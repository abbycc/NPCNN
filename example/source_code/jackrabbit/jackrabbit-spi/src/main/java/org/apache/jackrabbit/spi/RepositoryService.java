org apach jackrabbit spi
java input stream inputstream
java util iter
java util map
javax jcr access deni except accessdeniedexcept
javax jcr credenti
javax jcr invalid item state except invaliditemstateexcept
javax jcr item exist except itemexistsexcept
javax jcr item found except itemnotfoundexcept
javax jcr login except loginexcept
javax jcr merg except mergeexcept
javax jcr namespac except namespaceexcept
javax jcr workspac except nosuchworkspaceexcept
javax jcr node
javax jcr path found except pathnotfoundexcept
javax jcr referenti integr except referentialintegrityexcept
javax jcr repositori except repositoryexcept
javax jcr unsupport repositori oper except unsupportedrepositoryoperationexcept
javax jcr format except valueformatexcept
javax jcr lock lock except lockexcept
javax jcr nodetyp constraint violat except constraintviolationexcept
javax jcr nodetyp invalid node type definit except invalidnodetypedefinitionexcept
javax jcr nodetyp node type except nosuchnodetypeexcept
javax jcr nodetyp node type exist except nodetypeexistsexcept
javax jcr queri invalid queri except invalidqueryexcept
javax jcr version version
javax jcr version version except versionexcept
code repositoryservic code interfac defin method
retriev inform persist layer repositori
method modifi persist state
implement interfac intend hold state
persist layer session relat state held
method alter persist state includ inform
fulli author chang
method
pre
void repositoryservic copi sessioninfo sessioninfo
string srcworkspacenam
nodeid srcnodeid nodeid destparentnodeid
destnam
pre
method perform persist copi node identifi
srcnodeid node' subtre posit child node
identifi destparentnodeid assign newli copi node
destnam
code sessioninfo code object user workspac identif
eventu lock token requir execut copi
code srcworkspacenam code differ workspac present
sessioninfo copi correspond copi workspac
sourc destin copi oper
link nodeid code code hold
inform suffici complet author copi
oper
repositoryservic addit creat submit link batch
object cover list oper appli
persist layer
repositori servic repositoryservic
return code idfactori code
return code idfactori code
throw repositoryexcept error occur
factori idfactori factori getidfactori repositori except repositoryexcept
return code namefactori code
return code namefactori code
throw repositoryexcept error occur
factori namefactori factori getnamefactori repositori except repositoryexcept
return code pathfactori code
return code pathfactori code
throw repositoryexcept error occur
path factori pathfactori path factori getpathfactori repositori except repositoryexcept
return code qvaluefactori code defin spi implement
return code qvaluefactori code
throw repositoryexcept error occur
factori qvaluefactori factori getqvaluefactori repositori except repositoryexcept
return link iteminfocach code sessioninfo code
param sessioninfo
return
throw repositoryexcept
item info cach iteminfocach item info cach getiteminfocach session info sessioninfo session info sessioninfo repositori except repositoryexcept
return properti descriptor expos
link javax jcr repositori repositori implement built top
code repositoryservic code
return kei pair repositori descriptor kei valu
throw javax jcr repositoryexcept
javax jcr repositori getdescriptorkei
javax jcr repositori getdescriptor string
map string qvalu repositori descriptor getrepositorydescriptor repositori except repositoryexcept
sessioninfo creation releas
return code sessioninfo code method
code repositoryservic code
implement choos authent user suppli
code credenti code
param credenti credenti user
param workspacenam workspac code sessioninfo code
built workspacenam code null code
implement select default workspac
return code sessioninfo code authent success
throw loginexcept authent user fail
throw nosuchworkspaceexcept code workspacenam code
recogn
throw repositoryexcept error occur
session info sessioninfo obtain credenti credenti string workspac workspacenam
login except loginexcept workspac except nosuchworkspaceexcept repositori except repositoryexcept
return code sessioninfo code workspac
method code repositoryservic code
param sessioninfo workspac
param workspacenam workspac code sessioninfo code
built workspacenam code null code
implement select default workspac
return code sessioninfo code authent success
throw loginexcept authent user fail
throw nosuchworkspaceexcept code workspacenam code
recogn
throw repositoryexcept error occur
session info sessioninfo obtain session info sessioninfo session info sessioninfo string workspac workspacenam
login except loginexcept workspac except nosuchworkspaceexcept repositori except repositoryexcept
return code sessioninfo code method
code repositoryservic code
param sessioninfo
param credenti
return code sessioninfo code imperson success
throw loginexcept
throw repositoryexcept
javax jcr session imperson javax jcr credenti
session info sessioninfo imperson session info sessioninfo session info sessioninfo credenti credenti login except loginexcept repositori except repositoryexcept
code repositoryservic code sessioninfo
param sessioninfo
throw javax jcr repositoryexcept
dispos session info sessioninfo session info sessioninfo repositori except repositoryexcept
return workspac name code sessioninfo code
param sessioninfo
return arrai workspac name
throw javax jcr repositoryexcept
javax jcr workspac getaccessibleworkspacenam
javax jcr workspac getnam
string workspac name getworkspacenam session info sessioninfo session info sessioninfo repositori except repositoryexcept
access control
return true action defin arrai grant
code sessioninfo code fals
param sessioninfo
param itemid
param action
return true session code sessioninfo code
right item
throw javax jcr repositoryexcept
javax jcr session checkpermiss string string
javax jcr session haspermiss string string
grant isgrant session info sessioninfo session info sessioninfo item itemid item itemid string action repositori except repositoryexcept
read item
return code qnodedefinit code code node code
identifi method
caller unambigu determin applic definit
parent node type definit parent exist
root
param sessioninfo
param nodeid
return node definit applic code node code identifi
throw javax jcr repositoryexcept
node definit qnodedefinit node definit getnodedefinit session info sessioninfo session info sessioninfo node nodeid node nodeid repositori except repositoryexcept
return code qpropertydefinit code code properti code
identifi method
caller unambigu determin applic definit
parent node type definit
param sessioninfo
param propertyid
return properti definit applic code properti code
identifi
throw javax jcr repositoryexcept
properti definit qpropertydefinit properti definit getpropertydefinit session info sessioninfo session info sessioninfo properti propertyid properti propertyid repositori except repositoryexcept
retriev code nodeinfo code node identifi
code nodeid code link getiteminfo sessioninfo itemid
similar method addit return code iteminfo code
children code item code
param sessioninfo
param nodeid
return code nodeinfo code node identifi
throw javax jcr itemnotfoundexcept
throw javax jcr repositoryexcept
javax jcr session getitem string
javax jcr node getnod string
javax jcr version versionhistori getallvers
javax jcr version versionhistori getvers string
javax jcr version versionhistori getversionbylabel string
javax jcr version versionhistori getrootvers
javax jcr node getbasevers
javax jcr node getversionhistori
javax jcr version version getcontaininghistori
deprec link getiteminfo sessioninfo itemid
node info nodeinfo node info getnodeinfo session info sessioninfo session info sessioninfo node nodeid node nodeid item found except itemnotfoundexcept repositori except repositoryexcept
method 'batch read' persist storag return
code iteminfo code code itemid code
element code iter code addit iter
arbitrari code iteminfo code
param sessioninfo
param itemid
return code iter code code iteminfo code
singl element code iteminfo code repres
item identifi code itemid code iter
multipl element expect repres item
identifi code itemid code
throw javax jcr itemnotfoundexcept
throw javax jcr repositoryexcept
javax jcr session getitem string
javax jcr node getnod string
javax jcr version versionhistori getallvers
javax jcr version versionhistori getvers string
javax jcr version versionhistori getversionbylabel string
javax jcr version versionhistori getrootvers
javax jcr node getbasevers
javax jcr node getversionhistori
javax jcr version version getcontaininghistori
iter item info iteminfo item info getiteminfo session info sessioninfo session info sessioninfo item itemid item itemid item found except itemnotfoundexcept repositori except repositoryexcept
return iter code childinfo code present
node repres parentid
param sessioninfo
param parentid
return iter code childinfo code present
node repres parentid
throw itemnotfoundexcept
throw repositoryexcept
iter child info childinfo child info getchildinfo session info sessioninfo session info sessioninfo node nodeid parent parentid item found except itemnotfoundexcept repositori except repositoryexcept
return link propertyid properti referenc
node identifi code nodeid code
code weakrefer code code true code id
link javax jcr propertytyp weakrefer weakrefer properti
return properti type link javax jcr propertytyp refer refer
param sessioninfo
param nodeid
param propertynam filter refer properti return
code null code refer return
param weakrefer code true code properti type
link javax jcr propertytyp weakrefer type
link javax jcr propertytyp refer
return iter link propertyid properti
referenc node identifi code nodeid code
empti iter node referenc refer exist
throw itemnotfoundexcept
throw repositoryexcept
propertyinfo getid
jcr
iter properti propertyid refer getrefer session info sessioninfo session info sessioninfo node nodeid node nodeid properti propertynam weak refer weakrefer item found except itemnotfoundexcept repositori except repositoryexcept
return code propertyinfo code code properti code
identifi
param sessioninfo
param propertyid
return code propertyinfo code code properti code
identifi
throw javax jcr itemnotfoundexcept
throw javax jcr repositoryexcept
javax jcr session getitem string
javax jcr node getproperti string
deprec link getiteminfo sessioninfo itemid
properti info propertyinfo properti info getpropertyinfo session info sessioninfo session info sessioninfo properti propertyid properti propertyid item found except itemnotfoundexcept repositori except repositoryexcept
gener modif
start set oper modif
underli persist layer modif call
link batch execut execut
call link submit batch
param sessioninfo
param itemid item common ancestor
code item code affect batch execut code item code
modifi scope code batch code
return batch indic start set transient modif
execut link submit batch
throw repositoryexcept
javax jcr item save
javax jcr session save
batch
batch creat batch createbatch session info sessioninfo session info sessioninfo item itemid item itemid repositori except repositoryexcept
complet link batch discard previou modif
link createbatch sessioninfo itemid addit inform
batch creation
param batch
throw pathnotfoundexcept
throw itemnotfoundexcept
throw nosuchnodetypeexcept
throw valueformatexcept
throw versionexcept
throw lockexcept
throw constraintviolationexcept
throw accessdeniedexcept
throw unsupportedrepositoryoperationexcept
throw repositoryexcept
batch
submit batch batch path found except pathnotfoundexcept item found except itemnotfoundexcept node type except nosuchnodetypeexcept format except valueformatexcept version except versionexcept lock except lockexcept constraint violat except constraintviolationexcept access deni except accessdeniedexcept unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
import
import data present code inputstream code
persist layer note implement respons
valid data present integr repositori
complet
param sessioninfo
param parentid
param xmlstream
param uuidbehaviour
throw itemexistsexcept
throw pathnotfoundexcept
throw versionexcept
throw constraintviolationexcept
throw lockexcept
throw accessdeniedexcept
throw unsupportedrepositoryoperationexcept
throw repositoryexcept
javax jcr workspac importxml string java inputstream int
import xml importxml session info sessioninfo session info sessioninfo node nodeid parent parentid input stream inputstream xml stream xmlstream uuid behaviour uuidbehaviour item exist except itemexistsexcept path found except pathnotfoundexcept version except versionexcept constraint violat except constraintviolationexcept lock except lockexcept access deni except accessdeniedexcept unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
copi move
move node identifi code srcnodeid code
entir subtre locat defin code destparentnodeid code
code destnam code
param sessioninfo
param srcnodeid
param destparentnodeid
param destnam
throw javax jcr itemexistsexcept
throw javax jcr pathnotfoundexcept
throw javax jcr version versionexcept
throw javax jcr nodetyp constraintviolationexcept
throw javax jcr lock lockexcept
throw javax jcr accessdeniedexcept
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr repositoryexcept
javax jcr workspac move string string
move session info sessioninfo session info sessioninfo node nodeid src node srcnodeid node nodeid dest parent node destparentnodeid dest destnam item exist except itemexistsexcept path found except pathnotfoundexcept version except versionexcept constraint violat except constraintviolationexcept lock except lockexcept access deni except accessdeniedexcept unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
clone subtre identifi code srcnodeid code
workspac name code srcworkspacenam code destin
workspac code sessioninfo code
destin compos parent
code destnam code
note code srcworkspacenam code
code sessioninfo code case copi
correspond copi singl workspac
param sessioninfo
param srcworkspacenam
param srcnodeid
param destparentnodeid
param destnam
throw javax jcr nosuchworkspaceexcept
throw javax jcr nodetyp constraintviolationexcept
throw javax jcr version versionexcept
throw javax jcr accessdeniedexcept
throw javax jcr pathnotfoundexcept
throw javax jcr itemexistsexcept
throw javax jcr lock lockexcept
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr repositoryexcept
javax jcr workspac copi string string
javax jcr workspac copi string string string
copi session info sessioninfo session info sessioninfo string src workspac srcworkspacenam node nodeid src node srcnodeid node nodeid dest parent node destparentnodeid dest destnam workspac except nosuchworkspaceexcept constraint violat except constraintviolationexcept version except versionexcept access deni except accessdeniedexcept path found except pathnotfoundexcept item exist except itemexistsexcept lock except lockexcept unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
updat clone
updat node identifi code nodeid code replac
complet subtre clone node
present workspac code srcworkspacenam code
param sessioninfo
param nodeid
param srcworkspacenam
throw javax jcr nosuchworkspaceexcept
throw javax jcr accessdeniedexcept
throw javax jcr lock lockexcept
throw javax jcr invaliditemstateexcept
throw javax jcr repositoryexcept
javax jcr node updat string
updat session info sessioninfo session info sessioninfo node nodeid node nodeid string src workspac srcworkspacenam workspac except nosuchworkspaceexcept access deni except accessdeniedexcept lock except lockexcept invalid item state except invaliditemstateexcept repositori except repositoryexcept
clone subtre identifi code srcnodeid code
workspac name code srcworkspacenam code destin
workspac code sessioninfo code
destin compos parent
code destnam code
param sessioninfo
param srcworkspacenam
param srcnodeid
param destparentnodeid
param destnam
param removeexist
throw javax jcr nosuchworkspaceexcept
throw javax jcr nodetyp constraintviolationexcept
throw javax jcr version versionexcept
throw javax jcr accessdeniedexcept
throw javax jcr pathnotfoundexcept
throw javax jcr itemexistsexcept
throw javax jcr lock lockexcept
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr repositoryexcept
javax jcr workspac clone string string string boolean
clone session info sessioninfo session info sessioninfo string src workspac srcworkspacenam node nodeid src node srcnodeid node nodeid dest parent node destparentnodeid dest destnam remov exist removeexist workspac except nosuchworkspaceexcept constraint violat except constraintviolationexcept version except versionexcept access deni except accessdeniedexcept path found except pathnotfoundexcept item exist except itemexistsexcept lock except lockexcept unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
lock
return lock inform appli code node code identifi
code nodeid code code null code implement
support lock method return code null code
param sessioninfo
param nodeid
return lock inform node identifi
code nodeid code code null code lock appli node
throw javax jcr accessdeniedexcept
throw javax jcr repositoryexcept error occur
node getlock
lock info lockinfo lock info getlockinfo session info sessioninfo session info sessioninfo node nodeid node nodeid access deni except accessdeniedexcept repositori except repositoryexcept
creat lock code node code identifi
param sessioninfo
param nodeid
param deep
param sessionscop
return code lockinfo code lock
creat
throw javax jcr unsupportedrepositoryoperationexcept spi
implement support lock
throw javax jcr lock lockexcept node identifi
lock due exist lock due miss mixin type
throw javax jcr accessdeniedexcept
throw javax jcr repositoryexcept error occur
javax jcr node lock boolean boolean
lock info lockinfo lock session info sessioninfo session info sessioninfo node nodeid node nodeid deep session scope sessionscop unsupport repositori oper except unsupportedrepositoryoperationexcept lock except lockexcept access deni except accessdeniedexcept repositori except repositoryexcept
creat lock code node code identifi
param sessioninfo
param nodeid
param deep
param sessionscop
param timeouthint long indic desir lock timeout second
implement free ignor hint
param ownerhint string indic desir lockown info
implement free ignor hint
return code lockinfo code lock
creat
throw javax jcr unsupportedrepositoryoperationexcept spi
implement support lock
throw javax jcr lock lockexcept node identifi
lock due exist lock due miss mixin type
throw javax jcr accessdeniedexcept
throw javax jcr repositoryexcept error occur
javax jcr lock lockmanag lock string boolean boolean long string
jcr
lock info lockinfo lock session info sessioninfo session info sessioninfo node nodeid node nodeid deep session scope sessionscop timeout hint timeouthint string owner hint ownerhint unsupport repositori oper except unsupportedrepositoryoperationexcept lock except lockexcept access deni except accessdeniedexcept repositori except repositoryexcept
explicit refresh exist lock exist lock refresh
implicitli read write method list
param sessioninfo
param nodeid
throw javax jcr unsupportedrepositoryoperationexcept spi
implement support lock
throw javax jcr lock lockexcept node identifi
lock code sessioninfo code
token lock refresh
throw javax jcr accessdeniedexcept
throw javax jcr repositoryexcept error occur
javax jcr lock lock
refresh lock refreshlock session info sessioninfo session info sessioninfo node nodeid node nodeid unsupport repositori oper except unsupportedrepositoryoperationexcept lock except lockexcept access deni except accessdeniedexcept repositori except repositoryexcept
releas lock code node code identifi
code nodeid code
note link javax jcr session logout logout
session scope lock releas call unlock
param sessioninfo
param nodeid
throw javax jcr unsupportedrepositoryoperationexcept spi
implement support lock
throw javax jcr lock lockexcept node identifi
lock code sessioninfo code
token lock releas
throw javax jcr accessdeniedexcept
throw javax jcr repositoryexcept error occur
javax jcr node unlock
unlock session info sessioninfo session info sessioninfo node nodeid node nodeid unsupport repositori oper except unsupportedrepositoryoperationexcept lock except lockexcept access deni except accessdeniedexcept repositori except repositoryexcept
version
perform checkin code node code identifi
code nodeid code
param sessioninfo
param nodeid
return code nodeid code newli creat version
throw javax jcr version versionexcept
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr invaliditemstateexcept
throw javax jcr lock lockexcept
throw javax jcr repositoryexcept
javax jcr node checkin
node nodeid checkin session info sessioninfo session info sessioninfo node nodeid node nodeid version except versionexcept unsupport repositori oper except unsupportedrepositoryoperationexcept invalid item state except invaliditemstateexcept lock except lockexcept repositori except repositoryexcept
perform checkout code node code identifi
code nodeid code link checkout sessioninfo nodeid nodeid
code activityid code code null code
param sessioninfo
param nodeid
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr lock lockexcept
throw javax jcr repositoryexcept
javax jcr node checkout
checkout session info sessioninfo session info sessioninfo node nodeid node nodeid unsupport repositori oper except unsupportedrepositoryoperationexcept lock except lockexcept repositori except repositoryexcept
perform checkout code node code identifi
code nodeid code activ identifi
code activityid code code activityid code code null code
correspond link checkout sessioninfo nodeid
param sessioninfo
param nodeid
param activityid activ node set edit session
code null code activ effect
throw unsupportedrepositoryoperationexcept
throw lockexcept
throw repositoryexcept
jcr
checkout session info sessioninfo session info sessioninfo node nodeid node nodeid node nodeid activ activityid unsupport repositori oper except unsupportedrepositoryoperationexcept lock except lockexcept repositori except repositoryexcept
perform checkpoint code node code identifi
code nodeid code
param sessioninfo
param nodeid
return code nodeid code newli creat version
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr repositoryexcept
javax jcr version versionmanag checkpoint string
jcr
node nodeid checkpoint session info sessioninfo session info sessioninfo node nodeid node nodeid unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
perform checkpoint code node code identifi
code nodeid code checkout part code activityid code
account link checkout sessioninfo nodeid nodeid
param sessioninfo
param nodeid
param activityid activ node set edit session
code null code activ effect
throw unsupportedrepositoryoperationexcept
throw lockexcept
throw repositoryexcept
jcr
node nodeid checkpoint session info sessioninfo session info sessioninfo node nodeid node nodeid node nodeid activ activityid unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
remov version identifi code versionid code
param sessioninfo
param versionhistoryid code nodeid code identifi version
histori version identifi code versionid code belong
param versionid
throw referentialintegrityexcept
throw accessdeniedexcept
throw unsupportedrepositoryoperationexcept
throw versionexcept
throw repositoryexcept
javax jcr version versionhistori removevers string
remov version removevers session info sessioninfo session info sessioninfo node nodeid version histori versionhistoryid node nodeid version versionid referenti integr except referentialintegrityexcept access deni except accessdeniedexcept unsupport repositori oper except unsupportedrepositoryoperationexcept version except versionexcept repositori except repositoryexcept
restor node identifi code nodeid code state defin
version code versionid code
param sessioninfo
param nodeid
param versionid
param removeexist boolean flag indic deal
identifi collis occur node exist subtre
restor identifi node
introduc restor code removeexist code
code true code restor node take preced
exist node remov restor fail
throw javax jcr version versionexcept
throw javax jcr pathnotfoundexcept
throw javax jcr itemexistsexcept
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr lock lockexcept
throw javax jcr invaliditemstateexcept
throw javax jcr repositoryexcept
javax jcr node restor string boolean
javax jcr node restor javax jcr version version boolean
javax jcr node restor javax jcr version version string boolean
javax jcr node restorebylabel string boolean
restor session info sessioninfo session info sessioninfo node nodeid node nodeid node nodeid version versionid remov exist removeexist version except versionexcept path found except pathnotfoundexcept item exist except itemexistsexcept unsupport repositori oper except unsupportedrepositoryoperationexcept lock except lockexcept invalid item state except invaliditemstateexcept repositori except repositoryexcept
restor multipl version version restor
identifi arrai code nodeid code
param sessioninfo
param versionid
param removeexist boolean flag indic deal
identifi collis occur node exist subtre
restor identifi node
introduc restor code removeexist code
code true code node restor take preced
exist node remov restor fail
throw javax jcr itemexistsexcept
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr version versionexcept
throw javax jcr lock lockexcept
throw javax jcr invaliditemstateexcept
throw javax jcr repositoryexcept
javax jcr workspac restor javax jcr version version boolean
restor session info sessioninfo session info sessioninfo node nodeid version id versionid remov exist removeexist item exist except itemexistsexcept unsupport repositori oper except unsupportedrepositoryoperationexcept version except versionexcept lock except lockexcept invalid item state except invaliditemstateexcept repositori except repositoryexcept
merg node identifi code nodeid code subtre
node present workspac
code srcworkspacenam code
param sessioninfo
param nodeid
param srcworkspacenam
param besteffort
return code iter code link nodeid node
receiv merg result fail oper
throw javax jcr nosuchworkspaceexcept
throw javax jcr accessdeniedexcept
throw javax jcr mergeexcept
throw javax jcr lock lockexcept
throw javax jcr invaliditemstateexcept
throw javax jcr repositoryexcept
javax jcr node merg string boolean
iter node nodeid merg session info sessioninfo session info sessioninfo node nodeid node nodeid string src workspac srcworkspacenam effort besteffort workspac except nosuchworkspaceexcept access deni except accessdeniedexcept merg except mergeexcept lock except lockexcept invalid item state except invaliditemstateexcept repositori except repositoryexcept
merg node identifi code nodeid code subtre
node present workspac
code srcworkspacenam code
param sessioninfo
param nodeid
param srcworkspacenam
param besteffort
return code iter code link nodeid node
receiv merg result fail oper
throw javax jcr nosuchworkspaceexcept
throw javax jcr accessdeniedexcept
throw javax jcr mergeexcept
throw javax jcr lock lockexcept
throw javax jcr invaliditemstateexcept
throw javax jcr repositoryexcept
javax jcr version versionmanag merg string string boolean boolean
jcr
iter node nodeid merg session info sessioninfo session info sessioninfo node nodeid node nodeid string src workspac srcworkspacenam effort besteffort shallow isshallow workspac except nosuchworkspaceexcept access deni except accessdeniedexcept merg except mergeexcept lock except lockexcept invalid item state except invaliditemstateexcept repositori except repositoryexcept
resolv exist merg conflict present node identifi
code nodeid code
param sessioninfo
param nodeid
param mergefailedid code nodeid code remain jcr mergefail
refer properti version resolv remov
arrai ad predecessor id case link node donemerg version
case link node cancelmerg version version
remov list
param predecessorid complet set predecessor includ
ad order resolv merg conflict
throw javax jcr version versionexcept
throw javax jcr invaliditemstateexcept
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr repositoryexcept
javax jcr node cancelmerg javax jcr version version
javax jcr node donemerg javax jcr version version
resolv merg conflict resolvemergeconflict session info sessioninfo session info sessioninfo node nodeid node nodeid node nodeid merg fail id mergefailedid node nodeid predecessor id predecessorid version except versionexcept invalid item state except invaliditemstateexcept unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
add version label persist layer
param sessioninfo
param versionhistoryid code nodeid code identifi version
histori version identifi code versionid code belong
param versionid code nodeid code identifi version
label belong
param label label ad
param movelabel label assign version
version histori paramet effect code true code
label present move label version
code versionid code code fals code method
fail label remain origin version
throw javax jcr version versionexcept
throw javax jcr repositoryexcept
javax jcr version versionhistori addversionlabel string string boolean
add version label addversionlabel session info sessioninfo session info sessioninfo node nodeid version histori versionhistoryid node nodeid version versionid label move label movelabel version except versionexcept repositori except repositoryexcept
remov version label persist layer
param sessioninfo
param versionhistoryid code nodeid code identifi version
histori version identifi code versionid code belong
param versionid code nodeid code identifi version
label belong
param label label remov
throw javax jcr version versionexcept
throw javax jcr repositoryexcept
javax jcr version versionhistori removeversionlabel string
remov version label removeversionlabel session info sessioninfo session info sessioninfo node nodeid version histori versionhistoryid node nodeid version versionid label version except versionexcept repositori except repositoryexcept
creat activ
param sessioninfo
param titl
return code nodeid code activ node
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr repositoryexcept
javax jcr version versionmanag createact string
jcr
node nodeid creat activ createact session info sessioninfo session info sessioninfo string titl unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
remov activ identifi code activityid code
param sessioninfo
param activityid
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr repositoryexcept
javax jcr version versionmanag removeact node
jcr
remov activ removeact session info sessioninfo session info sessioninfo node nodeid activ activityid unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
merg activ identifi code activityid code
workspac code sessioninfo code creat
param sessioninfo
param activityid
return code iter code link nodeid node
receiv merg result fail oper
throw unsupportedrepositoryoperationexcept
throw repositoryexcept
iter node nodeid merg activ mergeact session info sessioninfo session info sessioninfo node nodeid activ activityid unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
param sessioninfo
param nodeid
return
throw unsupportedrepositoryoperationexcept
throw repositoryexcept
javax jcr version versionmanag createconfigur string
node nodeid creat configur createconfigur session info sessioninfo session info sessioninfo node nodeid node nodeid unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
search
return string arrai identifi queri languag support
spi implement
param sessioninfo
return string arrai identifi queri languag support
spi implement
throw javax jcr repositoryexcept
javax jcr queri querymanag getsupportedquerylanguag
string support queri languag getsupportedquerylanguag session info sessioninfo session info sessioninfo repositori except repositoryexcept
check queri code statement code valid
queri code languag code return bind variabl
name found queri statement
param sessioninfo session info
param statement queri statement check
param languag queri languag
param namespac local map namespac
queri code statement code
return bind variabl name
throw invalidqueryexcept queri statement invalid
languag support
throw repositoryexcept error occur check
statement
javax jcr queri querymanag createqueri string string
string check queri statement checkquerystat session info sessioninfo session info sessioninfo string statement string languag map string string namespac invalid queri except invalidqueryexcept repositori except repositoryexcept
execut queri statement queri languag
addit code namespac code paramet map prefix
namespac uri order properli resolv prefix localnam
pattern present queri statement
param sessioninfo session info execut queri
param statement queri statement execut
param languag queri languag pars queri
code statement code
param namespac local map namespac
queri code statement code
param limit maximum result size code code
maximum set
param offset offset total result set code code
offset set
param valu map pair collect call
link javax jcr queri queri bindvalu string
javax jcr
return queri info
throw repositoryexcept error occur
javax jcr queri queri execut
queri info queryinfo execut queri executequeri session info sessioninfo session info sessioninfo
string statement
string languag
map string string namespac
limit
offset
map string qvalu valu
repositori except repositoryexcept
observ
creat event filter repositori support observ
filter creat base paramet link
javax jcr observ observationmanag addeventlisten
note spi implement support observ
link javax jcr repositori option observ support repositori descriptor
return 'true'
param sessioninfo session info request event filter
param eventtyp combin event type constant
encod bitmask
param abspath absolut path
param isdeep code boolean code
param uuid arrai jcr uuid properti
param nodetypenam arrai node type name
param noloc code boolean code
return event filter instanc paramet
throw unsupportedrepositoryoperationexcept spi implement
creat event filter
throw repositoryexcept error occur creat
eventfilt
javax jcr observ observationmanag addeventlisten javax jcr observ eventlisten int string boolean string string boolean
event filter eventfilt creat event filter createeventfilt session info sessioninfo session info sessioninfo event type eventtyp
path ab path abspath deep isdeep
string uuid node type nodetypenam
local noloc
unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
creat link subscript event initi set
link eventfilt return subscript provid event
time subscript creat empti arrai filter
pass event creat subscript
filter updat call
link repositoryservic updateeventfilt subscript eventfilt
param sessioninfo session info
param filter initi event filter subscript
return
throw unsupportedrepositoryoperationexcept
spi implement support
observ
throw repositoryexcept error occur creat
subscript
subscript creat subscript createsubscript session info sessioninfo session info sessioninfo event filter eventfilt filter
unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
updat event filter subscript method return
event pass subscript gener
method call filter pass
code filter code
implement requir accept event filter instanc
creat link repositoryservic createeventfilt option
implement support event filter instanci client
implement requir special deploy case
make event filter implement class
repositori server
note thread safeti permiss call method
thread block call link
repositoryservic getev subscript long
subscript instanc paramet
param subscript subscript event filter
appli
param filter filter appli event
occur repositori event includ
event bundl link eventfilt accept event
boolean accept suppli
filter empti arrai pass potenti
event includ event bundl
client skip ignor event period
time
throw repositoryexcept error occur updat event
filter
updat event filter updateeventfilt subscript subscript event filter eventfilt filter
repositori except repositoryexcept
retriev event occur call method
pass subscript
note spi implement support observ
link javax jcr repositori option observ support
repositori descriptor return 'false'
implement block call thread return
subscript dispos thread
param subscript subscript
param timeout timeout millisecond wait
event bundl code timeout code
event occur empti arrai return
return arrai code eventbundl code repres event
occur
throw repositoryexcept error occur retriev
event bundl
throw interruptedexcept call thread interrupt
wait event
code timeout code
event bundl eventbundl event getev subscript subscript timeout
repositori except repositoryexcept interrupt except interruptedexcept
return event code eventjourn code point
time return event bundl event
time order retriev event client call method
timestamp event bundl empti bundl
event
param sessioninfo session info
param filter event filter appli note
code noloc code flag
param retriev event occur
timestamp
return event bundl
throw repositoryexcept error occur
throw unsupportedrepositoryoperationexcept
underli implement
support event journal
event bundl eventbundl event getev session info sessioninfo session info sessioninfo event filter eventfilt filter
repositori except repositoryexcept unsupport repositori oper except unsupportedrepositoryoperationexcept
pass subscript longer need
note thread safeti permiss call method
thread block call link
repositoryservic getev subscript long
subscript instanc paramet
throw repositoryexcept error occur subscript
dispos
dispos subscript subscript repositori except repositoryexcept
namespac
retriev regist namespac namespac prefix map
prefix kei namespac map
param sessioninfo
return
throw javax jcr repositoryexcept
javax jcr workspac getnamespaceregistri
javax jcr namespaceregistri getprefix
javax jcr namespaceregistri geturi
map string string regist namespac getregisterednamespac session info sessioninfo session info sessioninfo repositori except repositoryexcept
return namespac uri namespac code prefix code
param sessioninfo session info
param prefix namespac prefix resolv
return namespac uri namespac code prefix code
throw namespaceexcept prefix map namespac uri
throw repositoryexcept error occur
javax jcr namespaceregistri geturi string
string namespac uri getnamespaceuri session info sessioninfo session info sessioninfo string prefix
namespac except namespaceexcept repositori except repositoryexcept
return namespac prefix namespac code uri code
param sessioninfo session info
param uri namespac uri
return namespac prefix
throw namespaceexcept uri unknown
throw repositoryexcept error occur
javax jcr namespaceregistri getprefix string
string namespac prefix getnamespaceprefix session info sessioninfo session info sessioninfo string uri
namespac except namespaceexcept repositori except repositoryexcept
regist namespac prefix uri
param sessioninfo
param prefix prefix namespac regist
param uri namespac uri regist
throw javax jcr namespaceexcept
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr accessdeniedexcept
throw javax jcr repositoryexcept
javax jcr namespaceregistri registernamespac string string
regist namespac registernamespac session info sessioninfo session info sessioninfo string prefix string uri namespac except namespaceexcept unsupport repositori oper except unsupportedrepositoryoperationexcept access deni except accessdeniedexcept repositori except repositoryexcept
unregist namespac identifi uri
param sessioninfo
param uri namespac uri unregist
throw javax jcr namespaceexcept
throw javax jcr unsupportedrepositoryoperationexcept
throw javax jcr accessdeniedexcept
throw javax jcr repositoryexcept
javax jcr namespaceregistri unregisternamespac string
unregist namespac unregisternamespac session info sessioninfo session info sessioninfo string uri namespac except namespaceexcept unsupport repositori oper except unsupportedrepositoryoperationexcept access deni except accessdeniedexcept repositori except repositoryexcept
nodetyp
retriev code qnodetypedefinit code regist nodetyp
param sessioninfo
return iter link qnodetypedefinit
throw javax jcr repositoryexcept
javax jcr workspac getnodetypemanag
javax jcr nodetyp nodetypemanag getallnodetyp
javax jcr nodetyp nodetypemanag getmixinnodetyp
javax jcr nodetyp nodetypemanag getprimarynodetyp
javax jcr nodetyp nodetypemanag getnodetyp string
iter node type definit qnodetypedefinit node type definit getqnodetypedefinit session info sessioninfo session info sessioninfo repositori except repositoryexcept
retriev code qnodetypedefinit code name
implement free return addit definit
need caller due node type inherit caller
deal kind addit code qnodetypedefinit code
present code iter code irrespect
load
param sessioninfo
param nodetypenam name node type retriev
return link qnodetypedefinit
throw javax jcr nodetyp nosuchnodetypeexcept
name code qnodetypedefinit code exist
throw javax jcr repositoryexcept
javax jcr workspac getnodetypemanag
javax jcr nodetyp nodetypemanag getallnodetyp
javax jcr nodetyp nodetypemanag getmixinnodetyp
javax jcr nodetyp nodetypemanag getprimarynodetyp
javax jcr nodetyp nodetypemanag getnodetyp string
iter node type definit qnodetypedefinit node type definit getqnodetypedefinit session info sessioninfo session info sessioninfo nodetyp name nodetypenam repositori except repositoryexcept
regist node type code qnodetypedefinit code
code allowupd code code true code method
reregist exist node type modifi definit
method fail code nodetypeexistsexcept code
definit regist node type
param sessioninfo
param nodetypedefinit
param allowupd
throw invalidnodetypedefinitionexcept definit
invalid
throw nodetypeexistsexcept definit
regist node type code allowupd code code fals code
throw unsupportedrepositoryoperationexcept regist node type
support
throw repositoryexcept error occur
javax jcr nodetyp nodetypemanag registernodetyp javax jcr nodetyp nodetypedefinit boolean
regist node type registernodetyp session info sessioninfo session info sessioninfo node type definit qnodetypedefinit node type definit nodetypedefinit updat allowupd invalid node type definit except invalidnodetypedefinitionexcept node type exist except nodetypeexistsexcept unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
unregist node type code name code
param sessioninfo
param nodetypenam
throw unsupportedrepositoryoperationexcept unregist node type
support
throw nosuchnodetypeexcept name
regist node type
throw repositoryexcept error occur
javax jcr nodetyp nodetypemanag unregisternodetyp string
unregist node type unregisternodetyp session info sessioninfo session info sessioninfo node type name nodetypenam unsupport repositori oper except unsupportedrepositoryoperationexcept node type except nosuchnodetypeexcept repositori except repositoryexcept
workspac manag
creat workspac code code
code srcworkspacenam code code null code content
workspac 'cloned' workspac init content
empti workspac creat
param sessioninfo
param workspac
param srcworkspacenam workspac initi
content workspac 'cloned'
throw accessdeniedexcept
throw unsupportedrepositoryoperationexcept
throw nosuchworkspaceexcept
throw repositoryexcept
javax jcr workspac createworkspac string
javax jcr workspac createworkspac string string
jcr
creat workspac createworkspac session info sessioninfo session info sessioninfo string string src workspac srcworkspacenam access deni except accessdeniedexcept unsupport repositori oper except unsupportedrepositoryoperationexcept workspac except nosuchworkspaceexcept repositori except repositoryexcept
delet workspac code code
param sessioninfo
param workspac delet
throw accessdeniedexcept
throw unsupportedrepositoryoperationexcept
throw nosuchworkspaceexcept
throw repositoryexcept
javax jcr workspac deleteworkspac string
jcr
delet workspac deleteworkspac session info sessioninfo session info sessioninfo string access deni except accessdeniedexcept unsupport repositori oper except unsupportedrepositoryoperationexcept workspac except nosuchworkspaceexcept repositori except repositoryexcept
