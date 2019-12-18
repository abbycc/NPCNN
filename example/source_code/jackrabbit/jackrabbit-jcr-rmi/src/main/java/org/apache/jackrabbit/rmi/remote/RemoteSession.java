org apach jackrabbit rmi remot
java except ioexcept
java rmi remot
java rmi remot except remoteexcept
javax jcr credenti
javax jcr repositori except repositoryexcept
javax jcr unsupport repositori oper except unsupportedrepositoryoperationexcept
org apach jackrabbit rmi remot secur remot access control manag remoteaccesscontrolmanag
remot version jcr link javax jcr session session interfac
link org apach jackrabbit rmi server serversess serversess
link org apach jackrabbit rmi client clientsess clientsess
adapt provid transpar rmi access remot session
method interfac document refer
session method case remot object
simpli forward method call underli session instanc
complex return valu workspac object return
remot refer remot interfac simpl
return valu except simpli copi network
client rmi error signal remoteexcept
javax jcr session
org apach jackrabbit rmi client clientsess
org apach jackrabbit rmi server serversess
remot session remotesess remot
remot version
link javax jcr session getuserid session getuserid method
return user
throw remoteexcept rmi error
javax jcr session getuserid
string user getuserid remot except remoteexcept
return name attribut note serializ
attribut valu transmit network
client fetch object class
access return failur meet condit
signal remoteexcept
param attribut
return attribut
throw remoteexcept rmi error
javax jcr session getattribut java lang string
object attribut getattribut string remot except remoteexcept
remot version
link javax jcr session getattributenam session getattributenam
method
return attribut name
throw remoteexcept rmi error
string attribut name getattributenam remot except remoteexcept
remot version
link javax jcr session getworkspac session getworkspac method
return workspac
javax jcr session getworkspac
throw remoteexcept rmi error
remot workspac remoteworkspac workspac getworkspac remot except remoteexcept
remot version
link javax jcr session imperson credenti session imperson credenti
method
param credenti credenti session
return session
throw repositoryexcept repositori error
throw remoteexcept rmi error
remot session remotesess imperson credenti credenti
repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session getnodebyidentifi string session getnodebyidentifi string
method
param node identifi
return node
throw repositoryexcept repositori error
throw remoteexcept rmi error
remot node remotenod node identifi getnodebyidentifi string
repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session getnodebyuuid string session getnodebyuuid string
method
param uuid node uuid
return node
throw repositoryexcept repositori error
throw remoteexcept rmi error
remot node remotenod node uuid getnodebyuuid string uuid
repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session getitem string session getitem string
method
param path item path
return item
throw repositoryexcept repositori error
throw remoteexcept rmi error
remot item remoteitem item getitem string path repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session getnod string session getnod string
method
param path node path
return node
throw repositoryexcept repositori error
throw remoteexcept rmi error
remot node remotenod node getnod string path repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session getproperti string session getproperti string
method
param path properti path
return properti
throw repositoryexcept repositori error
throw remoteexcept rmi error
remot properti remoteproperti properti getproperti string path repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session itemexist string session itemexist string
method
param path item path
return code true code item exist
code fals code
throw repositoryexcept repositori except
throw remoteexcept rmi error
item exist itemexist string path repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session nodeexist string session nodeexist string
method
param path node path
return code true code node exist
code fals code
throw repositoryexcept repositori except
throw remoteexcept rmi error
node exist nodeexist string path repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session propertyexist string session propertyexist string
method
param path properti path
return code true code properti exist
code fals code
throw repositoryexcept repositori except
throw remoteexcept rmi error
properti exist propertyexist string path repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session removeitem string session removeitem string
method
param path item path
throw repositoryexcept repositori error
throw remoteexcept rmi error
remov item removeitem string path repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session move string string session move string string
method
param sourc path
param destin path
throw repositoryexcept repositori error
throw remoteexcept rmi error
move string string
repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session save session save method
throw repositoryexcept repositori error
throw remoteexcept rmi error
save repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session refresh boolean session refresh boolean
method
param keepchang flag transient
throw repositoryexcept repositori error
throw remoteexcept rmi error
refresh keepchang
repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session logout session logout
method
throw remoteexcept rmi error
logout remot except remoteexcept
remot version
link javax jcr session isliv session isliv
method
return code true code session live
code fals code
throw remoteexcept rmi error
live isliv remot except remoteexcept
remot version
link javax jcr session getrootnod session getrootnod method
return root node
throw repositoryexcept repositori error
throw remoteexcept rmi error
remot node remotenod root node getrootnod repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session haspendingchang session haspendingchang
method
return code true code session pend
code fals code
throw repositoryexcept repositori error
throw remoteexcept rmi error
pend haspendingchang repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session haspermiss string string session haspermiss string string
method
param path item path
param action action
return code true code permiss grant
code fals code
throw repositoryexcept repositori error
throw remoteexcept rmi error
permiss haspermiss string path string action
repositori except repositoryexcept remot except remoteexcept
import system document view xml data subtre
identifi node note entir xml stream transfer
singl byte arrai network problem
larg xml stream remot server wrap xml data
link java bytearrayinputstream bytearrayinputstream feed
normal importxml method
param path node path
param xml import xml document
param uuidbehaviour uuid handl mode
throw ioexcept error
throw repositoryexcept repositori error
throw remoteexcept rmi error
javax jcr session importxml java lang string java inputstream int
import xml importxml string path xml uuid behaviour uuidbehaviour
except ioexcept repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session setnamespaceprefix string string session setnamespaceprefix string string
method
param prefix namespac prefix
param uri namespac uri
throw repositoryexcept repositori error
throw remoteexcept rmi error
set namespac prefix setnamespaceprefix string prefix string uri
repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session getnamespaceprefix session getnamespaceprefix
method
return namespac prefix
throw repositoryexcept repositori error
throw remoteexcept rmi error
string namespac prefix getnamespaceprefix repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session getnamespaceuri string session getnamespaceuri string
method
param prefix namespac prefix
return namespac uri
throw repositoryexcept repositori error
throw remoteexcept rmi error
string namespac uri getnamespaceuri string prefix
repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session getnamespaceprefix string session getnamespaceprefix string
method
param uri namespac uri
return namespac prefix
throw repositoryexcept repositori error
throw remoteexcept rmi error
string namespac prefix getnamespaceprefix string uri
repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr session addlocktoken string session addlocktoken string
method
param lock token
throw remoteexcept rmi error
add lock token addlocktoken string remot except remoteexcept
remot version
link javax jcr session getlocktoken session getlocktoken
method
return lock token
throw remoteexcept rmi error
string lock token getlocktoken remot except remoteexcept
remot version
link javax jcr session removelocktoken string session removelocktoken string
method
param lock token
throw remoteexcept rmi error
remov lock token removelocktoken string remot except remoteexcept
export identifi repositori subtre system view xml
stream note entir xml stream transfer
singl byte arrai network problem
larg export remot server
link java bytearrayoutputstream bytearrayoutputstream captur
xml data written normal exportsysview method
param path node path
param skipbinari binari skip flag
param norecurs recurs flag
return export xml document
throw ioexcept error
throw repositoryexcept repositori error
throw remoteexcept rmi error
javax jcr session exportsystemview
export system view exportsystemview string path skip binari skipbinari recurs norecurs
except ioexcept repositori except repositoryexcept remot except remoteexcept
export identifi repositori subtre document view xml
stream note entir xml stream transfer
singl byte arrai network problem
larg export remot server
link java bytearrayoutputstream bytearrayoutputstream captur
xml data written normal exportdocview method
param path node path
param skipbinari skip binari flag
param norecurs recurs flag
return export xml document
throw ioexcept error
throw repositoryexcept repositori error
throw remoteexcept rmi error
javax jcr session exportdocumentview
export document view exportdocumentview string path skip binari skipbinari recurs norecurs
except ioexcept repositori except repositoryexcept remot except remoteexcept
remot version link javax jcr session getaccesscontrolmanag
session getaccesscontrolmanag method
throw unsupportedrepositoryoperationexcept remot session
support method
throw repositoryexcept error occur access
control manag
throw remoteexcept rmi error
remot access control manag remoteaccesscontrolmanag access control manag getaccesscontrolmanag
unsupport repositori oper except unsupportedrepositoryoperationexcept
repositori except repositoryexcept remot except remoteexcept
