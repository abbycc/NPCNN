org apach jackrabbit api secur user
java secur princip
java util iter
javax jcr repositori except repositoryexcept
javax jcr session
javax jcr unsupport repositori oper except unsupportedrepositoryoperationexcept
code usermanag code access mean maintain
link authoriz authoriz object link user user
link group group code usermanag code bound
code session code
note code creat code call modifi session
linkplain usermanag current session
depend repositori configur user manag
autosav mode link usermanag isautosav problem
overlap creation intermedi node surfac subsequ
link session save oper caller prepar repeat
case
user manag usermanag
filter flag indic code user code search
return
search type user search type user
filter flag indic code group code search
return
search type group search type group
filter flag indic code authoriz code
search
search type authoriz search type authoriz
authoriz
param user group
return authoriz code null code present
throw repositoryexcept error occur
authoriz getid
authoriz authoriz getauthoriz string repositori except repositoryexcept
authoriz main princip
param princip
return authoriz code null code present
throw repositoryexcept error occur
authoriz authoriz getauthoriz princip princip repositori except repositoryexcept
accord link org apach jackrabbit api secur user authoriz getpath
method retriev authoriz path
param path path authoriz
return authoriz code null code present
throw unsupportedrepositoryoperationexcept implement
support retriev authoriz path
throw repositoryexcept error occur
org apach jackrabbit api secur user authoriz getpath
authoriz authoriz path getauthorizablebypath string path unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
return code authoriz code
link authoriz getproperti string properti rel
path match
rel path segment properti
match patch return
properti retriev
link authoriz getproperti string search match
param relpath rel properti path
param
return code authoriz code properti
match
throw repositoryexcept error occur
authoriz getproperti string
iter authoriz find authoriz findauthoriz string rel path relpath string repositori except repositoryexcept
return code authoriz code
link authoriz getproperti string properti rel
path match contrast
link findauthoriz string string type authoriz
respect execut search
rel path segment properti
match path return
properti retriev
link authoriz getproperti string search match
param relpath rel properti path
param
param searchtyp constant
link search type authoriz
link search type group
link search type user
return iter code authoriz code
throw repositoryexcept error occur
iter authoriz find authoriz findauthoriz string rel path relpath string search type searchtyp repositori except repositoryexcept
return link authoriz match specif link queri
param queri queri
return iter authoriz witch match code queri code
throw repositoryexcept error occur
iter authoriz find authoriz findauthoriz queri queri repositori except repositoryexcept
creat user userid password pair
paramet code null code
link createus string string princip string
userid equal princip intermedi
path code null code
param userid user
param password initi password user
return code user code
throw authorizableexistsexcept case userid
authoriz princip exist
throw repositoryexcept error occur
user creat user createus string user userid string password authoriz exist except authorizableexistsexcept repositori except repositoryexcept
creat user paramet implement
deal code intermediatepath code paramet
code intermediatepath code
paramet code null code
param userid
param password
param princip
param intermediatepath
return code user code
throw authorizableexistsexcept case userid
authoriz princip exist
throw repositoryexcept current session
allow creat user error occur
user creat user createus string user userid string password princip princip
string intermedi path intermediatepath authoriz exist except authorizableexistsexcept repositori except repositoryexcept
creat group groupid code null code
link creategroup string princip string
groupid code princip code intermedi path
code null code
param groupid group code null code
return code group code
throw authorizableexistsexcept case groupid
link authoriz
link authoriz getid princip exist
throw repositoryexcept error occur
group creat group creategroup string group groupid authoriz exist except authorizableexistsexcept repositori except repositoryexcept
creat code group code base princip
note group' implement specif implement
princip hint case assert
uniqu id manag
param princip null code princip code
return code group code
throw authorizableexistsexcept case princip
authoriz
throw repositoryexcept error occur
group creat group creategroup princip princip authoriz exist except authorizableexistsexcept repositori except repositoryexcept
link creategroup string princip string
princip creat group'
param princip
param intermediatepath
return code group code
throw authorizableexistsexcept case princip
authoriz
throw repositoryexcept error occur
group creat group creategroup princip princip string intermedi path intermediatepath authoriz exist except authorizableexistsexcept repositori except repositoryexcept
creat code group code base princip
code intermediatepath code hint implement
deal code intermediatepath code paramet
param princip
param intermediatepath
return code group code
throw authorizableexistsexcept case princip
authoriz
throw repositoryexcept error occur
group creat group creategroup string group groupid princip princip string intermedi path intermediatepath authoriz exist except authorizableexistsexcept repositori except repositoryexcept
write oper execut user api automat
persist method return code true code case
pend transient left explicitli call
link javax jcr session save method return code fals code
complet extra save call
code session code code usermanag code
return code true code automat persist
code fals code made api includ method
call link authoriz subclass transient
persist link javax jcr session save
autosav boolean
auto save isautosav
auto save behavior code usermanag code
note allow case session
origin session access user manag
param enabl code true code made api
automat save explicit call
link javax jcr session save requir order persist
throw unsupportedrepositoryoperationexcept implement
chang auto save behavior
throw repositoryexcept error occur
auto save autosav enabl unsupport repositori oper except unsupportedrepositoryoperationexcept repositori except repositoryexcept
