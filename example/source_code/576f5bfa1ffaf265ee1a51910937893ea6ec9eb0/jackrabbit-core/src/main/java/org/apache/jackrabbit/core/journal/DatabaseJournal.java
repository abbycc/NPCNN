org apach jackrabbit core journal
org apach jackrabbit core persist bundl util connect factori connectionfactori
org apach jackrabbit spi common namespac namespac resolv namespaceresolv
org apach jackrabbit util text
org slf4j logger
org slf4j logger factori loggerfactori
java buffer reader bufferedread
java file
java except ioexcept
java input stream inputstream
java input stream reader inputstreamread
java sql connect
java sql databas meta data databasemetadata
java sql prepar statement preparedstat
java sql result set resultset
java sql sql except sqlexcept
java sql statement
java util calendar
javax jcr repositori except repositoryexcept
databas base journal implement store record insid databas tabl name
code journal code tabl code global revis code
highest revis number tabl locat insid schema
code schemaobjectprefix code
configur properti
code driver code jdbc driver class requir
properti default
code url code jdbc connect url requir properti
default
code databasetyp code databas type
field insid jdbc connect url delimit colon
code schemaobjectprefix code schema object prefix
default empti string
code user code usernam connect
code password code password connect
code reconnectdelaym code number millisecond wait
reconnect databas
code janitoren code specifi clean thread
journal tabl enabl default code fals code
code janitorsleep code specifi sleep time clean thread
second clean thread enabl default
equal hour
code janitorfirstrunhourofdai code specifi hour clean
thread initi run default code code mean night
jndi connect case javax name initialcontext driver
jndi url user password configur jndi resourc
configur jndi set
pre
param driver javax name initialcontext
param url java comp env jdbc test
pre
databas journal databasejourn abstract journal abstractjourn
schema object prefix
string schema object prefix variabl schema object prefix variabl
schemaobjectprefix
default ddl script
string default ddl default ddl default ddl
default journal tabl check schema complet
string default journal tabl default journal tabl journal
local revis tabl check schema complet
string local revis tabl local revis tabl local revis
default reconnect delai millisecond
default reconnect delai default reconnect delai
logger
logger log logger factori loggerfactori logger getlogg databas journal databasejourn
driver bean properti
string driver
connect url bean properti
string url
databas type bean properti
string databas type databasetyp
user bean properti
string user
password bean properti
string password
reconnect delai millisecond bean properti
reconnect delai reconnectdelaym
jdbc connect
connect connect
statement return revis rang
prepar statement preparedstat select revis stmt selectrevisionsstmt
statement updat global revis
prepar statement preparedstat updat global stmt updateglobalstmt
statement return global revis
prepar statement preparedstat select global stmt selectglobalstmt
statement append record
prepar statement preparedstat insert revis stmt insertrevisionstmt
statement return minimum local revis
prepar statement preparedstat select min local revis stmt selectminlocalrevisionstmt
statement remov set revis journal tabl
prepar statement preparedstat clean revis stmt cleanrevisionstmt
statement return local revis cluster node
prepar statement preparedstat local revis stmt getlocalrevisionstmt
statement insert local revis cluster node
prepar statement preparedstat insert local revis stmt insertlocalrevisionstmt
statement updat local revis cluster node
prepar statement preparedstat updat local revis stmt updatelocalrevisionstmt
auto commit level
lock level locklevel
lock revis
lock revis lockedrevis
time millisecond reattempt connect databas
reconnect time reconnecttimem
revis tabl janitor thread enabl
janitor enabl janitoren
sleep time revis tabl janitor second dai default
janitor sleep janitorsleep
run janitor schedul
run schedul default hour
calendar janitor run janitornextrun calendar instanc getinst
janitor run janitornextrun calendar hour dai hour dai
janitor run janitornextrun add calendar dai month dai month
janitor run janitornextrun set calendar hour dai hour dai
janitor run janitornextrun set calendar minut
janitor run janitornextrun set calendar
janitor run janitornextrun set calendar millisecond
instanc manag local revis
databas revis databaserevis databas revis databaserevis
sql statement return revis rang
string select revis stmt sql selectrevisionsstmtsql
sql statement updat global revis
string updat global stmt sql updateglobalstmtsql
sql statement return global revis
string select global stmt sql selectglobalstmtsql
sql statement append record
string insert revis stmt sql insertrevisionstmtsql
sql statement return minimum local revis
string select min local revis stmt sql selectminlocalrevisionstmtsql
sql statement remov set revis journal tabl
string clean revis stmt sql cleanrevisionstmtsql
sql statement return local revis cluster node
string local revis stmt sql getlocalrevisionstmtsql
sql statement insert local revis cluster node
string insert local revis stmt sql insertlocalrevisionstmtsql
sql statement updat local revis cluster node
string updat local revis stmt sql updatelocalrevisionstmtsql
schema object prefix bean properti
string schema object prefix schemaobjectprefix
inheritdoc
init string namespac resolv namespaceresolv resolv
journal except journalexcept
init resolv
provid valid default argument
schema object prefix schemaobjectprefix
schema object prefix schemaobjectprefix
reconnect delai reconnectdelaym
reconnect delai reconnectdelaym default reconnect delai default reconnect delai
init
connect connect getconnect
set auto commit setautocommit connect
check schema checkschema
build sql statement buildsqlstat
prepar statement preparestat
init instanc revis janitor initinstancerevisionandjanitor
except
string msg unabl creat connect
journal except journalexcept msg
log info databasejourn initi
complet initi databas journal base implement
check requir bean properti code driver code
code url code option deduc valid
databas type overridden subclass
creat connect requir argument
getconnect
throw journalexcept initi fail
init journal except journalexcept
driver
string msg driver
journal except journalexcept msg
url
string msg connect url
journal except journalexcept msg
databas type databasetyp
databas type databasetyp databas type url getdatabasetypefromurl url
illeg argument except illegalargumentexcept
string msg unabl deriv databas type url messag getmessag
journal except journalexcept msg
class fornam driver
class found except classnotfoundexcept
string msg unabl load driver class
journal except journalexcept msg
initi instanc revis manag janitor thread
throw journalexcept error
init instanc revis janitor initinstancerevisionandjanitor except
databas revis databaserevis databas revis databaserevis
make local revis tabl exist checkschema call jcr
check local revis schema checklocalrevisionschema
local file revis disk upgrad jcr
local file revis localfilerevis
revis getrevis
instanc revis instancerevis current file revis currentfilerevis file revis filerevis file revis getrevis
local file revis localfilerevis current file revis currentfilerevis
current file revis currentfilerevis close
write localfilerevis exist local revis
tabl local revis tabl entri cluster node
local revis localrevis databas revis databaserevis init local file revis localfilerevis
log info initi local revis local revis localrevis
start clean thread
janitor enabl janitoren
thread thread revis tabl janitor revisiontablejanitor clusterrevisionjanitor
set daemon setdaemon
start
log info cluster revis janitor thread start run schedul janitor run janitornextrun time gettim
log info cluster revis janitor thread start
javadoc
org apach jackrabbit core journal journal getinstancerevis
instanc revis instancerevis instanc revis getinstancerevis journal except journalexcept
databas revis databaserevis
creat databas connect method call insid
link init string org apach jackrabbit namespaceresolv
connect drop reacquir base
implement code java sql drivermanag code
connect overridden subclass
init
return connect
throw journalexcept driver load
throw sqlexcept connect establish
connect connect getconnect sql except sqlexcept journal except journalexcept
connect factori connectionfactori connect getconnect driver url user password
repositori except repositoryexcept
string msg unabl load driver class
journal except journalexcept msg
deriv databas type jdbc connect url simpli treat url
delimet colon take 2nd field
param url jdbc connect url
return databas type
throw illegalargumentexcept jdbc connect url invalid
string databas type url getdatabasetypefromurl string url illeg argument except illegalargumentexcept
start url index indexof
start
end url index indexof start
end
url substr start end
illeg argument except illegalargumentexcept url
inheritdoc
record iter recorditer record getrecord start revis startrevis
journal except journalexcept
check connect checkconnect
select revis stmt selectrevisionsstmt clear paramet clearparamet
select revis stmt selectrevisionsstmt clear warn clearwarn
select revis stmt selectrevisionsstmt set long setlong start revis startrevis
select revis stmt selectrevisionsstmt execut
databas record iter databaserecorditer
select revis stmt selectrevisionsstmt result set getresultset resolv getresolv path resolv getnamepathresolv
sql except sqlexcept
close
string msg unabl return record iter
journal except journalexcept msg
inheritdoc
record iter recorditer record getrecord journal except journalexcept
check connect checkconnect
select revis stmt selectrevisionsstmt clear paramet clearparamet
select revis stmt selectrevisionsstmt clear warn clearwarn
select revis stmt selectrevisionsstmt set long setlong long min min
select revis stmt selectrevisionsstmt execut
databas record iter databaserecorditer
select revis stmt selectrevisionsstmt result set getresultset resolv getresolv path resolv getnamepathresolv
sql except sqlexcept
close
string msg unabl return record iter
journal except journalexcept msg
inheritdoc
journal lock increment current tabl
name code global revis code effect write lock
tabl updat save rememb
append record save entail multipl append jcr
lock dolock journal except journalexcept
result set resultset
succeed
check connect checkconnect
lock level locklevel
set auto commit setautocommit connect
sql except sqlexcept
close
string msg unabl set autocommit fals
journal except journalexcept msg
updat global stmt updateglobalstmt clear paramet clearparamet
updat global stmt updateglobalstmt clear warn clearwarn
updat global stmt updateglobalstmt execut
select global stmt selectglobalstmt clear paramet clearparamet
select global stmt selectglobalstmt clear warn clearwarn
select global stmt selectglobalstmt execut
select global stmt selectglobalstmt result set getresultset
journal except journalexcept revis
lock revis lockedrevis long getlong
succeed
sql except sqlexcept
close
string msg unabl lock global revis tabl
journal except journalexcept msg
close
succeed
unlock dounlock
inheritdoc
unlock dounlock success
lock level locklevel
success
commit connect
rollback connect
set auto commit setautocommit connect
inheritdoc
save lock revis insid newli append record
append append record appendrecord record
record set revis setrevis lock revis lockedrevis
inheritdoc
save revis record
append append record appendrecord record input stream inputstream length
journal except journalexcept
check connect checkconnect
insert revis stmt insertrevisionstmt clear paramet clearparamet
insert revis stmt insertrevisionstmt clear warn clearwarn
insert revis stmt insertrevisionstmt set long setlong record revis getrevis
insert revis stmt insertrevisionstmt set string setstr getid
insert revis stmt insertrevisionstmt set string setstr record produc getproducerid
insert revis stmt insertrevisionstmt set binari stream setbinarystream length
insert revis stmt insertrevisionstmt execut
sql except sqlexcept
close
string msg unabl append revis lock revis lockedrevis
journal except journalexcept msg
inheritdoc
close
close
close databas connect statement close due
error occur calcul time reconnect
attempt
param failur close due failur
close failur
failur
reconnect time reconnecttimem system current time milli currenttimemilli reconnect delai reconnectdelaym
close select revis stmt selectrevisionsstmt
select revis stmt selectrevisionsstmt
close updat global stmt updateglobalstmt
updat global stmt updateglobalstmt
close select global stmt selectglobalstmt
select global stmt selectglobalstmt
close insert revis stmt insertrevisionstmt
insert revis stmt insertrevisionstmt
close select min local revis stmt selectminlocalrevisionstmt
select min local revis stmt selectminlocalrevisionstmt
close clean revis stmt cleanrevisionstmt
clean revis stmt cleanrevisionstmt
close local revis stmt getlocalrevisionstmt
local revis stmt getlocalrevisionstmt
close insert local revis stmt insertlocalrevisionstmt
insert local revis stmt insertlocalrevisionstmt
close updat local revis stmt updatelocalrevisionstmt
updat local revis stmt updatelocalrevisionstmt
close connect
connect
set autocommit flag connect connect
pass code null code log except warn
param connect databas connect
param autocommit enabl disabl autocommit
set auto commit setautocommit connect connect auto commit autocommit
connect
jcr setter fail manag connect
connect auto commit getautocommit auto commit autocommit
connect set auto commit setautocommit auto commit autocommit
sql except sqlexcept
string msg unabl set autocommit flag auto commit autocommit
log warn msg
commit connect connect pass
code null code log except warn
param connect connect
commit connect connect
connect
connect commit
sql except sqlexcept
string msg error commit connect messag getmessag
log warn msg
rollback connect connect pass
code null code log except warn
param connect connect
rollback connect connect
connect
connect rollback
sql except sqlexcept
string msg error roll back connect messag getmessag
log warn msg
close databas connect connect
pass code null code log except warn
param connect databas connect
close connect connect
connect
connect close
sql except sqlexcept
string msg error close connect messag getmessag
log warn msg
close input stream input stream
pass code null code log except warn
param input stream code null code
close input stream inputstream
close
except ioexcept
string msg error close input stream messag getmessag
log warn msg
close statement statement
pass code null code log except warn
param stmt statement code null code
close statement stmt
stmt
stmt close
sql except sqlexcept
string msg error close statement messag getmessag
log warn msg
close resultset result set
pass code null code log except warn
param resultset code null code
close result set resultset
close
sql except sqlexcept
string msg error close result set messag getmessag
log warn msg
check establish connect connect longer
exist wait code reconnecttimem code pass
error occur recreat connect
check connect checkconnect sql except sqlexcept journal except journalexcept
connect
delai delaym reconnect time reconnecttimem system current time milli currenttimemilli
delai delaym
thread sleep delai delaym
interrupt except interruptedexcept
ignor
connect connect getconnect
prepar statement preparestat
check requir schema object exist creat
exist
throw except error occur
check schema checkschema except
tabl exist tableexist connect meta data getmetadata schema object prefix schemaobjectprefix default journal tabl default journal tabl tableexist connect getmetadata schemaobjectprefix default journal tabl read ddl resourc
input stream inputstream databas journal databasejourn resourc stream getresourceasstream databas type databasetyp ddl
string msg databas specif ddl found databas type databasetyp ddl
fall back default ddl default ddl
log info msg
databas journal databasejourn resourc stream getresourceasstream default ddl default ddl
msg unabl load default ddl default ddl
journal except journalexcept msg
buffer reader bufferedread reader buffer reader bufferedread input stream reader inputstreamread
statement stmt connect creat statement createstat
string sql reader read line readlin
sql
skip comment empti line
sql start startswith sql length
replac prefix variabl
sql creat schema sql createschemasql sql
execut sql stmt
stmt execut updat executeupd sql
read sql stmt
sql reader read line readlin
close
close stmt
check local revis schema object exist creat
exist
throw except error occur
check local revis schema checklocalrevisionschema except
tabl exist tableexist connect meta data getmetadata schema object prefix schemaobjectprefix local revis tabl local revis tabl
log info creat schema object prefix schemaobjectprefix local revis tabl local revis tabl tabl
read ddl resourc
input stream inputstream databas journal databasejourn resourc stream getresourceasstream databas type databasetyp ddl
string msg databas specif ddl found databas type databasetyp ddl
fall back default ddl default ddl
log info msg
databas journal databasejourn resourc stream getresourceasstream default ddl default ddl
msg unabl load default ddl default ddl
journal except journalexcept msg
buffer reader bufferedread reader buffer reader bufferedread input stream reader inputstreamread
statement stmt connect creat statement createstat
string sql reader read line readlin
sql
skip comment empti line select statement
creat local revis tabl
sql start startswith sql length
sql index indexof local revis tabl local revis tabl
replac prefix variabl
sql creat schema sql createschemasql sql
execut sql stmt
stmt execut updat executeupd sql
read sql stmt
sql reader read line readlin
close
close stmt
check requir tabl exist schema
overridden subclass tabl name
param metadata databas meta data
return code true code schema exist
throw sqlexcept sql error occur
tabl exist tableexist databas meta data databasemetadata meta data metadata string tabl tablenam
sql except sqlexcept
meta data metadata store lower case identifi storeslowercaseidentifi
tabl tablenam tabl tablenam lower case tolowercas
meta data metadata store upper case identifi storesuppercaseidentifi
tabl tablenam tabl tablenam upper case touppercas
result set resultset meta data metadata tabl gettabl tabl tablenam
close
creat sql statement schema creation variabl substitut
param sql sql string variabl substitut
return valid sql string
string creat schema sql createschemasql string sql
text replac sql schema object prefix variabl schema object prefix variabl schema object prefix schemaobjectprefix
build sql statement overridden subclass
tabl column name
build sql statement buildsqlstat
select revis stmt sql selectrevisionsstmtsql
select revis journal produc revis data
schema object prefix schemaobjectprefix journal revis order revis
updat global stmt sql updateglobalstmtsql
updat schema object prefix schemaobjectprefix global revis
set revis revis
select global stmt sql selectglobalstmtsql
select revis
schema object prefix schemaobjectprefix global revis
insert revis stmt sql insertrevisionstmtsql
insert schema object prefix schemaobjectprefix journal
revis journal produc revis data
valu
select min local revis stmt sql selectminlocalrevisionstmtsql
select min revis schema object prefix schemaobjectprefix local revis
clean revis stmt sql cleanrevisionstmtsql
delet schema object prefix schemaobjectprefix journal revis
local revis stmt sql getlocalrevisionstmtsql
select revis schema object prefix schemaobjectprefix local revis
journal
insert local revis stmt sql insertlocalrevisionstmtsql
insert schema object prefix schemaobjectprefix local revis
revis journal valu
updat local revis stmt sql updatelocalrevisionstmtsql
updat schema object prefix schemaobjectprefix local revis
set revis journal
prepar sql statement
throw sqlexcept error occur
prepar statement preparestat sql except sqlexcept
select revis stmt selectrevisionsstmt connect prepar statement preparestat select revis stmt sql selectrevisionsstmtsql
updat global stmt updateglobalstmt connect prepar statement preparestat updat global stmt sql updateglobalstmtsql
select global stmt selectglobalstmt connect prepar statement preparestat select global stmt sql selectglobalstmtsql
insert revis stmt insertrevisionstmt connect prepar statement preparestat insert revis stmt sql insertrevisionstmtsql
select min local revis stmt selectminlocalrevisionstmt connect prepar statement preparestat select min local revis stmt sql selectminlocalrevisionstmtsql
clean revis stmt cleanrevisionstmt connect prepar statement preparestat clean revis stmt sql cleanrevisionstmtsql
local revis stmt getlocalrevisionstmt connect prepar statement preparestat local revis stmt sql getlocalrevisionstmtsql
insert local revis stmt insertlocalrevisionstmt connect prepar statement preparestat insert local revis stmt sql insertlocalrevisionstmtsql
updat local revis stmt updatelocalrevisionstmt connect prepar statement preparestat updat local revis stmt sql updatelocalrevisionstmtsql
bean getter
string driver getdriv
driver
string url geturl
url
databas type
return databas type
string databas type getdatabasetyp
databas type databasetyp
databas type
deprec
method deprec link getdatabasetyp
return databas type
string schema getschema
databas type databasetyp
string schema object prefix getschemaobjectprefix
schema object prefix schemaobjectprefix
string user getus
user
string password getpassword
password
reconnect delai getreconnectdelaym
reconnect delai reconnectdelaym
janitor enabl getjanitoren
janitor enabl janitoren
janitor sleep getjanitorsleep
janitor sleep janitorsleep
janitor run hour dai getjanitorfirstrunhourofdai
janitor run janitornextrun calendar hour dai hour dai
bean setter
set driver setdriv string driver
driver driver
set url seturl string url
url url
set databas type
param databasetyp databas type
set databas type setdatabasetyp string databas type databasetyp
databas type databasetyp databas type databasetyp
set databas type
deprec
method deprec link getdatabasetyp
param databasetyp databas type
set schema setschema string databas type databasetyp
databas type databasetyp databas type databasetyp
set schema object prefix setschemaobjectprefix string schema object prefix schemaobjectprefix
schema object prefix schemaobjectprefix schema object prefix schemaobjectprefix upper case touppercas
set user setus string user
user user
set password setpassword string password
password password
set reconnect delai setreconnectdelaym reconnect delai reconnectdelaym
reconnect delai reconnectdelaym reconnect delai reconnectdelaym
set janitor enabl setjanitoren enabl
janitor enabl janitoren enabl
set janitor sleep setjanitorsleep sleep
janitor sleep janitorsleep sleep
set janitor run hour dai setjanitorfirstrunhourofdai hour dai hourofdai
janitor run janitornextrun calendar instanc getinst
janitor run janitornextrun calendar hour dai hour dai hour dai hourofdai
janitor run janitornextrun add calendar dai month dai month
janitor run janitornextrun set calendar hour dai hour dai hour dai hourofdai
janitor run janitornextrun set calendar minut
janitor run janitornextrun set calendar
janitor run janitornextrun set calendar millisecond
class manag local revis cluster node
persist local revis local revis tabl
cluster databas
databas revis databaserevis instanc revis instancerevis
cach local revis cluster node
local revis localrevis
init method call
initi
check local revis databas
cluster node write default revis databas
param revis default local revis counter
return local revis
throw journalexcept error
init revis journal except journalexcept
check connect
check connect checkconnect
check entri databas
local revis stmt getlocalrevisionstmt clear paramet clearparamet
local revis stmt getlocalrevisionstmt clear warn clearwarn
local revis stmt getlocalrevisionstmt set string setstr getid
local revis stmt getlocalrevisionstmt execut
result set resultset local revis stmt getlocalrevisionstmt result set getresultset
exist
exist
revis long getlong
close
insert revis databas
exist
insert local revis stmt insertlocalrevisionstmt clear paramet clearparamet
insert local revis stmt insertlocalrevisionstmt clear warn clearwarn
insert local revis stmt insertlocalrevisionstmt set long setlong revis
insert local revis stmt insertlocalrevisionstmt set string setstr getid
insert local revis stmt insertlocalrevisionstmt execut
set cach local revis return
local revis localrevis revis
initi
revis
sql except sqlexcept
log warn fail initi local revis
databas journal databasejourn close
journal except journalexcept fail initi local revis
inheritdoc
initi
illeg state except illegalstateexcept instanc initi
local revis localrevis
inheritdoc
set local revis localrevis journal except journalexcept
initi
illeg state except illegalstateexcept instanc initi
updat cach tabl local revis
check connect
check connect checkconnect
updat local revis stmt updatelocalrevisionstmt clear paramet clearparamet
updat local revis stmt updatelocalrevisionstmt clear warn clearwarn
updat local revis stmt updatelocalrevisionstmt set long setlong local revis localrevis
updat local revis stmt updatelocalrevisionstmt set string setstr getid
updat local revis stmt updatelocalrevisionstmt execut
local revis localrevis local revis localrevis
sql except sqlexcept
log warn fail updat local revis
databas journal databasejourn close
inheritdoc
close
statement close databasejourn close
class maintain revis tabl
inform search index databas node type
case revis data safe thrown journal tabl
revis tabl janitor revisiontablejanitor runnabl
inheritdoc
run
thread current thread currentthread interrupt isinterrupt
log info clean run schedul janitor run janitornextrun time gettim
sleep time sleeptim janitor run janitornextrun time milli gettimeinmilli system current time milli currenttimemilli
sleep time sleeptim
thread sleep sleep time sleeptim
clean revis cleanupoldrevis
janitor run janitornextrun add calendar janitor sleep janitorsleep
interrupt except interruptedexcept
thread current thread currentthread interrupt
log info interrupt stop clean task
clean revis cluster tabl
clean revis cleanupoldrevis
min revis minrevis
check connect
check connect checkconnect
find minim local revis
select min local revis stmt selectminlocalrevisionstmt clear paramet clearparamet
select min local revis stmt selectminlocalrevisionstmt clear warn clearwarn
select min local revis stmt selectminlocalrevisionstmt execut
result set resultset select min local revis stmt selectminlocalrevisionstmt result set getresultset
clean cleanup
clean cleanup
min revis minrevis long getlong
close
clean
clean cleanup
clean revis stmt cleanrevisionstmt clear paramet clearparamet
clean revis stmt cleanrevisionstmt clear warn clearwarn
clean revis stmt cleanrevisionstmt set long setlong min revis minrevis
clean revis stmt cleanrevisionstmt execut
log info clean revis revis min revis minrevis
except
log warn fail clean revis
close
