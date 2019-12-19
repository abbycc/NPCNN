org apach jackrabbit core data
org apach jackrabbit core data data identifi dataidentifi
org apach jackrabbit core data data record datarecord
org apach jackrabbit core data data store datastor
org apach jackrabbit core data data store except datastoreexcept
org apach jackrabbit core util track input stream trackinginputstream
org apach jackrabbit core util check schema oper checkschemaoper
org apach jackrabbit core util connect factori connectionfactori
org apach jackrabbit core util connect helper connectionhelp
org apach jackrabbit core util databas awar databaseawar
org apach jackrabbit core util util dbutil
org apach jackrabbit core util stream wrapper streamwrapp
org apach jackrabbit util text
org slf4j logger
org slf4j logger factori loggerfactori
java buffer input stream bufferedinputstream
java byte arrai input stream bytearrayinputstream
java file
java except ioexcept
java input stream inputstream
java lang ref weak refer weakrefer
java secur digest input stream digestinputstream
java secur messag digest messagedigest
java secur algorithm except nosuchalgorithmexcept
java sql result set resultset
java util arrai list arraylist
java util collect
java util iter
java util list
java util map
java util properti
java util uuid
java util weak hash map weakhashmap
javax jcr repositori except repositoryexcept
javax sql data sourc datasourc
data store implement store record databas jdbc
configur
pre
datastor class org apach jackrabbit core data dbdatastor
param link seturl string url jdbc postgresql test
param link setus string user
param link setpassword string password
param link setdatabasetyp string databasetyp postgresql
param link setdriv string driver org postgresql driver
param link setminrecordlength int minrecordlength
param link setmaxconnect int maxconnect
param link setcopywhenread boolean copywhenread true
param link settableprefix string tableprefix
param link setschemaobjectprefix string schemaobjectprefix
param link setschemachecken string schemachecken true
datastor
pre
url user password set
remain set gener databas url protocol
databas type resourc file
jndi connect case javax name initialcontext driver
jndi url user password configur jndi resourc
configur jndi set
pre
param driver javax name initialcontext
param url java comp env jdbc test
pre
microsoft sql server problem read larg blob
jdbc driver version newer append responsebuff adapt databas url
append selectmethod cursor run memori
databas url jdbc sqlserver localhost databasenam test responsebuff adapt
default data copi temp file read avoid problem read multipl
blob time
tableprefix schema catalog
param tableprefix
data store dbdatastor data store datastor databas awar databaseawar
default minimum object size
default min record length default min record length
write temporari file length slow work
default set
string store temp file store temp file tempfil
call preparedstat setbinarystream
string store size minu store size minu
call preparedstat setbinarystream integ max
string store size max store size max max
digest algorithm uniqu identifi record
string digest sha
prefix temporari object
string temp prefix temp prefix temp
logger instanc
logger log logger factori loggerfactori logger getlogg data store dbdatastor
minimum modifi date file access read write modifi date
older modifi date updat current time
min modifi date minmodifiedd
databas url
string url
databas driver
string driver
user
string user
password
string password
databas type
string databas type databasetyp
minimum size object store data store
min record length minrecordlength default min record length default min record length
prefix datastor tabl empti default
string tabl prefix tableprefix
prefix tabl name default empti
string schema object prefix schemaobjectprefix
schema check initi
schema check enabl schemachecken
logic datasourc
string data sourc datasourcenam
properti 'table'
databasetyp properti file initi default
string tabl sql tablesql datastor
properti 'createtable'
databasetyp properti file initi default
string creat tabl sql createtablesql
creat tabl tableprefix tabl varchar primari kei length bigint modifi bigint data blob
properti 'inserttemp'
databasetyp properti file initi default
string insert temp sql inserttempsql
insert tableprefix tabl valu null
properti 'updatedata'
databasetyp properti file initi default
string updat data sql updatedatasql
updat tableprefix tabl set data
properti 'updatelastmodified'
databasetyp properti file initi default
string updat modifi sql updatelastmodifiedsql
updat tableprefix tabl set modifi modifi
properti 'update'
databasetyp properti file initi default
string updat sql updatesql
updat tableprefix tabl set length modifi
exist select tableprefix tabl
properti 'delete'
databasetyp properti file initi default
string delet sql deletesql
delet tableprefix tabl
properti 'deleteolder'
databasetyp properti file initi default
string delet older sql deleteoldersql
delet tableprefix tabl modifi
properti 'selectmeta'
databasetyp properti file initi default
string select meta sql selectmetasql
select length modifi tableprefix tabl
properti 'selectall'
databasetyp properti file initi default
string select sql selectallsql
select tableprefix tabl
properti 'selectdata'
databasetyp properti file initi default
string select data sql selectdatasql
select data tableprefix tabl
stream store mechan
string store stream storestream store temp file store temp file
copi stream temp file return
enabl default support concurr read
copi read copywhenread
data identifi set garbag collect
map data identifi dataidentifi weak refer weakrefer data identifi dataidentifi inus
collect synchron map synchronizedmap weak hash map weakhashmap data identifi dataidentifi weak refer weakrefer data identifi dataidentifi
temporari identifi
list string temporari temporaryinus collect synchron list synchronizedlist arrai list arraylist string
link connectionhelp set link init string method
connect helper connectionhelp con helper conhelp
repositori link connectionfactori
connect factori connectionfactori connect factori connectionfactori
inheritdoc
set connect factori setconnectionfactori connect factori connectionfactori connnect factori connnectionfactori
connect factori connectionfactori connnect factori connnectionfactori
inheritdoc
data record datarecord add record addrecord input stream inputstream stream data store except datastoreexcept
result set resultset
temp file input stream tempfileinputstream file input fileinput
string temp tempid
system current time milli currenttimemilli
uuid random uuid randomuuid string tostr
temp tempid temp prefix temp prefix
select length modifi datastor
con helper conhelp exec select meta sql selectmetasql object temp tempid
event row exist
insert datastor valu null
con helper conhelp exec insert temp sql inserttempsql object temp tempid long
except
convert insert record
util dbutil close
string msg creat record
log error msg
data store except datastoreexcept msg
temporari temporaryinus add temp tempid
messag digest messagedigest digest digest getdigest
digest input stream digestinputstream din digest input stream digestinputstream stream digest
track input stream trackinginputstream track input stream trackinginputstream din
stream wrapper streamwrapp wrapper
store size minu store size minu equal store stream storestream
wrapper stream wrapper streamwrapp
store size max store size max equal store stream storestream
wrapper stream wrapper streamwrapp integ max max
store temp file store temp file equal store stream storestream
file temp move temp file movetotempfil
file input fileinput temp file input stream tempfileinputstream temp
length temp length
wrapper stream wrapper streamwrapp file input fileinput length
data store except datastoreexcept unsupport stream store algorithm store stream storestream
updat datastor set data
con helper conhelp exec updat data sql updatedatasql object wrapper temp tempid
system current time milli currenttimemilli
length posit getposit
data identifi dataidentifi identifi data identifi dataidentifi digest digest
identifi usesidentifi identifi
identifi string tostr
updat datastor set length modifi
exist select datastor
count con helper conhelp updat updat sql updatesql object
long length long
temp tempid
null prevent close call final block count close
count
updat count mean row exist
delet datastor
con helper conhelp exec delet sql deletesql object temp tempid
select length modifi datastor
con helper conhelp exec select meta sql selectmetasql object
length oldlength long getlong
modifi lastmodifi long getlong
length oldlength length
string msg
digest collis temp temp tempid
length length
oldlength length oldlength
log error msg
data store except datastoreexcept msg
touch identifi modifi lastmodifi
identifi usesidentifi identifi
data record dbdatarecord record data record dbdatarecord identifi length
record
except
convert insert record
temp tempid
temporari temporaryinus remov temp tempid
util dbutil close
file input fileinput
file input fileinput close
except ioexcept
convert close temporari file
creat temp file copi data
input stream close
param input stream
return file
throw ioexcept
file move temp file movetotempfil input stream inputstream except ioexcept
file temp file creat temp file createtempfil dbrecord
temp file input stream tempfileinputstream write file close writetofileandclos temp
temp
inheritdoc
delet older deleteallolderthan min data store except datastoreexcept
arrai list arraylist string touch arrai list arraylist string
arrai list arraylist data identifi dataidentifi id arrai list arraylist data identifi dataidentifi inus kei set keyset
data identifi dataidentifi identifi id
identifi
touch add identifi string tostr
touch add addal temporari temporaryinus
string kei touch
updat modifi date updatelastmodifiedd kei
delet datastor modifi
con helper conhelp updat delet older sql deleteoldersql long long min
except
convert delet record
inheritdoc
iter data identifi dataidentifi identifi getallidentifi data store except datastoreexcept
arrai list arraylist data identifi dataidentifi list arrai list arraylist data identifi dataidentifi
result set resultset
select datastor
con helper conhelp exec select sql selectallsql object
string string getstr
start startswith temp prefix temp prefix
data identifi dataidentifi identifi data identifi dataidentifi
list add identifi
list iter
except
convert read record
util dbutil close
inheritdoc
min record length getminrecordlength
min record length minrecordlength
set minimum object length
maximum
param minrecordlength length
set min record length setminrecordlength min record length minrecordlength
min record length minrecordlength min record length minrecordlength
inheritdoc
data record datarecord record store getrecordifstor data identifi dataidentifi identifi data store except datastoreexcept
identifi usesidentifi identifi
result set resultset
string identifi string tostr
select length modifi datastor
con helper conhelp exec select meta sql selectmetasql object
data store except datastoreexcept record found identifi
length long getlong
modifi lastmodifi long getlong
touch identifi modifi lastmodifi
data record dbdatarecord identifi length modifi lastmodifi
except
convert read identifi identifi
util dbutil close
inheritdoc
data record datarecord record getrecord data identifi dataidentifi identifi data store except datastoreexcept
data record datarecord record record store getrecordifstor identifi
record
data store except datastoreexcept record found identifi
record
open input stream method set field caller
close input stream read
param inputstream databas input stream object
param identifi data identifi
throw datastoreexcept data store access
identifi invalid
input stream inputstream open stream openstream input stream dbinputstream input stream inputstream data identifi dataidentifi identifi data store except datastoreexcept
result set resultset
select data datastor
con helper conhelp exec select data sql selectdatasql object identifi string tostr
data store except datastoreexcept record found identifi
input stream inputstream stream binari stream getbinarystream
stream
stream byte arrai input stream bytearrayinputstream
util dbutil close
copi read copywhenread
copi read creat temp file close stream
file temp move temp file movetotempfil stream
stream temp file input stream tempfileinputstream temp
util dbutil close
stream buffer input stream bufferedinputstream stream
input stream inputstream set result set setresultset
stream
except
util dbutil close
convert retriev databas resourc
inheritdoc
init string home dir homedir data store except datastoreexcept
init databas type initdatabasetyp
con helper conhelp creat connect helper createconnectionhelp data sourc getdatasourc
schema check enabl isschemachecken
creat check schema oper createcheckschemaoper run
except
convert init data store driver driver url url user user
schemaobjectprefix schema object prefix schemaobjectprefix tablesql tabl sql tablesql createtablesql creat tabl sql createtablesql
data sourc datasourc data sourc getdatasourc except
data sourc getdatasourcenam equal data sourc getdatasourcenam
connect factori connectionfactori data sourc getdatasourc driver getdriv url geturl user getus password getpassword
connect factori connectionfactori data sourc getdatasourc data sourc datasourcenam
method call link init string method class return
link connectionhelp instanc assign code conhelp field subclass
overrid return special connect helper
param datasrc link datasourc persist manag
return link connectionhelp
throw except error
connect helper connectionhelp creat connect helper createconnectionhelp data sourc datasourc data src datasrc except
connect helper connectionhelp data src datasrc
method call link init string
link createconnectionhelp datasourc method return default link checkschemaoper
return link checkschemaoper instanc
check schema oper checkschemaoper creat check schema oper createcheckschemaoper
string tabl tablenam tabl prefix tableprefix schema object prefix schemaobjectprefix tabl sql tablesql
check schema oper checkschemaoper con helper conhelp byte arrai input stream bytearrayinputstream creat tabl sql createtablesql byte getbyt tabl tablenam
init databas type initdatabasetyp data store except datastoreexcept
fail found failifnotfound
databas type databasetyp
data sourc datasourcenam
databas type databasetyp connect factori connectionfactori data base type getdatabasetyp data sourc datasourcenam
repositori except repositoryexcept
data store except datastoreexcept
url start startswith jdbc
start jdbc length
end url index indexof start
databas type databasetyp url substr start end
fail found failifnotfound
input stream inputstream
data store dbdatastor resourc stream getresourceasstream databas type databasetyp properti
fail found failifnotfound
string msg
configur error resourc databas type databasetyp
properties' found
verifi databasetyp properti
log debug msg
data store except datastoreexcept msg
properti prop properti
prop load
close
except ioexcept
string msg configur error read properti databas type databasetyp properties'
log debug msg
data store except datastoreexcept msg
driver
driver properti getproperti prop driver driver
tabl sql tablesql properti getproperti prop tabl tabl sql tablesql
creat tabl sql createtablesql properti getproperti prop createt creat tabl sql createtablesql
insert temp sql inserttempsql properti getproperti prop inserttemp insert temp sql inserttempsql
updat data sql updatedatasql properti getproperti prop updatedata updat data sql updatedatasql
updat modifi sql updatelastmodifiedsql properti getproperti prop updatelastmodifi updat modifi sql updatelastmodifiedsql
updat sql updatesql properti getproperti prop updat updat sql updatesql
delet sql deletesql properti getproperti prop delet delet sql deletesql
delet older sql deleteoldersql properti getproperti prop deleteold delet older sql deleteoldersql
select meta sql selectmetasql properti getproperti prop selectmeta select meta sql selectmetasql
select sql selectallsql properti getproperti prop selectal select sql selectallsql
select data sql selectdatasql properti getproperti prop selectdata select data sql selectdatasql
store stream storestream properti getproperti prop storestream store stream storestream
store size minu store size minu equal store stream storestream
store temp file store temp file equal store stream storestream
store size max store size max equal store stream storestream
string msg unsupport stream store mechan store stream storestream
support store size minu store size minu
store temp file store temp file store size max store size max
log debug msg
data store except datastoreexcept msg
expand properti placehold support
tabl tabl default datastor
tableprefix tableprefix schemaobjectprefix set configur
param prop properti object
param kei kei
param defaultvalu default
return properti placehold replac
string properti getproperti properti prop string kei string default defaultvalu
string sql prop properti getproperti kei default defaultvalu
sql text replac sql tabl tabl sql tablesql trim
sql text replac sql tableprefix tabl prefix tableprefix schema object prefix schemaobjectprefix trim
sql
convert except data store except
param messag
param root
return data store except
data store except datastoreexcept convert string except
log warn
data store except datastoreexcept
data store except datastoreexcept
data store except datastoreexcept
inheritdoc
updat modifi date access updatemodifieddateonaccess
log debug updat modifiedd access
min modifi date minmodifiedd
updat modifi date entri requir
param identifi entri identifi
param lastmodifi current modifi date
return modifi date
touch data identifi dataidentifi identifi modifi lastmodifi data store except datastoreexcept
identifi usesidentifi identifi
updat modifi date updatelastmodifiedd identifi string tostr modifi lastmodifi
updat modifi date updatelastmodifiedd string kei modifi lastmodifi data store except datastoreexcept
modifi lastmodifi min modifi date minmodifiedd
system current time milli currenttimemilli
long long
updat datastor set modifi modifi
con helper conhelp exec updat modifi sql updatelastmodifiedsql object
kei
except
convert updat lastmodifi
modifi lastmodifi
databas type set
return databas type
string databas type getdatabasetyp
databas type databasetyp
set databas type default protocol jdbc databas url set
match resourc file databasetyp properti mysql
param databasetyp
set databas type setdatabasetyp string databas type databasetyp
databas type databasetyp databas type databasetyp
databas driver
return driver
string driver getdriv
driver
set databas driver class
set default driver class databas type
set databasetyp properti resourc kei 'driver'
param driver
set driver setdriv string driver
driver driver
password
return password
string password getpassword
password
set password
param password
set password setpassword string password
password password
databas url
return url
string url geturl
url
set databas url
jdbc postgresql test
param url
set url seturl string url
url url
user
return user
string user getus
user
set user
param user
set user setus string user
user user
return schema check enabl
schema check enabl isschemachecken
schema check enabl schemachecken
param enabl set schema check enabl
set schema check enabl setschemachecken enabl
schema check enabl schemachecken enabl
inheritdoc
close data store except datastoreexcept
identifi usesidentifi data identifi dataidentifi identifi
inus put identifi weak refer weakrefer data identifi dataidentifi identifi
inheritdoc
clear clearinus
inus clear
messag digest messagedigest digest getdigest data store except datastoreexcept
messag digest messagedigest instanc getinst digest
algorithm except nosuchalgorithmexcept
convert algorithm digest
maximum number concurr connect
deprec
return maximum number connect
max connect getmaxconnect
set maximum number concurr connect pool
connect requir garbag collect process
deprec
param maxconnect
set max connect setmaxconnect max connect maxconnect
stream copi temporari file return
return set
copi read getcopywhenread
copi read copywhenread
copi set enabl
stream copi temporari file read stream
param copywhenread set
set copi read setcopywhenread copi read copywhenread
copi read copywhenread copi read copywhenread
tabl prefix
return tabl prefix
string tabl prefix gettableprefix
tabl prefix tableprefix
set tabl prefix default empti
tabl construct
tableprefix schemaobjectprefix tablenam
param tableprefix
set tabl prefix settableprefix string tabl prefix tableprefix
tabl prefix tableprefix tabl prefix tableprefix
schema prefix
return schema object prefix
string schema object prefix getschemaobjectprefix
schema object prefix schemaobjectprefix
set schema object prefix default empti
tabl construct
tableprefix schemaobjectprefix tablenam
param schemaobjectprefix prefix
set schema object prefix setschemaobjectprefix string schema object prefix schemaobjectprefix
schema object prefix schemaobjectprefix schema object prefix schemaobjectprefix
string data sourc getdatasourcenam
data sourc datasourcenam
set data sourc setdatasourcenam string data sourc datasourcenam
data sourc datasourcenam data sourc datasourcenam
