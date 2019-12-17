org apach jackrabbit core lock
org apach jackrabbit core transact except transactionexcept
org apach jackrabbit core node impl nodeimpl
org apach jackrabbit core session impl sessionimpl
org apach jackrabbit core node nodeid
org slf4j logger
org slf4j logger factori loggerfactori
javax jcr repositori except repositoryexcept
javax jcr lock lock except lockexcept
java util map
java util hash map hashmap
java util list
java util arrai list arraylist
encapsul oper happen environ
environ xaenviron
logger instanc class
logger log logger factori loggerfactori logger getlogg environ xaenviron
statu prepar statu prepar
statu prepar statu prepar
statu commit statu commit
statu commit statu commit
statu roll back statu roll back
statu roll back statu roll back
global lock manag
lock manag impl lockmanagerimpl lock mgr lockmgr
map lock node index intern
map lock node map lockednodesmap hash map hashmap
map unlock node index intern
map unlock node map unlockednodesmap hash map hashmap
list lock unlock oper
list oper arrai list arraylist
oper index
index opindex
current statu
statu
creat instanc class
param lockmgr global lock manag
environ xaenviron lock manag impl lockmanagerimpl lock mgr lockmgr
lock mgr lockmgr lock mgr lockmgr
reset environ
reset
lock node map lockednodesmap clear
unlock node map unlockednodesmap clear
oper clear
index opindex
lock node
param node node lock
param isdeep code true code deep lock node
code fals code
param issessionscop code true code lock session scope
code fals code
throw lockexcept node lock
throw repositoryexcept error occur
abstract lock info abstractlockinfo lock node impl nodeimpl node deep isdeep session scope issessionscop
lock except lockexcept repositori except repositoryexcept
lock node deep isdeep session scope issessionscop abstract lock info abstractlockinfo timeout infinit timeout infinit
lock node
param node node lock
param isdeep code true code deep lock node
code fals code
param issessionscop code true code lock session scope
code fals code
param timeouthint
param ownerinfo
throw lockexcept node lock
throw repositoryexcept error occur
abstract lock info abstractlockinfo lock node impl nodeimpl node deep isdeep session scope issessionscop timeout hint timeouthint string owner info ownerinfo
lock except lockexcept repositori except repositoryexcept
node nodeid node node getnodeid
check neg set
lock info lockinfo info lock info lockinfo unlock node map unlockednodesmap
info
set compat effect
info deep deep isdeep info session scope sessionscop session scope issessionscop
unlock node map unlockednodesmap remov
oper remov info
lock mgr lockmgr lock info getlockinfo
verifi node lock
lock islock node
lock except lockexcept node lock
creat lock info node
string lock owner lockown owner info ownerinfo owner info ownerinfo node session getsess user getuserid
info lock info lockinfo node lock token locktoken session scope issessionscop deep isdeep lock owner lockown
session impl sessionimpl session session impl sessionimpl node session getsess
info set lock holder setlockhold session
info set live setliv
lock manag impl lockmanagerimpl session lock manag getsessionlockmanag session lock token ad locktokenad info lock token locktoken string tostr
lock node map lockednodesmap put info
oper add info
info
unlock node
param node node unlock
throw lockexcept node lock
throw repositoryexcept error occur
unlock node impl nodeimpl node lock except lockexcept repositori except repositoryexcept
node nodeid node node getnodeid
check posit set
abstract lock info abstractlockinfo info lock info lockinfo lock node map lockednodesmap
info
lock node map lockednodesmap remov
oper remov info
info set live setliv
info lock info getlockinfo node
info info getid equal
lock except lockexcept node lock
info lock holder getlockhold node session getsess
lock except lockexcept node lock session
info lock info lockinfo node info
unlock node map unlockednodesmap put info
oper add info
return flag indic node lock
return code true code node lock
code fals code
throw repositoryexcept error occur
lock islock node impl nodeimpl node repositori except repositoryexcept
abstract lock info abstractlockinfo info lock info getlockinfo node
info
return lock inform node
lock info node lock lock info
parent deep lock
param node node
return lockinfo lock info code null code node lock
throw repositoryexcept error occur
abstract lock info abstractlockinfo lock info getlockinfo node impl nodeimpl node repositori except repositoryexcept
node nodeid node node getnodeid
check neg set
unlock node map unlockednodesmap kei containskei
check posit set iter ascend hierarchi
lock node map lockednodesmap empti isempti
node impl nodeimpl current node
lock info lockinfo info lock info lockinfo lock node map lockednodesmap current getid
info
info getid equal info deep
info
current depth getdepth
current node impl nodeimpl current parent getpar
parent
lock mgr lockmgr lock info getlockinfo
return code abstractlockinfo code
session
param session session
return arrai code abstractlockinfo code
throw repositoryexcept error occur
abstract lock info abstractlockinfo lock info getlockinfo session impl sessionimpl session
repositori except repositoryexcept
arrai list arraylist result arrai list arraylist
lock info global lock manag
abstract lock info abstractlockinfo info lock mgr lockmgr lock info getlockinfo session
info length
abstract lock info abstractlockinfo info info
check neg set
unlock node map unlockednodesmap kei containskei info getid
result add info
add 'uncommitted' lock info
result add addal lock node map lockednodesmap valu
abstract lock info abstractlockinfo result arrai toarrai abstract lock info abstractlockinfo result size
add lock token environ
param lock token
add lock token addlocktoken string
remov lock token environ
param lock token
remov lock token removelocktoken string
prepar updat lock global lock manag feed lock
unlock oper
prepar transact except transactionexcept
statu statu prepar statu prepar
oper empti isempti
lock mgr lockmgr begin updat beginupd
index opindex oper size
lock info lockinfo info lock info lockinfo oper index opindex
info updat
repositori except repositoryexcept
transact except transactionexcept unabl updat
index opindex
index opindex oper size
index opindex
lock info lockinfo info lock info lockinfo oper index opindex
info undo
repositori except repositoryexcept
log error unabl undo lock oper
index opindex
lock mgr lockmgr cancel updat cancelupd
statu statu prepar statu prepar
commit finish updat unlock
global lock manag
commit
statu oldstatu statu
statu statu commit statu commit
statu oldstatu statu prepar statu prepar
oper empti isempti
lock mgr lockmgr end updat endupd
reset
statu statu commit statu commit
rollback undo updat unlock
global lock manag
rollback
statu oldstatu statu
statu statu roll back statu roll back
statu oldstatu statu prepar statu prepar
oper empti isempti
index opindex
lock info lockinfo info lock info lockinfo oper index opindex
info undo
repositori except repositoryexcept
log error unabl undo lock oper
index opindex
lock mgr lockmgr cancel updat cancelupd
reset
statu statu roll back statu roll back
return flag indic lock info belong
environ
env differentxaenv abstract lock info abstractlockinfo info
info lock info lockinfo
lock info lockinfo lock info lockinfo lock info lockinfo info
lock info lockinfo env getxaenv
inform lock insid transact
lock info lockinfo abstract lock info abstractlockinfo
node lock unlock
node impl nodeimpl node
flag indic info belong unlock oper
unlock isunlock
creat instanc class
param locktoken lock token
param sessionscop lock token session scope
param deep lock deep
param lockown owner lock
lock info lockinfo node impl nodeimpl node lock token locktoken lock token locktoken
session scope sessionscop deep string lock owner lockown
node lock token locktoken session scope sessionscop deep lock owner lockown timeout infinit timeout infinit
creat instanc class
param locktoken lock token
param sessionscop lock token session scope
param deep lock deep
param lockown owner lock
lock info lockinfo node impl nodeimpl node lock token locktoken lock token locktoken
session scope sessionscop deep string lock owner lockown
timeout hint timeouthint
lock token locktoken session scope sessionscop deep lock owner lockown timeout hint timeouthint
node node
creat instanc class signal
unlock oper exist lock inform
lock info lockinfo node impl nodeimpl node abstract lock info abstractlockinfo info
info lock token locktoken info session scope sessionscop info deep info lock owner lockown info second remain getsecondsremain
node node
unlock isunlock
return flag indic info belong unlock oper
return code true code info belong unlock oper
code fals code
unlock isunlock
unlock isunlock
oper
updat lock except lockexcept repositori except repositoryexcept
unlock isunlock
lock mgr lockmgr intern unlock internalunlock node
lock mgr lockmgr intern lock internallock node deep session scope sessionscop second remain getsecondsremain lock owner lockown
undo oper
undo lock except lockexcept repositori except repositoryexcept
unlock isunlock
lock mgr lockmgr intern lock internallock node deep session scope sessionscop second remain getsecondsremain lock owner lockown
lock mgr lockmgr intern unlock internalunlock node
return parent environ
environ xaenviron env getxaenv
environ xaenviron
inheritdoc
long environ commit roll back
lock inform subject chang
chang maychang
statu statu commit statu commit
statu statu roll back statu roll back
chang maychang
