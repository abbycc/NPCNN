org apach jackrabbit core persist pool
org apach jackrabbit core persist context pmcontext
extend link bundledbpersistencemanag mysql specif code
configur
param link setbundlecaches string bundlecaches
param link setconsistencycheck string consistencycheck fals
param link setminblobs string minblobs
param link setdriv string driver org gjt mysql driver
param link seturl string url
param link setus string user
param link setpassword string password
param link setschema string schema mysql
param link setschemaobjectprefix string schemaobjectprefix
param link seterrorhandl string errorhandl
sql persist manag mysqlpersistencemanag bundl persist manag bundledbpersistencemanag
inheritdoc
init context pmcontext context except
init default valu
driver getdriv
set driver setdriv org gjt mysql driver
databas type getdatabasetyp
set databas type setdatabasetyp mysql
init context
