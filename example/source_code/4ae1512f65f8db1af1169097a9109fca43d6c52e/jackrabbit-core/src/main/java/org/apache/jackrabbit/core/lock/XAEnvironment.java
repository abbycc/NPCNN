org apach jackrabbit core lock
org apach jackrabbit core transact except transactionexcept
org apach jackrabbit core node impl nodeimpl
org apach jackrabbit core session impl sessionimpl
org apach jackrabbit core workspac impl workspaceimpl
org apach jackrabbit core node nodeid
org slf4j logger
org slf4j logger factori loggerfactori
javax jcr repositori except repositoryexcept
javax jcr workspac
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
map node nodeid lock info xalockinfo lock node map lockednodesmap
hash map hashmap node nodeid lock info xalockinfo
map unlock node index intern
map node nodeid lock info xalockinfo unlock node map unlockednodesmap
hash map hashmap node nodeid lock info xalockinfo
list lock unlock oper
list lock info xalockinfo oper arrai list arraylist lock info xalockinfo
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
lock info lockinfo lock node impl nodeimpl node deep isdeep session scope issessionscop
lock except lockexcept repositori except repositoryexcept
lock node deep isdeep session scope issessionscop long max max
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
lock info lockinfo lock node impl nodeimpl node deep isdeep session scope issessionscop timeout hint timeouthint string owner info ownerinfo
lock except lockexcept repositori except repositoryexcept
node nodeid node node getnodeid
check neg set
lock info xalockinfo info unlock node map unlockednodesmap
info
set compat effect
info deep isdeep deep isdeep info session scope issessionscop session scope issessionscop
unlock node map unlockednodesmap remov
oper remov info
lock mgr lockmgr lock info getlockinfo
verifi node lock
lock islock node
lock except lockexcept node lock
creat lock info node
string lock owner lockown owner info ownerinfo owner info ownerinfo node session getsess user getuserid
info lock info xalockinfo node session scope issessionscop deep isdeep lock owner lockown
session impl sessionimpl session session impl sessionimpl node session getsess
info set lock holder setlockhold session
info set live setliv
lock manag impl lockmanagerimpl session lock manag getsessionlockmanag session lock token ad locktokenad info lock token getlocktoken
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
lock info lockinfo info lock node map lockednodesmap
info
lock node map lockednodesmap remov
oper remov info
info set live setliv
info lock info getlockinfo node
info info getid equal
lock except lockexcept node lock
info lock holder islockhold node session getsess
lock except lockexcept node lock session
lock info xalockinfo info xainfo lock info xalockinfo node info
unlock node map unlockednodesmap put info xainfo
oper add info xainfo
return flag indic node lock
return code true code node lock
code fals code
throw repositoryexcept error occur
lock islock node impl nodeimpl node repositori except repositoryexcept
lock info getlockinfo node
return lock inform node
lock info node lock lock info
parent deep lock
param node node
return lockinfo lock info code null code node lock
throw repositoryexcept error occur
lock info lockinfo lock info getlockinfo node impl nodeimpl node repositori except repositoryexcept
node nodeid node node getnodeid
check neg set
unlock node map unlockednodesmap kei containskei
check posit set iter ascend hierarchi
lock node map lockednodesmap empti isempti
node impl nodeimpl current node
lock info xalockinfo info lock node map lockednodesmap current getid
info
info getid equal info deep isdeep
info
current depth getdepth
current node impl nodeimpl current parent getpar
parent
lock mgr lockmgr lock info getlockinfo
return lock session
param session session
return lock session
throw repositoryexcept error occur
lock info lockinfo lock info getlockinfo session impl sessionimpl session
repositori except repositoryexcept
arrai list arraylist lock info lockinfo result arrai list arraylist lock info lockinfo
lock inform global lock manag
lock info lockinfo info lock mgr lockmgr lock info getlockinfo session
check neg set
unlock node map unlockednodesmap kei containskei info getid
result add info
add 'uncommitted' lock inform
result add addal lock node map lockednodesmap valu
lock info lockinfo result arrai toarrai lock info lockinfo result size
add lock token environ
param session
param lock token
throw repositoryexcept
add lock token addlocktoken session impl sessionimpl session string repositori except repositoryexcept
node nodeid lock info lockinfo pars lock token parselocktoken
node impl nodeimpl node node impl nodeimpl session item manag getitemmanag item getitem
lock info lockinfo info lock info getlockinfo node
info
info lock holder islockhold session
info lock holder getlockhold
info set lock holder setlockhold session
string msg add lock token lock held session
log warn msg
lock except lockexcept msg
inform sessionlockmanag
session lock manag getsessionlockmanag session lock token ad locktokenad
illeg argument except illegalargumentexcept
string msg bad lock token messag getmessag
log warn msg
lock except lockexcept msg
remov lock token environ
param session
param lock token
throw repositoryexcept
remov lock token removelocktoken session impl sessionimpl session string repositori except repositoryexcept
node nodeid lock info lockinfo pars lock token parselocktoken
node impl nodeimpl node node impl nodeimpl session item manag getitemmanag item getitem
lock info lockinfo info lock info getlockinfo node
info
info lock holder islockhold session
info set lock holder setlockhold
info lock holder getlockhold
string msg remov lock token lock held session
log warn msg
lock except lockexcept msg
inform sessionlockmanag
session lock manag getsessionlockmanag session lock token remov locktokenremov
illeg argument except illegalargumentexcept
string msg bad lock token messag getmessag
log warn msg
lock except lockexcept msg
session lock manag sessionlockmanag session lock manag getsessionlockmanag session impl sessionimpl session repositori except repositoryexcept
workspac wsp session workspac getworkspac
session lock manag sessionlockmanag wsp lock manag getlockmanag
prepar updat lock global lock manag feed lock
unlock oper
prepar transact except transactionexcept
statu statu prepar statu prepar
oper empti isempti
lock mgr lockmgr begin updat beginupd
index opindex oper size
lock info xalockinfo info oper index opindex
info updat
repositori except repositoryexcept
transact except transactionexcept unabl updat
index opindex
index opindex oper size
index opindex
lock info xalockinfo info oper index opindex
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
lock info xalockinfo info oper index opindex
info undo
repositori except repositoryexcept
log error unabl undo lock oper
index opindex
lock mgr lockmgr cancel updat cancelupd
reset
statu statu roll back statu roll back
return flag indic lock info belong
environ
env differentxaenv lock info lockinfo info
info lock info xalockinfo
lock info xalockinfo lock info lockinfo lock info xalockinfo info
lock info lockinfo env getxaenv
inform lock insid transact
lock info xalockinfo lock info lockinfo
node lock unlock
node impl nodeimpl node
flag indic info belong unlock oper
unlock isunlock
creat instanc class
param sessionscop lock token session scope
param deep lock deep
param lockown owner lock
lock info xalockinfo
node impl nodeimpl node
session scope sessionscop deep string lock owner lockown
node node getnodeid session scope sessionscop deep lock owner lockown long max max
node node
creat instanc class signal
unlock oper exist lock inform
lock info xalockinfo node impl nodeimpl node lock info lockinfo info
info
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
valid itemst unlock
jcr
workspac impl workspaceimpl node session getsess workspac getworkspac item state manag getitemstatemanag item state hasitemst node getid
lock mgr lockmgr intern unlock internalunlock node
lock info lockinfo intern lock internallock lock mgr lockmgr intern lock internallock
node deep isdeep session scope issessionscop
timeout time gettimeouttim lock owner getlockown
lock info lockinfo env lock xaenvlock lock info getlockinfo node
check locktoken remov transact
env lock xaenvlock env lock xaenvlock lock holder getlockhold
remov locktoken sessionlockmanag
session lock manag getsessionlockmanag intern lock internallock lock holder getlockhold lock token remov locktokenremov intern lock internallock lock token getlocktoken
intern lock internallock set lock holder setlockhold
undo oper
undo lock except lockexcept repositori except repositoryexcept
unlock isunlock
lock mgr lockmgr intern lock internallock
node deep isdeep session scope issessionscop
timeout hint gettimeouthint lock owner getlockown
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
