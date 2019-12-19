org apach jackrabbit core persist pool
org apach jackrabbit core persist context pmcontext
extend link bundledbpersistencemanag specif code
configur
pre
persistencemanag class org apach jackrabbit core persist pool h2persistencemanag
param link setbundlecaches string bundlecaches
param link setconsistencycheck string consistencycheck fals
param link setminblobs string minblobs
param link setdriv string driver org driver
param link seturl string url jdbc file wsp home itemst
param link setus string user
param link setpassword string password
param link setschema string schema
param link setschemaobjectprefix string schemaobjectprefix
param link seterrorhandl string errorhandl
param link setlocktimeout string locktimeout
persistencemanag
pre
persist manag h2persistencemanag bundl persist manag bundledbpersistencemanag
lock time
lock timeout locktimeout
return lock timeout
return lock timeout
string lock timeout getlocktimeout
string valueof lock timeout locktimeout
set lock timeout millisecond
param locktimeout lock timeout
set lock timeout setlocktimeout string lock timeout locktimeout
lock timeout locktimeout long pars long parselong lock timeout locktimeout
inheritdoc
init context pmcontext context except
init default valu
driver getdriv
set driver setdriv org driver
url geturl
set url seturl jdbc file context home dir gethomedir path getpath itemst
databas type getdatabasetyp
set databas type setdatabasetyp
schema object prefix getschemaobjectprefix
set schema object prefix setschemaobjectprefix
init context
con helper conhelp exec set lock timeout lock timeout locktimeout
