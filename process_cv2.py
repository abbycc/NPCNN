import numpy as np
import pickle
from collections import defaultdict
import sys, re
import pandas as pd
import os
import csv
import gensim


def clean_str(string, TREC=False):
    string = re.sub(r"[^A-Za-z0-9(),!?;\'\`]", " ", string)
    string = re.sub(r"\'s", " \'s", string)
    string = re.sub(r"\'ve", " \'ve", string)
    string = re.sub(r"n\'t", " n\'t", string)
    string = re.sub(r"\'re", " \'re", string)
    string = re.sub(r"\'d", " \'d", string)
    string = re.sub(r"\'ll", " \'ll", string)
    string = re.sub(r",", " , ", string)
    string = re.sub(r"!", " ! ", string)
    string = re.sub(r"\(", " \( ", string)
    string = re.sub(r"\)", " \) ", string)
    string = re.sub(r"\?", " \? ", string)
    string = re.sub(r"\s{2,}", " ", string)
    return string.strip() if TREC else string.strip().lower()


def load_bin_vec(fname, vocab):
    word_vecs = {}
    model = gensim.models.KeyedVectors.load_word2vec_format(fname, binary=True)#模型的导入
    for word in vocab:
        if word in model.vocab:
            word_vecs[word] = model[word]
    # with open(fname, "rb") as f:
    #     header = f.readline()
    #     vocab_size, layer1_size = map(int, header.split())
    #     binary_len = np.dtype('float32').itemsize * layer1_size
    #     for line in range(vocab_size):
    #         word = []
    #         while True:
    #             ch = f.read(1)
    #             if ch == ' ' :
    #                 word = ''.join(word)
    #                 break
    #             if ch != '\n':
    #                 word.append(ch)
    #                 print(word)
    #
    #         if word in vocab:
    #            word_vecs[word] = np.fromstring(f.read(binary_len), dtype='float32')
    #         else:
    #             f.read(binary_len)
    return word_vecs


def add_unknown_words(word_vecs, vocab, min_df=1, k=300):
    """
    For words that occur in at least min_df documents, create a separate word vector.
    0.25 is chosen so the unknown vectors have (approximately) same variance as pre-trained ones
    """
    for word in vocab:
        if word not in word_vecs and vocab[word] >= min_df:
            word_vecs[word] = np.random.uniform(-0.25, 0.25, k)


def getIdxfrom_sent(sent, word_idx_map, code_maxk):
    x = []
    #    pad = filter_h - 1
    #    for i in xrange(pad):
    #        x.append(0)
    words = sent.split()
    for word in words:
        if word in word_idx_map:
            x.append(word_idx_map[word])
    if len(x) <= code_maxk:
        while len(x) < code_maxk:
            x.append(0)
    if len(x) >= code_maxk:
        while len(x) > code_maxk:
            x.pop()
    return x


def getIdxfrom_sent_n(sent, max_l, word_idx_map, filter_h=5):
    x = []
    pad = filter_h - 1
    for i in range(pad):
        x.append(0)
    words = sent.split()
    for word in words:
        if word in word_idx_map:
            x.append(word_idx_map[word])
    while len(x) < max_l + 2 * pad:
        x.append(0)
    return x


def clean_str_sst(string):
    string = re.sub(r"[^A-Za-z0-9(),!?\'\`]", " ", string)
    string = re.sub(r"\s{2,}", " ", string)
    return string.strip().lower()


def get_W(word_vecs, k=300):
    vocab_size = len(word_vecs)
    word_idx_map = dict()
    W = np.zeros(shape=(vocab_size + 1, k), dtype='float32')
    W[0] = np.zeros(k, dtype='float32')
    i = 1
    for word in word_vecs:
        W[i] = word_vecs[word]
        word_idx_map[word] = i
        i += 1
    return W, word_idx_map


def alignData(data, code_maxl):
    mm = data.shape[0]
    nn = data.shape[1]
    if mm < code_maxl:
        tt = code_maxl - mm
        aa = np.zeros(nn * tt, dtype="int").reshape(tt, nn)
        new_data = np.vstack((data, aa))
    else:
        new_data = data[:code_maxl, :]
    return new_data


def getReport(bugID, maxlen):
    f = open(bugID + '.txt')
    line = f.readline()
    rev = []
    while line:
        rev.append(line.strip())
        line = f.readline()
    f.close()
    orig_rev = " ".join(rev).lower()
    words = orig_rev.split()

    if len(words) > maxlen:
        cut_words = []
        for i in range(maxlen):
            cut_words.append(words[i])
        report = " ".join(cut_words)
    else:
        report = " ".join(words)
    return report


def random_permutation(train_report, train_code, labels):
    labels = np.asarray(labels)
    labels = labels.reshape(len(labels))
    datasets_size = len(labels)
    labels_rand = np.zeros(datasets_size, dtype="int")
    zz = np.random.permutation(np.arange(datasets_size))
    train_report_rand, train_code_rand = [], []
    for i in range(datasets_size):
        labels_rand[i] = labels[zz[i]]
        train_report_rand.append(train_report[zz[i]])
        train_code_rand.append(train_code[zz[i]])
    return train_report_rand, train_code_rand, labels_rand


def load_data( code_maxl, code_maxk, report_maxl, test_num, w2v_file, repeat_index):
    # code_maxl max statements per file
    # code_maxk max words per statement

    revs, revs_code = [], []
    revs_pre = []
    vocab = defaultdict(float)

    spamreader = csv.reader(open("example/cv/" + str(repeat_index) + "/training_pos.csv", newline=''))
   # spamreader = csv.reader(open("JDT_CNN/training_pos.csv", newline=''))
    for row in spamreader:
        # print(row)
        #bug_report_name = "JDT_CNN/BugCorpus/BugCorpus/" + row[0].strip()
        bug_report_name = "example/bug_reports/" + row[0].strip()
        bug_description = getReport(bug_report_name, report_maxl)
        rev = []
        rev.append(bug_description)
        orig_rev = " ".join(rev).lower()
        words = set(orig_rev.split())
        for word in words:
            vocab[word] += 1
        datum = {"y": 1,
                 "text": orig_rev,
                 "num_words": len(orig_rev.split()),
                 "test": -1,
                 "target": -1}
        revs.append(datum)
        #source_code_name = "JDT_CNN/sources/sources/JDT_4_5/" + row[1].strip()
        source_code_name = "example/source_code/" + row[1].strip()
        with open(source_code_name, "rb") as f:
            revs_single = []
            for line in f:
                rev = []
                rev.append(line.strip())

                orig_rev = clean_str(" ".join(str(rev)))
                if len(orig_rev) <= 1: continue
                words = set(orig_rev.split())
                for word in words:
                    vocab[word] += 1
                datum = {"y": 1,
                         "text": orig_rev,
                         "num_words": len(orig_rev.split()),
                         "test": -1,
                         "target": -1}
                revs_single.append(datum)
            revs_code.append(revs_single)

    #    read training negative
    #spamreader = csv.reader(open("JDT_CNN/training_neg.csv", newline=''))
    spamreader = csv.reader(open("example/cv/" + str(repeat_index) + "/training_neg.csv", newline=''))
    for row in spamreader:
       # bug_report_name = "JDT_CNN/BugCorpus/BugCorpus/" + row[0].strip()
        bug_report_name = "example/bug_reports/" + row[0].strip()
        bug_description = getReport(bug_report_name, report_maxl)
        rev = []
        rev.append(bug_description)
        rev = []
        rev.append(bug_description.strip())
        orig_rev = " ".join(rev).lower()
        words = set(orig_rev.split())
        for word in words:
            vocab[word] += 1
        datum = {"y": 0,
                 "text": orig_rev,
                 "num_words": len(orig_rev.split()),
                 "test": -1,
                 "target": -1}
        revs.append(datum)
        #source_code_name = "JDT_CNN/sources/sources/JDT_4_5/" + row[1].strip()
        source_code_name = "example/source_code/" + row[1].strip()
        with open(source_code_name, "rb") as f:
            revs_single = []
            for line in f:
                rev = []
                rev.append(line.strip())
                orig_rev = clean_str(" ".join(str(rev)))
                if len(orig_rev) <= 1: continue
                words = set(orig_rev.split())
                for word in words:
                    vocab[word] += 1
                datum = {"y": 0,
                         "text": orig_rev,
                         "num_words": len(orig_rev.split()),
                         "test": -1,
                         "target": -1}
                revs_single.append(datum)
            revs_code.append(revs_single)

            #           test_num number of test bug reports
    for test_index in range(test_num):
        spamreader = csv.reader(
           # open("JDT_CNN/JDT4.5.0/test" + str(test_index) + ".csv", newline=''))
            open("example/cv/" + str(repeat_index) + "/test/test" + str(test_index) + ".csv", newline=''))
        for row in spamreader:
            label = row[2]
            bug_report_name = "JDT_CNN/BugCorpus/BugCorpus/" + row[0].strip()
            #bug_report_name = "example/bug_reports/" + row[0].strip()
            bug_description = getReport(bug_report_name, report_maxl)
            rev = []
            rev.append(bug_description)
            orig_rev = " ".join(str(rev)).lower()
            words = set(orig_rev.split())
            for word in words:
                vocab[word] += 1
            if label.strip() == "1":
                datum = {"y": 1,
                         "text": orig_rev,
                         "num_words": len(orig_rev.split()),
                         "test": test_index,
                         "target": 1}
            else:
                datum = {"y": 0,
                         "text": orig_rev,
                         "num_words": len(orig_rev.split()),
                         "test": test_index,
                         "target": 1}
            revs.append(datum)

          #  source_file_name = "JDT_CNN/sources/sources/JDT_4_5/" + row[1].strip()
            source_file_name = 'example/source_code/' + row[1].strip()
            with open(source_file_name, "rb") as f:
                revs_single = []
                for line in f:
                    rev = []
                    rev.append(line.strip())
                    orig_rev = clean_str(" ".join(str(rev)))
                    if len(orig_rev) <= 1:
                        orig_rev = "test"
                    words = set(orig_rev.split())
                    for word in words:
                        vocab[word] += 1
                    if label.strip() == "1":
                        datum = {"y": 1,
                                 "text": orig_rev,
                                 "num_words": len(orig_rev.split()),
                                 "test": test_index,
                                 "target": 1}
                    else:
                        datum = {"y": 0,
                                 "text": orig_rev,
                                 "num_words": len(orig_rev.split()),
                                 "test": test_index,
                                 "target": 1}
                    revs_single.append(datum)
                if len(revs_single) == 0:
                    revs_single = revs_pre
                revs_code.append(revs_single)
                revs_pre = revs_single

    w2v = load_bin_vec(w2v_file, vocab)
    add_unknown_words(w2v, vocab)
    W, word_idx_map = get_W(w2v)

    train_report, train_code, train_labels = [], [], []

    for rev in revs:
        sent = getIdxfrom_sent_n(rev["text"], report_maxl, word_idx_map, filter_h=5)
        if rev["test"] == -1:
            train_report.append(sent)

    for revs_single in revs_code:
        data_single = []
        label_single = []
        for rev in revs_single:
            sent = getIdxfrom_sent(rev["text"], word_idx_map, code_maxk=code_maxk)
            data_single.append(sent)
        if rev["test"] == -1:
            data_single = np.array(data_single, dtype="int")
            data_single = alignData(data_single, code_maxl)
            train_code.append(data_single)
            train_labels.append(label_single)
            label_single.append(rev["y"])

    train_labels = np.array(train_labels, dtype="int")

    test_report, test_code = [], []
    test_labels = []
    for i in range(test_num):
        test_report.append([])
        test_code.append([])
        test_labels.append([])

    for rev in revs:
        sent = []
        sent = getIdxfrom_sent_n(rev["text"], report_maxl, word_idx_map, filter_h=5)
        index = rev["test"]
        if index >= 0:
            test_report[index].append(sent)

    for revs_single in revs_code:
        data_single = []
        label_single = []
        for rev in revs_single:
            sent = getIdxfrom_sent(rev["text"], word_idx_map, code_maxk=code_maxk)
            data_single.append(sent)

        index = rev["test"]
        if index >= 0:
            label_single.append(rev["y"])
            data_single = np.array(data_single, dtype="int")
            data_single = alignData(data_single, code_maxl)
            test_code[index].append(data_single)
            test_labels[index].append(label_single)

    tobecheckdir = "JDT_CNN/middle"
    #tobecheckdir = "example/cv/" + str(repeat_index) + "/middle"
    if os.path.isdir(tobecheckdir) == False:
        os.makedirs(tobecheckdir)

    for i in range(test_num):
        test_labels[i] = np.array(test_labels[i], dtype="int")
        #print_file = "JDT_CNN/middle/test_middle" + str(i) + ".csv"
        print_file = "example/cv/" + str(repeat_index) + "/middle/test_middle" + str(i) + ".csv"
        pickle.dump([test_report[i], test_code[i], test_labels[i]], open(print_file, "wb"))
    #    random permutation; print to parameters.in
    train_report, train_code, train_labels = random_permutation(train_report, train_code, train_labels)
    print("Finish loading")
    return train_report, train_code, train_labels, W

if __name__=="__main__":
    w2v_file = "GoogleNews-vectors-negative300.bin"
    index_num = 1
    for repeat_index in range(index_num):
        print("cv_index: ", str(repeat_index))
        code_maxl = 50  # code_maxl max statements per file
        code_maxk = 20  # code_maxk max words per statement

        test_num = 107
        report_maxl = 200  # max report length
        test_c = 300  # random choose 300 candidate source code
        train_report, train_code, train_labels, W = load_data(code_maxl, code_maxk, report_maxl, test_num,w2v_file, repeat_index)
        pickle.dump([train_report, train_code, train_labels, W],open("example/cv/" + str(repeat_index) + "/parameters.in", "wb"))
        #pickle.dump([train_report, train_code, train_labels, W],open("JDT_CNN/parameters.in", "wb"))
        print("Finish processing!")