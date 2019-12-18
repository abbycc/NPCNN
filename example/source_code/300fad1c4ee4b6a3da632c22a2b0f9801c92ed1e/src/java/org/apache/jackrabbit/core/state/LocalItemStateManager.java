org apach jackrabbit core state
org apach jackrabbit core item itemid
org apach jackrabbit core node nodeid
org apach jackrabbit core properti propertyid
org apach jackrabbit core workspac impl workspaceimpl
org apach jackrabbit core observ observ manag impl observationmanagerimpl
org apach jackrabbit qname
org apach log4j logger
javax jcr repositori except repositoryexcept
java util iter
local code itemstatemanag code isol
persist state client
local item state manag localitemstatemanag
updat item state manag updatableitemstatemanag item state listen itemstatelisten
logger instanc
logger log logger logger getlogg local item state manag localitemstatemanag
cach weak refer itemst object issu
itemstatemanag
item state refer cach itemstatereferencecach cach
share item state manag
share item state manag shareditemstatemanag share state mgr sharedstatemgr
local workspaceimpl instanc
workspac impl workspaceimpl wsp impl wspimpl
flag indic item state manag edit mode
edit mode editmod
chang log
chang log changelog chang log changelog chang log changelog
creat code localitemstatemanag code instanc
todo localitemstatemanag wspimpl gener observ event
param sharedstatemgr share state manag
param wspimpl workspac instanc item state manag
belong code null code item state manag
workspac case version item state
manag version item state specif workspac
instanc
local item state manag localitemstatemanag share item state manag shareditemstatemanag share state mgr sharedstatemgr
workspac impl workspaceimpl wsp impl wspimpl
cach item state refer cach itemstatereferencecach
share state mgr sharedstatemgr share state mgr sharedstatemgr
wsp impl wspimpl wsp impl wspimpl
retriev node state parent share state manag
wrap intermedi object help handl local
modif
param node
return node state
throw nosuchitemstateexcept
throw itemstateexcept
node state nodest node state getnodest node nodeid
item state except nosuchitemstateexcept item state except itemstateexcept
load parent manag wrap
node state nodest state node state nodest share state mgr sharedstatemgr item state getitemst
state node state nodest state state statu getstatu
put cach
cach cach state
regist listen
state add listen addlisten
state
retriev properti state parent share state manag
wrap intermedi object help handl local
modif
param properti
return properti state
throw nosuchitemstateexcept
throw itemstateexcept
properti state propertyst properti state getpropertyst properti propertyid
item state except nosuchitemstateexcept item state except itemstateexcept
load parent manag wrap
properti state propertyst state properti state propertyst share state mgr sharedstatemgr item state getitemst
state properti state propertyst state state statu getstatu
put cach
cach cach state
regist listen
state add listen addlisten
state
itemstatemanag
inheritdoc
item state itemst item state getitemst item itemid
item state except nosuchitemstateexcept item state except itemstateexcept
check chang log
item state itemst state chang log changelog
state
state
check cach synchron ensur entri creat
cach
state cach retriev
state
regular behaviour
denot node denotesnod
state node state getnodest node nodeid
state properti state getpropertyst properti propertyid
state
inheritdoc
item state hasitemst item itemid
check item chang log
item state itemst state chang log changelog
state
item state except nosuchitemstateexcept
check cach
cach cach iscach
regular behaviour
share state mgr sharedstatemgr item state hasitemst
inheritdoc
node refer noderefer node refer getnoderefer node refer nodereferencesid
item state except nosuchitemstateexcept item state except itemstateexcept
check chang log
node refer noderefer ref chang log changelog
ref
ref
share state mgr sharedstatemgr node refer getnoderefer
inheritdoc
node refer hasnoderefer node refer nodereferencesid
check chang log
chang log changelog
share state mgr sharedstatemgr node refer hasnoderefer
updatableitemstatemanag
inheritdoc
edit illeg state except illegalstateexcept
edit mode editmod
illeg state except illegalstateexcept edit mode
chang log changelog reset
edit mode editmod
inheritdoc
edit mode ineditmod
edit mode editmod
inheritdoc
node state nodest creat createnew string uuid qname node type nodetypenam
string parent uuid parentuuid
illeg state except illegalstateexcept
edit mode editmod
illeg state except illegalstateexcept edit mode
node state nodest state node state nodest uuid node type nodetypenam parent uuid parentuuid
item state itemst statu statu
chang log changelog ad state
state
inheritdoc
properti state propertyst creat createnew qname prop propnam string parent uuid parentuuid
illeg state except illegalstateexcept
edit mode editmod
illeg state except illegalstateexcept edit mode
properti state propertyst state properti state propertyst prop propnam parent uuid parentuuid
item state itemst statu statu
chang log changelog ad state
state
inheritdoc
store item state itemst state illeg state except illegalstateexcept
edit mode editmod
illeg state except illegalstateexcept edit mode
chang log changelog modifi state
inheritdoc
store node refer noderefer ref illeg state except illegalstateexcept
edit mode editmod
illeg state except illegalstateexcept edit mode
chang log changelog modifi ref
inheritdoc
destroi item state itemst state illeg state except illegalstateexcept
edit mode editmod
illeg state except illegalstateexcept edit mode
chang log changelog delet state
inheritdoc
cancel illeg state except illegalstateexcept
edit mode editmod
illeg state except illegalstateexcept edit mode
chang log changelog undo share state mgr sharedstatemgr
edit mode editmod
inheritdoc
updat
stale item state except staleitemstateexcept item state except itemstateexcept
illeg state except illegalstateexcept
edit mode editmod
illeg state except illegalstateexcept edit mode
updat chang log changelog
chang log changelog reset
edit mode editmod
end updat oper fetch state refer
parent share item manag reconnect item
collect local chang log overwrit share
item copi
param changelog chang log local state refer
throw staleitemstateexcept affect item
state stale meantim
throw itemstateexcept error occur
updat chang log changelog chang log changelog
stale item state except staleitemstateexcept item state except itemstateexcept
observ manag impl observationmanagerimpl ob mgr obsmgr
wsp impl wspimpl
ob mgr obsmgr observ manag impl observationmanagerimpl wsp impl wspimpl observ manag getobservationmanag
repositori except repositoryexcept
string msg observationmanag unavail
log error msg
item state except itemstateexcept msg
share state mgr sharedstatemgr store chang log changelog ob mgr obsmgr
chang log changelog persist
inheritdoc
dispos
localitemstatemanag instanc longer need
cach item state safe discard
iter iter cach valu iter
iter hasnext
item state itemst state item state itemst iter
longer interest statu item state
state remov listen removelisten
discard item state remain listen inform
statu chang
state discard
item state dispos
state dispos ondispos
clear cach
cach evict evictal
itemstatelisten
inheritdoc
state creat statecr item state itemst creat
inheritdoc
state modifi statemodifi item state itemst modifi
inheritdoc
state destroi statedestroi item state itemst destroi
destroi remov listen removelisten
cach evict destroi getid
inheritdoc
state discard statediscard item state itemst discard
discard remov listen removelisten
cach evict discard getid
