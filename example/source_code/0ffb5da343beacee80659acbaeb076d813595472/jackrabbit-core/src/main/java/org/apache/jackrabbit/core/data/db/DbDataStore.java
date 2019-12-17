org apach jackrabbit core data
org apach jackrabbit core data data identifi dataidentifi
org apach jackrabbit core data data record datarecord
org apach jackrabbit core data data store datastor
org apach jackrabbit core data data store except datastoreexcept
org apach jackrabbit core persist bundl util connect recoveri manag connectionrecoverymanag
org apach jackrabbit core persist bundl util track input stream trackinginputstream
org apach jackrabbit core persist bundl util connect recoveri manag connectionrecoverymanag stream wrapper streamwrapp
org apach jackrabbit util text
org apach jackrabbit uuid uuid
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
java sql databas meta data databasemetadata
java sql prepar statement preparedstat
java sql result set resultset
java util arrai list arraylist
java util collect
java util iter
java util map
java util properti
java util weak hash map weakhashmap
javax jcr repositori except repositoryexcept
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
data store dbdatastor data store datastor
default minimum object size
default min record length default min record length
default maximum connect
default max connect default max connect
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
maximum number open connect
max connect maxconnect default max connect default max connect
list connect
pool connect pool connectionpool
prefix datastor tabl empti default
string tabl prefix tableprefix
prefix tabl name default empti
string schema object prefix schemaobjectprefix
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
map inus collect synchron map synchronizedmap weak hash map weakhashmap
inheritdoc
data record datarecord add record addrecord input stream inputstream stream data store except datastoreexcept
result set resultset
temp file input stream tempfileinputstream file input fileinput
connect recoveri manag connectionrecoverymanag conn connect getconnect
string temp tempid
connect recoveri manag connectionrecoverymanag trial
system current time milli currenttimemilli
uuid random uuid randomuuid string tostr
temp tempid temp prefix temp prefix
prepar statement preparedstat prep conn execut stmt executestmt select meta sql selectmetasql object temp tempid
prep result set getresultset
event row exist
conn execut stmt executestmt insert temp sql inserttempsql object temp tempid long
except
convert insert record
string msg creat record
log error msg
data store except datastoreexcept msg
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
conn execut stmt executestmt updat data sql updatedatasql object wrapper temp tempid
system current time milli currenttimemilli
length posit getposit
data identifi dataidentifi identifi data identifi dataidentifi digest digest
identifi usesidentifi identifi
identifi string tostr
updat datastor set length modifi
exist select datastor
prepar statement preparedstat prep conn execut stmt executestmt updat sql updatesql object
long length long
temp tempid
count prep updat count getupdatecount
count
updat count mean row exist
delet datastor
conn execut stmt executestmt delet sql deletesql object temp tempid
select length modifi datastor
prep conn execut stmt executestmt select meta sql selectmetasql object
prep result set getresultset
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
databas helper databasehelp close silent closesil
put back putback conn
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
connect recoveri manag connectionrecoverymanag conn connect getconnect
iter arrai list arraylist inus kei set keyset iter
hasnext
data identifi dataidentifi identifi data identifi dataidentifi
identifi
touch identifi
delet datastor modifi
prepar statement preparedstat prep conn execut stmt executestmt delet older sql deleteoldersql long long min
prep updat count getupdatecount
except
convert delet record
put back putback conn
inheritdoc
iter identifi getallidentifi data store except datastoreexcept
connect recoveri manag connectionrecoverymanag conn connect getconnect
arrai list arraylist list arrai list arraylist
result set resultset
select datastor
prepar statement preparedstat prep conn execut stmt executestmt select sql selectallsql object
prep result set getresultset
string string getstr
start startswith temp prefix temp prefix
data identifi dataidentifi identifi data identifi dataidentifi
list add identifi
list iter
except
convert read record
databas helper databasehelp close silent closesil
put back putback conn
inheritdoc
min record length getminrecordlength
min record length minrecordlength
set minimum object length
maximum
param minrecordlength length
set min record length setminrecordlength min record length minrecordlength
min record length minrecordlength min record length minrecordlength
inheritdoc
data record datarecord record getrecord data identifi dataidentifi identifi data store except datastoreexcept
connect recoveri manag connectionrecoverymanag conn connect getconnect
identifi usesidentifi identifi
result set resultset
string identifi string tostr
select length modifi datastor
prepar statement preparedstat prep conn execut stmt executestmt select meta sql selectmetasql object
prep result set getresultset
data store except datastoreexcept record found identifi
length long getlong
modifi lastmodifi long getlong
touch identifi modifi lastmodifi
data record dbdatarecord identifi length modifi lastmodifi
except
convert read identifi identifi
databas helper databasehelp close silent closesil
put back putback conn
open input stream method set field caller
close input stream read
param inputstream databas input stream object
param identifi data identifi
throw datastoreexcept data store access
identifi invalid
input stream inputstream open stream openstream input stream dbinputstream input stream inputstream data identifi dataidentifi identifi data store except datastoreexcept
connect recoveri manag connectionrecoverymanag conn
result set resultset
conn connect getconnect
select data datastor
prepar statement preparedstat prep conn execut stmt executestmt select data sql selectdatasql object identifi string tostr
prep result set getresultset
data store except datastoreexcept record found identifi
input stream inputstream stream binari stream getbinarystream
stream
stream byte arrai input stream bytearrayinputstream
databas helper databasehelp close silent closesil
put back putback conn
copi read copywhenread
copi read creat temp file close stream
file temp move temp file movetotempfil stream
stream temp file input stream tempfileinputstream temp
databas helper databasehelp close silent closesil
put back putback conn
stream buffer input stream bufferedinputstream stream
input stream inputstream set connect setconnect conn
input stream inputstream set result set setresultset
stream
except
databas helper databasehelp close silent closesil
put back putback conn
convert retriev databas resourc
inheritdoc
init string home dir homedir data store except datastoreexcept
init databas type initdatabasetyp
connect pool connectionpool pool max connect maxconnect
connect recoveri manag connectionrecoverymanag conn connect getconnect
databas meta data databasemetadata meta conn connect getconnect meta data getmetadata
log info jdbc driver meta driver getdrivernam meta driver version getdriververs
meta driver version getdriververs
result set resultset meta tabl gettabl schema object prefix schemaobjectprefix tabl sql tablesql
exist
close
exist
conn execut stmt executestmt creat tabl sql createtablesql
put back putback conn
except
convert init data store driver driver url url user user
schemaobjectprefix schema object prefix schemaobjectprefix tablesql tabl sql tablesql createtablesql creat tabl sql createtablesql
init databas type initdatabasetyp data store except datastoreexcept
fail found failifnotfound
databas type databasetyp
url start startswith jdbc
fail found failifnotfound
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
modifi lastmodifi min modifi date minmodifiedd
system current time milli currenttimemilli
long long
connect recoveri manag connectionrecoverymanag conn connect getconnect
updat datastor set modifi modifi
conn execut stmt executestmt updat modifi sql updatelastmodifiedsql object
identifi string tostr
except
convert updat lastmodifi
put back putback conn
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
inheritdoc
close
arrai list arraylist list connect pool connectionpool getal
list size
connect recoveri manag connectionrecoverymanag conn connect recoveri manag connectionrecoverymanag list
conn close
list clear
identifi usesidentifi data identifi dataidentifi identifi
inus put identifi weak refer weakrefer identifi
inheritdoc
clear clearinus
inus clear
messag digest messagedigest digest getdigest data store except datastoreexcept
messag digest messagedigest instanc getinst digest
algorithm except nosuchalgorithmexcept
convert algorithm digest
connect recoveri manag connectionrecoverymanag connect getconnect data store except datastoreexcept
connect recoveri manag connectionrecoverymanag conn connect recoveri manag connectionrecoverymanag connect pool connectionpool
conn set auto reconnect setautoreconnect
conn
interrupt except interruptedexcept
data store except datastoreexcept interrupt
repositori except repositoryexcept
data store except datastoreexcept open connect
put back putback connect recoveri manag connectionrecoverymanag conn data store except datastoreexcept
connect pool connectionpool add conn
interrupt except interruptedexcept
data store except datastoreexcept interrupt
maximum number concurr connect
return maximum number connect
max connect getmaxconnect
max connect maxconnect
set maximum number concurr connect pool
connect requir garbag collect process
param maxconnect
set max connect setmaxconnect max connect maxconnect
max connect maxconnect max connect maxconnect
creat connect
return connect
connect recoveri manag connectionrecoverymanag creat connect createnewconnect repositori except repositoryexcept
connect recoveri manag connectionrecoverymanag conn connect recoveri manag connectionrecoverymanag driver url user password
conn
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
