org apach jackrabbit core persist bundl util
org slf4j logger
org slf4j logger factori loggerfactori
org apach common util ioutil
org apach jackrabbit core persist util blob store blobstor
org apach jackrabbit core persist util resourc base blob store resourcebasedblobstor
org apach jackrabbit core node nodeid
org apach jackrabbit core properti propertyid
org apach jackrabbit core intern internalvalu
org apach jackrabbit core blob file blobfilevalu
org apach jackrabbit core data data store datastor
org apach jackrabbit core nodetyp node def nodedefid
org apach jackrabbit core nodetyp prop def propdefid
org apach jackrabbit spi
org apach jackrabbit uuid uuid
org apach jackrabbit spi common factori impl namefactoryimpl
java data input stream datainputstream
java data output stream dataoutputstream
java except ioexcept
java input stream inputstream
java util hash set hashset
java util iter
java util set
javax jcr properti type propertytyp
javax jcr repositori except repositoryexcept
class implement effici serial method item state
bundl bind bundlebind item state bind itemstatebind
default logger
logger log logger factori loggerfactori logger getlogg bundl bind bundlebind
creat bundl bind
param errorhandl error handl
param blobstor blobstor retriev blob
param nsindex namespac index
param nameindex index
param datastor data store
bundl bind bundlebind error handl errorhandl error handl errorhandl blob store blobstor blob store blobstor
string index stringindex index nsindex string index stringindex index nameindex data store datastor data store datastor
error handl errorhandl blob store blobstor index nsindex index nameindex data store datastor
deseri code nodepropbundl code data input stream
param input stream
param node bundl
return bundl
throw ioexcept error occur
node prop bundl nodepropbundl read bundl readbundl data input stream datainputstream node nodeid
except ioexcept
node prop bundl nodepropbundl bundl node prop bundl nodepropbundl
read version primari type special handl
index read int readint
version
version index
index
string uri index nsindex index string indextostr index
string local index nameindex index string indextostr read int readint
node type nodetypenam factori impl namefactoryimpl instanc getinst creat uri local
primarytyp
bundl set node type setnodetypenam node type nodetypenam
parentuuid
bundl set parent setparentid read readid
definitionid
bundl set node def setnodedefid node def nodedefid valueof read utf readutf
mixin type
set mixin type name mixintypenam hash set hashset
read index readindexedqnam
mixin type name mixintypenam add
read index readindexedqnam
bundl set mixin type name setmixintypenam mixin type name mixintypenam
properti
read index readindexedqnam
properti propertyid pid properti propertyid bundl getid
node prop bundl nodepropbundl properti entri propertyentri state pstate read properti entri readpropertyentri pid
bundl add properti addproperti state pstate
read index readindexedqnam
set referenc flag
bundl set referenc setreferenc read boolean readboolean
child node list uuid pair
node nodeid child childid read readid
child childid
bundl add child node entri addchildnodeentri read readqnam child childid
child childid read readid
read modcount version
version version
bundl set mod count setmodcount read mod count readmodcount
read share set version
set share set sharedset hash set hashset
version version
share set list parent uuid
node nodeid parent parentid read readid
parent parentid
share set sharedset add parent parentid
parent parentid read readid
bundl set share set setsharedset share set sharedset
bundl
check code nodepropbundl code data input stream
param input stream
return code true code data valid
code fals code
check bundl checkbundl data input stream datainputstream
version
primarytyp version
read version primari type special handl
index read int readint
version
version index
index
string uri index nsindex index string indextostr index
string local index nameindex index string indextostr read int readint
node type nodetypenam factori impl namefactoryimpl instanc getinst creat uri local
log debug serialz version version
log debug nodetypenam node type nodetypenam
except ioexcept
log error error read nodetypenam
uuid parent uuid parentuuid read uuid readuuid
log debug parentuuid parent uuid parentuuid
except ioexcept
log error error read parentuuid
string definit definitionid read utf readutf
log debug definitionid definit definitionid
except ioexcept
log error error read definitionid
mixin mixinnam read index readindexedqnam
mixin mixinnam
log debug mixintypenam mixin mixinnam
mixin mixinnam read index readindexedqnam
except ioexcept
log error error read mixintyp
prop propnam read index readindexedqnam
prop propnam
log debug propertynam prop propnam
check properti state checkpropertyst
prop propnam read index readindexedqnam
except ioexcept
log error error read properti name
uuid hasuuid read boolean readboolean
log debug hasuuid uuid hasuuid
except ioexcept
log error error read 'hasuuid'
uuid cne uuid cneuuid read uuid readuuid
cne uuid cneuuid
cne cnenam read readqnam
log debug childnodentri cne uuid cneuuid cne cnenam
cne uuid cneuuid read uuid readuuid
except ioexcept
log error error read child node entri
version version
mod count modcount read mod count readmodcount
log debug modcount mod count modcount
except ioexcept
log error error read mod cout
serial code nodepropbundl code data output stream
param output stream
param bundl bundl serial
throw ioexcept error occur
write bundl writebundl data output stream dataoutputstream node prop bundl nodepropbundl bundl
except ioexcept
size size
primarytyp version
write int writeint version current version current index nsindex string index stringtoindex bundl node type getnodetypenam namespac uri getnamespaceuri
write int writeint index nameindex string index stringtoindex bundl node type getnodetypenam local getlocalnam
parentuuid
write writeid bundl parent getparentid
definitionid
write utf writeutf bundl node def getnodedefid string tostr
mixin type
iter iter bundl mixin type name getmixintypenam iter
iter hasnext
write index writeindexedqnam iter
write index writeindexedqnam
properti
iter bundl properti name getpropertynam iter
iter hasnext
pname iter
node prop bundl nodepropbundl properti entri propertyentri state pstate bundl properti entri getpropertyentri pname
state pstate
log error propertyst miss bundl pname
write index writeindexedqnam pname
write state writest state pstate
write index writeindexedqnam
write uuid flag
write boolean writeboolean bundl referenc isreferenc
child node list uuid pair
iter bundl child node entri getchildnodeentri iter
iter hasnext
node prop bundl nodepropbundl child node entri childnodeentri entri node prop bundl nodepropbundl child node entri childnodeentri iter
write writeid entri getid writeid entri getid uuid
write writeqnam entri getnam writeqnam entri getnam
write writeid
write mod count
write mod count writemodcount bundl mod count getmodcount
write share set
iter bundl share set getsharedset iter
iter hasnext
write writeid node nodeid iter
write writeid
set size bundl
bundl set size setsiz size size
deseri code propertyst code data input stream
param input stream
param properti properti entri
return properti entri
throw ioexcept error occur
node prop bundl nodepropbundl properti entri propertyentri read properti entri readpropertyentri data input stream datainputstream properti propertyid
except ioexcept
node prop bundl nodepropbundl properti entri propertyentri entri node prop bundl nodepropbundl properti entri propertyentri
type modcount
type read int readint
entri set mod count setmodcount type
type
entri set type settyp type
multivalu
entri set multi valu setmultivalu read boolean readboolean
definitionid
entri set prop def setpropdefid prop def propdefid valueof read utf readutf
valu
count read int readint int count readint count
intern internalvalu valu intern internalvalu count
string blob id blobid string count
count
intern internalvalu val
type
properti type propertytyp binari
size read int readint
intern internalvalu data store data store size
val intern internalvalu creat data store datastor read utf readutf
size
blob id blobid read utf readutf
blob store blobstor resourc base blob store resourcebasedblobstor
val intern internalvalu creat resourc base blob store resourcebasedblobstor blob store blobstor resourc getresourc blob id blobid
val intern internalvalu creat blob store blobstor blob id blobid
except ioexcept
error handl errorhandl ignor miss blob ignoremissingblob
log warn ignor error read blob resourc
val intern internalvalu creat
except
except ioexcept unabl creat properti string tostr
short valu memori
data size
read fulli readfulli data
val intern internalvalu creat data
properti type propertytyp doubl
val intern internalvalu creat read doubl readdoubl
properti type propertytyp long
val intern internalvalu creat read long readlong
properti type propertytyp boolean
val intern internalvalu creat read boolean readboolean
properti type propertytyp
val intern internalvalu creat read readqnam
properti type propertytyp refer
val intern internalvalu creat read uuid readuuid
writeutf string size limit 64k
string serial length byte
len read int readint
byte len
read fulli readfulli byte
val intern internalvalu valueof string byte utf type
valu val
entri set valu setvalu valu
entri set blob id setblobid blob id blobid
entri
check code propertyst code data input stream
param input stream
return code true code data valid
code fals code
check properti state checkpropertyst data input stream datainputstream
type
type read int readint
mod count modcount type
type
log debug propertytyp properti type propertytyp namefromvalu type
log debug modcount mod count modcount
except ioexcept
log error error read properti type
ismv read boolean readboolean
log debug multivalu ismv
except ioexcept
log error error read multivalu
string defint defintionid read utf readutf
log debug definitionid defint defintionid
except ioexcept
log error error read definit
count
count read int readint
log debug num valu count
except ioexcept
log error error read number valu
count
type
properti type propertytyp binari
size
size read int readint
log debug binari size size
except ioexcept
log error error read size binari
intern internalvalu data store data store size
string read utf readutf
truncat log output
length
substr
log debug global data store
except ioexcept
log error error read blob
size
string read utf readutf
log debug blobid
except ioexcept
log error error read blob
short valu memori
data size
read fulli readfulli data
log debug binari data length byte
except ioexcept
log error error read inlin binari
properti type propertytyp doubl
read doubl readdoubl
log debug doubl
except ioexcept
log error error read doubl
properti type propertytyp long
read long readlong
log debug long
except ioexcept
log error error read long
properti type propertytyp boolean
read boolean readboolean
log debug boolean
except ioexcept
log error error read boolean
properti type propertytyp
read readqnam
log debug
except ioexcept
log error error read
properti type propertytyp refer
uuid uuid read uuid readuuid
log debug refer uuid
except ioexcept
log error error read refer
writeutf string size limit 64k
string serial length byte
len
len read int readint
log debug size string len
except ioexcept
log error error read size string
byte len
read fulli readfulli byte
string string byte utf
truncat log output
length
substr
log debug string
except ioexcept
log error error read string
serial code propertyst code data output stream
param output stream
param state properti entri store
throw ioexcept error occur
write state writest data output stream dataoutputstream node prop bundl nodepropbundl properti entri propertyentri state
except ioexcept
type mod count
write int writeint state type gettyp state mod count getmodcount
multivalu
write boolean writeboolean state multi valu ismultivalu
definitionid
write utf writeutf state prop def getpropdefid string tostr
valu
intern internalvalu valu state valu getvalu
write int writeint valu length writeint valu length count
valu length
intern internalvalu val valu
state type gettyp
properti type propertytyp binari
intern internalvalu data store data store data store datastor
write int writeint
val store data store datastor
repositori except repositoryexcept
string msg error store blob
state getid idx size val blob file getblobfilevalu length getlength
log error msg
except ioexcept msg
write utf writeutf val string tostr
special handl requir binari
spool binari file blob store
blob file blobfilevalu blob val blobval val blob file getblobfilevalu
size blob val blobval length getlength
size
log warn blob neg size potenti loss data
idx state getid string valueof
write int writeint
valu intern internalvalu creat
blob val blobval discard
size min blob size minblobs
write int writeint
string blob blobid state blob getblobid
blob blobid
input stream inputstream blob val blobval stream getstream
blob blobid blob store blobstor creat createid state getid
blob store blobstor put blob blobid size
state set blob setblobid blob blobid
util ioutil close quietli closequietli
except
string msg error store blob
state getid idx size size
log error msg
except ioexcept msg
replac instanc
back resourc blob store delet temp file
blob store blobstor resourc base blob store resourcebasedblobstor
valu intern internalvalu creat resourc base blob store resourcebasedblobstor blob store blobstor resourc getresourc blob blobid
valu intern internalvalu creat blob store blobstor blob blobid
except
log error error reload blob truncat
state getid idx size size
valu intern internalvalu creat
blob val blobval discard
store blob properti
write utf writeutf blob blobid writeutf blobid
delet evt blob
write int writeint size
data size
data input stream datainputstream
data input stream datainputstream blob val blobval stream getstream
read fulli readfulli data
util ioutil close quietli closequietli
except
string msg error store blob
state getid idx size size
log error msg
except ioexcept msg
write data data length
replac instanc
back resourc blob store delet temp file
valu intern internalvalu creat data
blob val blobval discard
properti type propertytyp doubl
write doubl writedoubl val doubl getdoubl
properti type propertytyp long
write long writelong val long getlong
properti type propertytyp boolean
write boolean writeboolean val boolean getboolean
properti type propertytyp
write writeqnam val getqnam
properti type propertytyp refer
write uuid writeuuid val uuid getuuid
writeutf string size limit 64k
write byte
byte val string tostr byte getbyt utf
write int writeint byte length writeint byte length length byte
write byte write byte byte
