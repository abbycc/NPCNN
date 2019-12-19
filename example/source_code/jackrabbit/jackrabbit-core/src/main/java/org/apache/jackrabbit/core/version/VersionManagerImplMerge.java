org apach jackrabbit core version
java util hash set hashset
java util iter
java util link list linkedlist
java util list
java util set
javax jcr access deni except accessdeniedexcept
javax jcr merg except mergeexcept
javax jcr node
javax jcr properti type propertytyp
javax jcr repositori except repositoryexcept
javax jcr unsupport repositori oper except unsupportedrepositoryoperationexcept
javax jcr version version
javax jcr version version except versionexcept
org apach jackrabbit core hierarchi manag hierarchymanag
org apach jackrabbit core item valid itemvalid
org apach jackrabbit core item itemid
org apach jackrabbit core node nodeid
org apach jackrabbit core secur author permiss
org apach jackrabbit core session session context sessioncontext
org apach jackrabbit core state child node entri childnodeentri
org apach jackrabbit core state item state except itemstateexcept
org apach jackrabbit core state properti state propertyst
org apach jackrabbit core state updat item state manag updatableitemstatemanag
org apach jackrabbit core intern internalvalu
org apach jackrabbit spi
org apach jackrabbit spi common constant nameconst
org slf4j logger
org slf4j logger factori loggerfactori
jcr version manag implement split class order
group relat method
class method merg oper
version manag impl merg versionmanagerimplmerg version manag impl restor versionmanagerimplrestor
default logger
logger log logger factori loggerfactori logger getlogg version manag impl merg versionmanagerimplmerg
creat version manag session
param context compon context current session
param statemgr underli state manag
param hiermgr local hierarchi manag
version manag impl merg versionmanagerimplmerg
session context sessioncontext context updat item state manag updatableitemstatemanag state mgr statemgr
hierarchi manag hierarchymanag hier mgr hiermgr
context state mgr statemgr hier mgr hiermgr
merg updat node
param state state merg updat
param srcroot src workspac root node
param failedid list fail id
param besteffort effort flag
param shallow shallow flag
throw repositoryexcept error occur
throw itemstateexcept error occur
merg node state nodestateex state node state nodestateex src root srcroot
list item itemid fail id failedid
effort besteffort shallow
repositori except repositoryexcept item state except itemstateexcept
shallow
code isshallow code code true code node
version method return made
state effect node type geteffectivenodetyp includ node type includesnodetyp constant nameconst mix version mix version
node state nodestateex src node srcnode node getcorrespondingnod state src root srcroot
src node srcnode
node merg call
node workspac merg method return quietli
made
write oper writeoper op start write oper startwriteoper
intern merg internalmerg state src root srcroot fail id failedid effort besteffort shallow
state store
op save
op close
merg updat node
param state state merg updat
param srcroot src workspac root node
param failedid list fail id
param besteffort effort flag
param shallow shallow flag
throw repositoryexcept error occur
throw itemstateexcept error occur
intern merg internalmerg node state nodestateex state node state nodestateex src root srcroot
list item itemid fail id failedid
effort besteffort shallow
repositori except repositoryexcept item state except itemstateexcept
node state nodestateex src node srcnode merg test domergetest state src root srcroot fail id failedid effort besteffort
src node srcnode
shallow
leav iter children ignor version child
node jcr
node state nodestateex state child node getchildnod
effect node type geteffectivenodetyp includ node type includesnodetyp constant nameconst mix version mix version
intern merg internalmerg src root srcroot fail id failedid effort besteffort shallow
check lock hold statu node exist
check modifi checkmodifi state item valid itemvalid check lock check lock item valid itemvalid check hold check hold permiss
remov properti present srcnode
properti state propertyst prop state properti getproperti
src node srcnode properti hasproperti prop getnam
state remov properti removeproperti prop getnam
updat properti src node
properti state propertyst prop src node srcnode properti getproperti
prop propnam prop getnam
ignor system type
prop propnam equal constant nameconst jcr primarytyp jcr primarytyp
prop propnam equal constant nameconst jcr mixintyp jcr mixintyp
prop propnam equal constant nameconst jcr uuid jcr uuid
state copi copyfrom prop
updat mixin type
state set mixin setmixin src node srcnode state getstat mixin type name getmixintypenam
remov child node
link list linkedlist child node entri childnodeentri delet todelet link list linkedlist child node entri childnodeentri
child node entri childnodeentri entri state state getstat child node entri getchildnodeentri
src node srcnode state getstat child node entri haschildnodeentri entri getnam entri index getindex
delet todelet add entri
child node entri childnodeentri entri delet todelet
state remov node removenod entri getnam entri index getindex
state store
add sourc
child node entri childnodeentri entri src node srcnode state getstat child node entri getchildnodeentri
node state nodestateex child state node getnod entri getnam entri index getindex
child
destin workspac node remov
state node hasnod entri getid
child state node getnod entri getid
node state nodestateex parent child parent getpar
parent remov node removenod child
parent store
creat child
node state nodestateex src child srcchild src node srcnode node getnod entri getid
child state add node addnod entri getnam src child srcchild state getstat node type getnodetypenam src child srcchild node getnodeid
child set mixin setmixin src child srcchild state getstat mixin type name getmixintypenam
copi src child
state store
intern merg internalmerg child src root srcroot effort besteffort
shallow
recurs merg
intern merg internalmerg child src root srcroot fail id failedid effort besteffort
return node workspac session
node workspac node workspac
defin
root node root node
referenc uuid node
uuid
referenc uuid
node nearest ancestor
referenc root node node
node rel path
param state
param srcroot root node state
return node code null code
node exist
throw repositoryexcept error occur
node state nodestateex node getcorrespondingnod node state nodestateex state node state nodestateex src root srcroot
repositori except repositoryexcept
search nearest ancestor referenc
node state nodestateex state
link list linkedlist child node entri childnodeentri element link list linkedlist child node entri childnodeentri
parent getparentid
effect node type geteffectivenodetyp includ node type includesnodetyp constant nameconst mix referenc mix referenc
node state nodestateex parent parent getpar
element add addfirst parent state getstat child node entri getchildnodeentri node getnodeid
parent
check ancestor exist
src root srcroot node hasnod node getnodeid
node state nodestateex src root srcroot node getnod node getnodeid
iter child node entri childnodeentri iter element iter
iter hasnext
child node entri childnodeentri iter
node getnod getnam index getindex
perform merg test result 'update'
sourc node return result 'leave' 'besteffort fail'
code null code return result merg test
'fail' besteffort set code fals code mergeexcept
thrown
jsr170 merg
check
successor degre merg result
updat
predecessor degre
ident version
merg result leav
successor predecessor
ident merg result fail
case repres diverg
branch version graph determin
result merg trivial
check
predecessor degre
ident version
merg result leav
relationship hold
merg result fail
param state state test
param srcroot root node state sourc workspac
param failedid list store fail node id
param besteffort effort flag
return sourc node code null code
throw repositoryexcept error occur
throw accessdeniedexcept access deni
node state nodestateex merg test domergetest node state nodestateex state node state nodestateex src root srcroot list item itemid fail id failedid effort besteffort
repositori except repositoryexcept access deni except accessdeniedexcept
node merg result leav
node state nodestateex src node srcnode node getcorrespondingnod state src root srcroot
src node srcnode
version updat
state effect node type geteffectivenodetyp includ node type includesnodetyp constant nameconst mix version mix version fail id failedid
src node srcnode
sourc node version leav
src node srcnode effect node type geteffectivenodetyp includ node type includesnodetyp constant nameconst mix version mix version
test version code simplifi
intention expand follow spec
intern version internalvers base version getbasevers state
intern version internalvers base version getbasevers src node srcnode
check ischeckedout state
check
recent ismorerec
eventu successor merg result updat
src node srcnode
equal recent ismorerec
eventu predecessor ident
version merg result leav
eventu successor eventu predecessor
ident merg result fail case
repres diverg branch version graph
fail cover
check
equal recent ismorerec
eventu predecessor ident
version merg result
leav
relationship hold merg result
fail
fail cover
recent ismorerec check ischeckedout state
successor degre merg result
updat case thought case
newer updat reflect
src node srcnode
equal recent ismorerec
predecessor degre
ident version merg
result leav case thought case
older ag left
successor predecessor ident
merg result fail case
repres diverg branch version graph
determin result merg trivial
effort besteffort
add 'offending' version jcr mergefail properti
set node nodeid set merg fail getmergefail state
set add getid
set merg fail setmergefail state set
fail id failedid add state node getnodeid
state store
string msg
unabl merg node violat version safe jcr path safegetjcrpath state
log debug msg
merg except mergeexcept msg
perform link node cancelmerg version link node donemerg version
depend code cancel code
param state state finish
param version version
param cancel flag inid cancel oper
throw repositoryexcept error occur
finish merg finishmerg node state nodestateex state version version cancel
repositori except repositoryexcept
check version
check version checkversion state
unsupport repositori oper except unsupportedrepositoryoperationexcept node full version safe jcr path safegetjcrpath state
check version mergefail list
set node nodeid fail merg fail getmergefail state
node nodeid version versionid version impl versionimpl version node getnodeid
fail remov version versionid
string msg
unabl finish merg version
jcr mergefail properti safe jcr path safegetjcrpath state
log error msg
version except versionexcept msg
write oper writeoper op start write oper startwriteoper
remov version mergefail list
set merg fail setmergefail state fail
cancel
add version jcr predecessor list
intern internalvalu val state properti valu getpropertyvalu constant nameconst jcr predecessor jcr predecessor
intern internalvalu intern internalvalu val length
val length
intern internalvalu creat val node getnodeid
val length intern internalvalu creat version versionid
state set properti valu setpropertyvalu constant nameconst jcr predecessor jcr predecessor properti type propertytyp refer
state store
op save
item state except itemstateexcept
repositori except repositoryexcept
op close
return set nodeid jcr mergefail properti state
param state state
return set node id
throw repositoryexcept error occur
set node nodeid merg fail getmergefail node state nodestateex state
repositori except repositoryexcept
set node nodeid set hash set hashset node nodeid
state properti hasproperti constant nameconst jcr mergefail jcr mergefail
intern internalvalu val state properti valu getpropertyvalu constant nameconst jcr mergefail jcr mergefail
intern internalvalu val val
set add val node getnodeid
set
updat merg fail properti state
param state state updat
param set set id
throw repositoryexcept error occur
set merg fail setmergefail node state nodestateex state set node nodeid set
repositori except repositoryexcept
set empti isempti
state remov properti removeproperti constant nameconst jcr mergefail jcr mergefail
intern internalvalu val intern internalvalu set size
iter node nodeid iter set iter
iter hasnext
node nodeid iter
val intern internalvalu creat
state set properti valu setpropertyvalu constant nameconst jcr mergefail jcr mergefail properti type propertytyp refer val
merg activ workspac
param activ intern activ
param failedid list fail id
throw repositoryexcept error occur
merg intern activ internalact activ list item itemid fail id failedid
repositori except repositoryexcept
version set versionset chang set changeset activ chang set getchangeset
write oper writeoper op start write oper startwriteoper
iter node nodeid iter chang set changeset version kei set keyset iter
iter hasnext
intern version internalvers chang set changeset version remov iter
node state nodestateex state node state getnodestateex frozen node getfrozennod frozen getfrozenid
state
intern version internalvers base base version getbasevers state
base version newer version add fail list
merg
base recent ismorerec
fail id failedid add state node getnodeid
add jcr mergefail properti
set node nodeid set merg fail getmergefail state
set add base getid
set merg fail setmergefail state set
state store
intern version internalvers restor intern restor internalrestor state chang set changeset
chang set changeset version remov restor version histori getversionhistori getid
reset iter
iter chang set changeset version kei set keyset iter
op save
item state except itemstateexcept
repositori except repositoryexcept
op close
