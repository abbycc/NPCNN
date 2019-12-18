org apach jackrabbit server jcr
org apach log4j logger
org apach jackrabbit webdav
org apach jackrabbit webdav jcr jcr dav except jcrdavexcept
org apach jackrabbit client repositori access servlet repositoryaccessservlet
javax jcr
javax servlet servlet except servletexcept
java util hash map hashmap
java util hash set hashset
code jcrwebdavserv code
jcr webdav server jcrwebdavserv dav session provid davsessionprovid
default logger
logger log logger logger getlogg jcr webdav server jcrwebdavserv
session cach
session cach sessioncach cach session cach sessioncach
jcr repositori
repositori repositori
creat jcrwebdavserv oper repositori
param repositori
jcr webdav server jcrwebdavserv repositori repositori
repositori repositori
davsessionprovid interfac
acquir davsess session cach creat
login repositori
success webdavrequest refer session
param request
throw davexcept session obtain
davsessionprovid acquiresess org apach jackrabbit webdav webdavrequest
acquir session acquiresess webdav request webdavrequest request
dav except davexcept
dav session davsess session cach request
request set dav session setdavsess session
releas refer request session
refer session exist session remov
cach
param request
davsessionprovid releasesess org apach jackrabbit webdav webdavrequest
releas session releasesess webdav request webdavrequest request
dav session davsess session request dav session getdavsess
session
session remov refer removerefer request
remov session request
request set dav session setdavsess
privat class implement code davsess code interfac
dav session impl davsessionimpl dav session davsess
underlai jcr session
session session
privat constructor
param request
throw davexcept case link javax jcr loginexcept link javax jcr repositoryexcept occur
dav session impl davsessionimpl dav servlet request davservletrequest request dav except davexcept
string workspac workspacenam request request locat getrequestloc workspac getworkspacenam
credenti cred repositori access servlet repositoryaccessservlet credenti header getcredentialsfromhead request header gethead dav constant davconst header author header author
session repositori login cred workspac workspacenam
login except loginexcept
loginexcept result unauthor
jcr dav except jcrdavexcept
repositori except repositoryexcept
repositoryexcept result forbidden
jcr dav except jcrdavexcept
servlet except servletexcept
dav except davexcept dav servlet respons davservletrespons intern server error intern server error messag getmessag
add refer code davsess code
davsess addrefer object
add refer addrefer object refer
cach add refer addrefer refer
remov refer code davsess code
refer present code davsess code remov
intern cach underlai session releas call
link javax jcr session logout
davsess removerefer object
remov refer removerefer object refer
cach remov refer removerefer refer
davsess getrepositorysess
session repositori session getrepositorysess
session
davsess addlocktoken string
add lock token addlocktoken string token
session add lock token addlocktoken token
davsess getlocktoken
string lock token getlocktoken
session lock token getlocktoken
davsess removelocktoken string
remov lock token removelocktoken string token
session remov lock token removelocktoken token
privat class provid cach referenc session object
session cach sessioncach
session map sessionmap session map sessionmap session map sessionmap
hash map hashmap refer session map referencetosessionmap hash map hashmap
retriev code davsess code transactionid
subscriptionid present request header cach session
found code null code return
param request
return cach code davsess code code null code
throw davexcept
dav session davsess webdav request webdavrequest request
dav except davexcept
string txid request transact gettransactionid
string subscript subscriptionid request subscript getsubscriptionid
string lock token locktoken request lock token getlocktoken
lock token locktoken txid subscript subscriptionid
dav except davexcept dav servlet respons davservletrespons precondit fail precondit fail ambigu header transactionid lock token subscriptionid present
dav session davsess session
retriev cach session
lock token locktoken refer containsrefer lock token locktoken
session session refer getsessionbyrefer lock token locktoken
txid refer containsrefer txid
session session refer getsessionbyrefer txid
subscript subscriptionid refer containsrefer subscript subscriptionid
session session refer getsessionbyrefer subscript subscriptionid
cach session present creat
session
session dav session impl davsessionimpl request
session map sessionmap put session hash set hashset
log info login user session repositori session getrepositorysess user getuserid log
log info login retriev cach session user session repositori session getrepositorysess user getuserid
add refer addrefer session request
session
add refer code davsess code
param session
param refer
add refer addrefer dav session davsess session object refer
hash set hashset refer set referenceset session map sessionmap session
refer set referenceset
refer set referenceset add refer
refer session map referencetosessionmap put refer session
log error fail add refer session entri cach found
remov refer code davsess code
param session
param refer
remov refer removerefer dav session davsess session object refer
hash set hashset refer set referenceset session map sessionmap session
refer set referenceset
refer set referenceset remov refer
log info remov refer refer session session
refer session map referencetosessionmap remov refer
log warn fail remov refer refer session session
refer set referenceset empti isempti
log info refer present webdav session clean
session map sessionmap remov session
log info login user session repositori session getrepositorysess user getuserid log
session repositori session getrepositorysess logout
log debug refer set referenceset size refer remain webdav session session
log error fail remov refer session entri cach found
return true exist code davsess code cach
referenc object
param refer
return true code davsess code referenc
object
refer containsrefer object refer
refer session map referencetosessionmap kei containskei refer
return code davsess code referenc
refer object
param refer
return code davsess code referenc refer
object
containsrefer object
dav session davsess session refer getsessionbyrefer object refer
dav session davsess refer session map referencetosessionmap refer
simpl class extend link hashmap
session map sessionmap hash map hashmap
hash set hashset dav session davsess kei
hash set hashset kei
hash set hashset put dav session davsess kei hash set hashset
hash set hashset put kei
hash set hashset remov dav session davsess kei
hash set hashset remov kei
