org apach jackrabbit core nodetyp
org apach jackrabbit core intern internalvalu
org apach jackrabbit spi
org apach jackrabbit spi constraint qvalueconstraint
org apach jackrabbit spi item definit qitemdefinit
org apach jackrabbit spi properti definit qpropertydefinit
org apach jackrabbit spi node definit qnodedefinit
org apach jackrabbit spi node type definit qnodetypedefinit
org slf4j logger
org slf4j logger factori loggerfactori
javax jcr properti type propertytyp
javax jcr repositori except repositoryexcept
javax jcr nodetyp constraint violat except constraintviolationexcept
javax jcr nodetyp node type except nosuchnodetypeexcept
java util arrai list arraylist
java util arrai
java util hash map hashmap
java util list
java util map
java util tree set treeset
java util set
java util hash set hashset
code effectivenodetyp code repres
code nodetyp code 'effective' node type inherit
resolv
instanc code effectivenodetyp code immut
effect node type effectivenodetyp cloneabl
logger log logger factori loggerfactori logger getlogg effect node type effectivenodetyp
list explicitli aggreg merg node type
tree set treeset merg node type mergednodetyp
list implicitli aggreg inherit node type
tree set treeset inherit node type inheritednodetyp
list explicitli aggreg implicitli
inherit includ node type
tree set treeset node type allnodetyp
map name item definit map list definit
hash map hashmap list item definit qitemdefinit name item def nameditemdef
list unnam item definit residu definit
arrai list arraylist item definit qitemdefinit unnam item def unnameditemdef
flag indic includ node type support order child node
order child node orderablechildnod
primari item primaryitemnam
privat constructor
effect node type effectivenodetyp
merg node type mergednodetyp tree set treeset
inherit node type inheritednodetyp tree set treeset
node type allnodetyp tree set treeset
name item def nameditemdef hash map hashmap list item definit qitemdefinit
unnam item def unnameditemdef arrai list arraylist item definit qitemdefinit
order child node orderablechildnod
primari item primaryitemnam
packag privat factori method
creat effect node type represent node type definit
note definit referenc node type contain
code ntdcach code
param ntd node type definit
param entcach cach built effect node type
param ntdcach cach node type definit resolv depend
return effect node type represent node type definit
throw nodetypeconflictexcept node type definit invalid
due ambigu child definit
throw nosuchnodetypeexcept node type refer supertyp
resolv
effect node type effectivenodetyp creat node type definit qnodetypedefinit ntd
effect node type cach effectivenodetypecach ent cach entcach
map node type definit qnodetypedefinit ntd cach ntdcach
node type conflict except nodetypeconflictexcept node type except nosuchnodetypeexcept
creat empti effect node type instanc
effect node type effectivenodetyp ent effect node type effectivenodetyp
ntname ntd getnam
prepar instanc
ent merg node type mergednodetyp add ntname
ent node type allnodetyp add ntname
map item definit map definit
effect detect ambigu child definit
ambigu defin term definit ident
set item definit qitemdefinit item def itemdef hash set hashset item definit qitemdefinit
node definit qnodedefinit cnda ntd child node def getchildnodedef
node definit qnodedefinit cnda acnda cnda
check child node definit ambigu
node type definit
item def itemdef cnda acnda
conflict
string msg
cnda acnda defin residu definesresidu
msg ntname ambigu residu child node definit
msg ntname ambigu definit child node name
cnda acnda getnam
log debug msg
node type conflict except nodetypeconflictexcept msg
item def itemdef add cnda acnda
cnda acnda defin residu definesresidu
residu node definit
ent unnam item def unnameditemdef add cnda acnda
name node definit
cnda acnda getnam
list item definit qitemdefinit def ent name item def nameditemdef
def
def arrai list arraylist item definit qitemdefinit
ent name item def nameditemdef put def
def size
exist definit
make auto creat
item definit qitemdefinit def def
cnda acnda auto creat isautocr def auto creat isautocr
conflict
string msg 'auto create' item definit
node type ntname
log debug msg
node type conflict except nodetypeconflictexcept msg
def add cnda acnda
properti definit qpropertydefinit pda ntd properti def getpropertydef
properti definit qpropertydefinit pda apda pda
check properti definit ambigu
node type definit
item def itemdef pda apda
conflict
string msg
pda apda defin residu definesresidu
msg ntname ambigu residu properti definit
msg ntname ambigu definit properti name
pda apda getnam
log debug msg
node type conflict except nodetypeconflictexcept msg
item def itemdef add pda apda
pda apda defin residu definesresidu
residu properti definit
ent unnam item def unnameditemdef add pda apda
name properti definit
pda apda getnam
list item definit qitemdefinit def ent name item def nameditemdef
def
def arrai list arraylist item definit qitemdefinit
ent name item def nameditemdef put def
def size
exist definit
make auto creat
item definit qitemdefinit def def
pda apda auto creat isautocr def auto creat isautocr
conflict
string msg 'auto create' item definit
node type ntname
log debug msg
node type conflict except nodetypeconflictexcept msg
def add pda apda
resolv supertyp recurs
supertyp ntd supertyp getsupertyp
supertyp length
effect node type effectivenodetyp base
node type registri nodetyperegistri effect node type geteffectivenodetyp supertyp ent cach entcach ntd cach ntdcach
ent intern merg internalmerg base
resolv 'order child nodes' attribut jcr
ntd order child node hasorderablechildnod
ent order child node orderablechildnod
nta ent inherit node type getinheritednodetyp
nta anta nta
node type definit qnodetypedefinit def ntd cach ntdcach nta anta
def order child node hasorderablechildnod
ent order child node orderablechildnod
resolv 'primari item' attribut jcr
ntd primari item getprimaryitemnam
ent primari item primaryitemnam ntd primari item getprimaryitemnam
nta ent inherit node type getinheritednodetyp
nta anta nta
node type definit qnodetypedefinit def ntd cach ntdcach nta anta
def primari item getprimaryitemnam
ent primari item primaryitemnam def primari item getprimaryitemnam
ent
packag privat factori method creat 'empty' effect
node type instanc
return 'empty' effect node type instanc
effect node type effectivenodetyp creat
effect node type effectivenodetyp
return true includ node type support
'order child nodes' return fals
return code true code effect node type order child node
order child node hasorderablechildnod
order child node orderablechildnod
primari item getprimaryitemnam
primari item primaryitemnam
merg node type getmergednodetyp
merg node type mergednodetyp arrai toarrai merg node type mergednodetyp size
inherit node type getinheritednodetyp
inherit node type inheritednodetyp arrai toarrai inherit node type inheritednodetyp size
node type getallnodetyp
node type allnodetyp arrai toarrai node type allnodetyp size
item definit qitemdefinit item def getallitemdef
name item def nameditemdef size unnam item def unnameditemdef size
item definit qitemdefinit empti arrai empti arrai
arrai list arraylist item definit qitemdefinit def arrai list arraylist item definit qitemdefinit name item def nameditemdef size unnam item def unnameditemdef size
list item definit qitemdefinit item def itemdef name item def nameditemdef valu
def add addal item def itemdef
def add addal unnam item def unnameditemdef
def size
item definit qitemdefinit empti arrai empti arrai
def arrai toarrai item definit qitemdefinit def size
item definit qitemdefinit name item def getnameditemdef
name item def nameditemdef size
item definit qitemdefinit empti arrai empti arrai
arrai list arraylist item definit qitemdefinit def arrai list arraylist item definit qitemdefinit name item def nameditemdef size
list item definit qitemdefinit item def itemdef name item def nameditemdef valu
def add addal item def itemdef
def size
item definit qitemdefinit empti arrai empti arrai
def arrai toarrai item definit qitemdefinit def size
item definit qitemdefinit unnam item def getunnameditemdef
unnam item def unnameditemdef size
item definit qitemdefinit empti arrai empti arrai
unnam item def unnameditemdef arrai toarrai item definit qitemdefinit unnam item def unnameditemdef size
name item def hasnameditemdef
name item def nameditemdef kei containskei
item definit qitemdefinit name item def getnameditemdef
list item definit qitemdefinit def name item def nameditemdef
def def size
item definit qitemdefinit empti arrai empti arrai
def arrai toarrai item definit qitemdefinit def size
node definit qnodedefinit node def getallnodedef
name item def nameditemdef size unnam item def unnameditemdef size
node definit qnodedefinit empti arrai empti arrai
arrai list arraylist node definit qnodedefinit def arrai list arraylist node definit qnodedefinit name item def nameditemdef size unnam item def unnameditemdef size
item definit qitemdefinit def unnam item def unnameditemdef
def defin node definesnod
def add node definit qnodedefinit def
list item definit qitemdefinit list name item def nameditemdef valu
item definit qitemdefinit def list
def defin node definesnod
def add node definit qnodedefinit def
def size
node definit qnodedefinit empti arrai empti arrai
def arrai toarrai node definit qnodedefinit def size
node definit qnodedefinit name node def getnamednodedef
name item def nameditemdef size
node definit qnodedefinit empti arrai empti arrai
arrai list arraylist node definit qnodedefinit def arrai list arraylist node definit qnodedefinit name item def nameditemdef size
list item definit qitemdefinit list name item def nameditemdef valu
item definit qitemdefinit def list
def defin node definesnod
def add node definit qnodedefinit def
def size
node definit qnodedefinit empti arrai empti arrai
def arrai toarrai node definit qnodedefinit def size
node definit qnodedefinit name node def getnamednodedef
list item definit qitemdefinit list name item def nameditemdef
list list size
node definit qnodedefinit empti arrai empti arrai
arrai list arraylist node definit qnodedefinit def arrai list arraylist node definit qnodedefinit list size
item definit qitemdefinit def list
def defin node definesnod
def add node definit qnodedefinit def
def size
node definit qnodedefinit empti arrai empti arrai
def arrai toarrai node definit qnodedefinit def size
node definit qnodedefinit unnam node def getunnamednodedef
unnam item def unnameditemdef size
node definit qnodedefinit empti arrai empti arrai
arrai list arraylist node definit qnodedefinit def arrai list arraylist node definit qnodedefinit unnam item def unnameditemdef size
item definit qitemdefinit def unnam item def unnameditemdef
def defin node definesnod
def add node definit qnodedefinit def
def size
node definit qnodedefinit empti arrai empti arrai
def arrai toarrai node definit qnodedefinit def size
node definit qnodedefinit auto creat node def getautocreatenodedef
auto creat item
search name item definit
name item def nameditemdef size
node definit qnodedefinit empti arrai empti arrai
arrai list arraylist node definit qnodedefinit def arrai list arraylist node definit qnodedefinit name item def nameditemdef size
list item definit qitemdefinit list name item def nameditemdef valu
item definit qitemdefinit def list
def defin node definesnod def auto creat isautocr
def add node definit qnodedefinit def
def size
node definit qnodedefinit empti arrai empti arrai
def arrai toarrai node definit qnodedefinit def size
properti definit qpropertydefinit prop def getallpropdef
name item def nameditemdef size unnam item def unnameditemdef size
properti definit qpropertydefinit empti arrai empti arrai
arrai list arraylist properti definit qpropertydefinit def arrai list arraylist properti definit qpropertydefinit name item def nameditemdef size unnam item def unnameditemdef size
item definit qitemdefinit def unnam item def unnameditemdef
def defin node definesnod
def add properti definit qpropertydefinit def
list item definit qitemdefinit list name item def nameditemdef valu
item definit qitemdefinit def list
def defin node definesnod
def add properti definit qpropertydefinit def
def size
properti definit qpropertydefinit empti arrai empti arrai
def arrai toarrai properti definit qpropertydefinit def size
properti definit qpropertydefinit name prop def getnamedpropdef
name item def nameditemdef size
properti definit qpropertydefinit empti arrai empti arrai
arrai list arraylist properti definit qpropertydefinit def arrai list arraylist properti definit qpropertydefinit name item def nameditemdef size
list item definit qitemdefinit list name item def nameditemdef valu
item definit qitemdefinit def list
def defin node definesnod
def add properti definit qpropertydefinit def
def size
properti definit qpropertydefinit empti arrai empti arrai
def arrai toarrai properti definit qpropertydefinit def size
properti definit qpropertydefinit name prop def getnamedpropdef
list item definit qitemdefinit list name item def nameditemdef
list list size
properti definit qpropertydefinit empti arrai empti arrai
arrai list arraylist properti definit qpropertydefinit def arrai list arraylist properti definit qpropertydefinit list size
item definit qitemdefinit def list
def defin node definesnod
def add properti definit qpropertydefinit def
def size
properti definit qpropertydefinit empti arrai empti arrai
def arrai toarrai properti definit qpropertydefinit def size
properti definit qpropertydefinit unnam prop def getunnamedpropdef
unnam item def unnameditemdef size
properti definit qpropertydefinit empti arrai empti arrai
arrai list arraylist properti definit qpropertydefinit def arrai list arraylist properti definit qpropertydefinit unnam item def unnameditemdef size
item definit qitemdefinit def unnam item def unnameditemdef
def defin node definesnod
def add properti definit qpropertydefinit def
def size
properti definit qpropertydefinit empti arrai empti arrai
def arrai toarrai properti definit qpropertydefinit def size
properti definit qpropertydefinit auto creat prop def getautocreatepropdef
auto creat item
search name item definit
name item def nameditemdef size
properti definit qpropertydefinit empti arrai empti arrai
arrai list arraylist properti definit qpropertydefinit def arrai list arraylist properti definit qpropertydefinit name item def nameditemdef size
list item definit qitemdefinit list name item def nameditemdef valu
item definit qitemdefinit def list
def defin node definesnod def auto creat isautocr
def add properti definit qpropertydefinit def
def size
properti definit qpropertydefinit empti arrai empti arrai
def arrai toarrai properti definit qpropertydefinit def size
properti definit qpropertydefinit mandatori prop def getmandatorypropdef
mandatori item
search name item definit
name item def nameditemdef size
properti definit qpropertydefinit empti arrai empti arrai
arrai list arraylist properti definit qpropertydefinit def arrai list arraylist properti definit qpropertydefinit name item def nameditemdef size
list item definit qitemdefinit list name item def nameditemdef valu
item definit qitemdefinit def list
def defin node definesnod def mandatori ismandatori
def add properti definit qpropertydefinit def
def size
properti definit qpropertydefinit empti arrai empti arrai
def arrai toarrai properti definit qpropertydefinit def size
node definit qnodedefinit mandatori node def getmandatorynodedef
mandatori item
search name item definit
name item def nameditemdef size
node definit qnodedefinit empti arrai empti arrai
arrai list arraylist node definit qnodedefinit def arrai list arraylist node definit qnodedefinit name item def nameditemdef size
list item definit qitemdefinit list name item def nameditemdef valu
item definit qitemdefinit def list
def defin node definesnod def mandatori ismandatori
def add node definit qnodedefinit def
def size
node definit qnodedefinit empti arrai empti arrai
def arrai toarrai node definit qnodedefinit def size
determin effect node type represent includ
inherit aggreg node type
param nodetypenam node type
return code true code node type includ
code fals code
includ node type includesnodetyp node type nodetypenam
node type allnodetyp node type nodetypenam
determin effect node type represent includ
inherit aggreg node type
param nodetypenam arrai node type name
return code true code node type includ
code fals code
includ node type includesnodetyp node type name nodetypenam
node type allnodetyp containsal arrai list aslist node type name nodetypenam
test constraint defin properti definit
code code satisfi code valu code
note protect flag check note
type convers attempt type valu
match requir type definit
param definiton properti
param valu arrai code internalvalu code object
throw constraintviolationexcept constraint defin
properti definit satisfi
valu
throw repositoryexcept error occur
check set properti constraint checksetpropertyvalueconstraint properti definit qpropertydefinit
intern internalvalu valu
constraint violat except constraintviolationexcept repositori except repositoryexcept
check multi flag
multipl ismultipl valu valu length
constraint violat except constraintviolationexcept properti multi valu
constraint qvalueconstraint constraint constraint getvalueconstraint
constraint constraint length
constraint check
valu valu length
check constraint
intern internalvalu valu
constraint
satisfi
constraint violat except constraintviolationexcept cve
constraint qvalueconstraint constraint constraint
constraint check
satisfi
constraint violat except constraintviolationexcept
cve
satisfi
throw except encount
cve
param
throw constraintviolationexcept
check add node constraint checkaddnodeconstraint
constraint violat except constraintviolationexcept
applic child node def getapplicablechildnodedef
node type except nosuchnodetypeexcept nsnte
string msg intern error inconsist node type
log debug msg
constraint violat except constraintviolationexcept msg nsnte
param
param nodetypenam
param ntreg
throw constraintviolationexcept
throw nosuchnodetypeexcept
check add node constraint checkaddnodeconstraint node type nodetypenam
node type registri nodetyperegistri reg ntreg
constraint violat except constraintviolationexcept node type except nosuchnodetypeexcept
node type nodetypenam
node type definit qnodetypedefinit def ntdef reg ntreg node type def getnodetypedef node type nodetypenam
def ntdef abstract isabstract
constraint violat except constraintviolationexcept node type nodetypenam abstract
def ntdef mixin ismixin
constraint violat except constraintviolationexcept node type nodetypenam mixin
item definit qitemdefinit applic child node def getapplicablechildnodedef node type nodetypenam reg ntreg
protect isprotect
constraint violat except constraintviolationexcept protect
auto creat isautocr
constraint violat except constraintviolationexcept auto creat manual ad
return applic child node definit child node
node type multipl applic definit
name definit preced residu definit
param
param nodetypenam
param ntreg
return
throw nosuchnodetypeexcept
throw constraintviolationexcept applic child node definit
found
node definit qnodedefinit applic child node def getapplicablechildnodedef node type nodetypenam
node type registri nodetyperegistri reg ntreg
node type except nosuchnodetypeexcept constraint violat except constraintviolationexcept
effect node type effectivenodetyp ent target enttarget
node type nodetypenam
ent target enttarget reg ntreg effect node type geteffectivenodetyp node type nodetypenam
ent target enttarget
name node definit
item definit qitemdefinit def name item def getnameditemdef
item definit qitemdefinit def def
def defin node definesnod
node definit qnodedefinit node definit qnodedefinit def
type requir primari type getrequiredprimarytyp
node definit exist
ent target enttarget type
check 'requir primari types' constraint
ent target enttarget includ node type includesnodetyp type
found name node definit
default primari type getdefaultprimarytyp
found node definit default node type
item defin
residu node definit
node definit qnodedefinit nda unnam node def getunnamednodedef
node definit qnodedefinit nda
ent target enttarget requir primari type getrequiredprimarytyp
check 'requir primari types' constraint
ent target enttarget includ node type includesnodetyp requir primari type getrequiredprimarytyp
found residu node definit
node type node
determin default node type
default primari type getdefaultprimarytyp
found residu node definit default node type
applic definit found
constraint violat except constraintviolationexcept match child node definit found
return applic properti definit properti
type multivalu characterist
multipl applic definit rule appli
name definit prefer residu definit
definit specif requir type prefer definit
requir type undefin
param
param type
param multivalu
return
throw constraintviolationexcept applic properti definit
found
properti definit qpropertydefinit applic properti def getapplicablepropertydef type
multi valu multivalu
constraint violat except constraintviolationexcept
name properti definit
properti definit qpropertydefinit match
match prop def getmatchingpropdef name prop def getnamedpropdef type multi valu multivalu
match
match
item defin
residu properti definit
match match prop def getmatchingpropdef unnam prop def getunnamedpropdef type multi valu multivalu
match
match
applic definit found
constraint violat except constraintviolationexcept match properti definit found
return applic properti definit properti
type multivalu flag account
select algorithm
code link getapplicablepropertydef int boolean code
method multivalu flag account
select algorithm applic definit
rule appli
name definit prefer residu definit
definit specif requir type prefer definit
requir type undefin
singl definit prefer multipl definit
param
param type
return
throw constraintviolationexcept applic properti definit
found
properti definit qpropertydefinit applic properti def getapplicablepropertydef type
constraint violat except constraintviolationexcept
name properti definit
properti definit qpropertydefinit match match prop def getmatchingpropdef name prop def getnamedpropdef type
match
match
item defin
residu properti definit
match match prop def getmatchingpropdef unnam prop def getunnamedpropdef type
match
match
applic definit found
constraint violat except constraintviolationexcept match properti definit found
properti definit qpropertydefinit match prop def getmatchingpropdef properti definit qpropertydefinit def type
properti definit qpropertydefinit match
properti definit qpropertydefinit def
req type reqtyp requir type getrequiredtyp
match type
req type reqtyp properti type propertytyp undefin
type properti type propertytyp undefin
req type reqtyp type
match
match
check definit match
match requir type getrequiredtyp requir type getrequiredtyp
match requir type getrequiredtyp properti type propertytyp undefin
found match
match
match multipl ismultipl multipl ismultipl
found match
match
match requir type getrequiredtyp properti type propertytyp undefin
match multipl ismultipl
found match outta
match
match
properti definit qpropertydefinit match prop def getmatchingpropdef properti definit qpropertydefinit def type
multi valu multivalu
properti definit qpropertydefinit match
properti definit qpropertydefinit def
req type reqtyp requir type getrequiredtyp
match type
req type reqtyp properti type propertytyp undefin
type properti type propertytyp undefin
req type reqtyp type
match multivalu flag
multi valu multivalu multipl ismultipl
found match
requir type getrequiredtyp properti type propertytyp undefin
found match outta
match
match
match
param
throw constraintviolationexcept
check remov item constraint checkremoveitemconstraint constraint violat except constraintviolationexcept
multipl definit
applic check
item definit qitemdefinit def name item def getnameditemdef
def
item definit qitemdefinit def def
def mandatori ismandatori
constraint violat except constraintviolationexcept remov mandatori item
def protect isprotect
constraint violat except constraintviolationexcept remov protect item
param
throw constraintviolationexcept
check remov node constraint checkremovenodeconstraint constraint violat except constraintviolationexcept
multipl definit
applic check
node definit qnodedefinit def name node def getnamednodedef
def
node definit qnodedefinit def def
def mandatori ismandatori
constraint violat except constraintviolationexcept remov mandatori node
def protect isprotect
constraint violat except constraintviolationexcept remov protect node
param
throw constraintviolationexcept
check remov properti constraint checkremovepropertyconstraint constraint violat except constraintviolationexcept
multipl definit
applic check
item definit qitemdefinit def name prop def getnamedpropdef
def
item definit qitemdefinit def def
def mandatori ismandatori
constraint violat except constraintviolationexcept remov mandatori properti
def protect isprotect
constraint violat except constraintviolationexcept remov protect properti
merg code effectivenodetyp code
check merg conflict
param
return
throw nodetypeconflictexcept
effect node type effectivenodetyp merg effect node type effectivenodetyp
node type conflict except nodetypeconflictexcept
creat clone instanc perform merg
'clone' avoid potenti inconsist state
instanc except thrown
merg
effect node type effectivenodetyp copi effect node type effectivenodetyp clone
copi intern merg internalmerg
copi
intern helper method merg code effectivenodetyp code
instanc instanc
warn instanc inconsist state except
thrown
param
param supertyp true merg result inherit code code
repres supertyp instanc fals
merg result explicit aggreg
throw nodetypeconflictexcept
intern merg internalmerg effect node type effectivenodetyp supertyp
node type conflict except nodetypeconflictexcept
nta node type getallnodetyp
includ count includedcount
nta anta nta
includ node type includesnodetyp nta anta
redund node type
log debug node type nta anta contain
includ count includedcount
includ count includedcount nta length
total overlap ignor
name item definit
item definit qitemdefinit def name item def getnameditemdef
item definit qitemdefinit def def
includ node type includesnodetyp def declar node type getdeclaringnodetyp
ignor redund definit
def getnam
list item definit qitemdefinit exist def existingdef name item def nameditemdef
exist def existingdef
exist def existingdef size
exist definit
item definit qitemdefinit exist def existingdef exist def existingdef
make auto creat
def auto creat isautocr exist def existingdef auto creat isautocr
conflict
string msg item definit
node type
def declar node type getdeclaringnodetyp
conflict node type
exist def existingdef declar node type getdeclaringnodetyp
collis auto creat definit
log debug msg
node type conflict except nodetypeconflictexcept msg
check ambigu definit
def defin node definesnod exist def existingdef defin node definesnod
def defin node definesnod
properti definit
properti definit qpropertydefinit properti definit qpropertydefinit def
properti definit qpropertydefinit epd properti definit qpropertydefinit exist def existingdef
compar type multivalu flag
requir type getrequiredtyp epd requir type getrequiredtyp
multipl ismultipl epd multipl ismultipl
conflict
string msg properti definit
node type
def declar node type getdeclaringnodetyp
conflict node type
exist def existingdef declar node type getdeclaringnodetyp
ambigu properti definit
log debug msg
node type conflict except nodetypeconflictexcept msg
child node definit
conflict
string msg child node definit
node type
def declar node type getdeclaringnodetyp
conflict node type
exist def existingdef declar node type getdeclaringnodetyp
ambigu child node definit
log debug msg
node type conflict except nodetypeconflictexcept msg
exist def existingdef arrai list arraylist item definit qitemdefinit
name item def nameditemdef put exist def existingdef
exist def existingdef add def
residu item definit
def unnam item def getunnameditemdef
item definit qitemdefinit def def
includ node type includesnodetyp def declar node type getdeclaringnodetyp
ignor redund definit
item definit qitemdefinit exist unnam item def unnameditemdef
compar exist definit
def defin node definesnod exist defin node definesnod
def defin node definesnod
properti definit
properti definit qpropertydefinit properti definit qpropertydefinit def
properti definit qpropertydefinit epd properti definit qpropertydefinit exist
compar type multivalu flag
requir type getrequiredtyp epd requir type getrequiredtyp
multipl ismultipl epd multipl ismultipl
conflict
string msg properti definit node type
def declar node type getdeclaringnodetyp
conflict node type
exist declar node type getdeclaringnodetyp
ambigu residu properti definit
log debug msg
node type conflict except nodetypeconflictexcept msg
child node definit
node definit qnodedefinit node definit qnodedefinit def
node definit qnodedefinit end node definit qnodedefinit exist
compar requir default primari type
arrai equal requir primari type getrequiredprimarytyp end requir primari type getrequiredprimarytyp
default primari type getdefaultprimarytyp
end default primari type getdefaultprimarytyp
default primari type getdefaultprimarytyp equal end default primari type getdefaultprimarytyp
conflict
string msg child node definit node type
def declar node type getdeclaringnodetyp
conflict node type
exist declar node type getdeclaringnodetyp
ambigu residu child node definit
log debug msg
node type conflict except nodetypeconflictexcept msg
unnam item def unnameditemdef add def
node type allnodetyp add addal arrai list aslist nta
supertyp
implicit merg result inherit
add merg node type supertyp
nta merg node type getmergednodetyp
inherit node type inheritednodetyp add addal arrai list aslist nta
add supertyp merg node type supertyp
nta inherit node type getinheritednodetyp
inherit node type inheritednodetyp add addal arrai list aslist nta
explicit merg
merg merg node type
nta merg node type getmergednodetyp
merg node type mergednodetyp add addal arrai list aslist nta
add supertyp merg node type supertyp
nta inherit node type getinheritednodetyp
inherit node type inheritednodetyp add addal arrai list aslist nta
updat 'order child nodes' attribut jcr
order child node hasorderablechildnod
order child node orderablechildnod
updat 'primari item' attribut jcr
primari item primaryitemnam primari item getprimaryitemnam
primari item primaryitemnam primari item getprimaryitemnam
overrid
object clone
effect node type effectivenodetyp clone effect node type effectivenodetyp
clone merg node type mergednodetyp add addal merg node type mergednodetyp
clone inherit node type inheritednodetyp add addal inherit node type inheritednodetyp
clone node type allnodetyp add addal node type allnodetyp
name item def nameditemdef kei set keyset
list item definit qitemdefinit list name item def nameditemdef
clone name item def nameditemdef put arrai list arraylist item definit qitemdefinit list
clone unnam item def unnameditemdef add addal unnam item def unnameditemdef
clone order child node orderablechildnod order child node orderablechildnod
clone primari item primaryitemnam primari item primaryitemnam
clone
