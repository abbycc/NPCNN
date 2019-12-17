org apach jackrabbit core persist bundl
org slf4j logger
org slf4j logger factori loggerfactori
org apach jackrabbit util text
org apach jackrabbit core state chang log changelog
org apach jackrabbit core state item state except itemstateexcept
org apach jackrabbit core state item state except nosuchitemstateexcept
org apach jackrabbit core state node refer nodereferencesid
org apach jackrabbit core state node refer noderefer
org apach jackrabbit core persist context pmcontext
org apach jackrabbit core persist bundl util connect recoveri manag connectionrecoverymanag
org apach jackrabbit core persist bundl util index dbnameindex
org apach jackrabbit core persist bundl util node prop bundl nodepropbundl
org apach jackrabbit core persist bundl util bundl bind bundlebind
org apach jackrabbit core persist bundl util error handl errorhandl
org apach jackrabbit core persist bundl util string index stringindex
org apach jackrabbit core persist util serial
org apach jackrabbit core persist util blob store blobstor
org apach jackrabbit core persist util file system blob store filesystemblobstor
org apach jackrabbit core file system resourc filesystemresourc
org apach jackrabbit core file system filesystem
org apach jackrabbit core local local file system localfilesystem
org apach jackrabbit core node nodeid
org apach jackrabbit core node iter nodeiditer
org apach jackrabbit core properti propertyid
org apach jackrabbit uuid uuid
java buffer reader bufferedread
java byte arrai input stream bytearrayinputstream
java byte arrai output stream bytearrayoutputstream
java data input stream datainputstream
java data output stream dataoutputstream
java file
java filter input stream filterinputstream
java except ioexcept
java input stream inputstream
java input stream reader inputstreamread
java sql blob
java sql connect
java sql databas meta data databasemetadata
java sql prepar statement preparedstat
java sql result set resultset
java sql sql except sqlexcept
java sql statement
java util arrai list arraylist
java util collect
java util iter
java util list
java util element except nosuchelementexcept
javax jcr repositori except repositoryexcept
gener persist manag store link nodepropbundl
databas
configur
param link setbundlecaches string bundlecaches
param link setconsistencycheck string consistencycheck fals
param link setconsistencyfix string consistencyfix fals
param link setminblobs string minblobs
param link setdriv string driver
param link seturl string url
param link setus string user
param link setpassword string password
param link setschema string schema
param link setschemaobjectprefix string schemaobjectprefix
param link seterrorhandl string errorhandl
param link setblockonconnectionloss string blockonconnectionloss fals
bundl persist manag bundledbpersistencemanag abstract bundl persist manag abstractbundlepersistencemanag
default logger
logger log logger factori loggerfactori logger getlogg bundl persist manag bundledbpersistencemanag
variabl schema prefix
string schema object prefix variabl schema object prefix variabl
schemaobjectprefix
storag model modifi binari kei
binari kei binari kei
storag model modifi longlong kei
longlong kei longlong kei
flag indic manag initi
initi
jdbc driver
string driver
jdbc url string
string url
jdbc user
string user
jdbc password
string password
schema identifi
string schema
prefix databas object
string schema object prefix schemaobjectprefix
flag indic consist check issu startup
consist check consistencycheck
flag indic consist check attempt fix issu
consist fix consistencyfix
initi size buffer serial object
initi buffer size initi buffer size
filesystem blob store
extern blo externalblob
block databas connect lost
block connect loss blockonconnectionloss
class manag statement execut recoveri connect loss
connect recoveri manag connectionrecoverymanag connect manag connectionmanag
sql statement bundl manag
string bundl insert sql bundleinsertsql
string bundl updat sql bundleupdatesql
string bundl select sql bundleselectsql
string bundl delet sql bundledeletesql
string bundl select id sql bundleselectallidsfromsql
string bundl select id sql bundleselectallidssql
sql statement noderefer manag
string node refer insert sql nodereferenceinsertsql
string node refer updat sql nodereferenceupdatesql
string node refer select sql nodereferenceselectsql
string node refer delet sql nodereferencedeletesql
file system blob data store
closeabl blob store closeableblobstor blob store blobstor
index local name
string index stringindex index nameindex
minimum size properti written blob store
setminblobs string
min blob size minblobs
flag error handl
error handl errorhandl error handl errorhandl error handl errorhandl
bundl bind
bundl bind bundlebind bind
persist manag
string string tostr
return configur jdbc connect url
return configur jdbc connect url
string url geturl
url
set jdbc connect url
connect creat jndi data sourc
driver class refer javax name context class
javax name initialcontext url jndi url
java comp env jdbc test
param url url set
set url seturl string url
url url
return configur user establish jdbc connect
return jdbc user
string user getus
user
set user establish jdbc connect
param user user
set user setus string user
user user
return configur password establish jdbc connect
return password
string password getpassword
password
set password establish jdbc connect
param password password connect
set password setpassword string password
password password
return class jdbc driver
return class jdbc driver
string driver getdriv
driver
set class jdbc driver driver class load
link init pmcontext init order assur exist
driver default driver databas
param driver class driver
set driver setdriv string driver
driver driver
return configur schema object prefix
return configur schema object prefix
string schema object prefix getschemaobjectprefix
schema object prefix schemaobjectprefix
set schema object prefix string prefix schema
object tabl index persist
manag databas
param schemaobjectprefix prefix schema object
set schema object prefix setschemaobjectprefix string schema object prefix schemaobjectprefix
make prefix uppercas
schema object prefix schemaobjectprefix schema object prefix schemaobjectprefix upper case touppercas
return configur schema identifi
return schema identifi
string schema getschema
schema
set schema identifi identifi load execut
respect ddl resourc order creat requir schema
object
param schema schema identifi
set schema setschema string schema
schema schema
return extern filesystem blob store
return extern filesystem blob store
extern blo isexternalblob
extern blo externalblob
set flag extern filesystem blob store usag
param externalblob true extern blob
store
set extern blo setexternalblob extern blo externalblob
extern blo externalblob extern blo externalblob
check consist check enabl
return code true code consist check enabl
string consist check getconsistencycheck
boolean string tostr consist check consistencycheck
defin consist check perform initi
param consistencycheck consist check flag
set consist check setconsistencycheck string consist check consistencycheck
consist check consistencycheck boolean valueof consist check consistencycheck boolean booleanvalu
check consist fix enabl
return code true code consist fix enabl
string consist fix getconsistencyfix
boolean string tostr consist fix consistencyfix
defin consist check attempt fix issu
find
param consistencyfix consist fix flag
set consist fix setconsistencyfix string consist fix consistencyfix
consist fix consistencyfix boolean valueof consist fix consistencyfix boolean booleanvalu
return minimum blob size byte
return minimum blob size byte
string min blob size getminblobs
string valueof min blob size minblobs
set minimum blob size size defin threshold
size properti includ bundl store blob store
param minblobs minimum blobsiz byte
set min blob size setminblobs string min blob size minblobs
min blob size minblobs integ decod min blob size minblobs int intvalu
set error handl behaviour manag link errorhandl
detail flag
param errorhandl error handl flag
set error handl seterrorhandl string error handl errorhandl
error handl errorhandl error handl errorhandl error handl errorhandl
return error handl configur manag
return error handl configur manag
string error handl geterrorhandl
error handl errorhandl string tostr
set block connect loss setblockonconnectionloss string block
block connect loss blockonconnectionloss boolean valueof block boolean booleanvalu
string block connect loss getblockonconnectionloss
boolean string tostr block connect loss blockonconnectionloss
return code true code blob store
return code true code blob store
blob store usedbblobstor
extern blo externalblob
return code true code blob store local
return code true code blob store local
local blob store uselocalfsblobstor
extern blo externalblob
check requir schema object exist creat
exist
throw sqlexcept sql error occur
throw repositoryexcept error occur
check schema checkschema sql except sqlexcept repositori except repositoryexcept
check tabl exist checktablesexist
read ddl resourc
input stream inputstream bundl persist manag bundledbpersistencemanag resourc stream getresourceasstream schema ddl
string msg configur error resourc schema ddl' found
log debug msg
repositori except repositoryexcept msg
buffer reader bufferedread reader buffer reader bufferedread input stream reader inputstreamread
statement stmt connect manag connectionmanag connect getconnect creat statement createstat
string sql reader read line readlin
sql
sql creat schema sql createschemasql sql
sql start startswith sql length
sql index indexof binval blob store usedbblobstor
creat blob relat tabl blob store configur
execut sql stmt
stmt execut updat executeupd sql
read sql stmt
sql reader read line readlin
except ioexcept
string msg configur error unabl read resourc schema ddl'
log debug msg
repositori except repositoryexcept msg
close
except ioexcept
ignor
stmt close
creat sql statement schema creation variabl substitut
param sql sql string variabl substitut
return valid sql string
string creat schema sql createschemasql string sql
replac prefix variabl
text replac sql schema object prefix variabl schema object prefix variabl schema object prefix schemaobjectprefix trim
check databas tabl exist
return code true code tabl exist
code fals code
throw sqlexcept databas error occur
throw repositoryexcept repositori except occur
check tabl exist checktablesexist sql except sqlexcept repositori except repositoryexcept
databas meta data databasemetadata meta data metadata connect manag connectionmanag connect getconnect meta data getmetadata
string tabl tablenam schema object prefix schemaobjectprefix bundl
meta data metadata store lower case identifi storeslowercaseidentifi
tabl tablenam tabl tablenam lower case tolowercas
meta data metadata store upper case identifi storesuppercaseidentifi
tabl tablenam tabl tablenam upper case touppercas
string user usernam check tabl user checktableswithus meta data metadata user getusernam
result set resultset meta data metadata tabl gettabl user usernam tabl tablenam
close
usernam includ retriev tabl
link checktablesexist
note chang oracl base
persist manag
return code fals code
check tabl user checktableswithus
inheritdoc
basic wrap jdbc transact super store
store chang log changelog chang log changelog item state except itemstateexcept
trial
throwabl except lastexcept
trial
connect con
con connect manag connectionmanag connect getconnect
connect manag connectionmanag set auto reconnect setautoreconnect
con set auto commit setautocommit
store chang log changelog
con commit
con set auto commit setautocommit
throwabl
except lastexcept
con
con rollback
sql except sqlexcept
log except logexcept rollback fail
sql except sqlexcept getcaus sql except sqlexcept
connect manag connectionmanag close
connect manag connectionmanag set auto reconnect setautoreconnect
block connect loss blockonconnectionloss trial
item state except itemstateexcept except lastexcept messag getmessag
inheritdoc
init context pmcontext context except
initi
illeg state except illegalstateexcept initi
init context
context home dir gethomedir getnam
connect manag connectionmanag connect recoveri manag connectionrecoverymanag block connect loss blockonconnectionloss
driver getdriv url geturl user getus password getpassword
make schemaobjectprefix consist legal charact
prepar schema object prefix prepareschemaobjectprefix
check schema object exist creat
check schema checkschema
creat correct blob store
blob store blobstor creat blob store createblobstor
build sql statement buildsqlstat
load namespac
bind bundl bind bundlebind error handl errorhandl blob store blobstor index getnsindex index getnameindex context data store getdatastor
bind set min blob size setminblobs min blob size minblobs
initi
consist check consistencycheck
check consist checkconsist
inheritdoc
bundl bind bundlebind bind getbind
bind
creat suitabl blobstor
return blobstor
throw except unspecifi error occur
closeabl blob store closeableblobstor creat blob store createblobstor except
local blob store uselocalfsblobstor
creat local blob store createlocalfsblobstor context
creat blob store createdbblobstor context
return local index
return local index
throw illegalstateexcept error occur
string index stringindex index getnameindex
index nameindex
file system resourc filesystemresourc re file system resourc filesystemresourc context file system getfilesystem re index re index
re exist
index nameindex index getnameindex
creat nameindex
index nameindex creat index createdbnameindex
index nameindex
except
illeg state except illegalstateexcept except
illeg state except illegalstateexcept unabl creat nsindex
except init initcaus
except
return instanc dbnameindex
return instanc dbnameindex
throw sqlexcept sql error occur
index dbnameindex creat index createdbnameindex sql except sqlexcept
index dbnameindex connect manag connectionmanag schema object prefix schemaobjectprefix
return storag model
return storag model
storag model getstoragemodel
binari kei binari kei
creat blob store base local call
init link uselocalfsblobstor return code true code
param context persist manag context
return blob store
throw except error occur
closeabl blob store closeableblobstor creat local blob store createlocalfsblobstor context pmcontext context
except
store blob' local file system directori
workspac home directori
local file system localfilesystem blob blobf local file system localfilesystem
blob blobf set root setroot file context home dir gethomedir blob
blob blobf init
blob store fsblobstor blob blobf
creat blob store databas call
init link usedbblobstor return code true code
param context persist manag context
return blob store
throw except error occur
closeabl blob store closeableblobstor creat blob store createdbblobstor context pmcontext context
except
blob store dbblobstor
perform consist check
check consist checkconsist
count
total
log info check workspac consist
collect modif arrai list arraylist
result set resultset
data input stream datainputstream din
string sql
storag model getstoragemodel binari kei binari kei
sql select node bundl data schema object prefix schemaobjectprefix bundl
sql select node node bundl data schema object prefix schemaobjectprefix bundl
statement stmt connect manag connectionmanag execut stmt executestmt sql object
stmt result set getresultset
node nodeid
blob blob
storag model getstoragemodel binari kei binari kei
node nodeid uuid byte getbyt
blob blob getblob
node nodeid uuid long getlong long getlong
blob blob getblob
din data input stream datainputstream blob binari stream getbinarystream
node prop bundl nodepropbundl bundl bind read bundl readbundl din
collect miss children missingchildren arrai list arraylist
iter iter bundl child node entri getchildnodeentri iter
iter hasnext
node prop bundl nodepropbundl child node entri childnodeentri entri node prop bundl nodepropbundl child node entri childnodeentri iter
entri getid string tostr end endswith babecafebab
string tostr end endswith babecafebab
node prop bundl nodepropbundl child load bundl loadbundl entri getid
child
log error nodest uuid getuuid
refer inexist child entri getnam
entri getid uuid getuuid
miss children missingchildren add entri
node nodeid child parent getparentid
log error childnod invalid parent uuid null
equal
log error childnod invalid parent uuid uuid getuuid
item state except itemstateexcept
log error error load child node
consist fix consistencyfix miss children missingchildren empti isempti
iter iter miss children missingchildren iter
iter hasnext
bundl child node entri getchildnodeentri remov iter
modif add bundl
node nodeid parent parentid bundl parent getparentid
parent parentid
exist parent parentid
log error nodest refer inexist parent parent parentid
except ioexcept
log error error bundl
din data input stream datainputstream blob binari stream getbinarystream
bind check bundl checkbundl din
count
count
log info check count total bundl
except
log error error bundl
close stream closestream din
close result set closeresultset
consist fix consistencyfix modif empti isempti
log info fix modif size inconsist bundl
iter iter modif iter
iter hasnext
node prop bundl nodepropbundl bundl node prop bundl nodepropbundl iter
log info fix bundl bundl getid
bundl mark markold bundl markold updat insert
store bundl storebundl bundl
item state except itemstateexcept
log error error store fix bundl
log info check count total bundl
make code schemaobjectprefix code consist
charact allow name target databas illeg
charact escap
throw except error occur
prepar schema object prefix prepareschemaobjectprefix except
databas meta data databasemetadata meta data metadata connect manag connectionmanag connect getconnect meta data getmetadata
string legal char legalchar meta data metadata extra charact getextranamecharact
legal char legalchar abcdefghijklmnopqrstuvwxzy0123456789
string prefix schema object prefix schemaobjectprefix upper case touppercas
string buffer stringbuff escap string buffer stringbuff
prefix length
prefix char charat
legal char legalchar index indexof
escap append
string hex integ hex string tohexstr
escap append char arrai tochararrai hex length
escap append hex
escap append
escap append
schema object prefix schemaobjectprefix escap string tostr
inheritdoc
close except
initi
illeg state except illegalstateexcept initi
index nameindex index dbnameindex
index dbnameindex index nameindex close
connect manag connectionmanag close
close blob store
blob store blobstor close
blob store blobstor
initi
set kei paramet prepar statement start
code po code return number kei paramet po
param stmt statement
param uuid uuid kei
param po posit kei paramet
return number kei paramet code po code
throw sqlexcept sql error occur
set kei setkei prepar statement preparedstat stmt uuid uuid po
sql except sqlexcept
storag model getstoragemodel binari kei binari kei
stmt set byte setbyt po uuid raw byte getrawbyt
stmt set long setlong po uuid signific bit getmostsignificantbit
stmt set long setlong po uuid signific bit getleastsignificantbit
po
construct paramet list preparedstat
uuid
param uuid uuid
return list object
object kei getkei uuid uuid
storag model getstoragemodel binari kei binari kei
object uuid raw byte getrawbyt
object long uuid signific bit getmostsignificantbit
long uuid signific bit getleastsignificantbit
creat paramet arrai sql statement
uuid paramet
param uuid uuid
param paramet
param paramet uuid paramet
return object arrai repres paramet
object creat param createparam uuid uuid object
creat kei
list kei arrai list arraylist
storag model getstoragemodel binari kei binari kei
kei add uuid raw byte getrawbyt
kei add long uuid signific bit getmostsignificantbit
kei add long uuid signific bit getleastsignificantbit
creat paramet
list param arrai list arraylist
param add
param add addal kei
param add addal kei
param add
param arrai toarrai
inheritdoc
node iter nodeiditer node id getallnodeid node nodeid bigger max count maxcount
item state except itemstateexcept repositori except repositoryexcept
result set resultset
uuid low uuid lowuuid
object kei
string sql
bigger
sql bundl select id sql bundleselectallidssql
low uuid lowuuid
kei object
sql bundl select id sql bundleselectallidsfromsql
low uuid lowuuid bigger uuid getuuid
kei kei getkei low uuid lowuuid
max count maxcount
row case row smaller
requir longlong kei
probabl low wrong kei
bundleselectallidsfrom sql statement
max count maxcount
statement stmt connect manag connectionmanag execut stmt executestmt sql kei max count maxcount
stmt result set getresultset
arrai list arraylist result arrai list arraylist
max count maxcount result size max count maxcount
uuid current
storag model getstoragemodel binari kei binari kei
current uuid byte getbyt
high long getlong
low long getlong
current uuid high low
low uuid lowuuid
skip kei smaller equal maxcount
current compar compareto low uuid lowuuid
result add current
list node iter listnodeiditer list node iter listnodeiditer result
sql except sqlexcept
string msg getallnodeid fail
log error msg
item state except itemstateexcept msg
close result set closeresultset
inheritdoc
node prop bundl nodepropbundl load bundl loadbundl node nodeid
item state except itemstateexcept
result set resultset
input stream inputstream
statement stmt connect manag connectionmanag execut stmt executestmt bundl select sql bundleselectsql kei getkei uuid getuuid
stmt result set getresultset
blob blob getblob
jcr pre fetch buffer blob data
length length
byte length
binari stream getbinarystream
read po
read read byte po byte length po
po read
data input stream datainputstream din data input stream datainputstream byte arrai input stream bytearrayinputstream byte
node prop bundl nodepropbundl bundl bind read bundl readbundl din
bundl set size setsiz length
bundl
except
string msg fail read bundl
log error msg
item state except itemstateexcept msg
close stream closestream
close result set closeresultset
inheritdoc
exist bundl existsbundl node nodeid item state except itemstateexcept
result set resultset
statement stmt connect manag connectionmanag execut stmt executestmt bundl select sql bundleselectsql kei getkei uuid getuuid
stmt result set getresultset
bundl exist result entri
except
string msg fail check exist bundl
log error msg
item state except itemstateexcept msg
close result set closeresultset
inheritdoc
store bundl storebundl node prop bundl nodepropbundl bundl item state except itemstateexcept
byte arrai output stream bytearrayoutputstream byte arrai output stream bytearrayoutputstream initi buffer size initi buffer size
data output stream dataoutputstream dout data output stream dataoutputstream
bind write bundl writebundl dout bundl
dout close
string sql bundl isnew bundl insert sql bundleinsertsql bundl updat sql bundleupdatesql
object param creat param createparam bundl getid uuid getuuid byte arrai tobytearrai
connect manag connectionmanag execut stmt executestmt sql param
except
string msg fail write bundl bundl getid
log error msg
item state except itemstateexcept msg
inheritdoc
destroi bundl destroybundl node prop bundl nodepropbundl bundl item state except itemstateexcept
connect manag connectionmanag execut stmt executestmt bundl delet sql bundledeletesql kei getkei bundl getid uuid getuuid
except
item state except nosuchitemstateexcept
item state except nosuchitemstateexcept
string msg fail delet bundl bundl getid
log error msg
item state except itemstateexcept msg
inheritdoc
node refer noderefer load node refer nodereferencesid target targetid
item state except nosuchitemstateexcept item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
result set resultset
input stream inputstream
statement stmt connect manag connectionmanag execut stmt executestmt
node refer select sql nodereferenceselectsql kei getkei target targetid target gettargetid uuid getuuid
stmt result set getresultset
item state except nosuchitemstateexcept target targetid string tostr
binari stream getbinarystream
node refer noderefer ref node refer noderefer target targetid
serial deseri ref
ref
except
item state except nosuchitemstateexcept
item state except nosuchitemstateexcept
string msg fail read refer target targetid
log error msg
item state except itemstateexcept msg
close stream closestream
close result set closeresultset
inheritdoc
method share code preparedstat code
strictli sequenti method synchron
persist manag instanc synchron
share statement method synchron share
statement synchron
store node refer noderefer ref item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
check insert updat
updat exist ref getid
string sql updat node refer updat sql nodereferenceupdatesql node refer insert sql nodereferenceinsertsql
byte arrai output stream bytearrayoutputstream
byte arrai output stream bytearrayoutputstream initi buffer size initi buffer size
serial refer
serial serial ref
object param creat param createparam ref target gettargetid uuid getuuid byte arrai tobytearrai
connect manag connectionmanag execut stmt executestmt sql param
close bytearrayoutputstream
close
except
string msg fail write node refer ref getid
log error msg
item state except itemstateexcept msg
inheritdoc
destroi node refer noderefer ref item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
connect manag connectionmanag execut stmt executestmt node refer delet sql nodereferencedeletesql
kei getkei ref target gettargetid uuid getuuid
except
item state except nosuchitemstateexcept
item state except nosuchitemstateexcept
string msg fail delet refer ref target gettargetid
log error msg
item state except itemstateexcept msg
inheritdoc
exist node refer nodereferencesid target targetid item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
result set resultset
statement stmt connect manag connectionmanag execut stmt executestmt node refer select sql nodereferenceselectsql
kei getkei target targetid target gettargetid uuid getuuid
stmt result set getresultset
refer exist result entri
except
string msg fail check exist node refer
target targetid
log error msg
item state except itemstateexcept msg
close result set closeresultset
reset code preparedstat code clear
paramet warn contain
param stmt code preparedstat code reset
code null code method
reset statement resetstat prepar statement preparedstat stmt
stmt
stmt clear paramet clearparamet
stmt clear warn clearwarn
sql except sqlexcept
log except logexcept fail reset preparedstat
close result set
param result set
close result set closeresultset result set resultset
close
sql except sqlexcept
log except logexcept fail close resultset
close input stream
param in input stream
close stream closestream input stream inputstream in
in
in close
except ioexcept ignor
ignor
close statement
param stmt statement
close statement closestat prepar statement preparedstat stmt
stmt
stmt close
sql except sqlexcept
log except logexcept fail close preparedstat
log sql except
param messag messag
param except
log except logexcept string messag sql except sqlexcept
messag
log error messag
log error reason messag getmessag
log error state code sql state getsqlstat error code geterrorcod
log debug dump
inheritdoc
string string tostr
initi sql string
build sql statement buildsqlstat
prepar statement
storag model getstoragemodel binari kei binari kei
bundl insert sql bundleinsertsql insert schema object prefix schemaobjectprefix bundl bundl data node valu
bundl updat sql bundleupdatesql updat schema object prefix schemaobjectprefix bundl set bundl data node
bundl select sql bundleselectsql select bundl data schema object prefix schemaobjectprefix bundl node
bundl delet sql bundledeletesql delet schema object prefix schemaobjectprefix bundl node
node refer insert sql nodereferenceinsertsql insert schema object prefix schemaobjectprefix ref ref data node valu
node refer updat sql nodereferenceupdatesql updat schema object prefix schemaobjectprefix ref set ref data node
node refer select sql nodereferenceselectsql select ref data schema object prefix schemaobjectprefix ref node
node refer delet sql nodereferencedeletesql delet schema object prefix schemaobjectprefix ref node
bundl select id sql bundleselectallidssql select node schema object prefix schemaobjectprefix bundl
bundl select id sql bundleselectallidsfromsql select node schema object prefix schemaobjectprefix bundl node order node
bundl insert sql bundleinsertsql insert schema object prefix schemaobjectprefix bundl bundl data node node valu
bundl updat sql bundleupdatesql updat schema object prefix schemaobjectprefix bundl set bundl data node node
bundl select sql bundleselectsql select bundl data schema object prefix schemaobjectprefix bundl node node
bundl delet sql bundledeletesql delet schema object prefix schemaobjectprefix bundl node node
node refer insert sql nodereferenceinsertsql
insert schema object prefix schemaobjectprefix ref
ref data node node valu
node refer updat sql nodereferenceupdatesql
updat schema object prefix schemaobjectprefix ref
set ref data node node
node refer select sql nodereferenceselectsql select ref data schema object prefix schemaobjectprefix ref node node
node refer delet sql nodereferencedeletesql delet schema object prefix schemaobjectprefix ref node node
bundl select id sql bundleselectallidssql select node node schema object prefix schemaobjectprefix bundl
paramet
exact statement databas support node node low
bundl select id sql bundleselectallidsfromsql
select node node schema object prefix schemaobjectprefix bundl
node null
order node node
helper interfac closeabl store
closeabl blob store closeableblobstor blob store blobstor
close
implement filesystem blob store
blob scheme
blob store fsblobstor file system blob store filesystemblobstor closeabl blob store closeableblobstor
file system filesystem
blob store fsblobstor file system filesystem
string creat createid properti propertyid index
build blob file path buildblobfilepath index string tostr
close
close
except
ignor
implement blob store store data insid databas
blob store dbblobstor closeabl blob store closeableblobstor
string blob insert sql blobinsertsql
string blob updat sql blobupdatesql
string blob select sql blobselectsql
string blob select exist sql blobselectexistsql
string blob delet sql blobdeletesql
blob store dbblobstor sql except sqlexcept
blob insert sql blobinsertsql insert schema object prefix schemaobjectprefix binval binval data binval valu
blob updat sql blobupdatesql updat schema object prefix schemaobjectprefix binval set binval data binval
blob select sql blobselectsql select binval data schema object prefix schemaobjectprefix binval binval
blob select exist sql blobselectexistsql select schema object prefix schemaobjectprefix binval binval
blob delet sql blobdeletesql delet schema object prefix schemaobjectprefix binval binval
inheritdoc
string creat createid properti propertyid index
string buffer stringbuff buf string buffer stringbuff
buf append parent getparentid string tostr
buf append
buf append index getnsindex string index stringtoindex getnam namespac uri getnamespaceuri
buf append
buf append index getnameindex string index stringtoindex getnam local getlocalnam
buf append
buf append index
buf string tostr
inheritdoc
input stream inputstream string blob blobid except
statement stmt connect manag connectionmanag execut stmt executestmt blob select sql blobselectsql object blob blobid
result set resultset stmt result set getresultset
close result set closeresultset
except blob blob blobid
input stream inputstream binari stream getbinarystream
databas treat length valu null
return empti inputstream case
close result set closeresultset
byte arrai input stream bytearrayinputstream
return inputstream wrapper order
close resultset stream close
filter input stream filterinputstream
close except ioexcept
close
safe close resultset
close result set closeresultset
inheritdoc
put string blob blobid input stream inputstream size
except
statement stmt connect manag connectionmanag execut stmt executestmt blob select exist sql blobselectexistsql object blob blobid
result set resultset stmt result set getresultset
blob exist result entri
exist
close result set closeresultset
string sql exist blob updat sql blobupdatesql blob insert sql blobinsertsql
object param object connect recoveri manag connectionrecoverymanag stream wrapper streamwrapp size blob blobid
connect manag connectionmanag execut stmt executestmt sql param
inheritdoc
remov string blob blobid except
statement stmt connect manag connectionmanag execut stmt executestmt blob delet sql blobdeletesql object blob blobid
stmt updat count getupdatecount
close
close databas resourc blobstor left
own bundledbpersistencemanag
iter memori list node id
helper class link bundledbpersistencemanag getallnodeid
list node iter listnodeiditer node iter nodeiditer
arrai list arraylist list
po
list node iter listnodeiditer arrai list arraylist list
list list
node nodeid node nextnodeid element except nosuchelementexcept
hasnext
element except nosuchelementexcept
node nodeid uuid list po
hasnext
po list size
object
node nextnodeid
remov
unsupport oper except unsupportedoperationexcept
