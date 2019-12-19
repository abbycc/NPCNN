org apach jackrabbit core
org apach common collect refer map referencemap
org apach jackrabbit core nodetyp
org apach jackrabbit core observ event state collect eventstatecollect
org apach jackrabbit core observ observ manag factori observationmanagerfactori
org apach jackrabbit core state
org apach jackrabbit core util uuid uuid
org apach jackrabbit core version version manag versionmanag
org apach log4j logger
javax jcr
javax jcr lock lock except lockexcept
javax jcr nodetyp constraint violat except constraintviolationexcept
javax jcr nodetyp node def nodedef
javax jcr nodetyp node type nodetyp
javax jcr nodetyp properti def propertydef
javax jcr version version except versionexcept
javax jcr version version histori versionhistori
java util
code itemimpl code implement code item code interfac
item impl itemimpl item item state listen itemstatelisten
logger log logger logger getlogg item impl itemimpl
constant deriv class
system properti valu system gener
jcr uuid
qname propnam uuid propnam uuid
qname namespac registri impl namespaceregistryimpl jcr uri jcr uri uuid
jcr primarytyp
qname propnam primarytyp propnam primarytyp
qname namespac registri impl namespaceregistryimpl jcr uri jcr uri primarytyp
jcr mixintyp
qname propnam mixintyp propnam mixintyp
qname namespac registri impl namespaceregistryimpl jcr uri jcr uri mixintyp
jcr creat
qname propnam creat propnam creat
qname namespac registri impl namespaceregistryimpl jcr uri jcr uri creat
jcr lastmodifi
qname propnam modifi propnam modifi
qname namespac registri impl namespaceregistryimpl jcr uri jcr uri lastmodifi
jcr mergefail
qname propnam merg fail propnam merg fail
qname namespac registri impl namespaceregistryimpl jcr uri jcr uri mergefail
statu normal statu normal
statu modifi statu modifi
statu destroi statu destroi
statu invalid statu invalid
statu
item itemid
code session code code item code acquir
session impl sessionimpl session
code repositori code object
repositori impl repositoryimpl rep
code itemst code code item code
item state itemst state
code itemmanag code creat code item code
item manag itemmanag item mgr itemmgr
code sessionitemstatemanag code code item code
session item state manag sessionitemstatemanag item state mgr itemstatemgr
listen weak refer
map listen
collect synchron map synchronizedmap refer map referencemap refer map referencemap weak refer map referencemap weak
packag privat constructor
param itemmgr code itemmanag code creat code item code
param session code session code code item code acquir
param code item code
param state state code item code
param listen listen life cylc code itemimpl code
item impl itemimpl item manag itemmanag item mgr itemmgr session impl sessionimpl session item itemid item state itemst state
item life cycl listen itemlifecyclelisten listen
session session
rep repositori impl repositoryimpl session repositori getrepositori
item state mgr itemstatemgr session item state manag getitemstatemanag
item mgr itemmgr item mgr itemmgr
state state
statu statu normal statu normal
listen
listen length
add life cycl listen addlifecyclelisten listen
notifi creat notifycr
add item listen event underli state object
state add listen addlisten
final throwabl
state
state remov listen removelisten
throwabl
ignor
final
perform saniti check item session
throw repositoryexcept item render invalid reason
saniti check sanitycheck repositori except repositoryexcept
check session statu
session saniti check sanitycheck
check statu item read oper
statu
statu normal statu normal
statu modifi statu modifi
statu destroi statu destroi
statu invalid statu invalid
invalid item state except invaliditemstateexcept item exist anymor
transient istransi
state transient istransi
item state itemst creat transient item state getorcreatetransientitemst repositori except repositoryexcept
make persist makepersist repositori except repositoryexcept
mark instanc 'removed' notifi listen
result state 'temporarili invalidated'
'perman invalidated' depend initi state
throw repositoryexcept error occur
set remov setremov repositori except repositoryexcept
statu statu invalid statu invalid statu statu destroi statu destroi
instanc 'invalid' outta
item state itemst transient state transientst creat transient item state getorcreatetransientitemst
transient state transientst statu getstatu item state itemst statu statu
'new' item simpli dispos transient state
longer indirectli
statediscard listen method invalid instanc perman
item state mgr itemstatemgr dispos transient item state disposetransientitemst transient state transientst
'existing' item back persist
state mark 'removed'
transient state transientst set statu setstatu item state itemst statu exist remov statu exist remov
transfer transient state attic
item state mgr itemstatemgr move transient item state attic movetransientitemstatetoatt transient state transientst
set state instanc 'invalid'
statu statu invalid statu invalid
notifi listen instanc
temporarili invalid
notifi invalid notifyinvalid
return item state code item code
return state code item code
item state itemst item state getitemst
state
notifi listen instanc discard
temporarili render 'invalid'
notifi creat notifycr
copi listen arrai avoid concurrentmodificationexcept
item life cycl listen itemlifecyclelisten item life cycl listen itemlifecyclelisten listen size
iter iter listen valu iter
cnt
iter hasnext
cnt item life cycl listen itemlifecyclelisten iter
length
item creat itemcr
notifi listen instanc invalid
temporarili render 'invalid'
notifi invalid notifyinvalid
copi listen arrai avoid concurrentmodificationexcept
item life cycl listen itemlifecyclelisten item life cycl listen itemlifecyclelisten listen size
iter iter listen valu iter
cnt
iter hasnext
cnt item life cycl listen itemlifecyclelisten iter
length
item invalid iteminvalid
notifi listen instanc resurrect
render 'valid'
notifi resurrect notifyresurrect
copi listen arrai avoid concurrentmodificationexcept
item life cycl listen itemlifecyclelisten item life cycl listen itemlifecyclelisten listen size
iter iter listen valu iter
cnt
iter hasnext
cnt item life cycl listen itemlifecyclelisten iter
length
item resurrect itemresurrect
notifi listen instanc destroi
perman render 'invalid'
notifi destroi notifydestroi
copi listen arrai avoid concurrentmodificationexcept
item life cycl listen itemlifecyclelisten item life cycl listen itemlifecyclelisten listen size
iter iter listen valu iter
cnt
iter hasnext
cnt item life cycl listen itemlifecyclelisten iter
length
item destroi itemdestroi
add code itemlifecyclelisten code
param listen listen inform life cycl
add life cycl listen addlifecyclelisten item life cycl listen itemlifecyclelisten listen
listen kei containskei listen
listen put listen listen
remov code itemlifecyclelisten code
param listen exist listen
remov life cycl listen removelifecyclelisten item life cycl listen itemlifecyclelisten listen
listen remov listen
return code item code
return code item code
item itemid getid
return primari path code item code
return primari path code item code
path primari path getprimarypath repositori except repositoryexcept
session hierarchi manag gethierarchymanag path getpath
build list transient modifi item state
scope code link save code
return list transient item state
throw invaliditemstateexcept
throw repositoryexcept
collect transient state gettransientst
invalid item state except invaliditemstateexcept repositori except repositoryexcept
list transient state persist
arrai list arraylist dirti arrai list arraylist
item state itemst transient state transientst
check statu item' state
transient istransi
state statu getstatu
item state itemst statu exist modifi statu exist modifi
add item' state list
dirti add state
item state itemst statu statu
string msg safe jcr path safegetjcrpath save item
log error msg
repositori except repositoryexcept msg
item state itemst statu stale modifi statu stale modifi
string msg safe jcr path safegetjcrpath item save modifi extern
log error msg
invalid item state except invaliditemstateexcept msg
item state itemst statu stale destroi statu stale destroi
string msg safe jcr path safegetjcrpath item save delet extern
log error msg
invalid item state except invaliditemstateexcept msg
log debug unexpect state statu state statu getstatu
ignor
node isnod
build list 'new' 'modified' descend
iter iter item state mgr itemstatemgr descend transient item state getdescendanttransientitemst
iter hasnext
transient state transientst item state itemst iter
transient state transientst statu getstatu
item state itemst statu statu
item state itemst statu exist modifi statu exist modifi
add modifi state list
dirti add transient state transientst
item state itemst statu stale modifi statu stale modifi
string msg transient state transientst getid item save modifi extern
log error msg
invalid item state except invaliditemstateexcept msg
item state itemst statu stale destroi statu stale destroi
string msg transient state transientst getid item save delet extern
log error msg
invalid item state except invaliditemstateexcept msg
log debug unexpect state statu transient state transientst statu getstatu
ignor
dirti
build list transient descend item state attic
mark 'removed' scope
code link save code
return list transient item state
throw invaliditemstateexcept
throw repositoryexcept
collect remov state getremovedst
invalid item state except invaliditemstateexcept repositori except repositoryexcept
arrai list arraylist remov arrai list arraylist
item state itemst transient state transientst
node isnod
iter iter item state mgr itemstatemgr descend transient item state attic getdescendanttransientitemstatesinatt
iter hasnext
transient state transientst item state itemst iter
check stale
transient state transientst statu getstatu item state itemst statu stale modifi statu stale modifi
string msg transient state transientst getid item remov modifi extern
log error msg
invalid item state except invaliditemstateexcept msg
transient state transientst statu getstatu item state itemst statu stale destroi statu stale destroi
string msg transient state transientst getid item remov delet extern
log error msg
invalid item state except invaliditemstateexcept msg
remov add transient state transientst
remov
valid transient item validatetransientitem iter iter
access deni except accessdeniedexcept constraint violat except constraintviolationexcept repositori except repositoryexcept
valid check perform transient item
transient node
'new' check node type satisfi
'requir node type' constraint definit
child node ad node question
check write permiss
child item remov node question
check write permiss
check 'mandatory' child item exist
transient properti
check write permiss
check properti satisfi constraint
property' definit
note protect flag check node addnod node remov
ad remov child entri node
node addmixin removemixin mixin node
properti setvalu properti modifi
access manag impl accessmanagerimpl access mgr accessmgr session access manag getaccessmanag
walk list transient item valid
iter hasnext
item state itemst item state itemst item state itemst iter
item state itemst node isnod
transient item node
node state nodest node state nodest node state nodest item state itemst
item itemid node state nodest getid
node impl nodeimpl node node impl nodeimpl item mgr itemmgr item getitem
node def nodedef def node definit getdefinit
node type impl nodetypeimpl node type impl nodetypeimpl node primari node type getprimarynodetyp
transient node ad 'new'
check node' node type requir node type
definit
node type nodetyp nta def requir primari type getrequiredprimarytyp
nta length
node type impl nodetypeimpl req ntreq node type impl nodetypeimpl nta
node state nodest statu getstatu item state itemst statu statu
getqnam equal req ntreq getqnam
deriv isderivedfrom req ntreq getqnam
transient node' node type satisfi
'requir primari types' constraint
string msg node safe jcr path safegetjcrpath node type req ntreq getnam
log warn msg
constraint violat except constraintviolationexcept msg
check child remov
node state nodest remov child node entri getremovedchildnodeentri empti isempti node state nodest remov properti entri getremovedpropertyentri empti isempti
check write permiss
access mgr accessmgr grant isgrant access manag accessmanag write
string msg node safe jcr path safegetjcrpath allow remov child item
log error msg
access deni except accessdeniedexcept msg
check protect flag
check nodeimpl remov string
check child addit
ad child node
iter ad iter addedit node state nodest ad child node entri getaddedchildnodeentri iter
ad iter addedit hasnext
node state nodest child node entri childnodeentri entri node state nodest child node entri childnodeentri ad iter addedit
node child node childnod node item mgr itemmgr item getitem node nodeid entri uuid getuuid
node def nodedef child def childdef child node childnod definit getdefinit
child def childdef auto creat isautocr
check write permiss
access mgr accessmgr grant isgrant access manag accessmanag write
string msg node safe jcr path safegetjcrpath allow add node child node childnod getnam
log error msg
access deni except accessdeniedexcept msg
mandatori child properti
properti def propertydef prop def propdef mandatori properti def getmandatorypropertydef
prop def propdef length
properti def impl propertydefimpl properti def impl propertydefimpl prop def propdef
node state nodest properti entri haspropertyentri getqnam
string msg node safe jcr path safegetjcrpath mandatori properti getnam exist
log warn msg
constraint violat except constraintviolationexcept msg
mandatori child node
node def nodedef node def nodedef mandatori node def getmandatorynodedef
node def nodedef length
node def impl nodedefimpl node def impl nodedefimpl node def nodedef
node state nodest child node entri haschildnodeentri getqnam
string msg node safe jcr path safegetjcrpath mandatori child node getnam exist
log warn msg
constraint violat except constraintviolationexcept msg
transient item properti
properti state propertyst prop state propstat properti state propertyst item state itemst
item itemid prop propid prop state propstat getid
node nodeid node nodeid node nodeid prop state propstat parent uuid getparentuuid
properti impl propertyimpl prop properti impl propertyimpl item mgr itemmgr item getitem prop propid
properti def impl propertydefimpl def properti def impl propertydefimpl prop definit getdefinit
def auto creat isautocr
check write permiss properti
access mgr accessmgr grant isgrant prop propid access manag accessmanag write
string msg item mgr itemmgr safe jcr path safegetjcrpath node nodeid allow set properti prop getnam
log error msg
access deni except accessdeniedexcept msg
prop state propstat overlai state getoverlayedst
properti ad check write permiss parent
access mgr accessmgr grant isgrant node nodeid access manag accessmanag write
string msg item mgr itemmgr safe jcr path safegetjcrpath node nodeid allow set properti prop getnam
log error msg
access deni except accessdeniedexcept msg
check constraint
check constraint protect properti
set implement
set user api
def protect isprotect
string constraint def constraint getvalueconstraint
constraint
intern internalvalu valu prop state propstat valu getvalu
node type impl nodetypeimpl check set properti constraint checksetpropertyvalueconstraint def valu
repositori except repositoryexcept
repack except provid verbos error messag
string msg prop safe jcr path safegetjcrpath messag getmessag
log warn msg
constraint violat except constraintviolationexcept msg
manual check refer constraint
requir session target node
check
def requir type getrequiredtyp properti type propertytyp refer
valu length
satisfi
uuid target uuid targetuuid uuid valu intern internalvalu
node target node targetnod session node uuid getnodebyuuid target uuid targetuuid string tostr
constraint
satisfi
constraint length
refer constraint specifi
requir node type
target node
string ntname constraint
target node targetnod node type isnodetyp ntname
satisfi
repositori except repositoryexcept
string msg prop safe jcr path safegetjcrpath
fail check refer constraint
log error msg
constraint violat except constraintviolationexcept msg
satisfi
string msg prop safe jcr path safegetjcrpath
satisfi constraint
constraint constraint report 1st
log warn msg
constraint violat except constraintviolationexcept msg
check protect flag
check propertyimpl setvalu
check refer checkrefer iter iter dirti iterdirti iter iter remov iterremov
refer manag referencemanag ref mgr refmgr
referenti integr except referentialintegrityexcept repositori except repositoryexcept
map target node id' modifi noderefer object
hash map hashmap dirti node ref dirtynoderef hash map hashmap
walk dirti item process refer properti
verifi target node exist
updat collect affect noderefer object
target node dirtynoderef map
iter dirti iterdirti hasnext
item state itemst transient state transientst item state itemst iter dirti iterdirti
transient state transientst node isnod
properti state propertyst prop state propstat properti state propertyst transient state transientst
prop state propstat type gettyp properti type propertytyp refer
prop state propstat statu getstatu item state itemst statu exist modifi statu exist modifi
modifi refer properti
remov 'reference' store
properti state propertyst prop state oldpropst properti state propertyst prop state propstat overlai state getoverlayedst
intern internalvalu val prop state oldpropst valu getvalu
val val length
string uuid val string tostr
node nodeid target targetid node nodeid uuid
node refer noderefer ref
dirti node ref dirtynoderef kei containskei target targetid
ref node refer noderefer dirti node ref dirtynoderef target targetid
ref ref mgr refmgr target targetid
dirti node ref dirtynoderef put target targetid ref
remov refer target node
ref remov refer removerefer properti propertyid prop state propstat getid
add refer store
intern internalvalu val prop state propstat valu getvalu
val val length
string uuid val string tostr
node nodeid target targetid node nodeid uuid
verifi target exist
item mgr itemmgr item exist itemexist target targetid
string msg item mgr itemmgr safe jcr path safegetjcrpath prop state propstat getid
target node refer properti exist
log warn msg
referenti integr except referentialintegrityexcept msg
target unsav node make
scope current save oper
veryfi descend 'this' item
node impl nodeimpl target node impl nodeimpl item mgr itemmgr item getitem target targetid
target isnew
target primari path getprimarypath descend isdescendantof primari path getprimarypath
string msg item mgr itemmgr safe jcr path safegetjcrpath prop state propstat getid
target node refer properti node save scope current save oper
log warn msg
referenti integr except referentialintegrityexcept msg
malform path except malformedpathexcept mpe
string msg item mgr itemmgr safe jcr path safegetjcrpath prop state propstat getid
fail verifi exist target node
log error msg mpe
repositori except repositoryexcept msg mpe
node refer noderefer ref
dirti node ref dirtynoderef kei containskei target targetid
ref node refer noderefer dirti node ref dirtynoderef target targetid
ref ref mgr refmgr target targetid
dirti node ref dirtynoderef put target targetid ref
add refer target node
ref add refer addrefer properti propertyid prop state propstat getid
walk 'removed' item
build list remov node
process refer properti updat collect affect
noderefer object target node
arrai list arraylist remov node removednod arrai list arraylist
iter remov iterremov hasnext
item state itemst transient state transientst item state itemst iter remov iterremov
transient state transientst node isnod
remov node collect process
remov node removednod add transient state transientst
properti state propertyst prop state propstat properti state propertyst transient state transientst
prop state propstat type gettyp properti type propertytyp refer
remov refer properti
remov 'reference' store
intern internalvalu val prop state propstat valu getvalu
val length
string uuid val string tostr
node nodeid target targetid node nodeid uuid
node refer noderefer ref
dirti node ref dirtynoderef kei containskei target targetid
ref node refer noderefer dirti node ref dirtynoderef target targetid
ref ref mgr refmgr target targetid
dirti node ref dirtynoderef put target targetid ref
remov refer target node
ref remov refer removerefer properti propertyid prop state propstat getid
noderefer object updat
walk 'removed' node verifi node
referenc remov
iter iter remov node removednod iter
iter hasnext
node state nodest node state nodest node state nodest iter
check node referenc
node nodeid target targetid node nodeid node state nodest getid
node refer noderefer ref
dirti node ref dirtynoderef kei containskei target targetid
ref node refer noderefer dirti node ref dirtynoderef target targetid
ref ref mgr refmgr target targetid
ref refer hasrefer
string msg node state nodest getid
node remov referenc
log warn msg
referenti integr except referentialintegrityexcept msg
persist dirti noderefer object
iter dirti node ref dirtynoderef valu iter
iter hasnext
node refer noderefer ref node refer noderefer iter
ref mgr refmgr save ref
remov transient item removetransientitem iter iter repositori except repositoryexcept
walk list transient item mark 'removed'
definit remov
iter hasnext
item state itemst transient state transientst item state itemst iter
persist item state persistableitemst persist state persistentst persist item state persistableitemst transient state transientst overlai state getoverlayedst
remov persist state incl descend
indirectli statedestroi listen method
perman invalid item instanc wrap
persist state persistentst destroi
item state except itemstateexcept is
string msg fail remov item transient state transientst getid
log error msg is
repositori except repositoryexcept msg is
persist transient item persisttransientitem iter iter repositori except repositoryexcept
walk list transient item persist
iter hasnext
item state itemst item state itemst item state itemst iter
item impl itemimpl item item mgr itemmgr item getitem item state itemst getid
persist state transient item
item make persist makepersist
initi version histori node node type
code mix version code
call link save
param iter
return true call gener transient state fals
throw repositoryexcept
init version histori initversionhistori iter iter repositori except repositoryexcept
todo consolid version histori creation code nodeimpl addmixin itemimpl initversionhistori
walk list transient item
search version node
creat transient state createdtransientst
iter hasnext
item state itemst item state itemst item state itemst iter
item state itemst node isnod
node impl nodeimpl node node impl nodeimpl item mgr itemmgr item getitem item state itemst getid
node node type isnodetyp node type registri nodetyperegistri mix version mix version
node properti hasproperti version manag versionmanag propnam version histori propnam version histori
version histori versionhistori hist session version mgr versionmgr creat version histori createversionhistori node
node intern set properti internalsetproperti version manag versionmanag propnam version histori propnam version histori intern internalvalu creat uuid hist uuid getuuid
node intern set properti internalsetproperti version manag versionmanag propnam base version propnam base version intern internalvalu creat uuid hist root version getrootvers uuid getuuid
node intern set properti internalsetproperti version manag versionmanag propnam check propnam check intern internalvalu creat
node intern set properti internalsetproperti version manag versionmanag propnam predecessor propnam predecessor intern internalvalu intern internalvalu creat uuid hist root version getrootvers uuid getuuid
creat transient state createdtransientst
creat transient state createdtransientst
failsaf map intern code code jcr path
diagnost output error messag
return jcr path fallback
string safe jcr path safegetjcrpath
item mgr itemmgr safe jcr path safegetjcrpath
code link item getnam code
method return code qname code
code string code
return item code qname code
throw repositoryexcept error occur
qname getqnam repositori except repositoryexcept
itemstatelisten
itemstatelisten statecr
state creat statecr item state itemst creat
statu statu normal statu normal
itemstatelisten statedestroi
state destroi statedestroi item state itemst destroi
underli state perman destroi
set state instanc 'destroyed'
statu statu destroi statu destroi
dispos state
state destroi
state remov listen removelisten
state
notifi listen instanc
perman invalid
notifi destroi notifydestroi
itemstatelisten statemodifi
state modifi statemodifi item state itemst modifi
statu statu modifi statu modifi
itemstatelisten statediscard
state discard statediscard item state itemst discard
state item discard result
call node revert itemimpl setremov
transient istransi
state statu getstatu
persist item transient remov
item state itemst statu exist remov statu exist remov
persist item transient modifi
item state itemst statu exist modifi statu exist modifi
persist item transient modifi remov
underli persist state extern
modifi transient modif remov
item state itemst statu stale modifi statu stale modifi
item state itemst persist state persistentst state overlai state getoverlayedst
state transient wrapper underli
persist state therefor restor
persist state resurrect item instanc
state remov listen removelisten
state persist state persistentst
state add listen addlisten
statu statu invalid statu invalid
resurrect instanc
statu statu normal statu normal
notifi listen
notifi resurrect notifyresurrect
persist item transient modifi remov
underli persist state extern
destroi transient modif remov
item state itemst statu stale destroi statu stale destroi
set state instanc 'destroyed'
statu statu destroi statu destroi
dispos state
state remov listen removelisten
state
notifi listen instanc
perman invalid
notifi destroi notifydestroi
item transient ad
item state itemst statu statu
set state instanc 'destroyed'
statu statu destroi statu destroi
dispos state
state remov listen removelisten
state
notifi listen instanc
perman invalid
notifi destroi notifydestroi
render instanc 'invalid'
statu statu invalid statu invalid
notifi listen
notifi invalid notifyinvalid
item
item accept
accept item visitor itemvisitor visitor
repositori except repositoryexcept
item isnod
node isnod
item getnam
string getnam repositori except repositoryexcept
item getpar
node parent getpar
item found except itemnotfoundexcept access deni except accessdeniedexcept repositori except repositoryexcept
item isnew
isnew
state statu getstatu item state itemst statu statu
item ismodifi
modifi ismodifi
state transient istransi state overlai state getoverlayedst
item remov
remov repositori except repositoryexcept
check state instanc
saniti check sanitycheck
path path element pathel thisnam primari path getprimarypath element getnameel
check protect
node isnod
node impl nodeimpl node node impl nodeimpl
check repositori root node
node repositori root isrepositoryroot
string msg safe jcr path safegetjcrpath remov root node
log error msg
repositori except repositoryexcept msg
node def nodedef def node definit getdefinit
check protect flag
def protect isprotect
string msg safe jcr path safegetjcrpath remov protect node
log error msg
constraint violat except constraintviolationexcept msg
properti impl propertyimpl prop properti impl propertyimpl
properti def propertydef def prop definit getdefinit
check protect flag
def protect isprotect
string msg safe jcr path safegetjcrpath remov protect properti
log error msg
constraint violat except constraintviolationexcept msg
node impl nodeimpl parent node parentnod node impl nodeimpl parent getpar
check version write
parent node parentnod safe check safeischeckedout
string msg parent node parentnod safe jcr path safegetjcrpath remov child check node
log error msg
version except versionexcept msg
check protect flag parent node
parent node parentnod definit getdefinit protect isprotect
string msg parent node parentnod safe jcr path safegetjcrpath remov child protect node
log error msg
constraint violat except constraintviolationexcept msg
deleg remov child item parent node
node isnod
parent node parentnod remov child node removechildnod thisnam getnam thisnam index getindex
parent node parentnod remov child properti removechildproperti thisnam getnam
item save
save
access deni except accessdeniedexcept lock except lockexcept
constraint violat except constraintviolationexcept invalid item state except invaliditemstateexcept
referenti integr except referentialintegrityexcept repositori except repositoryexcept
check state instanc
saniti check sanitycheck
synchron session
session
turn temporari path cach perform
assum path chang save call
item state mgr itemstatemgr enabl path cach enablepathcach
build list transient state persist
collect dirti transient state gettransientst
dirti size
transient item
item state itemst transient state transientst
check parent node includ dirti item list
dirti node remov ad ad remov parent child
link requir parent child save
iter iter dirti iter
iter hasnext
transient state transientst item state itemst iter
transient state transientst node isnod
node state nodest node state nodest node state nodest transient state transientst
arrai list arraylist dirti parent dirtypar arrai list arraylist
remov parent
dirti parent dirtypar add addal node state nodest remov parent uui getremovedparentuuid
ad parent
dirti parent dirtypar add addal node state nodest ad parent uui getaddedparentuuid
iter parent iter parentsit dirti parent dirtypar iter
parent iter parentsit hasnext
node nodeid node nodeid string parent iter parentsit
node state nodest parent state parentst
parent state parentst node state nodest item state mgr itemstatemgr transient item state gettransientitemst
item state except itemstateexcept is
string msg inconsist fail retriev transient state item mgr itemmgr safe jcr path safegetjcrpath
log error msg
repositori except repositoryexcept msg
check parent save
dirti parent state parentst
save parent
string msg item mgr itemmgr safe jcr path safegetjcrpath save
log error msg
repositori except repositoryexcept msg
valid access node type constraint
valid child remov
valid transient item validatetransientitem dirti iter
workspac impl workspaceimpl wsp workspac impl workspaceimpl session workspac getworkspac
list event gener save
observ manag factori observationmanagerfactori ob factori obsfactori rep observ manag factori getobservationmanagerfactori wsp getnam
event state collect eventstatecollect event ob factori obsfactori creat event state collect createeventstatecollect session
session item state manag getitemstatemanag session hierarchi manag gethierarchymanag
make interrupt
verifi persist node refer
refer manag referencemanag ref mgr refmgr wsp refer manag getreferencemanag
ref mgr refmgr
build list transient descend attic
mark 'removed'
collect remov remov state getremovedst
referenti integr check
make referenc node remov
refer updat persist
check refer checkrefer dirti iter remov iter ref mgr refmgr
creat event state affect item state
prepar event dispatch step order
check access right item remov
todo consolid event gener dispatch code ideal method call save succeed
event creat event state createeventst dirti
event creat event state createeventst remov
event prepar
definit remov transient item mark 'removed'
remov transient item removetransientitem remov iter
dispos transient state mark 'removed'
iter remov iter
iter hasnext
transient state transientst item state itemst iter
dispos transient state longer
indirectli statediscard listen method
perman invalid wrap item instanc
item state mgr itemstatemgr dispos transient item state attic disposetransientitemstateinatt transient state transientst
initi version histori node gener transient state
init version histori initversionhistori dirti iter
build list transient state previou call
gener transient state
dirti transient state gettransientst
persist 'new' 'modified' transient state
persist transient item persisttransientitem dirti iter
synchron refmgr
safe dispos transient state
iter dirti iter
iter hasnext
transient state transientst item state itemst iter
dispos transient state longer
item state mgr itemstatemgr dispos transient item state disposetransientitemst transient state transientst
persist dispatch event
forward session decid time
event dispatch case transact support
session dispatch event
turn temporari path cach
item state mgr itemstatemgr enabl path cach enablepathcach
item refresh
refresh keepchang
invalid item state except invaliditemstateexcept repositori except repositoryexcept
check state instanc
saniti check sanitycheck
keepchang
todo fixm reset item statu field statu normal
descend transient instanc
reset stale itemst instanc
node isnod
check repositori root node
node impl nodeimpl repositori root isrepositoryroot
optim
item state mgr itemstatemgr dispos transient item state disposealltransientitemst
list transient item discard
arrai list arraylist list arrai list arraylist
item state itemst transient state transientst
check statu item' state
transient istransi
transient state transientst item state itemst state
transient state transientst statu getstatu
item state itemst statu stale modifi statu stale modifi
item state itemst statu stale destroi statu stale destroi
item state itemst statu exist modifi statu exist modifi
add item' state list
list add transient state transientst
item state itemst statu statu
string msg safe jcr path safegetjcrpath revert item
log error msg
repositori except repositoryexcept msg
log debug unexpect state statu transient state transientst statu getstatu
ignor
node isnod
build list 'new' 'modified' 'stale' descend
iter iter item state mgr itemstatemgr descend transient item state getdescendanttransientitemst
iter hasnext
transient state transientst item state itemst iter
transient state transientst statu getstatu
item state itemst statu stale modifi statu stale modifi
item state itemst statu stale destroi statu stale destroi
item state itemst statu statu
item state itemst statu exist modifi statu exist modifi
add modifi state list
list add transient state transientst
log debug unexpect state statu transient state transientst statu getstatu
ignor
process list 'new' 'modified' 'stale' transient state
iter iter list iter
iter hasnext
transient state transientst item state itemst iter
dispos transient state longer
indirectli statediscard listen method
restor perman invalid wrap item instanc
item state mgr itemstatemgr dispos transient item state disposetransientitemst transient state transientst
discard transient descend attic mark
'removed' resurrect remov item
iter item state mgr itemstatemgr descend transient item state attic getdescendanttransientitemstatesinatt
iter hasnext
transient state transientst item state itemst iter
dispos transient state indirectli
statediscard listen method resurrect wrap item instanc
item state mgr itemstatemgr dispos transient item state attic disposetransientitemstateinatt transient state transientst
item getancestor
item ancestor getancestor degre
item found except itemnotfoundexcept access deni except accessdeniedexcept repositori except repositoryexcept
check state instanc
saniti check sanitycheck
degre
item mgr itemmgr root node getrootnod
path getancestor requir rel degre
convert absolut rel ancestor degre
path path primari path getprimarypath
rel degre reldegre path ancestor count getancestorcount degre
rel degre reldegre
item found except itemnotfoundexcept
path ancestor path ancestorpath path ancestor getancestor rel degre reldegre
item mgr itemmgr item getitem ancestor path ancestorpath
path found except pathnotfoundexcept pnfe
item found except itemnotfoundexcept
item getpath
string path getpath repositori except repositoryexcept
primari path getprimarypath jcr path tojcrpath session namespac resolv getnamespaceresolv
prefix declar except noprefixdeclaredexcept npde
string msg intern error encount unregist namespac
log error msg npde
repositori except repositoryexcept msg npde
item getdepth
depth getdepth repositori except repositoryexcept
primari path getprimarypath ancestor count getancestorcount
item getsess
session session getsess repositori except repositoryexcept
session
item issam item
issam item item otheritem
item otheritem
item otheritem item impl itemimpl
item impl itemimpl item impl itemimpl item otheritem
equal
