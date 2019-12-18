org apach jackrabbit core cluster
org apach jackrabbit core node nodeid
org apach jackrabbit core journal journal except journalexcept
org apach jackrabbit core journal record
cluster record repres lock unlock oper
lock record lockrecord cluster record clusterrecord
identifi lock
identifi
node
node nodeid node nodeid
flag indic lock unlock
lock islock
flag indic lock deep
deep isdeep
user
string user userid
creat instanc class lock oper
serial
param nodeid node
param isdeep flag indic lock deep
param userid user
param record journal record
param workspac workspac
lock record lockrecord node nodeid node nodeid deep isdeep string user userid
record record string workspac
record workspac
node nodeid node nodeid
lock islock
deep isdeep deep isdeep
user userid user userid
creat instanc class unlock oper
serial
param nodeid node
param record journal record
param workspac workspac
lock record lockrecord node nodeid node nodeid record record string workspac
record workspac
node nodeid node nodeid
lock islock
creat instanc class deseri
lock unlock oper
param record journal record
param workspac workspac
lock record lockrecord record record string workspac
record workspac
inheritdoc
read doread journal except journalexcept
node nodeid record read node readnodeid
lock islock record read boolean readboolean
lock islock
deep isdeep record read boolean readboolean
user userid record read string readstr
inheritdoc
write dowrit journal except journalexcept
record write char writechar identifi
record write node writenodeid node nodeid
record write boolean writeboolean lock islock
lock islock
record write boolean writeboolean deep isdeep
record write string writestr user userid
inheritdoc
process cluster record processor clusterrecordprocessor processor
processor process
return node
return node
node nodeid node getnodeid
node nodeid
return flag indic lock unlock oper
return code true code lock oper
code fals code unlock oper
lock islock
lock islock
return flag indic lock deep
return code true code lock deep
code fals code
deep isdeep
deep isdeep
return user lock oper
return user
string user getuserid
user userid
