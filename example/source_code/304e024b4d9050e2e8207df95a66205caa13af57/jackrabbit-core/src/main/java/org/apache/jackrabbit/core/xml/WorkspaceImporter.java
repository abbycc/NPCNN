org apach jackrabbit core xml
org apach jackrabbit core batch item oper batcheditemoper
org apach jackrabbit core hierarchi manag hierarchymanag
org apach jackrabbit core node nodeid
org apach jackrabbit core properti propertyid
org apach jackrabbit core session impl sessionimpl
org apach jackrabbit core workspac impl workspaceimpl
org apach jackrabbit core nodetyp effect node type effectivenodetyp
org apach jackrabbit core nodetyp node def nodedef
org apach jackrabbit core nodetyp node type registri nodetyperegistri
org apach jackrabbit core nodetyp prop def propdef
org apach jackrabbit core state item state itemst
org apach jackrabbit core state node state nodest
org apach jackrabbit core state properti state propertyst
org apach jackrabbit core util refer chang tracker referencechangetrack
org apach jackrabbit core intern internalvalu
org apach jackrabbit core version version manag versionmanag
org apach jackrabbit malform path except malformedpathexcept
org apach jackrabbit path
org apach jackrabbit qname
org apach jackrabbit uuid uuid
org slf4j logger
org slf4j logger factori loggerfactori
javax jcr import uuid behavior importuuidbehavior
javax jcr item exist except itemexistsexcept
javax jcr item found except itemnotfoundexcept
javax jcr path found except pathnotfoundexcept
javax jcr properti type propertytyp
javax jcr repositori except repositoryexcept
javax jcr lock lock except lockexcept
javax jcr nodetyp constraint violat except constraintviolationexcept
javax jcr version version
javax jcr version version except versionexcept
javax jcr version version histori versionhistori
java util iter
java util list
java util stack
java util arrai list arraylist
code workspaceimport code
workspac import workspaceimport import
logger log logger factori loggerfactori logger getlogg workspac import workspaceimport
node state nodest import target importtarget
workspac impl workspaceimpl wsp
session impl sessionimpl session
version manag versionmanag version manag versionmanag
node type registri nodetyperegistri reg ntreg
hierarchi manag hierarchymanag hier mgr hiermgr
batch item oper batcheditemoper item op itemop
uuid behavior uuidbehavior
abort
stack parent
helper object track remap uuid' import refer
properti correct depend uuid map
refer chang tracker referencechangetrack ref tracker reftrack
creat code workspaceimport code instanc
param parentpath target path add import subtre
param wsp
param ntreg
param uuidbehavior flag govern incom uuid handl
throw pathnotfoundexcept node exist
code parentpath code
current session grant read
access
throw constraintviolationexcept node
code parentpath code protect
throw versionexcept node
code parentpath code
check
throw lockexcept lock prevent addit
subtre
throw repositoryexcept error occur
workspac import workspaceimport path parent path parentpath
workspac impl workspaceimpl wsp
node type registri nodetyperegistri reg ntreg
uuid behavior uuidbehavior
path found except pathnotfoundexcept constraint violat except constraintviolationexcept
version except versionexcept lock except lockexcept repositori except repositoryexcept
wsp wsp
session session impl sessionimpl wsp session getsess
version manag versionmanag session version manag getversionmanag
reg ntreg reg ntreg
uuid behavior uuidbehavior uuid behavior uuidbehavior
item op itemop batch item oper batcheditemoper
wsp item state manag getitemstatemanag reg ntreg session lock manag getlockmanag
session wsp hierarchi manag gethierarchymanag
hier mgr hiermgr wsp hierarchi manag gethierarchymanag
perform preliminari check
item op itemop verifi write verifycanwrit parent path parentpath
import target importtarget item op itemop node state getnodest parent path parentpath
abort
ref tracker reftrack refer chang tracker referencechangetrack
parent stack
parent push import target importtarget
param parent
param conflict
param nodeinfo
return
throw repositoryexcept
node state nodest resolv uuid conflict resolveuuidconflict node state nodest parent
node state nodest conflict
node info nodeinfo node info nodeinfo
repositori except repositoryexcept
node state nodest node
uuid behavior uuidbehavior import uuid behavior importuuidbehavior import uuid creat import uuid creat
creat uuid
check node ad check access right
node type constraint assum lock version statu
check ancestor
item op itemop check add node checkaddnod parent node info nodeinfo getnam
node info nodeinfo node type getnodetypenam
batch item oper batcheditemoper check access check access
batch item oper batcheditemoper check constraint check constraint
node item op itemop creat node state createnodest parent node info nodeinfo getnam
node info nodeinfo node type getnodetypenam node info nodeinfo mixin name getmixinnam
rememb uuid map
effect node type effectivenodetyp ent item op itemop effect node type geteffectivenodetyp node
ent includ node type includesnodetyp qname mix referenc mix referenc
ref tracker reftrack map uuid mappeduuid node info nodeinfo getid uuid getuuid node node getnodeid uuid getuuid
uuid behavior uuidbehavior import uuid behavior importuuidbehavior import uuid collis throw import uuid collis throw
string msg node uuid node info nodeinfo getid
exist
log debug msg
item exist except itemexistsexcept msg
uuid behavior uuidbehavior import uuid behavior importuuidbehavior import uuid collis remov exist import uuid collis remov exist
make conflict node importtarget ancestor thereof
path hier mgr hiermgr path getpath import target importtarget node getnodeid
path hier mgr hiermgr path getpath conflict node getnodeid
equal ancestor isancestorof
string msg remov ancestor node
log debug msg
constraint violat except constraintviolationexcept msg
malform path except malformedpathexcept mpe
string msg intern error fail determin degre relationship
log error msg mpe
repositori except repositoryexcept msg mpe
remov conflict
check conflict remov
access right node type constraint lock version statu
item op itemop check remov node checkremovenod conflict
batch item oper batcheditemoper check access check access
batch item oper batcheditemoper check lock check lock
batch item oper batcheditemoper check version check version
batch item oper batcheditemoper check constraint check constraint
remov conflict recurs
item op itemop remov node state removenodest conflict
creat uuid
check node ad check access right
node type constraint assum lock version statu
check ancestor
item op itemop check add node checkaddnod parent node info nodeinfo getnam
node info nodeinfo node type getnodetypenam
batch item oper batcheditemoper check access check access
batch item oper batcheditemoper check constraint check constraint
creat node
node item op itemop creat node state createnodest parent node info nodeinfo getnam
node info nodeinfo node type getnodetypenam node info nodeinfo mixin name getmixinnam
node info nodeinfo getid
uuid behavior uuidbehavior import uuid behavior importuuidbehavior import uuid collis replac exist import uuid collis replac exist
node nodeid parent parentid conflict parent getparentid
parent parentid
string msg root node replac
log debug msg
repositori except repositoryexcept msg
'replace' current parent parent conflict
parent item op itemop node state getnodest parent parentid
item found except itemnotfoundexcept inf
string msg intern error fail retriev parent state
log error msg inf
repositori except repositoryexcept msg inf
remov conflict
check conflict remov
access right node type constraint lock version statu
item op itemop check remov node checkremovenod conflict
batch item oper batcheditemoper check access check access
batch item oper batcheditemoper check lock check lock
batch item oper batcheditemoper check version check version
batch item oper batcheditemoper check constraint check constraint
'replace' 'remov exist add new' oper
order parent'
child node entri jcr
backup list child node entri order
restor
node state nodest child node entri childnodeentri cne conflict cneconflict parent child node entri getchildnodeentri node info nodeinfo getid
list cne list cnelist arrai list arraylist parent child node entri getchildnodeentri
remov conflict recurs
item op itemop remov node state removenodest conflict
creat uuid locat conflict
check node ad locat
access right node type constraint lock version statu
item op itemop check add node checkaddnod parent node info nodeinfo getnam
node info nodeinfo node type getnodetypenam
batch item oper batcheditemoper check access check access
batch item oper batcheditemoper check lock check lock
batch item oper batcheditemoper check version check version
batch item oper batcheditemoper check constraint check constraint
creat node
node item op itemop creat node state createnodest parent node info nodeinfo getnam
node info nodeinfo node type getnodetypenam node info nodeinfo mixin name getmixinnam
node info nodeinfo getid
restor list child node entri jcr
cne conflict cneconflict getnam equal node info nodeinfo getnam
restor origin child node list
parent set child node entri setchildnodeentri cne list cnelist
replac child node entri
preserv origin posit
parent remov child node entri removeallchildnodeentri
iter iter cne list cnelist iter iter hasnext
node state nodest child node entri childnodeentri cne node state nodest child node entri childnodeentri iter
cne getid equal node info nodeinfo getid
replac entri
parent add child node entri addchildnodeentri node info nodeinfo getnam node info nodeinfo getid
parent add child node entri addchildnodeentri cne getnam cne getid
string msg unknown uuidbehavior uuid behavior uuidbehavior
log debug msg
repositori except repositoryexcept msg
node
post process import node initi properti special
semant
param node
throw repositoryexcept
post process node postprocessnod node state nodest node repositori except repositoryexcept
special handl requir properti special semant
defin mix referenc mix version
mix lockabl
todo fixm deleg 'node type instanc handler'
effect node type effectivenodetyp ent item op itemop effect node type geteffectivenodetyp node
ent includ node type includesnodetyp qname mix version mix version
check version histori
node case version node
export remov import
import uuid collis remov exist
import uuid collis replac exist
creat version histori
version histori versionhistori histori version manag versionmanag version histori getversionhistori session node
histori
histori version manag versionmanag creat version histori createversionhistori session node
version root version rootvers histori root version getrootvers
jcr versionhistori
condit add properti conditionaladdproperti
node qname jcr versionhistori jcr versionhistori properti type propertytyp refer
intern internalvalu creat uuid histori uuid getuuid
jcr basevers
condit add properti conditionaladdproperti
node qname jcr basevers jcr basevers properti type propertytyp refer
intern internalvalu creat uuid root version rootvers uuid getuuid
jcr predecessor
condit add properti conditionaladdproperti
node qname jcr predecessor jcr predecessor properti type propertytyp refer
intern internalvalu creat uuid root version rootvers uuid getuuid
jcr ischeckedout
condit add properti conditionaladdproperti
node qname jcr ischeckedout jcr ischeckedout properti type propertytyp boolean
intern internalvalu creat
add properti node properti
exist
param node node properti ad
param properti
param type properti type link propertytyp
param multipl properti multivalu
param initi properti ad
throw repositoryexcept properti ad
condit add properti conditionaladdproperti
node state nodest node qname type multipl
intern internalvalu
repositori except repositoryexcept
node properti haspropertynam
prop def propdef def item op itemop find applic properti definit findapplicablepropertydefinit
type multipl node
properti state propertyst prop item op itemop creat properti state createpropertyst
node type def
prop set valu setvalu intern internalvalu
import
inheritdoc
start repositori except repositoryexcept
start updat oper
item op itemop edit
illeg state except illegalstateexcept is
abort
string msg intern error fail start updat oper
log debug msg
repositori except repositoryexcept msg is
inheritdoc
start node startnod node info nodeinfo node info nodeinfo list prop info propinfo
repositori except repositoryexcept
abort
import abort outta
succeed
node state nodest parent
check saniti workspac session
wsp saniti check sanitycheck
parent node state nodest parent peek
process node
node state nodest node
node nodeid node info nodeinfo getid
qname node nodenam node info nodeinfo getnam
qname ntname node info nodeinfo node type getnodetypenam
qname mixin node info nodeinfo mixin name getmixinnam
parent
parent node skip skip child node
parent push parent push null push null stack skip node
succeed
log debug skip node node nodenam
parent child node entri haschildnodeentri node nodenam
node exist
node state nodest child node entri childnodeentri entri
parent child node entri getchildnodeentri node nodenam
node nodeid exist idexist entri getid
node state nodest exist node state nodest item op itemop item state getitemst exist idexist
node def nodedef def reg ntreg node def getnodedef exist definit getdefinitionid
def sibl allowssamenames
exist sibl
check potenti conflict
effect node type effectivenodetyp ent exist entexist
item op itemop effect node type geteffectivenodetyp exist
def protect isprotect ent exist entexist includ node type includesnodetyp ntname
skip protect node
parent push parent push null push null stack skip node
succeed
log debug skip protect node
item op itemop safe jcr path safegetjcrpath exist node getnodeid
def auto creat isautocr ent exist entexist includ node type includesnodetyp ntname
node auto creat
creat
node exist
item exist except itemexistsexcept item op itemop safe jcr path safegetjcrpath exist node getnodeid
node
node
potenti uuid conflict creat node
node def nodedef def item op itemop find applic node definit findapplicablenodedefinit
node nodenam ntname parent
def protect isprotect
skip protect node
parent push parent push null push null stack skip node
succeed
log debug skip protect node node nodenam
parent properti haspropertynam node nodenam
resolv properti conflict resolvepropertynameconflict parent node nodenam
check node ad check access right
node type constraint assum lock version statu
check ancestor
item op itemop check add node checkaddnod parent node nodenam ntname
batch item oper batcheditemoper check access check access
batch item oper batcheditemoper check constraint check constraint
creat node
node item op itemop creat node state createnodest parent node nodenam ntname mixin def
potenti uuid conflict
node state nodest conflict item op itemop node state getnodest
resolv uuid conflict
node resolv uuid conflict resolveuuidconflict parent conflict node info nodeinfo
item found except itemnotfoundexcept
creat uuid
node def nodedef def item op itemop find applic node definit findapplicablenodedefinit
node nodenam ntname parent
def protect isprotect
skip protect node
parent push parent push null push null stack skip node
succeed
log debug skip protect node node nodenam
check node ad check access right
node type constraint assum lock version statu
check ancestor
item op itemop check add node checkaddnod parent node nodenam ntname
batch item oper batcheditemoper check access check access
batch item oper batcheditemoper check constraint check constraint
creat node
node item op itemop creat node state createnodest parent node nodenam ntname mixin def
process properti
iter iter prop info propinfo iter
iter hasnext
prop info propinfo prop info propinfo iter
appli node item op itemop reg ntreg ref tracker reftrack
store affect node
item op itemop store node
item op itemop store parent
push current node stack parent
parent push node
succeed
succeed
updat oper fail cancel modif
abort
item op itemop cancel
resolv conflict properti node
import exist properti import
document view import element
attribut parent element
renam conflict properti
http issu apach org jira brows jcr
param parent parent node
param node import
throw repositoryexcept
resolv properti conflict resolvepropertynameconflict node state nodest parent qname
repositori except repositoryexcept
properti propertyid prop propid properti propertyid parent node getnodeid
properti state propertyst conflict item op itemop properti state getpropertyst prop propid
conflict statu getstatu item state itemst statu statu
assum properti import
renam conflict properti
todo revers escap scheme creat uniqu
qname newnam qname namespac uri getnamespaceuri local getlocalnam
parent properti haspropertynam newnam
newnam qname newnam namespac uri getnamespaceuri newnam local getlocalnam
intern internalvalu valu conflict valu getvalu
properti state propertyst prop newprop item op itemop creat properti state createpropertyst
parent newnam conflict type gettyp valu length
prop newprop set valu setvalu valu
parent remov properti removepropertynam
item op itemop store parent
item op itemop destroi conflict
inheritdoc
end node endnod node info nodeinfo node info nodeinfo repositori except repositoryexcept
abort
import abort outta
node state nodest node node state nodest parent pop
node
node skip
succeed
check saniti workspac session
wsp saniti check sanitycheck
post process node initi properti special semant
post process node postprocessnod node
make node valid definit
item op itemop valid node
node store state
item op itemop store node
succeed
succeed
updat oper fail cancel modif
abort
item op itemop cancel
inheritdoc
end repositori except repositoryexcept
abort
import abort outta
succeed
check saniti workspac session
wsp saniti check sanitycheck
adjust refer refer uuid' map
newli gerer uuid' import
iter iter ref tracker reftrack process refer getprocessedrefer
iter hasnext
properti state propertyst prop properti state propertyst iter
paranoid
prop type gettyp properti type propertytyp refer
modifi
intern internalvalu valu prop valu getvalu
intern internalvalu val newval intern internalvalu valu length
valu length
intern internalvalu val valu
uuid origin val uuid getuuid
uuid adjust ref tracker reftrack map uuid getmappeduuid origin
adjust
val newval intern internalvalu creat adjust
modifi
refer adjust copi
val newval val
modifi
prop set valu setvalu val newval
item op itemop store prop
ref tracker reftrack clear
make import target valid definit
item op itemop valid import target importtarget
final store state import target
parent import subtre
item op itemop store import target importtarget
succeed
succeed
updat oper fail cancel modif
abort
item op itemop cancel
abort
finish updat
item op itemop updat
