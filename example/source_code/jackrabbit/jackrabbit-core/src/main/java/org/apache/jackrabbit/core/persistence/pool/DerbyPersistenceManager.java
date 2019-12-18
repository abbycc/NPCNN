org apach jackrabbit core persist pool
org apach jackrabbit core persist context pmcontext
org apach jackrabbit core util connect helper connectionhelp
org apach jackrabbit core util derbi connect helper derbyconnectionhelp
java sql connect
java sql sql except sqlexcept
javax sql data sourc datasourc
extend link bundledbpersistencemanag derbi specif code
configur
param link setbundlecaches string bundlecaches
param link setconsistencycheck string consistencycheck fals
param link setminblobs string minblobs
param link setdriv string driver org apach derbi jdbc embeddeddriv
param link seturl string url jdbc derbi wsp home itemst creat true
param link setus string user
param link setpassword string password
param link setschema string schema derbi
param link setschemaobjectprefix string schemaobjectprefix
param link seterrorhandl string errorhandl
derbi relat
param link setderbystorageinitialpag string derbystorageinitialpag
param link setderbystorageminimumrecords string derbystorageminimumrecords
param link setderbystoragepagecaches string derbystoragepagecaches
param link setderbystoragepagereservedspac string derbystoragepagereservedspac
param link setderbystoragepages string derbystoragepages
derbi persist manag derbypersistencemanag bundl persist manag bundledbpersistencemanag
embed driver
string derbi embed driver derbi embed driver org apach derbi jdbc embeddeddriv
setderbystorageinitialpag string
derbi storag initi page derbystorageinitialpag
setderbystorageminimumrecords string
derbi storag minimum record size derbystorageminimumrecords
setderbystoragepagecaches string
derbi storag page cach size derbystoragepagecaches
setderbystoragepagereservedspac string
derbi storag page reserv space derbystoragepagereservedspac
setderbystoragepages string
derbi storag page size derbystoragepages
setderbystorageinitialpag
return initi page properti
string derbi storag initi page getderbystorageinitialpag
string valueof derbi storag initi page derbystorageinitialpag
disk size derbi tabl grow page time
page user data page total disk
overhead alloc grow page time
derbi tabl index creat number page
pre alloc properti prior creat tabl
creat index statement
defin number user page tabl index creat
purpos properti prealloc tabl index
reason size user expect larg amount data
insert tabl index tabl index
pre alloc page enjoi small perform improv
tabl index pre alloc page data load
total desir size tabl index
strong derbi storag initialpag derbi storag pages byte strong
creat tabl index set properti derbi
attempt prealloc request number user page
oper fail unabl prealloc
request number page long alloc page
default code code
param derbystorageinitialpag number initi page
set derbi storag initi page setderbystorageinitialpag string derbi storag initi page derbystorageinitialpag
derbi storag initi page derbystorageinitialpag
integ decod derbi storag initi page derbystorageinitialpag int intvalu
setderbystorageminimumrecords
return minimum record size
string derbi storag minimum record size getderbystorageminimumrecords
string valueof derbi storag minimum record size derbystorageminimumrecords
minimum user row size byte disk databas page
tabl creat tabl properti ensur
room row grow page updat
overflow gener varchar
varchar bit data data type tabl updat lot
row start small grow due updat reserv
space time insert minim row overflow due updat
result wast space set properti prior issu
creat tabl statement
default code code
param derbystorageminimumrecords minimum record size
set derbi storag minimum record size setderbystorageminimumrecords string derbi storag minimum record size derbystorageminimumrecords
derbi storag minimum record size derbystorageminimumrecords
integ decod derbi storag minimum record size derbystorageminimumrecords int intvalu
setderbystoragepagecaches
return page cach size
string derbi storag page cach size getderbystoragepagecaches
string valueof derbi storag page cach size derbystoragepagecaches
defin size number page database' data page cach
data page memori actual amount memori page cach
depend
size cach configur link setderbystoragepagecaches
size page configur link setderbystoragepages
overhead vari jvm
increas size page cach typic
memori java heap start embed applic
take consider memori embed
applic default page size
page cach size page requir memori
overhead
minimum page lower derbi
default
default code code 16mb memori usag
default page size
param derbystoragepagecaches page cach size
set derbi storag page cach size setderbystoragepagecaches string derbi storag page cach size derbystoragepagecaches
derbi storag page cach size derbystoragepagecaches
integ decod derbi storag page cach size derbystoragepagecaches int intvalu
setderbystoragepagereservedspac
return page reserv space
string derbi storag page reserv space getderbystoragepagereservedspac
string valueof derbi storag page reserv space derbystoragepagereservedspac
defin percentag space reserv updat disk
databas page tabl index percentag
space free page insert leav reserv space
page minim row overflow perform hit
updat page fill reserv space
threshold row allow page reserv space
row increas size updat
insert set properti prior issu creat tabl statement
derbi storag pagereservedspac empti page
accept row
default code code
param derbystoragepagereservedspac page reserv space
set derbi storag page reserv space setderbystoragepagereservedspac string derbi storag page reserv space derbystoragepagereservedspac
derbi storag page reserv space derbystoragepagereservedspac
integ decod derbi storag page reserv space derbystoragepagereservedspac int intvalu
setderbystoragepages
return page size
string derbi storag page size getderbystoragepages
string valueof derbi storag page size derbystoragepages
defin page size byte disk databas page tabl
index tabl index creation page size
valu set properti
prior issu creat tabl creat index statement
lifetim newli creat conglomer
default code code
param derbystoragepages storag page size
set derbi storag page size setderbystoragepages string derbi storag page size derbystoragepages
derbi storag page size derbystoragepages integ decod derbi storag page size derbystoragepages int intvalu
inheritdoc
init context pmcontext context except
init default valu
driver getdriv
set driver setdriv derbi embed driver derbi embed driver
databas type getdatabasetyp
set databas type setdatabasetyp derbi
url geturl
set url seturl jdbc derbi context home dir gethomedir path getpath itemst creat true
schema object prefix getschemaobjectprefix
set schema object prefix setschemaobjectprefix
init context
set properti
derbi embed driver derbi embed driver equal driver getdriv
con helper conhelp exec call sysc util sysc set databas properti
'derbi storag initialpages' derbi storag initi page derbystorageinitialpag
con helper conhelp exec call sysc util sysc set databas properti
'derbi storag minimumrecordsize' derbi storag minimum record size derbystorageminimumrecords
con helper conhelp exec call sysc util sysc set databas properti
'derbi storag pagecachesize' derbi storag page cach size derbystoragepagecaches
con helper conhelp exec call sysc util sysc set databas properti
'derbi storag pagereservedspace' derbi storag page reserv space derbystoragepagereservedspac
con helper conhelp exec call sysc util sysc set databas properti 'derbi storag pagesize'
derbi storag page size derbystoragepages
inheritdoc
overrid
connect helper connectionhelp creat connect helper createconnectionhelp data sourc datasourc data src datasrc
derbi connect helper derbyconnectionhelp data src datasrc block connect loss blockonconnectionloss
inheritdoc
derbi handl binari index long long kei
return link bundledbpersistencemanag longlong kei
storag model getstoragemodel
bundl persist manag bundledbpersistencemanag longlong kei longlong kei
close connect shut embed derbi
databas
throw sqlexcept error occur
databasepersistencemanag closeconnect connect
close except
close
derbi connect helper derbyconnectionhelp con helper conhelp shut shutdown driver getdriv
