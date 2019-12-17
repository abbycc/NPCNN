org apach jackrabbit core state
org apach jackrabbit core node nodeid
org apach jackrabbit core properti propertyid
org apach jackrabbit core file system filesystem
org apach jackrabbit core local local file system localfilesystem
org apach jackrabbit core state abstract persist manag abstractpersistencemanag
org apach jackrabbit core state chang log changelog
org apach jackrabbit core state item state except itemstateexcept
org apach jackrabbit core state item state except nosuchitemstateexcept
org apach jackrabbit core state node refer noderefer
org apach jackrabbit core state node refer nodereferencesid
org apach jackrabbit core state node state nodest
org apach jackrabbit core state context pmcontext
org apach jackrabbit core state properti state propertyst
org apach jackrabbit core state item state itemst
org apach jackrabbit core state util blob store blobstor
org apach jackrabbit core state util file system blob store filesystemblobstor
org apach jackrabbit core state util serial
org apach jackrabbit core blob file blobfilevalu
org apach jackrabbit core intern internalvalu
org apach jackrabbit util text
org apach log4j logger
javax jcr properti type propertytyp
javax jcr repositori except repositoryexcept
java buffer reader bufferedread
java byte arrai output stream bytearrayoutputstream
java file
java except ioexcept
java input stream inputstream
java input stream reader inputstreamread
java filter input stream filterinputstream
java byte arrai input stream bytearrayinputstream
java sql connect
java sql driver manag drivermanag
java sql prepar statement preparedstat
java sql result set resultset
java sql sql except sqlexcept
java sql statement
java sql databas meta data databasemetadata
code simpledbpersistencemanag code gener jdbc base
code persistencemanag code jackrabbit persist
code itemst code code noderefer code object
simpl custom binari serial format link serial
basic normal databas schema essenc tabl 'key'
'data' column
configur properti
code driver code fqn jdbc driver class
code url code databas url form code jdbc subprotocol subnam code
code user code databas user
code password code user' password
code schema code type schema
code mysql code code mssql code
code schemaobjectprefix code prefix prepend schema object
code externalblob code code true code default binari
valu blob store local file system
code fals code blob store databas
requir schema object automat creat execut ddl
statement read schema ddl file ddl file read
resourc call code getclass getresourceasstream schema ddl code
line ddl file execut separatli call
code java sql statement execut string code occur
string code schemaobjectprefix code replac
properti code schemaobjectprefix code
fragment sampl configur mysql
pre
persistencemanag class org apach jackrabbit core state simpledbpersistencemanag
param driver mysql jdbc driver
param url jdbc mysql test
param schema mysql
param schemaobjectprefix wsp
param externalblob fals
persistencemanag
pre
fragment sampl configur daffodil embed
pre
persistencemanag class org apach jackrabbit core state simpledbpersistencemanag
param driver daffodil jdbc daffodildbdriv
param url jdbc daffodildb embed wsp path wsp home databas creat true
param user daffodil
param password daffodil
param schema daffodil
param schemaobjectprefix wsp
param externalblob fals
persistencemanag
pre
fragment sampl configur db2
pre
persistencemanag class org apach jackrabbit core state simpledbpersistencemanag
param driver ibm db2 jcc db2driver
param url jdbc db2 test
param schema db2
param schemaobjectprefix wsp
param externalblob fals
persistencemanag
pre
fragment sampl configur mssql
pre
persistencemanag class org apach jackrabbit core state simpledbpersistencemanag
param driver microsoft jdbc sqlserver sqlserverdriv
param url jdbc microsoft sqlserver localhost databasenam test selectmethod cursor
param schema mssql
param user
param password
param schemaobjectprefix wsp
param externalblob fals
persistencemanag
pre
fragment sampl configur postgresql
pre
persistencemanag class org apach jackrabbit core state simpledbpersistencemanag
param driver org postgresql driver
param url jdbc postgresql localhost test
param schema postgresql
param user postgr
param password postgr
param schemaobjectprefix wsp
param externalblob fals
persistencemanag
pre
link derbypersistencemanag
simpl persist manag simpledbpersistencemanag abstract persist manag abstractpersistencemanag
logger instanc
logger log logger logger getlogg simpl persist manag simpledbpersistencemanag
string schema object prefix variabl schema object prefix variabl
schemaobjectprefix
initi
string driver
string url
string user
string password
string schema
string schema object prefix schemaobjectprefix
extern blo externalblob
initi size buffer serial object
initi buffer size initi buffer size
jdbc connect
connect con
share prepar statement nodest manag
prepar statement preparedstat node state insert nodestateinsert
prepar statement preparedstat node state updat nodestateupd
prepar statement preparedstat node state select nodestateselect
prepar statement preparedstat node state select exist nodestateselectexist
prepar statement preparedstat node state delet nodestatedelet
share prepar statement propertyst manag
prepar statement preparedstat properti state insert propertystateinsert
prepar statement preparedstat properti state updat propertystateupd
prepar statement preparedstat properti state select propertystateselect
prepar statement preparedstat properti state select exist propertystateselectexist
prepar statement preparedstat properti state delet propertystatedelet
share prepar statement noderefer manag
prepar statement preparedstat node refer insert nodereferenceinsert
prepar statement preparedstat node refer updat nodereferenceupd
prepar statement preparedstat node refer select nodereferenceselect
prepar statement preparedstat node refer select exist nodereferenceselectexist
prepar statement preparedstat node refer delet nodereferencedelet
share prepar statement blob manag
code externalblob fals code
prepar statement preparedstat blob insert blobinsert
prepar statement preparedstat blob updat blobupd
prepar statement preparedstat blob select blobselect
prepar statement preparedstat blob select exist blobselectexist
prepar statement preparedstat blob delet blobdelet
file system blob data store
code externalblob true code
file system filesystem blob blobf
blobstor manag blob data file system
code externalblob true code
blob store blobstor blob store blobstor
creat code simpledbpersistencemanag code instanc
simpl persist manag simpledbpersistencemanag
schema default
schema object prefix schemaobjectprefix
extern blo externalblob
initi
setter getter
string url geturl
url
set url seturl string url
url url
string user getus
user
set user setus string user
user user
string password getpassword
password
set password setpassword string password
password password
string driver getdriv
driver
set driver setdriv string driver
driver driver
string schema object prefix getschemaobjectprefix
schema object prefix schemaobjectprefix
set schema object prefix setschemaobjectprefix string schema object prefix schemaobjectprefix
make prefix uppercas
schema object prefix schemaobjectprefix schema object prefix schemaobjectprefix upper case touppercas
string schema getschema
schema
set schema setschema string schema
schema schema
extern blo isexternalblob
extern blo externalblob
set extern blo setexternalblob extern blo externalblob
extern blo externalblob extern blo externalblob
set extern blo setexternalblob string extern blo externalblob
extern blo externalblob boolean valueof extern blo externalblob boolean booleanvalu
persistencemanag
inheritdoc
init context pmcontext context except
initi
illeg state except illegalstateexcept initi
setup jdbc connect
class fornam driver
con driver manag drivermanag connect getconnect url user password
con set auto commit setautocommit
make schemaobjectprefix consist legal charact
prepar schema object prefix prepareschemaobjectprefix
check schema object exist creat
check schema checkschema
prepar statement
node state insert nodestateinsert
con prepar statement preparestat insert
schema object prefix schemaobjectprefix node node data node valu
node state updat nodestateupd
con prepar statement preparestat updat
schema object prefix schemaobjectprefix node set node data node
node state select nodestateselect
con prepar statement preparestat select node data
schema object prefix schemaobjectprefix node node
node state select exist nodestateselectexist
con prepar statement preparestat select
schema object prefix schemaobjectprefix node node
node state delet nodestatedelet
con prepar statement preparestat delet
schema object prefix schemaobjectprefix node node
properti state insert propertystateinsert
con prepar statement preparestat insert
schema object prefix schemaobjectprefix prop prop data prop valu
properti state updat propertystateupd
con prepar statement preparestat updat
schema object prefix schemaobjectprefix prop set prop data prop
properti state select propertystateselect
con prepar statement preparestat select prop data
schema object prefix schemaobjectprefix prop prop
properti state select exist propertystateselectexist
con prepar statement preparestat select
schema object prefix schemaobjectprefix prop prop
properti state delet propertystatedelet
con prepar statement preparestat delet
schema object prefix schemaobjectprefix prop prop
node refer insert nodereferenceinsert
con prepar statement preparestat insert
schema object prefix schemaobjectprefix ref ref data node valu
node refer updat nodereferenceupd
con prepar statement preparestat updat
schema object prefix schemaobjectprefix ref set ref data node
node refer select nodereferenceselect
con prepar statement preparestat select ref data
schema object prefix schemaobjectprefix ref node
node refer select exist nodereferenceselectexist
con prepar statement preparestat select
schema object prefix schemaobjectprefix ref node
node refer delet nodereferencedelet
con prepar statement preparestat delet
schema object prefix schemaobjectprefix ref node
extern blo externalblob
store blob local file system directori
workspac home directori
local file system localfilesystem blob blobf local file system localfilesystem
blob blobf set root setroot file context home dir gethomedir blob
blob blobf init
blob blobf blob blobf
blob store blobstor file system blob store filesystemblobstor blob blobf
store blob
blob store blobstor blob store dbblobstor
blob insert blobinsert
con prepar statement preparestat insert
schema object prefix schemaobjectprefix binval binval data binval valu
blob updat blobupd
con prepar statement preparestat updat
schema object prefix schemaobjectprefix binval set binval data binval
blob select blobselect
con prepar statement preparestat select binval data
schema object prefix schemaobjectprefix binval binval
blob select exist blobselectexist
con prepar statement preparestat select
schema object prefix schemaobjectprefix binval binval
blob delet blobdelet
con prepar statement preparestat delet
schema object prefix schemaobjectprefix binval binval
initi
inheritdoc
close except
initi
illeg state except illegalstateexcept initi
close share prepar statement
close statement closestat node state insert nodestateinsert
close statement closestat node state updat nodestateupd
close statement closestat node state select nodestateselect
close statement closestat node state select exist nodestateselectexist
close statement closestat node state delet nodestatedelet
close statement closestat properti state insert propertystateinsert
close statement closestat properti state updat propertystateupd
close statement closestat properti state select propertystateselect
close statement closestat properti state select exist propertystateselectexist
close statement closestat properti state delet propertystatedelet
close statement closestat node refer insert nodereferenceinsert
close statement closestat node refer updat nodereferenceupd
close statement closestat node refer select nodereferenceselect
close statement closestat node refer select exist nodereferenceselectexist
close statement closestat node refer delet nodereferencedelet
extern blo externalblob
close statement closestat blob insert blobinsert
close statement closestat blob updat blobupd
close statement closestat blob select blobselect
close statement closestat blob select exist blobselectexist
close statement closestat blob delet blobdelet
close blob file system
blob blobf close
blob blobf
blob store blobstor
close jdbc connect
con close
initi
inheritdoc
store chang log changelog chang log changelog
item state except itemstateexcept
item state except itemstateexcept is
store chang log changelog
item state except itemstateexcept
is
is
store succeed commit
con commit
sql except sqlexcept
string msg commit chang log fail
log error msg
item state except itemstateexcept msg
store fail rollback
con rollback
sql except sqlexcept
string msg rollback chang log fail
log error msg
throw origin except
is
inheritdoc
node state nodest load node nodeid
item state except nosuchitemstateexcept item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
prepar statement preparedstat stmt node state select nodestateselect
stmt
result set resultset
input stream inputstream
stmt set string setstr string tostr
stmt execut
stmt result set getresultset
item state except nosuchitemstateexcept string tostr
binari stream getbinarystream
node state nodest state creat createnew
serial deseri state
state
except
item state except nosuchitemstateexcept
item state except nosuchitemstateexcept
string msg fail read node state
log error msg
item state except itemstateexcept msg
close stream closestream
close result set closeresultset
reset statement resetstat stmt
inheritdoc
properti state propertyst load properti propertyid
item state except nosuchitemstateexcept item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
prepar statement preparedstat stmt properti state select propertystateselect
stmt
result set resultset
input stream inputstream
stmt set string setstr string tostr
stmt execut
stmt result set getresultset
item state except nosuchitemstateexcept string tostr
binari stream getbinarystream
properti state propertyst state creat createnew
serial deseri state blob store blobstor
state
except
item state except nosuchitemstateexcept
item state except nosuchitemstateexcept
string msg fail read properti state
log error msg
item state except itemstateexcept msg
close stream closestream
close result set closeresultset
reset statement resetstat stmt
inheritdoc
method share code preparedstat code
execut strictli sequenti method synchron
persist manag instanc synchron
share statement method sychron share
statement synchron
store node state nodest state item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
check insert updat
updat state statu getstatu item state itemst statu statu
boolean updat exist state getid
prepar statement preparedstat stmt updat node state updat nodestateupd node state insert nodestateinsert
byte arrai output stream bytearrayoutputstream
byte arrai output stream bytearrayoutputstream initi buffer size initi buffer size
serial node state
serial serial state
synchron instanc
addition synchron preparedstat
stmt set byte setbyt byte arrai tobytearrai
stmt set string setstr state node getnodeid string tostr
stmt execut updat executeupd
close bytearrayoutputstream
close
except
string msg fail write node state state node getnodeid
log error msg
item state except itemstateexcept msg
reset statement resetstat stmt
inheritdoc
method share code preparedstat code
execut strictli sequenti method synchron
persist manag instanc synchron
share statement method sychron share
statement synchron
store properti state propertyst state
item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
check insert updat
updat state statu getstatu item state itemst statu statu
boolean updat exist state getid
prepar statement preparedstat stmt updat properti state updat propertystateupd properti state insert propertystateinsert
byte arrai output stream bytearrayoutputstream
byte arrai output stream bytearrayoutputstream initi buffer size initi buffer size
serial properti state
serial serial state blob store blobstor
synchron instanc
addition synchron preparedstat
stmt set byte setbyt byte arrai tobytearrai
stmt set string setstr state properti getpropertyid string tostr
stmt execut updat executeupd
close bytearrayoutputstream
close
except
string msg fail write properti state state properti getpropertyid
log error msg
item state except itemstateexcept msg
reset statement resetstat stmt
inheritdoc
destroi node state nodest state
item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
prepar statement preparedstat stmt node state delet nodestatedelet
stmt set string setstr state node getnodeid string tostr
stmt execut updat executeupd
except
string msg fail delet node state state node getnodeid
log error msg
item state except itemstateexcept msg
reset statement resetstat stmt
inheritdoc
destroi properti state propertyst state
item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
make binari valu blob properli remov
intern internalvalu valu state valu getvalu
valu
valu length
intern internalvalu val valu
val
val type gettyp properti type propertytyp binari
blob file blobfilevalu blob val blobval blob file blobfilevalu val intern internalvalu
delet intern resourc represent blob
blob val blobval delet
remov blobstor
string blob blobid blob store blobstor creat createid state properti getpropertyid
blob store blobstor remov blob blobid
except
log warn fail remov blobstor blob blobid
prepar statement preparedstat stmt properti state delet propertystatedelet
stmt set string setstr state properti getpropertyid string tostr
stmt execut updat executeupd
except
string msg fail delet properti state state properti getpropertyid
log error msg
item state except itemstateexcept msg
reset statement resetstat stmt
inheritdoc
node refer noderefer load node refer nodereferencesid target targetid
item state except nosuchitemstateexcept item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
prepar statement preparedstat stmt node refer select nodereferenceselect
stmt
result set resultset
input stream inputstream
stmt set string setstr target targetid string tostr
stmt execut
stmt result set getresultset
item state except nosuchitemstateexcept target targetid string tostr
binari stream getbinarystream
node refer noderefer ref node refer noderefer target targetid
serial deseri ref
ref
except
item state except nosuchitemstateexcept
item state except nosuchitemstateexcept
string msg fail read node refer target targetid
log error msg
item state except itemstateexcept msg
close stream closestream
close result set closeresultset
reset statement resetstat stmt
inheritdoc
method share code preparedstat code
execut strictli sequenti method synchron
persist manag instanc synchron
share statement method sychron share
statement synchron
store node refer noderefer ref
item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
check insert updat
updat exist ref target gettargetid
prepar statement preparedstat stmt updat node refer updat nodereferenceupd node refer insert nodereferenceinsert
byte arrai output stream bytearrayoutputstream
byte arrai output stream bytearrayoutputstream initi buffer size initi buffer size
serial refer
serial serial ref
synchron instanc
addition synchron preparedstat
stmt set byte setbyt byte arrai tobytearrai
stmt set string setstr ref target gettargetid string tostr
stmt execut updat executeupd
close bytearrayoutputstream
close
except
string msg fail write node refer ref target gettargetid
log error msg
item state except itemstateexcept msg
reset statement resetstat stmt
inheritdoc
destroi node refer noderefer ref
item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
prepar statement preparedstat stmt node refer delet nodereferencedelet
stmt set string setstr ref target gettargetid string tostr
stmt execut updat executeupd
except
string msg fail delet node refer ref target gettargetid
log error msg
item state except itemstateexcept msg
reset statement resetstat stmt
inheritdoc
exist node nodeid item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
prepar statement preparedstat stmt node state select exist nodestateselectexist
stmt
result set resultset
stmt set string setstr string tostr
stmt execut
stmt result set getresultset
node state exist result entri
except
string msg fail check exist node state
log error msg
item state except itemstateexcept msg
close result set closeresultset
reset statement resetstat stmt
inheritdoc
exist properti propertyid item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
prepar statement preparedstat stmt properti state select exist propertystateselectexist
stmt
result set resultset
stmt set string setstr string tostr
stmt execut
stmt result set getresultset
properti state exist result entri
except
string msg fail check exist properti state
log error msg
item state except itemstateexcept msg
close result set closeresultset
reset statement resetstat stmt
inheritdoc
exist node refer nodereferencesid target targetid item state except itemstateexcept
initi
illeg state except illegalstateexcept initi
prepar statement preparedstat stmt node refer select exist nodereferenceselectexist
stmt
result set resultset
stmt set string setstr target targetid string tostr
stmt execut
stmt result set getresultset
refer exist result entri
except
string msg fail check exist node refer
target targetid
log error msg
item state except itemstateexcept msg
close result set closeresultset
reset statement resetstat stmt
misc helper method
reset code preparedstat code clear paramet
warn contain
note method call synchron context
method code preparedstat code instanc
oper thread safe
param stmt code preparedstat code reset
code null code method
reset statement resetstat prepar statement preparedstat stmt
stmt
stmt clear paramet clearparamet
stmt clear warn clearwarn
sql except sqlexcept
log except logexcept fail reset preparedstat
close result set closeresultset result set resultset
close
sql except sqlexcept
log except logexcept fail close resultset
close stream closestream input stream inputstream
close
except ioexcept ignor
close statement closestat statement stmt
stmt
stmt close
sql except sqlexcept
log except logexcept fail close statement
log except logexcept string messag sql except sqlexcept
messag
log error messag
log error reason messag getmessag
log error state code sql state getsqlstat error code geterrorcod
log debug dump
make code schemaobjectprefix code consist
charact allow name target databas illeg
charact escap
throw except error occur
prepar schema object prefix prepareschemaobjectprefix except
databas meta data databasemetadata meta data metadata con meta data getmetadata
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
check requir schema object exist creat
exist
throw except error occur
check schema checkschema except
databas meta data databasemetadata meta data metadata con meta data getmetadata
string tabl tablenam schema object prefix schemaobjectprefix node
meta data metadata store lower case identifi storeslowercaseidentifi
tabl tablenam tabl tablenam lower case tolowercas
meta data metadata store upper case identifi storesuppercaseidentifi
tabl tablenam tabl tablenam upper case touppercas
result set resultset meta data metadata tabl gettabl tabl tablenam
schema exist schemaexist
schema exist schemaexist
close
schema exist schemaexist
read ddl resourc
input stream inputstream class getclass resourc stream getresourceasstream schema ddl
string msg configur error unknown schema schema
log debug msg
repositori except repositoryexcept msg
buffer reader bufferedread reader buffer reader bufferedread input stream reader inputstreamread
statement stmt con creat statement createstat
string sql reader read line readlin
sql
replac prefix variabl
sql text replac sql schema object prefix variabl schema object prefix variabl schema object prefix schemaobjectprefix
execut sql stmt
stmt execut updat executeupd sql
read sql stmt
sql reader read line readlin
commit
con commit
close stream closestream
close statement closestat stmt
class
blob store dbblobstor blob store blobstor
inheritdoc
string creat createid properti propertyid index
blobid simpl string concaten index
string buffer stringbuff string buffer stringbuff
append string tostr
append
append index
append
string tostr
inheritdoc
input stream inputstream string blob blobid except
prepar statement preparedstat stmt blob select blobselect
stmt
stmt set string setstr blob blobid
stmt execut
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
reset statement resetstat stmt
inheritdoc
put string blob blobid input stream inputstream size
except
prepar statement preparedstat stmt blob select exist blobselectexist
stmt set string setstr blob blobid
stmt execut
result set resultset stmt result set getresultset
blob exist result entri
exist
reset statement resetstat stmt
close result set closeresultset
stmt exist blob updat blobupd blob insert blobinsert
stmt set binari stream setbinarystream size
stmt set string setstr blob blobid
stmt execut updat executeupd
reset statement resetstat stmt
inheritdoc
remov string blob blobid except
prepar statement preparedstat stmt blob delet blobdelet
stmt set string setstr blob blobid
stmt execut updat executeupd
reset statement resetstat stmt
