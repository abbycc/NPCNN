org apach jackrabbit core xml
org apach jackrabbit core batch item oper batcheditemoper
org apach jackrabbit core constant
org apach jackrabbit core hierarchi manag hierarchymanag
org apach jackrabbit core malform path except malformedpathexcept
org apach jackrabbit core namespac resolv namespaceresolv
org apach jackrabbit core node nodeid
org apach jackrabbit core path
org apach jackrabbit core properti propertyid
org apach jackrabbit core qname
org apach jackrabbit core session impl sessionimpl
org apach jackrabbit core workspac impl workspaceimpl
org apach jackrabbit core nodetyp effect node type effectivenodetyp
org apach jackrabbit core nodetyp node def nodedef
org apach jackrabbit core nodetyp node type registri nodetyperegistri
org apach jackrabbit core nodetyp prop def propdef
org apach jackrabbit core state node state nodest
org apach jackrabbit core state properti state propertyst
org apach jackrabbit core util base64
org apach jackrabbit core util refer chang tracker referencechangetrack
org apach jackrabbit core util uuid uuid
org apach jackrabbit core intern internalvalu
org apach log4j logger
javax jcr import uuid behavior importuuidbehavior
javax jcr item exist except itemexistsexcept
javax jcr item found except itemnotfoundexcept
javax jcr path found except pathnotfoundexcept
javax jcr properti type propertytyp
javax jcr repositori except repositoryexcept
javax jcr lock lock except lockexcept
javax jcr nodetyp constraint violat except constraintviolationexcept
javax jcr version version except versionexcept
javax jcr version version histori versionhistori
java byte arrai input stream bytearrayinputstream
java byte arrai output stream bytearrayoutputstream
java except ioexcept
java util iter
java util list
java util stack
code workspaceimport code
workspac import workspaceimport import constant
logger log logger logger getlogg workspac import workspaceimport
node state nodest import target importtarget
workspac impl workspaceimpl wsp
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
session impl sessionimpl se session impl sessionimpl wsp session getsess
item op itemop batch item oper batcheditemoper wsp item state manag getitemstatemanag
reg ntreg wsp lock manag getlockmanag se wsp hierarchi manag gethierarchymanag
se namespac resolv getnamespaceresolv
hier mgr hiermgr wsp hierarchi manag gethierarchymanag
perform preliminari check
item op itemop verifi write verifycanwrit parent path parentpath
import target importtarget item op itemop node state getnodest parent path parentpath
wsp wsp
reg ntreg reg ntreg
uuid behavior uuidbehavior uuid behavior uuidbehavior
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
ent includ node type includesnodetyp mix referenc mix referenc
ref tracker reftrack map uuid mappeduuid node info nodeinfo uuid getuuid node uuid getuuid
uuid behavior uuidbehavior import uuid behavior importuuidbehavior import uuid collis throw import uuid collis throw
string msg node uuid node info nodeinfo uuid getuuid
exist
log debug msg
item exist except itemexistsexcept msg
uuid behavior uuidbehavior import uuid behavior importuuidbehavior import uuid collis remov exist import uuid collis remov exist
make conflict node importtarget ancestor thereof
path hier mgr hiermgr path getpath import target importtarget getid
path hier mgr hiermgr path getpath conflict getid
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
node info nodeinfo uuid getuuid
uuid behavior uuidbehavior import uuid behavior importuuidbehavior import uuid collis replac exist import uuid collis replac exist
conflict parent uuid getparentuuid
string msg root node replac
log debug msg
repositori except repositoryexcept msg
'replace' current parent parent conflict
node nodeid parent parentid node nodeid conflict parent uuid getparentuuid
parent item op itemop node state getnodest parent parentid
item found except itemnotfoundexcept inf
string msg intern error fail retriev parent state
log error msg inf
repositori except repositoryexcept msg inf
remov conflict
check conflict remov
item op itemop check remov node checkremovenod conflict
batch item oper batcheditemoper check access check access
batch item oper batcheditemoper check lock check lock
batch item oper batcheditemoper check version check version
batch item oper batcheditemoper check constraint check constraint
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
node info nodeinfo uuid getuuid
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
ent includ node type includesnodetyp mix version mix version
prop def propdef def
properti state propertyst prop
session impl sessionimpl session session impl sessionimpl wsp session getsess
version histori versionhistori hist session version manag getversionmanag creat version histori createversionhistori session node
jcr versionhistori
node properti entri haspropertyentri jcr versionhistori jcr versionhistori
def item op itemop find applic properti definit findapplicablepropertydefinit jcr versionhistori jcr versionhistori
properti type propertytyp refer node
prop item op itemop creat properti state createpropertyst node jcr versionhistori jcr versionhistori
properti type propertytyp refer def
prop set valu setvalu intern internalvalu intern internalvalu creat uuid hist uuid getuuid
jcr basevers
node properti entri haspropertyentri jcr basevers jcr basevers
def item op itemop find applic properti definit findapplicablepropertydefinit jcr basevers jcr basevers
properti type propertytyp refer node
prop item op itemop creat properti state createpropertyst node jcr basevers jcr basevers
properti type propertytyp refer def
prop set valu setvalu intern internalvalu intern internalvalu creat uuid hist root version getrootvers uuid getuuid
jcr predecessor
node properti entri haspropertyentri jcr predecessor jcr predecessor
def item op itemop find applic properti definit findapplicablepropertydefinit jcr predecessor jcr predecessor
properti type propertytyp refer node
prop item op itemop creat properti state createpropertyst node jcr predecessor jcr predecessor
properti type propertytyp refer def
prop set valu setvalu intern internalvalu intern internalvalu creat uuid hist root version getrootvers uuid getuuid
jcr ischeckedout
node properti entri haspropertyentri jcr ischeckedout jcr ischeckedout
def item op itemop find applic properti definit findapplicablepropertydefinit jcr ischeckedout jcr ischeckedout
properti type propertytyp boolean node
prop item op itemop creat properti state createpropertyst node jcr ischeckedout jcr ischeckedout
properti type propertytyp boolean def
prop set valu setvalu intern internalvalu intern internalvalu creat
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
namespac resolv namespaceresolv context nscontext
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
string uuid node info nodeinfo uuid getuuid
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
node nodeid exist idexist node nodeid entri uuid getuuid
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
item op itemop safe jcr path safegetjcrpath exist getid
def auto creat isautocr ent exist entexist includ node type includesnodetyp ntname
node auto creat
creat
node exist
item exist except itemexistsexcept item op itemop safe jcr path safegetjcrpath exist getid
node
node
uuid
potenti uuid conflict creat node
node def nodedef def
item op itemop find applic node definit findapplicablenodedefinit node nodenam ntname parent
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
potenti uuid conflict
node state nodest conflict
conflict item op itemop node state getnodest node nodeid uuid
item found except itemnotfoundexcept inf
conflict
conflict
resolv uuid conflict
node resolv uuid conflict resolveuuidconflict parent conflict node info nodeinfo
creat uuid
node def nodedef def
item op itemop find applic node definit findapplicablenodedefinit node nodenam ntname parent
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
node item op itemop creat node state createnodest parent node nodenam ntname mixin uuid def
process properti
iter iter prop info propinfo iter
iter hasnext
prop info propinfo prop info propinfo iter
qname prop propnam getnam
text textvalu tva valu getvalu
type type gettyp
properti state propertyst prop
prop def propdef def
node properti entri haspropertyentri prop propnam
properti exist
properti propertyid exist idexist properti propertyid node uuid getuuid prop propnam
properti state propertyst exist
properti state propertyst item op itemop item state getitemst exist idexist
def reg ntreg prop def getpropdef exist definit getdefinitionid
def protect isprotect
skip protect properti
log debug skip protect properti
item op itemop safe jcr path safegetjcrpath exist idexist
def auto creat isautocr exist type gettyp type
type properti type propertytyp undefin
def multipl ismultipl exist multi valu ismultivalu
properti auto creat
creat
prop exist
item exist except itemexistsexcept item op itemop safe jcr path safegetjcrpath exist getid
prop
properti
find applic definit
multi singl valu properti
tva length
singl multi valu
singl valu
def item op itemop find applic properti definit findapplicablepropertydefinit prop propnam
type node
constraint violat except constraintviolationexcept cve
multi valu
def item op itemop find applic properti definit findapplicablepropertydefinit prop propnam
type node
multi valu
def item op itemop find applic properti definit findapplicablepropertydefinit prop propnam
type node
def protect isprotect
skip protect properti
log debug skip protect properti prop propnam
creat properti
prop item op itemop creat properti state createpropertyst node prop propnam type def
check multi valu characterist
tva length tva length def multipl ismultipl
constraint violat except constraintviolationexcept item op itemop safe jcr path safegetjcrpath prop getid
multi valu
convert serial valu internalvalu object
intern internalvalu iva intern internalvalu tva length
target type targettyp def requir type getrequiredtyp
target type targettyp properti type propertytyp undefin
type properti type propertytyp undefin
target type targettyp properti type propertytyp string
target type targettyp type
tva length
text textvalu tva
target type targettyp properti type propertytyp binari
base64 encod binari type
decod reader
todo decod temp file pass fileinputstream internalvalu factori method
file tmpfile null
tmpfile file createtempfil bin null
fileoutputstream fileoutputstream tmpfile
base64 decod reader
close
iva internalvalu creat fileinputstream tmpfile
catch ioexcept ioe
string msg fail decod binari
log debug msg ioe
throw repositoryexcept msg ioe
final
temp file delet
internalvalu instanc spool
content
tmpfile null
tmpfile delet
byte arrai output stream bytearrayoutputstream bao byte arrai output stream bytearrayoutputstream
base64 decod reader bao
close bytearrayoutputstream
bao close
iva intern internalvalu creat byte arrai input stream bytearrayinputstream bao byte arrai tobytearrai
except ioexcept ioe
string msg fail decod binari
log debug msg ioe
repositori except repositoryexcept msg ioe
retriev serial
string ser servalu
ser servalu retriev
except ioexcept ioe
string msg fail retriev serial
log debug msg ioe
repositori except repositoryexcept msg ioe
convert serial internalvalu
current namespac context xml document
iva intern internalvalu creat ser servalu target type targettyp
context nscontext
set valu
prop set valu setvalu iva
make properti valid definit
item op itemop valid prop
prop type gettyp properti type propertytyp refer
store refer resolut
ref tracker reftrack process refer processedrefer prop
store properti
item op itemop store prop
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
string origin uuid val intern internalvalu string tostr
string adjust ref tracker reftrack map uuid getmappeduuid origin
adjust
val newval intern internalvalu creat uuid string fromstr adjust
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
