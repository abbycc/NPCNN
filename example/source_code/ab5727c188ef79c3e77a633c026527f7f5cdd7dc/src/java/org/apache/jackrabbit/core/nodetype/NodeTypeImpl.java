org apach jackrabbit core nodetyp
org apach jackrabbit core base except baseexcept
org apach jackrabbit core illeg except illegalnameexcept
org apach jackrabbit core intern internalvalu
org apach jackrabbit core namespac resolv namespaceresolv
org apach jackrabbit core prefix declar except noprefixdeclaredexcept
org apach jackrabbit core qname
org apach jackrabbit core unknown prefix except unknownprefixexcept
org apach log4j logger
javax jcr properti type propertytyp
javax jcr repositori except repositoryexcept
javax jcr
javax jcr nodetyp constraint violat except constraintviolationexcept
javax jcr nodetyp node type except nosuchnodetypeexcept
javax jcr nodetyp node def nodedef
javax jcr nodetyp node type nodetyp
javax jcr nodetyp properti def propertydef
java util arrai list arraylist
java util hash set hashset
code nodetypeimpl code
node type impl nodetypeimpl node type nodetyp
logger log logger logger getlogg node type impl nodetypeimpl
node type def nodetypedef ntd
effect node type effectivenodetyp ent
node type manag impl nodetypemanagerimpl mgr ntmgr
namespac resolv translat qualifi name jcr name
namespac resolv namespaceresolv resolv nsresolv
packag privat constructor
creat valid node type instanc
assum node type definit valid referenc
node type supertyp requir node type exist valid
param ent effect merg resolv node type represent
param ntd definit node type
param ntmgr node type manag node type
param nsresolv namespac resolv
node type impl nodetypeimpl effect node type effectivenodetyp ent node type def nodetypedef ntd
node type manag impl nodetypemanagerimpl mgr ntmgr namespac resolv namespaceresolv resolv nsresolv
ent ent
mgr ntmgr mgr ntmgr
resolv nsresolv resolv nsresolv
store clone definit
ntd node type def nodetypedef ntd clone
clone support except clonenotsupportedexcept
log fatal intern error
intern error internalerror messag getmessag
return applic child node definit child node
param nodenam
return
throw repositoryexcept applic child node definit
found
node def impl nodedefimpl applic child node def getapplicablechildnodedef qname node nodenam
repositori except repositoryexcept
applic child node def getapplicablechildnodedef node nodenam
return applic child node definit child node
node type
param nodenam
param nodetypenam
return
throw repositoryexcept applic child node definit
found
node def impl nodedefimpl applic child node def getapplicablechildnodedef qname node nodenam qname node type nodetypenam
repositori except repositoryexcept
node def impl nodedefimpl ent applic child node def getapplicablechildnodedef node nodenam node type nodetypenam
mgr ntmgr resolv nsresolv
return applic properti definit properti
type
param propertynam
param type
param multivalu
return
throw repositoryexcept applic properti definit
found
properti def impl propertydefimpl applic properti def getapplicablepropertydef qname properti propertynam type
multi valu multivalu
repositori except repositoryexcept
properti def impl propertydefimpl ent applic properti def getapplicablepropertydef properti propertynam type multi valu multivalu
mgr ntmgr resolv nsresolv
check node type directli indirectli deriv
node type
param nodetypenam
return true node type directli indirectli deriv
node type fals
deriv isderivedfrom qname node type nodetypenam
node type nodetypenam equal ntd getnam ent includ node type includesnodetyp node type nodetypenam
return definit node type
return definit node type
node type def nodetypedef definit getdefinit
return clone definit
node type def nodetypedef ntd clone
clone support except clonenotsupportedexcept
log fatal intern error
intern error internalerror messag getmessag
return arrai child node definit
node type includ child node definit inherit supertyp
node type code link nodedef isautocr code
return code true code
return arrai child node definit
nodedef isautocr
node def nodedef auto creat node def getautocreatenodedef
child node def childnodedef cnda ent auto creat node def getautocreatenodedef
node def nodedef node def nodedef node def nodedef cnda length
cnda length
node def nodedef node def impl nodedefimpl cnda mgr ntmgr resolv nsresolv
node def nodedef
return arrai properti definit
node type includ properti definit inherit supertyp
node type code link propertydef isautocr code
return code true code
return arrai properti definit
propertydef isautocr
properti def propertydef auto creat properti def getautocreatepropertydef
prop def propdef pda ent auto creat prop def getautocreatepropdef
properti def propertydef prop def propdef properti def propertydef pda length
pda length
prop def propdef properti def impl propertydefimpl pda mgr ntmgr resolv nsresolv
prop def propdef
return arrai properti definit
node type includ properti definit inherit supertyp
node type code link propertydef ismandatori code
return code true code
return arrai properti definit
propertydef ismandatori
properti def propertydef mandatori properti def getmandatorypropertydef
prop def propdef pda ent mandatori prop def getmandatorypropdef
properti def propertydef prop def propdef properti def propertydef pda length
pda length
prop def propdef properti def impl propertydefimpl pda mgr ntmgr resolv nsresolv
prop def propdef
return arrai child node definit
node type includ child node definit inherit supertyp
node type code link nodedef ismandatori code
return code true code
return arrai child node definit
nodedef ismandatori
node def nodedef mandatori node def getmandatorynodedef
child node def childnodedef cnda ent mandatori node def getmandatorynodedef
node def nodedef node def nodedef node def nodedef cnda length
cnda length
node def nodedef node def impl nodedefimpl cnda mgr ntmgr resolv nsresolv
node def nodedef
test constraint defin properti definit
code def code satisfi code valu code
note protect flag check
param def definiton properti
param valu arrai code internalvalu code object
throw constraintviolationexcept
throw repositoryexcept
check set properti constraint checksetpropertyvalueconstraint properti def impl propertydefimpl def
intern internalvalu valu
constraint violat except constraintviolationexcept repositori except repositoryexcept
effect node type effectivenodetyp check set properti constraint checksetpropertyvalueconstraint def unwrap valu
return 'internal' fulli qualifi
return qualifi
qname getqnam
ntd getnam
return inherit supertyp node type
return arrai code nodetyp code object
getsupertyp
getdeclaredsupertyp
node type nodetyp inherit supertyp getinheritedsupertyp
declar supertyp
qname name ntname ntd supertyp getsupertyp
hash set hashset declar hash set hashset
name ntname length
declar add name ntname
supertyp
name ntname ent inherit node type getinheritednodetyp
filter supertyp declar
arrai list arraylist inherit arrai list arraylist
name ntname length
declar name ntname
inherit add mgr ntmgr node type getnodetyp name ntname
node type except nosuchnodetypeexcept
log error undefin supertyp
node type nodetyp
node type nodetyp inherit arrai toarrai node type nodetyp inherit size
nodetyp
inheritdoc
string getnam
ntd getnam jcr tojcrnam resolv nsresolv
prefix declar except noprefixdeclaredexcept npde
log error encount unregist namespac node type npde
ntd getnam string tostr
inheritdoc
string primari item getprimaryitemnam
qname pinam ntd primari item getprimaryitemnam
pinam pinam jcr tojcrnam resolv nsresolv
prefix declar except noprefixdeclaredexcept npde
log error encount unregist namespac primari item npde
ntd getnam string tostr
inheritdoc
mixin ismixin
ntd mixin ismixin
inheritdoc
node type isnodetyp string node type nodetypenam
qname ntname
ntname qname jcr fromjcrnam node type nodetypenam resolv nsresolv
illeg except illegalnameexcept in
log warn invalid node type node type nodetypenam in
unknown prefix except unknownprefixexcept up
log warn invalid node type node type nodetypenam up
getqnam equal ntname deriv isderivedfrom ntname
inheritdoc
order child node hasorderablechildnod
ntd order child node hasorderablechildnod
inheritdoc
node type nodetyp supertyp getsupertyp
qname name ntname ent inherit node type getinheritednodetyp
node type nodetyp supertyp node type nodetyp name ntname length
name ntname length
supertyp mgr ntmgr node type getnodetyp name ntname
node type except nosuchnodetypeexcept
log error undefin supertyp
node type nodetyp
supertyp
inheritdoc
node def nodedef child node def getchildnodedef
child node def childnodedef cnda ent node def getallnodedef
node def nodedef node def nodedef node def nodedef cnda length
cnda length
node def nodedef node def impl nodedefimpl cnda mgr ntmgr resolv nsresolv
node def nodedef
inheritdoc
properti def propertydef properti def getpropertydef
prop def propdef pda ent prop def getallpropdef
properti def propertydef prop def propdef properti def propertydef pda length
pda length
prop def propdef properti def impl propertydefimpl pda mgr ntmgr resolv nsresolv
prop def propdef
inheritdoc
node type nodetyp declar supertyp getdeclaredsupertyp
qname name ntname ntd supertyp getsupertyp
node type nodetyp supertyp node type nodetyp name ntname length
name ntname length
supertyp mgr ntmgr node type getnodetyp name ntname
node type except nosuchnodetypeexcept
log error undefin supertyp
node type nodetyp
supertyp
inheritdoc
node def nodedef declar child node def getdeclaredchildnodedef
child node def childnodedef cnda ntd child node def getchildnodedef
node def nodedef node def nodedef node def nodedef cnda length
cnda length
node def nodedef node def impl nodedefimpl cnda mgr ntmgr resolv nsresolv
node def nodedef
inheritdoc
set properti cansetproperti string properti propertynam
set properti null equival remov
remov item canremoveitem properti propertynam
qname qname jcr fromjcrnam properti propertynam resolv nsresolv
properti def impl propertydefimpl def
applic properti def getapplicablepropertydef type gettyp
def protect isprotect
def multipl ismultipl
intern internalvalu intern internalvalu intern internalvalu creat resolv nsresolv
check set properti constraint checksetpropertyvalueconstraint def intern internalvalu intern internalvalu
base except baseexcept
implement specif except fall
repositori except repositoryexcept
fall
inheritdoc
set properti cansetproperti string properti propertynam valu
valu
set properti null equival remov
remov item canremoveitem properti propertynam
qname qname jcr fromjcrnam properti propertynam resolv nsresolv
type valu length properti type propertytyp undefin valu type gettyp
properti def impl propertydefimpl def applic properti def getapplicablepropertydef type
def protect isprotect
def multipl ismultipl
arrai list arraylist list arrai list arraylist
convert valu compact arrai purg null entri
valu length
valu
intern internalvalu intern internalvalu intern internalvalu creat valu resolv nsresolv
list add intern internalvalu
intern internalvalu intern valu internalvalu intern internalvalu list arrai toarrai intern internalvalu list size
check set properti constraint checksetpropertyvalueconstraint def intern valu internalvalu
base except baseexcept
implement specif except fall
repositori except repositoryexcept
fall
inheritdoc
add child node canaddchildnod string child node childnodenam
ent check add node constraint checkaddnodeconstraint qname jcr fromjcrnam child node childnodenam resolv nsresolv
base except baseexcept
implement specif except fall
repositori except repositoryexcept
fall
inheritdoc
add child node canaddchildnod string child node childnodenam string node type nodetypenam
ent check add node constraint checkaddnodeconstraint qname jcr fromjcrnam child node childnodenam resolv nsresolv qname jcr fromjcrnam node type nodetypenam resolv nsresolv
base except baseexcept
implement specif except fall
repositori except repositoryexcept
fall
inheritdoc
remov item canremoveitem string item itemnam
ent check remov item constraint checkremoveitemconstraint qname jcr fromjcrnam item itemnam resolv nsresolv
base except baseexcept
implement specif except fall
repositori except repositoryexcept
fall
inheritdoc
properti def propertydef declar properti def getdeclaredpropertydef
prop def propdef pda ntd properti def getpropertydef
properti def propertydef prop def propdef properti def propertydef pda length
pda length
prop def propdef properti def impl propertydefimpl pda mgr ntmgr resolv nsresolv
prop def propdef
