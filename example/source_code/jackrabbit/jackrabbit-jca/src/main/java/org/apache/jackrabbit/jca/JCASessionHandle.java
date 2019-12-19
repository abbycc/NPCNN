org apach jackrabbit jca
java except ioexcept
java input stream inputstream
java output stream outputstream
java secur access control except accesscontrolexcept
javax jcr access deni except accessdeniedexcept
javax jcr credenti
javax jcr invalid item state except invaliditemstateexcept
javax jcr invalid serial data except invalidserializeddataexcept
javax jcr item
javax jcr item exist except itemexistsexcept
javax jcr item found except itemnotfoundexcept
javax jcr login except loginexcept
javax jcr namespac except namespaceexcept
javax jcr node
javax jcr path found except pathnotfoundexcept
javax jcr properti
javax jcr repositori
javax jcr repositori except repositoryexcept
javax jcr session
javax jcr unsupport repositori oper except unsupportedrepositoryoperationexcept
javax jcr factori valuefactori
javax jcr workspac
javax jcr lock lock except lockexcept
javax jcr nodetyp constraint violat except constraintviolationexcept
javax jcr nodetyp node type except nosuchnodetypeexcept
javax jcr retent retent manag retentionmanag
javax jcr secur access control manag accesscontrolmanag
javax jcr version version except versionexcept
javax transact except xaexcept
javax transact resourc xaresourc
javax transact xid
org xml sax content handler contenthandl
org xml sax sax except saxexcept
class implement jca implement session
jca session handl jcasessionhandl session resourc xaresourc
manag connect
jca manag connect jcamanagedconnect
construct session
jca session handl jcasessionhandl jca manag connect jcamanagedconnect
return manag connect
jca manag connect jcamanagedconnect manag connect getmanagedconnect
set manag connect
set manag connect setmanagedconnect jca manag connect jcamanagedconnect
return session
session session getsess
session getsess
return repositori
repositori repositori getrepositori
session getsess repositori getrepositori
return user
string user getuserid
session getsess user getuserid
return attribut
object attribut getattribut string
session getsess attribut getattribut
return attribut name
string attribut name getattributenam
session getsess attribut name getattributenam
return workspac
workspac workspac getworkspac
session getsess workspac getworkspac
imperson user
session imperson credenti cred
login except loginexcept repositori except repositoryexcept
repositori except repositoryexcept imperson support manag environ
return root node
node root node getrootnod
repositori except repositoryexcept
session getsess root node getrootnod
return node uuid
suppress warn suppresswarn deprec
node node uuid getnodebyuuid string uuid
item found except itemnotfoundexcept repositori except repositoryexcept
session getsess node uuid getnodebyuuid uuid
return item
item item getitem string arg0
path found except pathnotfoundexcept repositori except repositoryexcept
session getsess item getitem arg0
return true item exist
item exist itemexist string arg0
repositori except repositoryexcept
session getsess item exist itemexist arg0
move item
move string arg0 string arg1
item exist except itemexistsexcept path found except pathnotfoundexcept version except versionexcept
constraint violat except constraintviolationexcept lock except lockexcept repositori except repositoryexcept
session getsess move arg0 arg1
save session
save
access deni except accessdeniedexcept item exist except itemexistsexcept
constraint violat except constraintviolationexcept invalid item state except invaliditemstateexcept version except versionexcept
lock except lockexcept node type except nosuchnodetypeexcept repositori except repositoryexcept
session getsess save
refresh session
refresh arg0
repositori except repositoryexcept
session getsess refresh arg0
return true pend
pend haspendingchang
repositori except repositoryexcept
session getsess pend haspendingchang
return factori
factori valuefactori factori getvaluefactori
unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
session getsess factori getvaluefactori
check permiss
check permiss checkpermiss string arg0 string arg1
access control except accesscontrolexcept repositori except repositoryexcept
session getsess check permiss checkpermiss arg0 arg1
return import content handler
content handler contenthandl import content handler getimportcontenthandl string arg0 arg1
path found except pathnotfoundexcept constraint violat except constraintviolationexcept version except versionexcept
lock except lockexcept repositori except repositoryexcept
session getsess import content handler getimportcontenthandl arg0 arg1
import xml content
import xml importxml string arg0 input stream inputstream arg1 arg2
except ioexcept path found except pathnotfoundexcept item exist except itemexistsexcept
constraint violat except constraintviolationexcept version except versionexcept invalid serial data except invalidserializeddataexcept
lock except lockexcept repositori except repositoryexcept
session getsess import xml importxml arg0 arg1 arg2
export system view
export system view exportsystemview string arg0 content handler contenthandl arg1 arg2 arg3
path found except pathnotfoundexcept sax except saxexcept repositori except repositoryexcept
session getsess export system view exportsystemview arg0 arg1 arg2 arg3
export system view
export system view exportsystemview string arg0 output stream outputstream arg1 arg2 arg3
except ioexcept path found except pathnotfoundexcept repositori except repositoryexcept
session getsess export system view exportsystemview arg0 arg1 arg2 arg3
export document view
export document view exportdocumentview string arg0 content handler contenthandl arg1 arg2 arg3
path found except pathnotfoundexcept sax except saxexcept repositori except repositoryexcept
session getsess export document view exportdocumentview arg0 arg1 arg2 arg3
export document view
export document view exportdocumentview string arg0 output stream outputstream arg1 arg2 arg3
except ioexcept path found except pathnotfoundexcept repositori except repositoryexcept
session getsess export document view exportdocumentview arg0 arg1 arg2 arg3
set namespac prefix
set namespac prefix setnamespaceprefix string arg0 string arg1
namespac except namespaceexcept repositori except repositoryexcept
session getsess set namespac prefix setnamespaceprefix arg0 arg1
return namespac prefix
string namespac prefix getnamespaceprefix
repositori except repositoryexcept
session getsess namespac prefix getnamespaceprefix
return namespac uri
string namespac uri getnamespaceuri string arg0
namespac except namespaceexcept repositori except repositoryexcept
session getsess namespac uri getnamespaceuri arg0
return namespac prefix
string namespac prefix getnamespaceprefix string arg0
namespac except namespaceexcept repositori except repositoryexcept
session getsess namespac prefix getnamespaceprefix arg0
logout session
logout
close handl closehandl
return true session live
live isliv
session getsess live isliv
add lock token
suppress warn suppresswarn deprec
add lock token addlocktoken string arg0
session getsess add lock token addlocktoken arg0
return lock token
suppress warn suppresswarn deprec
string lock token getlocktoken
session getsess lock token getlocktoken
remov lock token
suppress warn suppresswarn deprec
remov lock token removelocktoken string arg0
session getsess remov lock token removelocktoken arg0
access control manag accesscontrolmanag access control manag getaccesscontrolmanag
repositori except repositoryexcept
session getsess access control manag getaccesscontrolmanag
node node getnod string arg0 repositori except repositoryexcept
session getsess node getnod arg0
node node identifi getnodebyidentifi string arg0 repositori except repositoryexcept
session getsess node identifi getnodebyidentifi arg0
properti properti getproperti string arg0 repositori except repositoryexcept
session getsess properti getproperti arg0
retent manag retentionmanag retent manag getretentionmanag
repositori except repositoryexcept
session getsess retent manag getretentionmanag
capabl hascap string arg0 object arg1 object arg2
repositori except repositoryexcept
session getsess capabl hascap arg0 arg1 arg2
permiss haspermiss string arg0 string arg1
repositori except repositoryexcept
session getsess permiss haspermiss arg0 arg1
node exist nodeexist string path repositori except repositoryexcept
session getsess node exist nodeexist path
properti exist propertyexist string path repositori except repositoryexcept
session getsess properti exist propertyexist path
remov item removeitem string path repositori except repositoryexcept
session getsess remov item removeitem path
xaresourc
resourc xaresourc resourc getxaresourc except xaexcept
session session session getsess
session resourc xaresourc
resourc xaresourc session
except xaexcept
transact support session
start xid xid flag except xaexcept
resourc getxaresourc start xid flag
end xid xid flag except xaexcept
resourc getxaresourc end xid flag
prepar xid xid except xaexcept
resourc getxaresourc prepar xid
rollback xid xid except xaexcept
resourc getxaresourc rollback xid
commit xid xid phase onephas except xaexcept
resourc getxaresourc commit xid phase onephas
forget xid xid except xaexcept
resourc getxaresourc forget xid
xid recov flag except xaexcept
resourc getxaresourc recov flag
issamerm resourc xaresourc xare except xaexcept
xare jca session handl jcasessionhandl
xare jca session handl jcasessionhandl xare resourc getxaresourc
resourc getxaresourc issamerm xare
transact timeout gettransactiontimeout except xaexcept
resourc getxaresourc transact timeout gettransactiontimeout
set transact timeout settransactiontimeout second except xaexcept
resourc getxaresourc set transact timeout settransactiontimeout second
