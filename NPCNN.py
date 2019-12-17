import tensorflow as tf
import numpy as np
import pickle
from keras.utils import to_categorical#transform one-hot vector
from eval_result import eval_y

sess = tf.InteractiveSession()

def weight_variable(shape):
    initial = tf.truncated_normal(shape,stddev=0.1)
    #创建一个结构为shape的正态分布的权重矩阵，标准差为0.1
    return tf.Variable(initial)

def bias_variable(shape):
    #创建一个结构为shape的偏置矩阵，每一个偏置值初始为0.1
    initial = tf.constant(0.1,shape=shape)
    return tf.Variable(initial)

#read data
print("loading data for training")
test_num = 107
X = pickle.load(open('parameters.in','rb'))
train_report,train_code,train_labels,W = X[0],X[1],X[2],X[3]
train_report = np.array(train_report)
train_code = np.array(train_code)
train_labels = np.array(train_labels)
train_labels = to_categorical(train_labels)
W = np.array(W)
print(np.array(train_report).shape, np.array(train_code).shape, np.array(train_labels).shape, np.array(W).shape)
print("finish reading")
#在W中找到所需的单词向量，维度多一维
train_code = W[train_code]
train_report = W[train_report]
print(np.array(train_code).shape,np.array(train_report).shape)
#print(train_code.shape[2],train_code.shape[3])

#定义输入输出结构，声明占位符
x1 = tf.placeholder(tf.float32,[None,train_code.shape[2],train_code.shape[3]])
x2 = tf.placeholder(tf.float32,[None,train_report.shape[1],train_report.shape[2]])
y = tf.placeholder(tf.float32,[None,2])
keep_prob = tf.placeholder(tf.float32)
print(x1.shape,x2.shape)

filters = [3,4,5]#卷积核的高度d有3，4，5
n_epoches = 20
batch_size = 50

#source file 提取特征
output1 = None #第一次卷积的输出
for i in range(len(filters)):
    input1 = tf.reshape(x1,[-1,x1.shape[1],x1.shape[2],1])
    filter_shape = [filters[i],300,1,100]#第一第二参数为卷积核的大小，第三个是通道数，第四个是卷积核的数目
    pool_shape = []
    W_conv1 = weight_variable(filter_shape)
    b_conv1 = bias_variable([100])#对于每一个卷积核对应一个偏置
    h_conv1 = tf.nn.relu(tf.nn.conv2d(input1,W_conv1,strides=[1,1,1,1],padding='VALID')+b_conv1)#卷积
    h_poo11 = tf.nn.max_pool(h_conv1,ksize=[1,input1.shape[1]-filters[i]+1,1,1],strides=[1,1,1,1],padding='VALID')
    if output1 == None:output1 = h_poo11
    else: output1 = tf.concat([output1,h_poo11],axis=3) #把卷积核得出的特征向量连接起来

input2 = tf.reshape(output1,[-1,50,300,1])#第二次卷积
output2 = None
for i in range(len(filters)):
    filter_shape = [filters[i],300,1,100]
    W_conv2 = weight_variable(filter_shape)
    b_conv2 = bias_variable([100])
    h_conv2 = tf.nn.relu(tf.nn.conv2d(input2,W_conv2,strides=[1,1,1,1],padding='VALID')+b_conv2)
    h_pool2 = tf.nn.max_pool(h_conv2,ksize=[1,input2.shape[1]-filters[i]+1,1,1],strides=[1,1,1,1],padding='VALID')
    if output2 == None:output2 = h_pool2
    else: output2 = tf.concat([output2,h_pool2],axis=3) #把卷积核得出的特征向量连接起来

#bug report
output3 = None
for i in range(len(filters)):
    input_report = tf.reshape(x2,[-1,x2.shape[1],x2.shape[2],1])
    W_conv3 = weight_variable([filters[i],300,1,100])
    b_conv3 = bias_variable([100])
    h_conv3 = tf.nn.relu(tf.nn.conv2d(input_report,W_conv3,strides=[1,1,1,1],padding='VALID')+b_conv3)
    h_pool3 = tf.nn.max_pool(h_conv3,ksize=[1,input_report.shape[1]-filters[i]+1,1,1],strides=[1,1,1,1],padding='VALID')
    if output3 == None:output3 = h_pool3
    else:output3 = tf.concat([output3, h_pool3], axis=3)  # 把卷积核得出的特征向量连接起来

output = tf.concat([output2,output3],axis=3)#把两个输出连接起来
print(output)

#full-contect
output = tf.nn.dropout(output,keep_prob)
W_fc1 = weight_variable([int(output.shape[3]),2])
b_fc1 = bias_variable([2])
h_pool_flat = tf.reshape(output,[-1,output.shape[3]])
prediction = tf.nn.softmax(tf.matmul(h_pool_flat,W_fc1)+b_fc1)

cost = [0.2,0.8]#不平衡参数因子
cross_entropy = -tf.reduce_sum(cost*y*tf.log(prediction))
#cross_entropy = tf.reduce_mean(-tf.reduce_sum(y*tf.log(prediction)))#交叉熵函数
train_step = tf.train.AdamOptimizer(1e-4).minimize(cross_entropy)
output_label = tf.argmax(prediction,1)#argmax( ,1)返回每行最大数值的索引
correct_prediction = tf.equal(tf.argmax(prediction,1),tf.argmax(y,1))#判断与正确答案的索引是否相同
accuracy = tf.reduce_mean(tf.cast(correct_prediction,tf.float32))#计算准确率

def minibatches(inputs_x1 = None,inputs_x2 = None,targets = None,batch_size = None,shuffle = False):
    if shuffle:#判断是否混合
        indices = np.arange(len(inputs_x1))
        np.random.shuffle(indices)
    for start_idx in range(0,len(inputs_x1)-batch_size+1,batch_size):
        if shuffle:
            excerpt = indices[start_idx:start_idx+batch_size]
        else:
            excerpt = slice(start_idx,start_idx+batch_size)
        yield inputs_x1[excerpt],inputs_x2[excerpt],targets[excerpt]

def get_testsets(test_code,test_report,test_label):
    code_x = test_code[0]
    for i in range(300-1):
        code_x = np.vstack((code_x,test_code[i+1]))
    report_x = test_report
    y = test_label
    return code_x,report_x,y

report_test = []
code_test = []
test_y = []

#train_x1 = train_code.reshape(train_code.
train_x1 = train_code
train_x2 = train_report
train_y = train_labels

print(train_x1.shape,train_x2.shape,train_y.shape)
sess.run(tf.global_variables_initializer())
for epoches in range(n_epoches):
    for train_x1_batch,train_x2_batch,y_train in  minibatches(train_x1,train_x2,train_y,batch_size,True):
        train_x1_batch = train_x1_batch.reshape(train_x1_batch.shape[0]*train_x1_batch.shape[1],train_x1_batch.shape[2],train_x1_batch.shape[3])
        #print(train_x1_batch.shape,train_x2_batch.shape,y_train.shape)
        _, acc, out = sess.run([train_step, accuracy, output3], feed_dict={x1: train_x1_batch, x2: train_x2_batch, y: y_train,keep_prob:1})
        #_,acc,out = sess.run([train_step,accuracy,output3],feed_dict={x1:train_x1_batch,x2:train_x2_batch,y:y_train,keep_prob:0.25})
        print(acc)
        #print(out.shape)

#ent,output,_=sess.run([cross_entropy,output,train_step],feed_dict={x1:train_code[0],x2:train_report[0].reshape(1,208,300),y:train_labels[0].reshape(1,2),keep_prob:1})
#print(output)

top10_all = []
MRR_all = []
MAP_all = []

for test_index in range(test_num):
    X = pickle.load(open("example/cv/"+str(0)+"/middle/test_middle"+str(test_index)+".csv","rb"))
    test_report,test_code,test_labels = X[0],X[1],X[2]
    test_report = np.array(test_report,dtype='int')[:,:208]
    test_code = np.array(test_code,dtype='int')
    test_labels = np.array(test_labels,dtype='int')
   # print(test_code.shape,test_report.shape,train_labels.shape)
    test_code_x, test_report_x, test_label = get_testsets(test_code,test_report,test_labels)
    test_code_x = W[test_code_x].reshape(300*50,20,300)
    test_report_x = W[test_report_x]
    #print(test_code_x.shape,test_report_x.shape)
    pre, label = sess.run([prediction, output_label], feed_dict={x1: test_code_x, x2: test_report_x,keep_prob:1})
    #pre,label = sess.run([prediction,output_label],feed_dict={x1:test_code_x,x2:test_report_x,keep_prob:0.25})
    #print(pre,label)
    test_p = pre[:,1]
    test_y_labels = test_label
   # top10 = eval_y(test_p, label, test_y_labels)
    #top10_all.append(top10)
#print('top10:', np.mean(top10_all))


    top10,MRR,MAP = eval_y(test_p, label, test_y_labels)
    top10_all.append(top10)
    MRR_all.append(MRR)
    MAP_all.append(MAP)

print('top10:', np.mean(top10_all))
print('MRR:', np.mean(MRR_all))
print('MAP:',np.mean(MAP_all))

