org apach jackrabbit rmi client
java secur princip
java util iter
javax jcr item
javax jcr namespac registri namespaceregistri
javax jcr node
javax jcr node iter nodeiter
javax jcr properti
javax jcr properti iter propertyiter
javax jcr repositori
javax jcr session
javax jcr workspac
javax jcr lock lock
javax jcr lock lock manag lockmanag
javax jcr nodetyp item definit itemdefinit
javax jcr nodetyp node definit nodedefinit
javax jcr nodetyp node type nodetyp
javax jcr nodetyp node type iter nodetypeiter
javax jcr nodetyp node type manag nodetypemanag
javax jcr nodetyp properti definit propertydefinit
javax jcr observ observ manag observationmanag
javax jcr queri queri
javax jcr queri queri manag querymanag
javax jcr queri queri result queryresult
javax jcr queri row
javax jcr queri row iter rowiter
javax jcr secur access control entri accesscontrolentri
javax jcr secur access control manag accesscontrolmanag
javax jcr secur access control polici accesscontrolpolici
javax jcr secur access control polici iter accesscontrolpolicyiter
javax jcr secur privileg
javax jcr version version
javax jcr version version histori versionhistori
javax jcr version version iter versioniter
javax jcr version version manag versionmanag
org apach jackrabbit rmi remot remot item remoteitem
org apach jackrabbit rmi remot remot item definit remoteitemdefinit
org apach jackrabbit rmi remot remot iter remoteiter
org apach jackrabbit rmi remot remot lock remotelock
org apach jackrabbit rmi remot remot lock manag remotelockmanag
org apach jackrabbit rmi remot remot namespac registri remotenamespaceregistri
org apach jackrabbit rmi remot remot node remotenod
org apach jackrabbit rmi remot remot node definit remotenodedefinit
org apach jackrabbit rmi remot remot node type remotenodetyp
org apach jackrabbit rmi remot remot node type manag remotenodetypemanag
org apach jackrabbit rmi remot remot observ manag remoteobservationmanag
org apach jackrabbit rmi remot remot properti remoteproperti
org apach jackrabbit rmi remot remot properti definit remotepropertydefinit
org apach jackrabbit rmi remot remot queri remotequeri
org apach jackrabbit rmi remot remot queri manag remotequerymanag
org apach jackrabbit rmi remot remot queri result remotequeryresult
org apach jackrabbit rmi remot remot repositori remoterepositori
org apach jackrabbit rmi remot remot row remoterow
org apach jackrabbit rmi remot remot session remotesess
org apach jackrabbit rmi remot remot version remotevers
org apach jackrabbit rmi remot remot version histori remoteversionhistori
org apach jackrabbit rmi remot remot version manag remoteversionmanag
org apach jackrabbit rmi remot remot workspac remoteworkspac
org apach jackrabbit rmi remot princip remot princip remoteprincip
org apach jackrabbit rmi remot secur remot access control entri remoteaccesscontrolentri
org apach jackrabbit rmi remot secur remot access control manag remoteaccesscontrolmanag
org apach jackrabbit rmi remot secur remot access control polici remoteaccesscontrolpolici
org apach jackrabbit rmi remot secur remot privileg remoteprivileg
factori interfac creat local adapt remot refer
interfac defin remot jcr rmi refer adapt
back normal jcr interfac adapt mechan
modifi add extra featur chang
local adapt factori repositori client
note
link org apach jackrabbit rmi client clientobject clientobject
base class number util method design work
local adapt factori adapt implement inherit
function subclass clientobject
org apach jackrabbit rmi server remoteadapterfactori
org apach jackrabbit rmi client clientadapterfactori
org apach jackrabbit rmi client clientobject
local adapt factori localadapterfactori
factori method creat local adapt remot repositori
param remot remot repositori
return local repositori adapt
repositori repositori getrepositori remot repositori remoterepositori remot
factori method creat local adapt remot session
param repositori current repositori
param remot remot session
return local session adapt
session session getsess repositori repositori remot session remotesess remot
factori method creat local adapt remot workspac
param session current session
param remot remot workspac
return local workspac adapt
workspac workspac getworkspac session session remot workspac remoteworkspac remot
factori method creat local adapt remot observ
manag
param workspac current workspac
param remot remot observ manag
return local observ manag adapt
observ manag observationmanag observ manag getobservationmanag workspac workspac
remot observ manag remoteobservationmanag remot
factori method creat local adapt remot namespac
registri
param remot remot namespac registri
return local namespac registri adapt
namespac registri namespaceregistri namespac registri getnamespaceregistri remot namespac registri remotenamespaceregistri remot
factori method creat local adapt remot node type
manag
param remot remot node type manag
return local node type manag adapt
node type manag nodetypemanag node type manag getnodetypemanag remot node type manag remotenodetypemanag remot
factori method creat local adapt remot item
note call method client
introspect remot item refer determin
link getnod session remotenod getnod
link getproperti session remoteproperti getproperti method
adapt return method cover
basic link item item interfac
param session current session
param remot remot item
return local item adapt
item item getitem session session remot item remoteitem remot
factori method creat local adapt remot properti
param session current session
param remot remot properti
return local properti adapt
properti properti getproperti session session remot properti remoteproperti remot
factori method creat local adapt remot node
param session current session
param remot remot node
return local node adapt
node node getnod session session remot node remotenod remot
factori method creat local adapt remot version
param session current session
param remot remot version
return local version adapt
version version getvers session session remot version remotevers remot
factori method creat local adapt remot version histori
param session current session
param remot remot version histori
return local version histori adapt
version histori versionhistori version histori getversionhistori session session remot version histori remoteversionhistori remot
factori method creat local adapt remot node type
param remot remot node type
return local node type adapt
node type nodetyp node type getnodetyp remot node type remotenodetyp remot
factori method creat local adapt remot item
definit note call method client
introspect remot item definit determin
link getnodedef remotenodedefinit getnodedef
link getpropertydef remotepropertydefinit getpropertydef method
adapt return method cover
link itemdefinit itemdef base interfac
param remot remot item definit
return local item definit adapt
item definit itemdefinit item def getitemdef remot item definit remoteitemdefinit remot
factori method creat local adapt remot node
definit
param remot remot node definit
return local node definit adapt
node definit nodedefinit node def getnodedef remot node definit remotenodedefinit remot
factori method creat local adapt remot properti
definit
param remot remot properti definit
return local properti definit adapt
properti definit propertydefinit properti def getpropertydef remot properti definit remotepropertydefinit remot
factori method creat local adapt remot lock
param session current session
param remot remot lock
return local lock adapt
lock lock getlock session session remot lock remotelock remot
factori method creat local adapt remot queri manag
param session current session
param remot remot queri manag
return local queri manag adapt
queri manag querymanag queri manag getquerymanag session session remot queri manag remotequerymanag remot
factori method creat local adapt remot queri
param session current session
param remot remot queri
return local queri adapt
queri queri getqueri session session remot queri remotequeri remot
factori method creat local adapt remot queri result
param session current session
param remot remot queri result
return local queri result adapt
queri result queryresult queri result getqueryresult session session remot queri result remotequeryresult remot
factori method creat local adapt remot queri row
param remot remot queri row
return local queri row adapt
row row getrow remot row remoterow remot
factori method creat local adapt remot node iter
param session current session
param remot remot node iter
return local node iter adapt
node iter nodeiter node iter getnodeiter session session remot iter remoteiter remot
factori method creat local adapt remot properti iter
param session current session
param remot remot properti iter
return local properti iter adapt
properti iter propertyiter properti iter getpropertyiter session session remot iter remoteiter remot
factori method creat local adapt remot version iter
param session current session
param remot remot version iter
return local version iter adapt
version iter versioniter version iter getversioniter session session remot iter remoteiter remot
factori method creat local adapt remot
node type iter
param remot remot node type iter
return local node type iter adapt
node type iter nodetypeiter node type iter getnodetypeiter remot iter remoteiter remot
factori method creat local adapt remot row iter
param remot remot row iter
return local row iter adapt
row iter rowiter row iter getrowiter remot iter remoteiter remot
lock manag lockmanag lock manag getlockmanag session session remot lock manag remotelockmanag lock manag lockmanag
version manag versionmanag version manag getversionmanag
session session remot version manag remoteversionmanag version manag versionmanag
factori method creat local adapt remot access control
manag
param remot remot access control manag
return local access control manag
access control manag accesscontrolmanag access control manag getaccesscontrolmanag
remot access control manag remoteaccesscontrolmanag remot
factori method creat local adapt remot access control
polici
param remot remot access control polici
return local access control polici
access control polici accesscontrolpolici access control polici getaccesscontrolpolici remot access control polici remoteaccesscontrolpolici remot
factori method creat arrai local adapt arrai
remot access control polici
param remot arrai remot access control polici
return arrai local access control polici
access control polici accesscontrolpolici access control polici getaccesscontrolpolici
remot access control polici remoteaccesscontrolpolici remot
factori method creat local adapt remot access control
polici iter
param remot access control polici iter
return local access control polici iter
access control polici iter accesscontrolpolicyiter access control polici iter getaccesscontrolpolicyiter
remot iter remoteiter remot
factori method creat local adapt remot access control
entri
param remot remot access control entri
return local access control entri
access control entri accesscontrolentri access control entri getaccesscontrolentri remot access control entri remoteaccesscontrolentri remot
factori method creat arrai local adapt arrai
remot access control entri
param remot arrai remot access control entri
return local arrai access control entri
access control entri accesscontrolentri access control entri getaccesscontrolentri remot access control entri remoteaccesscontrolentri remot
factori method creat local adapt remot princip
code remot code
link org apach jackrabbit rmi remot secur remotegroup
prinicip return implement code java secur acl group code
interfac
param remot princip
return local princip
princip princip getprincip remot princip remoteprincip remot
factori method creat local adapt remot princip
iter
entri code remot code iter
link org apach jackrabbit rmi remot secur remotegroup
provid princip implement
code java secur acl group code interfac
param remot remot princip iter
return local princip iter
iter princip princip iter getprincipaliter remot iter remoteiter remot
factori method creat local adapt remot privileg
param remot remot privileg
return local privileg
privileg privileg getprivileg remot privileg remoteprivileg remot
factori method creat arrai local adapt arrai
remot privileg
param remot arrai remot privileg
return arrai local privileg
privileg privileg getprivileg remot privileg remoteprivileg remot
