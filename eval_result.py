from scipy.special import perm

def calculate_same_value(labels_sorted, test_p_sorted, start_pos):
    i = start_pos
    num_same = 0
    num_p = 0
    while test_p_sorted[start_pos] == test_p_sorted[i]:
        num_same = num_same + 1
        if labels_sorted[i] ==1 : num_p = num_p + 1
        i = i + 1
        if i == len(labels_sorted ): break
    return num_p, num_same

def eval_y (test_p, test_l, labels ):
    test_p_sorted = test_p
    test_p_index = sorted(range(len(test_p_sorted)) ,key = lambda k: test_p_sorted[k], reverse =True )#降序排序
    test_p_sorted = sorted(test_p, reverse = True)

    labels_sorted = []
    for index in test_p_index:
        labels_sorted.append(labels[index])

    top_num = 10
    top10rank = 0
    for i in range(top_num):
        if(labels_sorted[i] ==1 ):
            '''
            num_p, num_s = calculate_same_value(labels_sorted, test_p_sorted, i)
            num_r = top_num - i
            if num_p > (num_s-num_r):
                top10rank = 1
                break
            v1 = perm(num_s-num_r, num_p)*perm(num_s-num_p,num_s-num_p)
            v2 = perm(num_s,num_s)
            top10rank = 1-(float)((float)(v1)/(float)(v2))
            if top10rank > 1: top10rank=1
            if top10rank!=top10rank: top10rank=1
            break

    return top10rank

    '''
            top10rank = 1
            break
    num_p, num_s = calculate_same_value(labels_sorted,test_p_sorted,10)
    if(num_p >=1 ): top10rank = 1 #统计在第十位并列排名相同的文件中，是否含有相关文件

    MRRrank = 0.0
    for i in range(len(labels_sorted)):
        if( labels_sorted[i] == 1 ):
            MRRrank = MRRrank +  float(1/(i+1))

    MAPrank = 0.0
    pos_num = 0
    for i in range(len(labels_sorted)):
        if( labels_sorted[i] == 1):
            pos_num = pos_num + 1
            MAPrank = MAPrank + float(pos_num/(i+1))

    MAPrank =  float(MAPrank/pos_num)
    MRRrank = float(MRRrank/pos_num)
   
    return top10rank, MRRrank, MAPrank

