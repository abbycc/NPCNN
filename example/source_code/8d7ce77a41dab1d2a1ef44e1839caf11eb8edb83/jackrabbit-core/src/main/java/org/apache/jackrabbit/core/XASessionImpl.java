org apach jackrabbit core
org apach jackrabbit core config workspac config workspaceconfig
org apach jackrabbit core lock lock manag lockmanag
org apach jackrabbit core lock lock manag impl lockmanagerimpl
org apach jackrabbit core lock lock manag xalockmanag
org apach jackrabbit core secur authent auth context authcontext
org apach jackrabbit core state share item state manag shareditemstatemanag
org apach jackrabbit core state item state manag xaitemstatemanag
org apach jackrabbit core version version manag versionmanag
org apach jackrabbit core version version manag impl versionmanagerimpl
org apach jackrabbit core version version manag xaversionmanag
org slf4j logger
org slf4j logger factori loggerfactori
javax jcr access deni except accessdeniedexcept
javax jcr repositori except repositoryexcept
javax secur auth subject
javax transact except xaexcept
javax transact resourc xaresourc
javax transact xid
java util collect
java util hash map hashmap
java util map
session extens support
session impl xasessionimpl session impl sessionimpl
session xasess resourc xaresourc
logger instanc
logger log logger factori loggerfactori logger getlogg session impl xasessionimpl
global transact
map global txglobal collect synchron map synchronizedmap hash map hashmap
default transact timeout second
default timeout default timeout
transact
transact context transactioncontext
transact timeout second
timeout txtimeout
list transact resourc
intern resourc internalxaresourc resourc txresourc
session local lock manag
lock manag lockmanag lock mgr lockmgr
creat instanc class
param rep repositori
param logincontext login context authent subject
param wspconfig workspac configur
throw accessdeniedexcept subject login context
grant access
workspac
throw repositoryexcept error occur
session impl xasessionimpl repositori impl repositoryimpl rep auth context authcontext login context logincontext
workspac config workspaceconfig wsp config wspconfig
access deni except accessdeniedexcept repositori except repositoryexcept
rep login context logincontext wsp config wspconfig
init
creat instanc class
param rep repositori
param subject authent subject
param wspconfig workspac configur
throw accessdeniedexcept subject grant access
workspac
throw repositoryexcept error occur
session impl xasessionimpl repositori impl repositoryimpl rep subject subject
workspac config workspaceconfig wsp config wspconfig
access deni except accessdeniedexcept repositori except repositoryexcept
rep subject wsp config wspconfig
init
initi object
init repositori except repositoryexcept
item state manag xaitemstatemanag state mgr statemgr item state manag xaitemstatemanag wsp item state manag getitemstatemanag
lock manag xalockmanag lock mgr lockmgr lock manag xalockmanag lock manag getlockmanag
version manag xaversionmanag version mgr versionmgr version manag xaversionmanag version manag getversionmanag
creat arrai resourc particip
transact resourc depend
chang sequenc
artifici resourc version manag begin
end handl lock version manag begin resourc
acquir write lock version manag prepar method
end resourc releas write lock commit
rollback note write lock acquir
commit version manag
inform jcr jcr
resourc txresourc intern resourc internalxaresourc
version mgr versionmgr resourc begin getxaresourcebegin
version mgr versionmgr state mgr statemgr lock mgr lockmgr
version mgr versionmgr resourc end getxaresourceend
state mgr statemgr set virtual provid setvirtualprovid version mgr versionmgr
inheritdoc
workspac impl workspaceimpl creat workspac instanc createworkspaceinst workspac config workspaceconfig wsp config wspconfig
share item state manag shareditemstatemanag state mgr statemgr
repositori impl repositoryimpl rep
session impl sessionimpl session
workspac xaworkspac wsp config wspconfig state mgr statemgr rep session
inheritdoc
version manag versionmanag creat version manag createversionmanag repositori impl repositoryimpl rep
repositori except repositoryexcept
version manag impl versionmanagerimpl mgr vmgr version manag impl versionmanagerimpl rep version manag getversionmanag
version manag xaversionmanag mgr vmgr rep node type registri getnodetyperegistri rep item state cach factori getitemstatecachefactori
inheritdoc
lock manag lockmanag lock manag getlockmanag repositori except repositoryexcept
lock mgr lockmgr
lock manag impl lockmanagerimpl lock mgr lockmgr lock manag impl lockmanagerimpl wsp lock manag getlockmanag
lock mgr lockmgr lock manag xalockmanag lock mgr lockmgr
lock mgr lockmgr
xasess
inheritdoc
resourc xaresourc resourc getxaresourc
xaresourc
inheritdoc
transact timeout gettransactiontimeout
timeout txtimeout default timeout default timeout timeout txtimeout
inheritdoc
set transact timeout settransactiontimeout second
timeout txtimeout second
inheritdoc
resourc belong resourc manag connect
session credenti
issamerm resourc xaresourc xare except xaexcept
xare session impl xasessionimpl
session impl xasessionimpl xase session impl xasessionimpl xare
string equal stringsequ user userid xase user userid
inheritdoc
code tmnoflag code creat transact
context associ resourc
code tmjoin code resourc
transact context transact
code tmresum code resum work
transact context suspend earlier
flag gener code xaexcept code type
code xaer inval code
start xid xid flag except xaexcept
isassoci
log error resourc transact
except xaexcept except xaexcept xaer proto xaer proto
transact context transactioncontext transact context transactioncontext global txglobal xid
flag tmnoflag
except xaexcept except xaexcept xaer dupid xaer dupid
creat transact createtransact xid
flag tmjoin
except xaexcept except xaexcept xaer nota xaer nota
flag tmresum
except xaexcept except xaexcept xaer nota xaer nota
suspend issuspend
log error unabl resum transact suspend
except xaexcept except xaexcept xaer proto xaer proto
set suspend setsuspend
except xaexcept except xaexcept xaer inval xaer inval
associ
creat transact context
param xid xid global transact
return transact context
transact context transactioncontext creat transact createtransact xid xid
transact context transactioncontext transact context transactioncontext resourc txresourc transact timeout gettransactiontimeout
global txglobal put xid
inheritdoc
code tmsuccess code disassoci session
transact
code tmfail code disassoci session
transact mark transact rollback
code tmsuspend code disassoci session
transact
flag gener code xaexcept code type
code xaer inval code
legal transact associ suspend
end code tmsuccess code code tmfail code
resum
end xid xid flag except xaexcept
transact context transactioncontext transact context transactioncontext global txglobal xid
except xaexcept except xaexcept xaer nota xaer nota
flag tmsuspend
isassoci
log error resourc transact
except xaexcept except xaexcept xaer proto xaer proto
associ
set suspend setsuspend
flag tmfail flag tmsuccess
suspend issuspend
isassoci
log error resourc transact
except xaexcept except xaexcept xaer proto xaer proto
associ
set suspend setsuspend
except xaexcept except xaexcept xaer inval xaer inval
inheritdoc
prepar xid xid except xaexcept
transact context transactioncontext transact context transactioncontext global txglobal xid
except xaexcept except xaexcept xaer nota xaer nota
prepar
inheritdoc
commit xid xid phase onephas except xaexcept
transact context transactioncontext transact context transactioncontext global txglobal xid
except xaexcept except xaexcept xaer nota xaer nota
phase onephas
prepar
commit
global txglobal remov xid
inheritdoc
rollback xid xid except xaexcept
transact context transactioncontext transact context transactioncontext global txglobal xid
except xaexcept except xaexcept xaer nota xaer nota
rollback
global txglobal remov xid
inheritdoc
recoveri support
xid recov flag except xaexcept
xid
inheritdoc
recoveri support
forget xid xid except xaexcept
associ session global transact intern set
transact transact local object
perform item retriev store
associ transact context transactioncontext
resourc txresourc length
intern resourc internalxaresourc resourc txresourc resourc txresourc
resourc txresourc associ
return flag indic resourc
transact
return code true code resourc
transact code fals code
isassoci
inheritdoc
logout
logout
dispos cach
version manag xaversionmanag version mgr versionmgr close
except
log warn error close xaversionmanag
compar string equal code null code
consid equal
string equal stringsequ string string
equal
