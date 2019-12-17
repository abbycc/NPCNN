org apach jackrabbit common cnd
javax jcr repositori except repositoryexcept
javax jcr properti type propertytyp
javax jcr queri qom queri object model constant queryobjectmodelconst
javax jcr nodetyp item definit itemdefinit
javax jcr nodetyp node type definit nodetypedefinit
javax jcr nodetyp properti definit propertydefinit
builder node type definit node definit properti definit
param type node type definit
param type namespac map
definit builder factori definitionbuilderfactori
creat instanc link abstractnodetypedefinitionbuild
return
throw repositoryexcept
abstract node type definit builder abstractnodetypedefinitionbuild node type definit builder newnodetypedefinitionbuild
repositori except repositoryexcept
set namespac map node type definit built
param nsmap
set namespac map setnamespacemap map nsmap
return namespac map node type definit built
namespac map getnamespacemap
add map namespac map
param prefix
param uri
throw repositoryexcept
set namespac setnamespac string prefix string uri repositori except repositoryexcept
builder node type definit type
param
abstract node type definit builder abstractnodetypedefinitionbuild
link setnam string
string
link setmixin boolean
mixin ismixin
link setorderablechildnod boolean
order isorder
link setabstract boolean
abstract isabstract
link setquery boolean
queryabl
set node type definit built
param
throw repositoryexcept valid
nodetypedefinit getnam
set setnam string repositori except repositoryexcept
return node type definit built
return
string getnam
add set supertyp node type definit
built
param supertyp
throw repositoryexcept valid
nodetypedefinit getdeclaredsupertypenam
add supertyp addsupertyp string repositori except repositoryexcept
param ismixin code true code build mixin node type
definit code fals code
throw repositoryexcept
nodetypedefinit ismixin
set mixin setmixin mixin ismixin repositori except repositoryexcept
mixin ismixin mixin ismixin
param isorder code true code build node type
order child node code fals code
throw repositoryexcept
nodetypedefinit hasorderablechildnod
set order child node setorderablechildnod order isorder repositori except repositoryexcept
order isorder order isorder
param primari item
throw repositoryexcept
nodetypedefinit getprimaryitemnam
set primari item setprimaryitemnam string repositori except repositoryexcept
param isabstract code true code build node type abstract
throw repositoryexcept
nodetypedefinit isabstract
set abstract setabstract abstract isabstract repositori except repositoryexcept
abstract isabstract abstract isabstract
param queryabl code true code build node type queryabl
throw repositoryexcept
nodetypedefinit isquery
set queryabl setquery queryabl repositori except repositoryexcept
queryabl queryabl
creat instanc link definitionbuilderfactori abstractpropertydefinitionbuild
add properti definit node type definit built
return
throw repositoryexcept
abstract properti definit builder abstractpropertydefinitionbuild properti definit builder newpropertydefinitionbuild
repositori except repositoryexcept
creat instanc link definitionbuilderfactori abstractnodedefinitionbuild
add child node definit node type definit built
return
throw repositoryexcept
abstract node definit builder abstractnodedefinitionbuild node definit builder newnodedefinitionbuild repositori except repositoryexcept
build node type definit
return
throw repositoryexcept
build repositori except repositoryexcept
builder item definit type code code
param
abstract item definit builder abstractitemdefinitionbuild
link setnam string
string
link setautocr boolean
autocr
link setonparentvers int
parent onpar
link setprotect boolean
protect isprotect
link setmandatori boolean
mandatori ismandatori
param child item definit build
throw repositoryexcept
itemdefinit getnam
set setnam string repositori except repositoryexcept
child item definit built
return
string getnam
param declar node type
throw repositoryexcept
itemdefinit getdeclaringnodetyp
set declar node type setdeclaringnodetyp string repositori except repositoryexcept
param autocr code true code build 'autocreate' child item
definit fals
throw repositoryexcept
itemdefinit isautocr
set auto creat setautocr autocr repositori except repositoryexcept
autocr autocr
param onpar 'onparentversion' attribut child item definit built
throw repositoryexcept
itemdefinit getonparentvers
set parent version setonparentvers parent onpar repositori except repositoryexcept
parent onpar parent onpar
param isprotect code true code build 'protected' child
item definit fals
throw repositoryexcept
itemdefinit isprotect
set protect setprotect protect isprotect repositori except repositoryexcept
protect isprotect protect isprotect
param ismandatori code true code build 'mandatory' child
item definit fals
throw repositoryexcept
set mandatori setmandatori mandatori ismandatori repositori except repositoryexcept
mandatori ismandatori mandatori ismandatori
build item definit add parent node type definit
throw repositoryexcept
build repositori except repositoryexcept
builder properti definit type code code
param
abstract properti definit builder abstractpropertydefinitionbuild abstract item definit builder abstractitemdefinitionbuild
string oper oper string
queri object model constant queryobjectmodelconst jcr oper equal jcr oper equal
queri object model constant queryobjectmodelconst jcr oper greater jcr oper greater
queri object model constant queryobjectmodelconst jcr oper greater equal jcr oper greater equal
queri object model constant queryobjectmodelconst jcr oper jcr oper
queri object model constant queryobjectmodelconst jcr oper equal jcr oper equal
queri object model constant queryobjectmodelconst jcr oper jcr oper
queri object model constant queryobjectmodelconst jcr oper equal jcr oper equal
link setrequiredtyp int
requir type requiredtyp properti type propertytyp undefin
link setmultipl boolean
multipl ismultipl
link setfulltextsearch boolean
full text searchabl fulltextsearch
link setqueryorder boolean
queri order queryorder
link setavailablequeryoper string
string queri oper queryoper oper oper
param type requir type properti definit built
throw repositoryexcept
propertydefinit getrequiredtyp
set requir type setrequiredtyp type repositori except repositoryexcept
requir type requiredtyp type
requir type properti definit built
return
requir type getrequiredtyp
requir type requiredtyp
param constraint add constraint list constraint properti
definit built
throw repositoryexcept
propertydefinit getvalueconstraint
add constraint addvalueconstraint string constraint repositori except repositoryexcept
param add default list default valu properti definit
built
throw repositoryexcept
propertydefinit getdefaultvalu
add default valu adddefaultvalu string repositori except repositoryexcept
param ismultipl true build 'multiple' properti definit
throw repositoryexcept
propertydefinit ismultipl
set multipl setmultipl multipl ismultipl repositori except repositoryexcept
multipl ismultipl multipl ismultipl
param fulltextsearch code true code build
'fulltext searchable' properti definit
throw repositoryexcept
propertydefinit isfulltextsearch
set full text searchabl setfulltextsearch full text searchabl fulltextsearch repositori except repositoryexcept
full text searchabl fulltextsearch full text searchabl fulltextsearch
param queryorder code true code properti order queri
throw repositoryexcept
propertydefinit isqueryorder
set queri order setqueryorder queri order queryorder repositori except repositoryexcept
queri order queryorder queri order queryorder
param queryoper queri oper properti
throw repositoryexcept
propertydefinit getavailablequeryoper
set queri oper setavailablequeryoper string queri oper queryoper repositori except repositoryexcept
queri oper queryoper
null pointer except nullpointerexcept queryoper
queri oper queryoper queri oper queryoper
builder child node definit type code code
param
abstract node definit builder abstractnodedefinitionbuild abstract item definit builder abstractitemdefinitionbuild
sn allowsn
param default primari type node definit built
throw repositoryexcept
set default primari type setdefaultprimarytyp string repositori except repositoryexcept
param add requir primari type list name requir primari type
node definit built
throw repositoryexcept
add requir primari type addrequiredprimarytyp string repositori except repositoryexcept
param allowsn true build node definit sibl fals
throw repositoryexcept
set sibl setallowssamenames sn allowsn repositori except repositoryexcept
sn allowsn sn allowsn
