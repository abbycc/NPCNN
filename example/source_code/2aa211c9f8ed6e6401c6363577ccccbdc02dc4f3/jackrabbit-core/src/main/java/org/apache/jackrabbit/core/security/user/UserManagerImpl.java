org apach jackrabbit core secur user
org apach jackrabbit api secur princip item base princip itembasedprincip
org apach jackrabbit api secur user authoriz
org apach jackrabbit api secur user authoriz exist except authorizableexistsexcept
org apach jackrabbit api secur user group
org apach jackrabbit api secur user queri
org apach jackrabbit api secur user user
org apach jackrabbit api secur user user manag usermanag
org apach jackrabbit core item impl itemimpl
org apach jackrabbit core node impl nodeimpl
org apach jackrabbit core protect item modifi protecteditemmodifi
org apach jackrabbit core session impl sessionimpl
org apach jackrabbit core session listen sessionlisten
org apach jackrabbit core node nodeid
org apach jackrabbit core secur system princip systemprincip
org apach jackrabbit core secur princip princip impl principalimpl
org apach jackrabbit core session session oper sessionoper
org apach jackrabbit spi
org apach jackrabbit spi path
org apach jackrabbit util text
org slf4j logger
org slf4j logger factori loggerfactori
javax jcr access deni except accessdeniedexcept
javax jcr item exist except itemexistsexcept
javax jcr item found except itemnotfoundexcept
javax jcr node
javax jcr node iter nodeiter
javax jcr repositori except repositoryexcept
javax jcr unsupport repositori oper except unsupportedrepositoryoperationexcept
javax jcr
javax jcr lock lock except lockexcept
javax jcr nodetyp constraint violat except constraintviolationexcept
javax jcr version version except versionexcept
java unsupport encod except unsupportedencodingexcept
java secur princip
java util hash set hashset
java util iter
java util element except nosuchelementexcept
java util properti
java util set
java util uuid
default implement code usermanag code interfac
characterist
user group store repositori jcr node
user creat link userconst user path group
creat link userconst group path configur
authoriz store jcr uuid properti md5 hash
order structur user group tree avoid creat flat
hierarchi addit hierarchi node type rep authorizablefold
introduc
intermedi path pass creat method
built logic intermedi path miss
built logic appli rule
name hierarchi folder determin
authoriz creat consist lead char
rel depth start node link getuserspath
link getgroupspath
default level depth creat
parent node expect consist folder structur
invalid jcr char prevent creation
node name authoriz node intermedi
hierarchi node link text escapeillegaljcrchar string escap
exampl
creat exist user 'asmith'
intermedi path result structur
pre
rep secur unstructur
rep authoriz rep authorizablefold
rep user rep authorizablefold
rep authorizablefold
rep authorizablefold
asmith rep user
pre
creat exist user 'asmith' intermedi
path 'some tree' result structur
pre
rep secur unstructur
rep authoriz rep authorizablefold
rep user rep authorizablefold
rep authorizablefold
tree rep authorizablefold
asmith rep user
pre
code usermanag code handl configur
option
link param user path defin user node creat
miss set link user path
link param group path defin group node creat
miss set link group path
link param compatibil jr16 param present
code true code authoriz
code noderesolv code found
paramet miss fals user group creat
jackrabbit repositori found
default option disabl
link param default depth paramet chang number
level default store authoriz node
expect posit integ greater default
number level
link param auto expand tree paramet present
code true code tree user group node
automat creat addit hierarchi level number node
level exce maxim allow link param auto expand size size
default option disabl
link param auto expand size paramet take effect
link param auto expand tree enabl expect
posit long greater default
user manag impl usermanagerimpl protect item modifi protecteditemmodifi
user manag usermanag user constant userconst session listen sessionlisten
configur option chang
link userconst user path default path creat user
string param user path param user path userspath
configur option chang
link userconst group path default path creat group
string param group path param group path groupspath
flag enabl minim backward compat jackrabbit
param present code true code
authoriz code noderesolv code found
paramet miss fals user group creat
jackrabbit repositori found
default option disabl
string param compatibil jr16 param compatibil jr16 compatiblejr16
paramet chang number level default
store authoriz node default number level
strong note strong chang default depth user group
creat repositori inconsist due
fact resolut authoriz reli
structur defin default depth
recommend remov authoriz node
reachabl config option chang
default depth increas
authoriz level default depth reachabl
default depth decreas
authoriz level default depth reachabl
link param auto expand tree flag set code true code
string param default depth param default depth defaultdepth
paramet present code true code tree
user group node automat creat addit
hierarchi level number node level exce
maxim allow link param auto expand size size
default option disabl
string param auto expand tree param auto expand tree autoexpandtre
paramet take effect link param auto expand tree
enabl default
string param auto expand size param auto expand size autoexpands
paramet present group membership collect node
structur link userconst member default
multi valu properti link userconst member determin
maximum number member properti addit intermedi node
insert valid valu integ
string param group membership split size param group membership split size groupmembershipsplits
logger log logger factori loggerfactori logger getlogg user manag impl usermanagerimpl
session impl sessionimpl session
string admin adminid
node resolv noderesolv auth resolv authresolv
node creator nodecr node creator nodecr
configur defin node user node creat
default link userconst user path
string user path userspath
configur defin node group node creat
default link userconst group path
string group path groupspath
flag indic link getauthoriz string deal
user group creat jackrabbit
authoriz creat defin logic
retriev search travers flag
code true code method find authoriz
code authresolv code found
compat jr16 compatiblejr16
boolean flag indic edit session system session
system user manag issystemusermanag
maximum number properti group membership node structur
link userconst member addit intermedi node insert
default link userconst member record group
membership
group membership split size groupmembershipsplits
membership cach membershipcach membership cach membershipcach
creat code usermanag code default configur
param session edit read session
param adminid user administr
user manag impl usermanagerimpl session impl sessionimpl session string admin adminid repositori except repositoryexcept
session admin adminid
creat code usermanag code
param session edit read session
param adminid user administr
param config configur paramet
user manag impl usermanagerimpl session impl sessionimpl session string admin adminid properti config repositori except repositoryexcept
session admin adminid config
creat code usermanag code code session code
configur option respect
link param user path miss set link userconst user path
link param group path miss set link userconst group path
link param default depth default number level
link param auto expand tree default option disabl
link param auto expand size default
link param group membership split size default mean
link userconst member
link usermanagerimpl introduct detail
param session edit read session
param adminid user administr
param config configur paramet
param mcach share membership cach
throw javax jcr repositoryexcept
user manag impl usermanagerimpl session impl sessionimpl session string admin adminid properti config
membership cach membershipcach cach mcach repositori except repositoryexcept
session session
admin adminid admin adminid
node creator nodecr node creator nodecr config
object param config config param user path param user path
user path userspath param param string tostr user path user path
param config config param group path param group path
group path groupspath param param string tostr group path group path
param config config param compatibil jr16 param compatibil jr16
compat jr16 compatiblejr16 param boolean pars boolean parseboolean param string tostr
param config config param group membership split size param group membership split size
group membership split size groupmembershipsplits pars membership split size parsemembershipsplits param
cach mcach
membership cach membershipcach cach mcach
membership cach membershipcach membership cach membershipcach session group path groupspath group membership split size groupmembershipsplits
node resolv noderesolv
index node resolv indexnoderesolv session session
repositori except repositoryexcept
log debug usermanag querymanag workspac session workspac getworkspac getnam travers node resolv
travers node resolv traversingnoderesolv session session
auth resolv authresolv
auth resolv authresolv set search root setsearchroot user path userspath group path groupspath
evalu edit session system session
systemsess class packag protect session object
check properti instanc
workaround compar class check subject
system princip
system user manag issystemusermanag org apach jackrabbit core systemsess equal session class getclass getnam
session subject getsubject princip getprincip system princip systemprincip empti isempti
implement specif method releav user creat
content
return root path user content
param user path configur paramet
string user path getuserspath
user path userspath
implement specif method releav group creat
content
return root path group content
param group path configur paramet
string group path getgroupspath
group path groupspath
return membership cach present user manag instanc
membership cach membershipcach membership cach getmembershipcach
membership cach membershipcach
maximum number properti group membership node structur
link userconst member addit intermedi node insert
default link userconst member record group
membership
return
group membership split size getgroupmembershipsplits
group membership split size groupmembershipsplits
usermanag
usermanag getauthoriz string
authoriz authoriz getauthoriz string repositori except repositoryexcept
length
illeg argument except illegalargumentexcept invalid authoriz
authoriz intern authoriz internalgetauthoriz
extra check exist administr user
exist
case remov recreat system session
regular session lack read permiss admin user'
node explicit test current edit session
system session perform
admin adminid equal system user manag issystemusermanag
log info admin user exist
creat admin createadmin
usermanag getauthoriz princip
authoriz authoriz getauthoriz princip princip repositori except repositoryexcept
node impl nodeimpl
shortcut avoid execut queri
princip authoriz impl authorizableimpl node base princip nodebasedprincip
node nodeid node nodeid authoriz impl authorizableimpl node base princip nodebasedprincip princip node getnodeid
session node getnodebyid node nodeid
item found except itemnotfoundexcept
authoriz null
princip item base princip itembasedprincip
string auth path authpath item base princip itembasedprincip princip path getpath
session node exist nodeexist auth path authpath
node impl nodeimpl session node getnod auth path authpath
princip implement
short cut work case equal principalnam
execut queri case pname mismatch except queri
requir persist user node issu userimport
string princip getnam
authoriz intern authoriz internalgetauthoriz
equal princip getprincip getnam
repositori except repositoryexcept
ignor execut queri
authoriz match princip search
node impl nodeimpl auth resolv authresolv find node findnod princip princip rep authoriz rep authoriz
build authoriz object
authoriz getauthoriz
usermanag findauthoriz string string
iter authoriz find authoriz findauthoriz string rel path relpath string repositori except repositoryexcept
find authoriz findauthoriz rel path relpath search type authoriz search type authoriz
usermanag findauthoriz string string int
iter authoriz find authoriz findauthoriz string rel path relpath string search type searchtyp
repositori except repositoryexcept
search type searchtyp search type user search type user search type searchtyp search type authoriz search type authoriz
illeg argument except illegalargumentexcept invalid search type search type searchtyp
path path session path getqpath rel path relpath
node iter nodeiter node
rel path relpath index indexof
search properti authoriz node
node auth resolv authresolv find node findnod path search type searchtyp long max max
path path normal path getnormalizedpath
path length getlength
search authoriz node
ntname
search type searchtyp
search type group search type group
ntname rep group rep group
search type user search type user
ntname rep user rep user
ntname rep authoriz rep authoriz
node auth resolv authresolv find node findnod path getnam ntname
search authoriz node path constraint
account
node auth resolv authresolv find node findnod path search type searchtyp long max max
authoriz iter authorizableiter node
usermanag findauthoriz queri
iter authoriz find authoriz findauthoriz queri queri repositori except repositoryexcept
path queri builder xpathquerybuild builder path queri builder xpathquerybuild
queri build builder
path queri evalu xpathqueryevalu builder session eval
usermanag createus string string
user creat user createus string user userid string password repositori except repositoryexcept
creat user createus user userid password princip impl principalimpl user userid
usermanag createus string string java secur princip string
user creat user createus string user userid string password
princip princip string intermedi path intermediatepath
authoriz exist except authorizableexistsexcept repositori except repositoryexcept
check valid checkvalidid user userid
password
illeg argument except illegalargumentexcept creat user null password
note princip valid setprincip call
node impl nodeimpl user node usernod node impl nodeimpl node creator nodecr creat user node createusernod user userid intermedi path intermediatepath
set princip setprincip user node usernod princip
set properti setproperti user node usernod password password getvalu user impl userimpl build password buildpasswordvalu password
user user creat user createus user node usernod
auto save isautosav
session save
log debug user creat user userid user node usernod path getpath
user
repositori except repositoryexcept
wrong revert throw
session refresh
log debug fail creat user revert
usermanag creategroup string
group creat group creategroup string group groupid
authoriz exist except authorizableexistsexcept repositori except repositoryexcept
creat group creategroup group groupid princip impl principalimpl group groupid
link creategroup java secur princip string
intermedi path code null code
usermanag creategroup princip
group creat group creategroup princip princip repositori except repositoryexcept
creat group creategroup princip
link creategroup string princip string groupid
gener princip conflict
exist authoriz happen case
princip princip expand suffix
result group equal princip
param princip princip repres exist user
group
param intermediatepath
return group
throw authorizableexistsexcept
throw repositoryexcept
usermanag creategroup java secur princip string
group creat group creategroup princip princip string intermedi path intermediatepath authoriz exist except authorizableexistsexcept repositori except repositoryexcept
check valid princip checkvalidprincip princip
string group groupid group getgroupid princip getnam
creat group creategroup group groupid princip intermedi path intermediatepath
creat code group code code groupid code
code princip code creat defin
link getgroupspath group path
exist element path creat node
type link rep authoriz folder rep authorizablefold
param groupid groupid
user group
param princip princip repres exist user
group
param intermediatepath
return group
throw authorizableexistsexcept
throw repositoryexcept
usermanag creategroup string java secur princip string
group creat group creategroup string group groupid princip princip string intermedi path intermediatepath authoriz exist except authorizableexistsexcept repositori except repositoryexcept
check valid checkvalidid group groupid
note princip valid setprincip call
node impl nodeimpl group node groupnod node impl nodeimpl node creator nodecr creat group node creategroupnod group groupid intermedi path intermediatepath
princip
set princip setprincip group node groupnod princip
group group creat group creategroup group node groupnod
auto save isautosav
session save
log debug group creat group groupid group node groupnod path getpath
group
repositori except repositoryexcept
session refresh
log debug newinst group fail revert parent
return code true code default autosav behavior
alter link autosav boolean
return code true code
org apach jackrabbit api secur user usermanag isautosav
auto save isautosav
throw code unsupportedrepositoryoperationexcept code
modif autosav behavior support
usermanag autosav boolean
auto save autosav enabl unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
unsupport repositori oper except unsupportedrepositoryoperationexcept chang autosav behavior
param node user group node
param princip valid null princip
throw authorizableexistsexcept user group
princip
throw repositoryexcept error occur
set princip setprincip node impl nodeimpl node princip princip authoriz exist except authorizableexistsexcept repositori except repositoryexcept
check valid princip checkvalidprincip princip
check authoriz princip
addit valid node requir order
circumv problem import exist authoriz
case origin user group node recreat search
collid authoriz find persist
node
authoriz exist authoriz getauthoriz princip
exist authoriz impl authorizableimpl exist node getnod issam node
authoriz exist except authorizableexistsexcept authoriz princip getnam exist
node isnew node properti hasproperti princip princip
repositori except repositoryexcept rep principalnam set node
set properti setproperti node princip princip getvalu princip getnam
set protect properti setprotectedproperti node impl nodeimpl node prop propnam repositori except repositoryexcept lock except lockexcept constraint violat except constraintviolationexcept item exist except itemexistsexcept version except versionexcept
set properti setproperti node prop propnam
auto save isautosav
node save
set protect properti setprotectedproperti node impl nodeimpl node prop propnam valu repositori except repositoryexcept lock except lockexcept constraint violat except constraintviolationexcept item exist except itemexistsexcept version except versionexcept
set properti setproperti node prop propnam valu
auto save isautosav
node save
set protect properti setprotectedproperti node impl nodeimpl node prop propnam valu type repositori except repositoryexcept lock except lockexcept constraint violat except constraintviolationexcept item exist except itemexistsexcept version except versionexcept
set properti setproperti node prop propnam valu type
auto save isautosav
node save
remov protect item removeprotecteditem item impl itemimpl item node parent repositori except repositoryexcept access deni except accessdeniedexcept version except versionexcept
remov item removeitem item
auto save isautosav
parent save
node impl nodeimpl add protect node addprotectednod node impl nodeimpl parent ntname repositori except repositoryexcept
node impl nodeimpl add node addnod parent ntname
auto save isautosav
parent save
perform protect oper performprotectedoper session impl sessionimpl session session oper sessionoper oper repositori except repositoryexcept
perform protect performprotect session oper
implement specif method retriev user group node
code null code return
pre
pass node code null code
correct node type
underneath configur user group tree
pre
param user group node
return authoriz code null code
throw repositoryexcept error occur
authoriz authoriz getauthoriz node impl nodeimpl repositori except repositoryexcept
authoriz authorz
string path path getpath
node type isnodetyp rep user rep user text descend isdescend user path userspath path
authorz creat user createus
node type isnodetyp rep group rep group text descend isdescend group path groupspath path
authorz creat group creategroup
node type valid user group
hierarchi return null
log debug unexpect user nodetyp primari node type getprimarynodetyp getnam
match node return null
authorz
test user group exist princip
happen userid princip
case gener group creat
param principalnam hint group
return group
throw repositoryexcept error occur
string group getgroupid string princip principalnam repositori except repositoryexcept
string group groupid princip principalnam
intern authoriz internalgetauthoriz group groupid
group groupid princip principalnam
group groupid
param user group
return authoriz code code code null code
throw repositoryexcept error occur
authoriz intern authoriz internalgetauthoriz string repositori except repositoryexcept
node nodeid node nodeid build node buildnodeid
node impl nodeimpl
session node getnodebyid node nodeid
item found except itemnotfoundexcept
compat jr16 compatiblejr16
backward compat user group structur
determin exist authoriz directli
search node belong
node impl nodeimpl auth resolv authresolv find node findnod userid userid rep user rep user
user group
note return groupid
illeg jcr char group getid 'unescapes' node
addit escap requir
node nodenam session getqnam text escap illeg jcr char escapeillegaljcrchar
node impl nodeimpl auth resolv authresolv find node findnod node nodenam rep group rep group
match node found ignor except
authoriz getauthoriz
getvalu string str strvalu
session factori getvaluefactori creat createvalu str strvalu
param userid userid
return true userid belong administr user
admin isadminid string user userid
admin adminid admin adminid equal user userid
build user object user node
param usernod user node
return instanc code user code
throw repositoryexcept node child configur
userspath node error occur
user creat user createus node impl nodeimpl user node usernod repositori except repositoryexcept
user node usernod user node usernod node type isnodetyp rep user rep user
illeg argument except illegalargumentexcept
text descend isdescend user path userspath user node usernod path getpath
repositori except repositoryexcept user user path
creat user docreateus user node usernod
build user object user node overridden
return custom implement
param node user node
return user object
throw repositoryexcept error occur
user creat user docreateus node impl nodeimpl node repositori except repositoryexcept
user impl userimpl node
build group object group node
param groupnod group node
return instanc code group code
throw repositoryexcept node child configur
groupspath node error occur
group creat group creategroup node impl nodeimpl group node groupnod repositori except repositoryexcept
group node groupnod group node groupnod node type isnodetyp rep group rep group
illeg argument except illegalargumentexcept
text descend isdescend group path groupspath group node groupnod path getpath
repositori except repositoryexcept group group path
creat group docreategroup group node groupnod
build group object group node overridden
return custom implement
param node group node
return group
throw repositoryexcept error occur
group creat group docreategroup node impl nodeimpl node repositori except repositoryexcept
group impl groupimpl node
creat administr user node creat collid
exist node itemexistsexcept exist node remov
admin user node creat
collis exist node occur circumst
code userspath code modifi user manag
configur success repositori start creat
administr user
nodeid creat link buildnodeid string coincid
collid nodeid creat regular node creation
process
return admin user
throw repositoryexcept error occur
user creat admin createadmin repositori except repositoryexcept
user admin
admin creat user createus admin adminid admin adminid
auto save isautosav
session save
log info creat admin user admin adminid default
item exist except itemexistsexcept
node impl nodeimpl conflict node conflictingnod session node getnodebyid build node buildnodeid admin adminid
string conflict path conflictpath conflict node conflictingnod path getpath
log error detect conflict node conflict path conflictpath node type conflict node conflictingnod primari node type getprimarynodetyp getnam
todo move conflict node type rep user remov recreat
conflict node conflictingnod remov
log info remov conflict node conflict path conflictpath
admin creat user createus admin adminid admin adminid
auto save isautosav
session save
log info resolv conflict creat admin user admin adminid default
admin
creat uuid code code string convert
lower case
param user group convert valid nodeid
return code nodeid code
throw repositoryexcept error occur
node nodeid build node buildnodeid string repositori except repositoryexcept
uuid uuid uuid uuid byte nameuuidfrombyt lower case tolowercas byte getbyt utf
node nodeid uuid
unsupport encod except unsupportedencodingexcept
repositori except repositoryexcept unexpect error build hash
check code code empti string
user group
param user group creat
throw illegalargumentexcept null empti string
throw authorizableexistsexcept
throw repositoryexcept error occur
check valid checkvalidid string illeg argument except illegalargumentexcept authoriz exist except authorizableexistsexcept repositori except repositoryexcept
length
illeg argument except illegalargumentexcept creat authoriz null empti string
intern authoriz internalgetauthoriz
authoriz exist except authorizableexistsexcept user group exist
throw code illegalargumentexcept code princip
code null code code null code empti string
param princip
check valid princip checkvalidprincip princip princip
princip princip getnam equal princip getnam
illeg argument except illegalargumentexcept princip null valid
pars membership split size parsemembershipsplits object param
param
integ pars int parseint param string tostr
number format except numberformatexcept
log warn invalid expect integ
param string tostr param group membership split size param group membership split size
sessionlisten
sessionlisten loggingout org apach jackrabbit core sessionimpl
log loggingout session impl sessionimpl session
sessionlisten loggedout org apach jackrabbit core sessionimpl
log loggedout session impl sessionimpl session
logout session log session
session session
session logout
class
class
authoriz iter authorizableiter iter authoriz
set string serv hash set hashset string
authoriz
node iter nodeiter auth node iter authnodeit
authoriz iter authorizableiter node iter nodeiter auth node iter authnodeit
auth node iter authnodeit auth node iter authnodeit
seek seeknext
iter
iter hasnext
hasnext
iter
authoriz
authoriz authr
authr
element except nosuchelementexcept
seek seeknext
authr
iter remov
remov
unsupport oper except unsupportedoperationexcept
authoriz seek seeknext
auth node iter authnodeit hasnext
node impl nodeimpl node node impl nodeimpl auth node iter authnodeit node nextnod
serv node uuid getuuid
authoriz authr authoriz getauthoriz node
serv add node uuid getuuid
authr
authr
repositori except repositoryexcept
log debug messag getmessag
continu seek authoriz
authoriz iter complet
class creat jcr node
authoriz behavior
user creat rep secur rep authoriz rep user
path configur
group creat rep secur rep authoriz rep group
path configur
categori authoriz creat human readabl
structur base defin intermedi path intern logic
depth defin code defaultdepth code config option
creat user node 'asmith' result
structur assum defaultdepth
pre
rep secur unstructur
rep authoriz rep authorizablefold
rep user rep authorizablefold
rep authorizablefold
rep authorizablefold
asmith rep user
pre
case user node calcul userid
link text escapeillegaljcrchar string escap illeg jcr char
case group node calcul princip
circumv conflict exist id escap illeg char
intermedi path pass name intermedi
folder calcul lead char escap node
escap node shorter code defaultdepth code
char repeat
creat user node 'a' result
structur assum defaultdepth
pre
rep secur unstructur
rep authoriz rep authorizablefold
rep user rep authorizablefold
rep authorizablefold
rep authorizablefold
rep user
pre
code autoexpandtre code option code true code
user tree automat expand addit level
code autoexpands code exceed level
auto expans authoriz tree defin
step except case
long code autoexpands code reach authoriz
node creat structur defin
code defaultdepth code
code autoexpands code reach addit intermedi
folder creat
creat user node 'asmith1001' result
structur
pre
rep secur unstructur
rep authoriz rep authorizablefold
rep user rep authorizablefold
rep authorizablefold
rep authorizablefold
asmith1 rep user
asmith2 rep user
asmith1000 rep user
asm rep authorizablefold
asmith1001 rep user
pre
conflict order prevent conflict aris
creat authoriz node expans conflict
authoriz folder intermedi level creat
node equal name reserv level
folder
attempt creat user 'asm'
result intermedi level irrespect max size
reach
pre
rep secur unstructur
rep authoriz rep authorizablefold
rep user rep authorizablefold
rep authorizablefold
rep authorizablefold
asm rep authorizablefold
asm rep user
pre
special case authoriz node creat
shorter equal length folder level authoriz
node creat max size reach
attempt creat user 'as' 'asm' structur
ton 'asmith' user result
pre
rep secur unstructur
rep authoriz rep authorizablefold
rep user rep authorizablefold
rep authorizablefold
rep authorizablefold
asmith1 rep user
asmith2 rep user
asmith1000 rep user
rep user
asm rep authorizablefold
asmith1001 rep user
asm rep user
pre
special case code autoexpandtre code enabl
exist authoriz node collid intermedi
folder creat auto expans abort
authoriz insert valid level irrespect
max size reach
configur option
strong defaultdepth strong
posit code integ code greater defin depth
default structur creat
default
strong autoexpandtre strong
code boolean code defin tree automat expand
level maximum number child node reach
default code fals code
strong autoexpands strong
posit code long code greater defin maximum
number child node allow level
default
note total number child node greater
autoexpands
node creator nodecr
string delimit
default depth default depth
default size default size
default depth defaultdepth
auto expand tree autoexpandtre
effort max size authoriz folder
node creat edit session allow
child node
auto expand size autoexpands
node creator nodecr properti config
default depth default depth
expand
size default size default size
config
config kei containskei param default depth param default depth
integ pars int parseint config param default depth param default depth string tostr
log warn invalid defaultdepth default
default depth default depth
number format except numberformatexcept
log warn unabl pars defaultdepth config paramet default
config kei containskei param auto expand tree param auto expand tree
expand boolean pars boolean parseboolean config param auto expand tree param auto expand tree string tostr
config kei containskei param auto expand size param auto expand size
size integ pars int parseint config param auto expand size param auto expand size string tostr
expand size
log warn invalid autoexpands size default
size default size default size
number format except numberformatexcept
log warn unabl pars autoexpands config paramet default
default depth defaultdepth
auto expand tree autoexpandtre expand
auto expand size autoexpands size
node creat user node createusernod string user userid string intermedi path intermediatepath repositori except repositoryexcept
creat authoriz node createauthorizablenod user userid intermedi path intermediatepath
node creat group node creategroupnod string group groupid string intermedi path intermediatepath repositori except repositoryexcept
creat authoriz node createauthorizablenod group groupid intermedi path intermediatepath
node creat authoriz node createauthorizablenod string group isgroup string intermedi path intermediatepath repositori except repositoryexcept
string escap escapedid text escap illeg jcr char escapeillegaljcrchar
node folder
creat default folder node present
folder creat default folder node createdefaultfoldernod escap escapedid group isgroup intermedi path intermediatepath
eventu creat addit intermedi folder
intermedi path intermediatepath
intern logic
folder creat intermedi folder node createintermediatefoldernod escap escapedid folder
node nodenam session getqnam escap escapedid
ntname group isgroup rep group rep group rep user rep user
node nodeid nid build node buildnodeid
check exist collid folder child node
node impl nodeimpl folder node hasnod node nodenam
node impl nodeimpl collid node impl nodeimpl folder node getnod node nodenam
collid node type isnodetyp rep authoriz folder rep authoriz folder
log warn exist folder node collid user group creat expand path collid path getpath
folder collid
folder creation
assert rep authoriz folder exist
similarli collis exist authoriz
check
string msg fail creat authoriz detect conflict node unexpect nodetyp collid primari node type getprimarynodetyp getnam
log error msg
constraint violat except constraintviolationexcept msg
check collis exist node user group tree
session item manag getitemmanag item exist itemexist nid
string msg fail creat authoriz detect conflict exist node nodeid nid
log error msg
item exist except itemexistsexcept msg
final creat authoriz node
add node addnod node impl nodeimpl folder node nodenam ntname nid
node creat default folder node createdefaultfoldernod string string escap escapedid
group isgroup string intermedi path intermediatepath repositori except repositoryexcept
string default path defaultpath default folder path getdefaultfolderpath group isgroup intermedi path intermediatepath
make user group nest exclus creat
tree rep authorizablefold start userspath
groupspath ancestor userspath groupspath
rep authorizablefold
shortcut session getnod defaultpath omit
string segmt default path defaultpath split
node impl nodeimpl folder node impl nodeimpl session root node getrootnod
string auth root authroot group isgroup group path groupspath user path userspath
string segment segmt
segment length
folder node hasnod segment
folder node impl nodeimpl folder node getnod segment
text descend equal isdescendantorequ auth root authroot folder path getpath
folder node type isnodetyp rep authoriz folder rep authoriz folder
constraint violat except constraintviolationexcept invalid intermedi path type rep authorizablefold
folder add node addnod folder session getqnam segment rep authoriz folder rep authoriz folder
valid check authoriz creat conflict
check authoriz node exist checkauthorizablenodeexist escap escapedid folder
folder
string default folder path getdefaultfolderpath string group isgroup string intermedi path intermediatepath
string builder stringbuild bld string builder stringbuild
group isgroup
bld append group path groupspath
bld append user path userspath
intermedi path intermediatepath
intern logic
string builder stringbuild segment lastseg string builder stringbuild default depth defaultdepth
length idlength length
default depth defaultdepth
length idlength
segment lastseg append char charat
escapedid short append char
segment lastseg append char charat length idlength
bld append delimit append text escap illeg jcr char escapeillegaljcrchar segment lastseg string tostr
structur defin intermedi path
intermedi path intermediatepath start startswith bld string tostr
intermedi path intermediatepath intermedi path intermediatepath substr bld string tostr length
intermedi path intermediatepath length equal intermedi path intermediatepath
intermedi path intermediatepath start startswith
bld append
bld append intermedi path intermediatepath
bld string tostr
node creat intermedi folder node createintermediatefoldernod string string escap escapedid node folder repositori except repositoryexcept
auto expand tree autoexpandtre
addit folder creat
folder
addit folder creat
maxim size child node reach
authoriz node creat potenti collid
intermedi node
segm length segmlength default depth defaultdepth
intermedi folder need intermediatefolderneed escap escapedid folder
string folder foldernam text escap illeg jcr char escapeillegaljcrchar substr segm length segmlength
folder node hasnod folder foldernam
node impl nodeimpl node impl nodeimpl folder node getnod folder foldernam
valid check folder type rep authorizablefold
authoriz node
node type isnodetyp rep authoriz folder rep authoriz folder
expect nodetyp violat
folder
node type isnodetyp rep authoriz rep authoriz
authoriz node creat
intermedi folder creat
occur 'autoexpandtree' option
enabl
resolut
abort auto expand creat authoriz
current level ignor max size reach
note behavior prefer tmp
remov recreat collid authoriz node
log warn auto expand abort exist authoriz node getnam 'conflict intermedi folder creat
unexpect node type
string msg fail creat authoriz node detect conflict node unexpect nodetyp primari node type getprimarynodetyp getnam
log error msg
constraint violat except constraintviolationexcept msg
folder exist collid child node
folder add node addnod node impl nodeimpl folder session getqnam folder foldernam rep authoriz folder rep authoriz folder
segm length segmlength
final valid check authoriz creat conflict
check authoriz node exist checkauthorizablenodeexist escap escapedid folder
folder
check authoriz node exist checkauthorizablenodeexist string node nodenam node folder authoriz exist except authorizableexistsexcept repositori except repositoryexcept
folder node hasnod node nodenam
node impl nodeimpl folder node getnod node nodenam node type isnodetyp rep authoriz rep authoriz
authoriz exist except authorizableexistsexcept unabl creat group user collis exist authoriz
intermedi folder need intermediatefolderneed string node nodenam node folder repositori except repositoryexcept
creat addit intermedi folder id
shorter equal long folder case
max size flag
node nodenam length folder getnam length
test potenti exist collis case
intermedi node creat irrespect max size
exist number children
node nodenam length folder getnam length
max size reach folder node
creat potenti collid intermedi folder
exist folder structur
authid creat abt
exist collis result
exist folder structur abt
authid creat abt
possibl max size reach
folder node getnod size getsiz auto expand size autoexpands
collis creat addit intermedi
folder due max size reach
