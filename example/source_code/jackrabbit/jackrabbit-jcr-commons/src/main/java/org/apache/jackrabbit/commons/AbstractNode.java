org apach jackrabbit common
java input stream inputstream
java util calendar
javax jcr item
javax jcr item found except itemnotfoundexcept
javax jcr item visitor itemvisitor
javax jcr node
javax jcr path found except pathnotfoundexcept
javax jcr properti
javax jcr properti iter propertyiter
javax jcr repositori except repositoryexcept
javax jcr session
javax jcr unsupport repositori oper except unsupportedrepositoryoperationexcept
javax jcr
javax jcr factori valuefactori
javax jcr lock lock except lockexcept
javax jcr nodetyp node type nodetyp
javax jcr nodetyp node type manag nodetypemanag
javax jcr version version
javax jcr version version histori versionhistori
abstract base class implement jcr link node interfac
link item method default implement
link item accept javax jcr itemvisitor
link item getnam
link item getpar
link item getsess
link item ismodifi
link item isnew
link item issam item
link item refresh boolean
link item remov
link item save
link node method default implement
link node addmixin string
link node addnod string
link node addnod string string
link node canaddmixin string
link node cancelmerg version
link node checkin
link node checkout
link node donemerg version
link node getbasevers
link node getcorrespondingnodepath string
link node getdefinit
link node getindex
link node getlock
link node getnod string
link node getnod
link node getnod string
link node getprimaryitem
link node getproperti
link node getproperti string
link node getrefer
link node lock boolean boolean
link node merg string boolean
link node orderbefor string string
link node removemixin string
link node restor version string boolean
link node setproperti string
link node setproperti string
link node unlock
link node updat string
abstract node abstractnod abstract item abstractitem node
item
accept item visitor
default implement call link itemvisitor visit node
visitor node argument
param visitor item visitor
throw repositoryexcept error occur
accept item visitor itemvisitor visitor repositori except repositoryexcept
visitor visit
return path node
default implement recurs call method
parent node append option index
node construct full path return parent node
root node
return node path
throw repositoryexcept error occur
string path getpath repositori except repositoryexcept
string buffer stringbuff buffer string buffer stringbuff parent getpar path getpath
buffer length
buffer append
buffer append getnam
index index getindex
index
buffer append
buffer append index
buffer append
buffer string tostr
item found except itemnotfoundexcept
return code true code
return code true code
node isnod
node
return declar mixin node type node
default implement valu
code jcr mixintyp code properti mixin node type
link nodetypemanag current workspac
return mixin node type
throw repositoryexcept error occur
node type nodetyp mixin node type getmixinnodetyp repositori except repositoryexcept
node type manag nodetypemanag manag
session getsess workspac getworkspac node type manag getnodetypemanag
properti properti properti getproperti getnam jcr mixintyp
valu properti valu getvalu
node type nodetyp type node type nodetyp valu length
valu length
type manag node type getnodetyp valu string getstr
type
path found except pathnotfoundexcept
jcr mixintyp exist mixin type node
node type nodetyp
return primari node type node
default implement
code jcr primarytyp code properti primari
node type link nodetypemanag current workspac
return primari node type
throw repositoryexcept error occur
node type nodetyp primari node type getprimarynodetyp repositori except repositoryexcept
node type manag nodetypemanag manag
session getsess workspac getworkspac node type manag getnodetypemanag
properti properti properti getproperti getnam jcr primarytyp
manag node type getnodetyp properti string getstr
return properti rel path node
default implement parent node
rel path iter properti node
find return identifi properti
param relpath rel path properti
return properti
throw pathnotfoundexcept properti found
throw repositoryexcept error occur
properti properti getproperti string rel path relpath
path found except pathnotfoundexcept repositori except repositoryexcept
corner case remov refer end path
rel path relpath end endswith
rel path relpath rel path relpath substr rel path relpath length
find parent node identifi properti
node node
slash rel path relpath index lastindexof
slash
node session getsess root node getrootnod
rel path relpath rel path relpath substr
slash
node node getnod rel path relpath substr slash
rel path relpath rel path relpath substr slash
name properti iter check
client invalid path
properti iter propertyiter properti node properti getproperti rel path relpath
properti hasnext
properti properti properti properti
rel path relpath equal properti getnam
properti
path found except pathnotfoundexcept properti found rel path relpath
return uuid node
default implement check node referenc
type code mix referenc code return content
code jcr uuid code properti
return node uuid
throw unsupportedrepositoryoperationexcept
node referenc
throw repositoryexcept error occur
string uuid getuuid
unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
node type isnodetyp getnam mix referenc
properti getproperti getnam jcr uuid string getstr
unsupport repositori oper except unsupportedrepositoryoperationexcept
node referenc path getpath
return version histori node
default implement return version histori
base version node
return version histori
throw repositoryexcept error occur
version histori versionhistori version histori getversionhistori repositori except repositoryexcept
base version getbasevers histori getcontaininghistori
check node rel path exist
default implement node
link node getnod string return code true code
link pathnotfoundexcept thrown
param relpath rel path
return code true code node exist path
code fals code
throw repositoryexcept error occur
node hasnod string rel path relpath repositori except repositoryexcept
node getnod rel path relpath
path found except pathnotfoundexcept
check node properti
default implement call link node getnod return
code true code iff return iter element
return code true code node child node
code fals code
throw repositoryexcept error occur
node hasnod repositori except repositoryexcept
node getnod hasnext
check node properti
default implement call link node getproperti
return code true code iff return iter element
note normal circumst weird access control
method return code true code node
code jcr primarytyp code properti
return code true code node properti
code fals code
throw repositoryexcept error occur
properti hasproperti repositori except repositoryexcept
properti getproperti hasnext
check properti rel path exist
default implement properti
link node getproperti string return code true code
link pathnotfoundexcept thrown
param relpath rel path
return code true code properti exist path
code fals code
throw repositoryexcept error occur
properti hasproperti string rel path relpath repositori except repositoryexcept
properti getproperti rel path relpath
path found except pathnotfoundexcept
check node hold lock
default implement call link node getlock return
code true code iff hold node lock
node
return code true code node hold lock
code fals code
throw repositoryexcept error occur
hold lock holdslock repositori except repositoryexcept
issam lock getlock node getnod
lock except lockexcept
check node check
default implement check code jcr ischeckedout code
properti node version recurs call method
parent node node version version
root node return code true code method
return code true code node check
code fals code
throw repositoryexcept error occur
check ischeckedout repositori except repositoryexcept
node type isnodetyp getnam jcr version
node version check jcr ischeckedout properti
properti getproperti getnam jcr ischeckedout boolean getboolean
node version parent check
parent getpar check ischeckedout
item found except itemnotfoundexcept
node root node check
check node lock
default implement call link node getlock return
code true code iff link lockexcept thrown
return code true code node lock
code fals code
throw repositoryexcept error occur
lock islock repositori except repositoryexcept
lock getlock
lock except lockexcept
check node type
default implement iter primari mixin
type supertyp node return code true code
type encount return code fals code
type match
param type
return code true code node type
code fals code
throw repositoryexcept error occur
node type isnodetyp string repositori except repositoryexcept
node type nodetyp type primari node type getprimarynodetyp
equal type getnam
node type nodetyp supertyp type supertyp getsupertyp
supertyp length
equal supertyp getnam
node type nodetyp mixin mixin node type getmixinnodetyp
mixin length
equal mixin getnam
supertyp mixin supertyp getsupertyp
supertyp length
equal supertyp getnam
restor node version
default implement retriev name link version
link versionhistori forward call
link node restor version boolean method
param versionnam version
param removeexist pass
throw repositoryexcept error occur
restor string version versionnam remov exist removeexist
repositori except repositoryexcept
restor version histori getversionhistori version getvers version versionnam remov exist removeexist
restor node version
default implement forward call
link node restor version string boolean method
rel path
param version pass
param removeexist pass
throw repositoryexcept error occur
restor version version remov exist removeexist
repositori except repositoryexcept
restor version remov exist removeexist
restor node version label
default implement retriev label link version
link versionhistori forward call
link node restor version boolean method
param versionlabel version label
param removeexist pass
throw repositoryexcept error occur
restor label restorebylabel string version label versionlabel remov exist removeexist
repositori except repositoryexcept
restor version histori getversionhistori version label getversionbylabel version label versionlabel
remov exist removeexist
set name properti
default implement link valuefactori
current link session creat link instanc
string valu forward call
link node setproperti string method
param properti
param string string valu
return modifi properti
throw repositoryexcept error occur
properti set properti setproperti string string string
repositori except repositoryexcept
factori valuefactori factori session getsess factori getvaluefactori
valu string length
string length
valu factori creat createvalu string
set properti setproperti valu
set name properti
default implement link valuefactori
current link session creat link instanc
string forward call
link node setproperti string method
param properti
param string
return modifi properti
throw repositoryexcept error occur
properti set properti setproperti string string
repositori except repositoryexcept
factori valuefactori factori session getsess factori getvaluefactori
set properti setproperti factori creat createvalu
set name properti
default implement link valuefactori
current link session creat link instanc
binari forward call
link node setproperti string method
param properti
param binari
return modifi properti
throw repositoryexcept error occur
properti set properti setproperti string input stream inputstream
repositori except repositoryexcept
factori valuefactori factori session getsess factori getvaluefactori
set properti setproperti factori creat createvalu
set name properti
default implement link valuefactori
current link session creat link instanc
boolean forward call
link node setproperti string method
param properti
param boolean
return modifi properti
throw repositoryexcept error occur
properti set properti setproperti string
repositori except repositoryexcept
factori valuefactori factori session getsess factori getvaluefactori
set properti setproperti factori creat createvalu
set name properti
default implement link valuefactori
current link session creat link instanc
doubl forward call
link node setproperti string method
param properti
param doubl
return modifi properti
throw repositoryexcept error occur
properti set properti setproperti string
repositori except repositoryexcept
factori valuefactori factori session getsess factori getvaluefactori
set properti setproperti factori creat createvalu
set name properti
default implement link valuefactori
current link session creat link instanc
long forward call
link node setproperti string method
param properti
param long
return modifi properti
throw repositoryexcept error occur
properti set properti setproperti string
repositori except repositoryexcept
factori valuefactori factori session getsess factori getvaluefactori
set properti setproperti factori creat createvalu
set name properti
default implement link valuefactori
current link session creat link instanc
date forward call
link node setproperti string method
param properti
param date
return modifi properti
throw repositoryexcept error occur
properti set properti setproperti string calendar
repositori except repositoryexcept
factori valuefactori factori session getsess factori getvaluefactori
set properti setproperti factori creat createvalu
set name properti
default implement link valuefactori
current link session creat link instanc
refer forward call
link node setproperti string method
param properti
param refer
return modifi properti
throw repositoryexcept error occur
properti set properti setproperti string node
repositori except repositoryexcept
factori valuefactori factori session getsess factori getvaluefactori
set properti setproperti factori creat createvalu
set name properti
default implement link valuefactori
current link session convert
type forward call
link node setproperti string method
param properti
param properti
param type properti type
return modifi properti
throw repositoryexcept error occur
properti set properti setproperti string type
repositori except repositoryexcept
type gettyp type
factori valuefactori factori session getsess factori getvaluefactori
factori creat createvalu string getstr type
set properti setproperti
set name properti
default implement link valuefactori
current link session convert valu
type forward call
link node setproperti string method
param properti
param valu properti valu
param type properti type
return modifi properti
throw repositoryexcept error occur
properti set properti setproperti string valu type
repositori except repositoryexcept
factori valuefactori factori session getsess factori getvaluefactori
convert valu length
valu length
valu type gettyp type
convert factori creat createvalu valu string getstr type
convert valu
set properti setproperti convert
set name properti
default implement link valuefactori
current link session creat link instanc
type string valu forward call
link node setproperti string method
param properti
param string string valu
param type properti type
return modifi properti
throw repositoryexcept error occur
properti set properti setproperti string string string type
repositori except repositoryexcept
factori valuefactori factori session getsess factori getvaluefactori
valu string length
string length
valu factori creat createvalu string type
set properti setproperti valu
set name properti
default implement link valuefactori
current link session creat link instanc
type string forward call
link node setproperti string method
param properti
param string
param type properti type
return modifi properti
throw repositoryexcept error occur
properti set properti setproperti string string type
repositori except repositoryexcept
factori valuefactori factori session getsess factori getvaluefactori
set properti setproperti factori creat createvalu type
privat
return prefix jcr namespac uri local
current namespac map
param uri namespac uri
param namespac local
return prefix jcr
throw repositoryexcept error occur
string getnam string repositori except repositoryexcept
namespac helper namespacehelp session getsess jcr getjcrnam
