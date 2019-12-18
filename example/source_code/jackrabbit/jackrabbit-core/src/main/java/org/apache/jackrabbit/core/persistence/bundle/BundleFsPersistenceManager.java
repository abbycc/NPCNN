org apach jackrabbit core persist bundl
org slf4j logger
org slf4j logger factori loggerfactori
org apach common util ioutil
org apach jackrabbit core file system filesystem
org apach jackrabbit core base file system basedfilesystem
org apach jackrabbit core file system except filesystemexcept
org apach jackrabbit core local local file system localfilesystem
org apach jackrabbit core persist context pmcontext
org apach jackrabbit core persist util blob store blobstor
org apach jackrabbit core persist util bundl bind bundlebind
org apach jackrabbit core persist util error handl errorhandl
org apach jackrabbit core persist util file system blob store filesystemblobstor
org apach jackrabbit core persist util node prop bundl nodepropbundl
org apach jackrabbit core persist util serial
org apach jackrabbit core node nodeid
org apach jackrabbit core properti propertyid
org apach jackrabbit core state item state except itemstateexcept
org apach jackrabbit core state item state except nosuchitemstateexcept
org apach jackrabbit core state node refer noderefer
java file
java input stream inputstream
java output stream outputstream
java sql sql except sqlexcept
java util arrai list arraylist
java util arrai
java util list
gener persist manag store link nodepropbundl
filesystem
configur
param link setblobfsblocks string blobfsblocks
param link setminblobs string minblobs
param link seterrorhandl string errorhandl
bundl persist manag bundlefspersistencemanag abstract bundl persist manag abstractbundlepersistencemanag
default logger
logger log logger factori loggerfactori logger getlogg bundl persist manag bundlefspersistencemanag
flag indic manag initi
initi
file system blob data store
bundl persist manag bundlefspersistencemanag closeabl blob store closeableblobstor blob store blobstor
default blocksiz blob filesystem
setblobfsblocks string
blob block size blobfsblocks
minimum size properti written blob store
setminblobs string
min blob size minblobs
filesystem item store
file system filesystem item itemf
flag error handl
error handl errorhandl error handl errorhandl error handl errorhandl
bundl bind
bundl bind bundlebind bind
persist manag
string string tostr
return configur block size blob cqf
return block size
string blob block size getblobfsblocks
string valueof blob block size blobfsblocks
set block size blob control blob handl
size blob store workspace' physic filesystem
blob store item filesystem
note binari properti consid blob
store respect blob store size exce
link getminblobs
param size block size
set blob block size setblobfsblocks string size
blob block size blobfsblocks integ decod size int intvalu
return code true code blob store local
return code true code blob store local
local blob store uselocalfsblobstor
blob block size blobfsblocks
return mininum blob size
return mininum blob size
string min blob size getminblobs
string valueof min blob size minblobs
set minimum blob size size defin threshold
size properti includ bundl store blob store
high valu decreas perform
param minblobs
set min blob size setminblobs string min blob size minblobs
min blob size minblobs integ decod min blob size minblobs int intvalu
set error handl behaviour manag link errorhandl
detail flag
param errorhandl
set error handl seterrorhandl string error handl errorhandl
error handl errorhandl error handl errorhandl error handl errorhandl
return error handl configur manag
return error handl configur manag
string error handl geterrorhandl
error handl errorhandl string tostr
inheritdoc
init context pmcontext context except
initi
illeg state except illegalstateexcept initi
init context
context home dir gethomedir getnam
creat item
item itemf base file system basedfilesystem context file system getfilesystem item
creat correct blob store
local blob store uselocalfsblobstor
local file system localfilesystem blob blobf local file system localfilesystem
blob blobf set root setroot file context home dir gethomedir blob
blob blobf init
blob store blobstor bundl persist manag bundlefspersistencemanag blob store fsblobstor blob blobf
blob store blobstor bundl persist manag bundlefspersistencemanag blob store fsblobstor item itemf
load namespac
bind bundl bind bundlebind error handl errorhandl blob store blobstor index getnsindex index getnameindex context data store getdatastor
bind set min blob size setminblobs min blob size minblobs
initi
inheritdoc
overrid
blob store blobstor blob store getblobstor
blob store blobstor
inheritdoc
close except
initi
illeg state except illegalstateexcept initi
close blob store
blob store blobstor close
blob store blobstor
item itemf close
item itemf
close
initi
inheritdoc
node prop bundl nodepropbundl load bundl loadbundl node nodeid item state except itemstateexcept
string path build node file path buildnodefilepath string tostr
item itemf exist path
input stream inputstream item itemf input stream getinputstream path
bind read bundl readbundl
util ioutil close quietli closequietli
except
string msg fail read bundl
log error msg
item state except itemstateexcept msg
creat file path node
suitabl store node state filesystem
param buf buffer append code null code
param node
return buffer append data
string buffer stringbuff build node file path buildnodefilepath string buffer stringbuff buf node nodeid
buf
buf string buffer stringbuff
build node folder path buildnodefolderpath buf
buf append
buf append nodefilenam
buf
creat file path refer
suitabl store refer state filesystem
param buf buffer append code null code
param node
return buffer append data
string buffer stringbuff build node refer file path buildnodereferencesfilepath
string buffer stringbuff buf node nodeid
buf
buf string buffer stringbuff
build node folder path buildnodefolderpath buf
buf append
buf append noderefsfilenam
buf
inheritdoc
store bundl storebundl node prop bundl nodepropbundl bundl item state except itemstateexcept
string buffer stringbuff buf build node folder path buildnodefolderpath bundl getid
buf append
buf append nodefilenam
string file filenam buf string tostr
string dir file filenam substr file filenam index lastindexof file system filesystem separ char separ char
item itemf exist dir
item itemf creat folder createfold dir
output stream outputstream item itemf output stream getoutputstream file filenam
bind write bundl writebundl bundl
close
except
string msg fail write bundl bundl getid
bundl persist manag bundlefspersistencemanag log error msg
item state except itemstateexcept msg
inheritdoc
destroi bundl destroybundl node prop bundl nodepropbundl bundl item state except itemstateexcept
string buffer stringbuff buf build node file path buildnodefilepath bundl getid
item itemf delet file deletefil buf string tostr
except
item state except nosuchitemstateexcept
item state except nosuchitemstateexcept
string msg fail delet bundl bundl getid
bundl persist manag bundlefspersistencemanag log error msg
item state except itemstateexcept msg
inheritdoc
node refer noderefer load refer loadreferencesto node nodeid target targetid
item state except nosuchitemstateexcept item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
input stream inputstream
string path build node refer file path buildnodereferencesfilepath target targetid string tostr
item itemf exist path
special case
item state except nosuchitemstateexcept target targetid string tostr
item itemf input stream getinputstream path
node refer noderefer ref node refer noderefer target targetid
serial deseri ref
ref
item state except nosuchitemstateexcept
except
string msg fail read refer target targetid
bundl persist manag bundlefspersistencemanag log error msg
item state except itemstateexcept msg
util ioutil close quietli closequietli
inheritdoc
store node refer noderefer ref
item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
string buffer stringbuff buf build node folder path buildnodefolderpath ref target gettargetid
buf append
buf append noderefsfilenam
string file filenam buf string tostr
string dir file filenam substr file filenam index lastindexof file system filesystem separ char separ char
item itemf exist dir
item itemf creat folder createfold dir
output stream outputstream item itemf output stream getoutputstream file filenam
serial serial ref
close
except
string msg fail write ref
bundl persist manag bundlefspersistencemanag log error msg
item state except itemstateexcept msg
inheritdoc
destroi node refer noderefer ref item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
string buffer stringbuff buf build node refer file path buildnodereferencesfilepath ref target gettargetid
item itemf delet file deletefil buf string tostr
except
item state except nosuchitemstateexcept
item state except nosuchitemstateexcept
string msg fail delet ref
bundl persist manag bundlefspersistencemanag log error msg
item state except itemstateexcept msg
inheritdoc
exist refer existsreferencesto node nodeid target targetid item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
string buffer stringbuff buf build node refer file path buildnodereferencesfilepath target targetid
item itemf exist buf string tostr
except
string msg fail check exist node refer target targetid
bundl persist manag bundlefspersistencemanag log error msg
item state except itemstateexcept msg
log sql except
param messag
param
log except logexcept string messag sql except sqlexcept
messag
bundl persist manag bundlefspersistencemanag log error messag
bundl persist manag bundlefspersistencemanag log error reason messag getmessag
bundl persist manag bundlefspersistencemanag log error
state code sql state getsqlstat error code geterrorcod
bundl persist manag bundlefspersistencemanag log debug dump
inheritdoc
string string tostr
helper interfac closeabl store
closeabl blob store closeableblobstor blob store blobstor
close
implement filesystem blob store
blob scheme
blob store fsblobstor file system blob store filesystemblobstor bundl persist manag bundlefspersistencemanag closeabl blob store closeableblobstor
file system filesystem
blob store fsblobstor file system filesystem
string creat createid properti propertyid index
build blob file path buildblobfilepath index string tostr
close
close
except
ignor
inheritdoc
list node nodeid node id getallnodeid node nodeid bigger max count maxcount
item state except itemstateexcept
arrai list arraylist node nodeid list arrai list arraylist node nodeid
list recurs getlistrecurs list bigger bigger max count maxcount
list
file system except filesystemexcept
string msg fail read node list bigger
log error msg
item state except itemstateexcept msg
inheritdoc
node nodeid file getidfromfilenam string file filenam
string buffer stringbuff buff string buffer stringbuff
file filenam end endswith nodefilenam
file filenam length
file filenam char charat
buff append
len buff length
len len len len
buff append
node nodeid buff string tostr
list recurs getlistrecurs
arrai list arraylist node nodeid list string path node nodeid bigger max count maxcount
file system except filesystemexcept
max count maxcount list size max count maxcount
string file item itemf list file listfil path
arrai sort file
file length
string file
node nodeid file getidfromfilenam path file system filesystem separ
bigger bigger string tostr compar compareto string tostr
list add
max count maxcount list size max count maxcount
string dir item itemf list folder listfold path
arrai sort dir
dir length
list recurs getlistrecurs list path file system filesystem separ dir
bigger max count maxcount
