org apach jackrabbit jcr2spi state
org apach common collect iter iter chain iteratorchain
org apach jackrabbit jcr2spi hierarchi hierarchi entri hierarchyentri
org apach jackrabbit jcr2spi hierarchi node entri nodeentri
org apach jackrabbit jcr2spi hierarchi properti entri propertyentri
org apach jackrabbit jcr2spi oper oper
org apach jackrabbit spi
org apach jackrabbit spi node definit qnodedefinit
org apach jackrabbit spi properti definit qpropertydefinit
org apach jackrabbit spi qvalu
org slf4j logger
org slf4j logger factori loggerfactori
javax jcr invalid item state except invaliditemstateexcept
javax jcr item exist except itemexistsexcept
javax jcr repositori except repositoryexcept
javax jcr nodetyp constraint violat except constraintviolationexcept
java util collect
java util iter
java util link hash set linkedhashset
java util set
code transientitemstatemanag code add support transient
link itemst method creat item state
modif invok item state instanc
creat node state
link createnewnodest string qnodedefinit nodest
link createnewpropertyst nodest qpropertydefinit qvalu int
transient item state manag transientitemstatemanag item state creation listen itemstatecreationlisten
logger instanc class
logger log logger factori loggerfactori logger getlogg transient item state manag transientitemstatemanag
ad state
set ad state addedst link hash set linkedhashset
modifi state
set modifi state modifiedst link hash set linkedhashset
remov state
set remov state removedst link hash set linkedhashset
stale state
set stale state stalest link hash set linkedhashset
set oper
set oper link hash set linkedhashset
transient item state manag transientitemstatemanag
return oper record
iter oper getoper
oper iter
add oper list oper record
transientitemstatemanag
param oper
add oper addoper oper oper
oper add oper
return code true code transient ism pend
pend haspendingchang
oper empti isempti
creat chang log tree start code target code
includ check changelog creat total 'self contained'
independ item scope updat oper
target depend tree
move node requir target node includ
parent save
param target
param throwonstal throw invaliditemstateexcept
code itemst code decend stale flag true
return
throw invaliditemstateexcept stale code itemst code
encount travers state hierarchi code changelog code
popul transient item state client
reus code changelog code except thrown
throw repositoryexcept code state code item state
chang log changelog chang log getchangelog item state itemst target throw stale throwonstal invalid item state except invaliditemstateexcept constraint violat except constraintviolationexcept repositori except repositoryexcept
fail fast test check statu item' state
target statu getstatu statu
string msg save revert item statu target
log debug msg
repositori except repositoryexcept msg
throw stale throwonstal statu stale isstal target statu getstatu
string msg attempt save revert item extern modifi target
log debug msg
invalid item state except invaliditemstateexcept msg
set op link hash set linkedhashset
set affect state affectedst link hash set linkedhashset
hierarchi entri hierarchyentri target hierarchi entri gethierarchyentri
parent getpar
root entri complet chang log
simplic collect op state omit
throw stale throwonstal stale state stalest empti isempti
string msg save state modifi extern
log debug msg
invalid item state except invaliditemstateexcept msg
affect state affectedst add addal stale state stalest
op add addal oper
affect state affectedst add addal ad state addedst
affect state affectedst add addal modifi state modifiedst
affect state affectedst add addal remov state removedst
root entri
check stale state scope save
throw stale throwonstal
iter stale state stalest iter hasnext
item state itemst state item state itemst
contain tree containedintre target state
string msg save state modifi extern
log debug msg
invalid item state except invaliditemstateexcept msg
collect affect state scope save undo
iter iter
ad state addedst iter
remov state removedst iter
modifi state modifiedst iter
iter chain iteratorchain chain iter chain iteratorchain
throw stale throwonstal
chain add iter additer stale state stalest iter
chain hasnext
item state itemst state item state itemst chain
contain tree containedintre target state
affect state affectedst add state
collect set oper
check affect state list oper
list modifi remov ad state collect
changelog
iter oper iter hasnext
oper oper
collect state opstat affect item state getaffecteditemst
iter osit state opstat iter osit hasnext
item state itemst state item state itemst osit
affect state affectedst state
oper includ
affect state affectedst containsal state opstat
incomplet changelog save parent
string msg changelog contain
constraint violat except constraintviolationexcept msg
violat add oper stop iter
affect state present oper
op add
chang log changelog chang log changelog target op affect state affectedst
creat transient link nodest overlai
link nodest
param nodenam code nodest code creat
param uniqueid uniqueid code nodest code creat
code null code creat code nodest code
identifi uniqu
param nodetypenam node type node state
param definit qualifi definit node state
param parent parent node state
return transient link nodest
node state nodest creat node state createnewnodest node nodenam string uniqu uniqueid node type nodetypenam
node definit qnodedefinit definit node state nodest parent
repositori except repositoryexcept
node entri nodeentri node entri nodeentri parent hierarchi entri gethierarchyentri add node entri addnewnodeentri node nodenam uniqu uniqueid node type nodetypenam definit
parent mark modifi markmodifi
repositori except repositoryexcept
remov
node state getnodest
creat transient properti state code parent code
node state
param propnam properti state creat
param parent node state properti ad
param definit
return creat properti state
throw itemexistsexcept code parent code properti
throw constraintviolationexcept
throw repositoryexcept
properti state propertyst creat properti state createnewpropertyst prop propnam node state nodest parent
properti definit qpropertydefinit definit
qvalu valu properti type propertytyp
item exist except itemexistsexcept constraint violat except constraintviolationexcept repositori except repositoryexcept
note caller make properti type 'undefined'
node entri nodeentri node entri nodeentri node entri nodeentri parent hierarchi entri gethierarchyentri
properti entri propertyentri node entri nodeentri add properti entri addnewpropertyentri prop propnam definit valu properti type propertytyp
parent mark modifi markmodifi
repositori except repositoryexcept
remov
properti state getpropertyst
dispos transient item state manag clear refer
transient modifi item state
dispos
ad state addedst clear
modifi state modifiedst clear
remov state removedst clear
stale state stalest clear
clear oper
oper clear
remov state oper list changelog intern
list modif
param subchangelog
dispos chang log changelog chang log subchangelog
set affect state affectedst chang log subchangelog affect state getaffectedst
ad state addedst remov removeal affect state affectedst
modifi state modifiedst remov removeal affect state affectedst
remov state removedst remov removeal affect state affectedst
stale state stalest remov removeal affect state affectedst
oper remov removeal chang log subchangelog oper getoper
state remov state state
collect ad remov
modifi state collect add
remov state collect
param state state remov
remov item state itemst state
ad state addedst remov state
modifi state modifiedst remov state
remov state removedst add state
param parent
param state
return
contain tree containedintre item state itemst parent item state itemst state
hierarchi entri hierarchyentri state hierarchi entri gethierarchyentri
hierarchi entri hierarchyentri phe parent hierarchi entri gethierarchyentri
short cut
phe parent getpar phe
parent node isnod phe parent getpar
simpl case walk hierarchi
hierarchi entri hierarchyentri parent getpar
phe
parent getpar
state descend 'parent'
itemstatelifecyclelisten
depend statu state adapt chang log
revert state reset statu 'exist modified'
'existing' state 'existing' 'exist modified'
modifi set chang log
itemstatelifecyclelisten statuschang itemst int
statu chang statuschang item state itemst state previou statu previousstatu
updat collect state transient modifi
note cleanup oper omit expect
occur link changelog save link changelog undo
extern modif contrast clash transient modif
render state stale
state statu getstatu
statu exist
previou statu previousstatu
statu exist modifi exist modifi
modifi persist revert
modifi state modifiedst remov state
statu exist remov exist remov
transient remov revert
remov state removedst remov state
statu stale modifi stale modifi
modifi stale revert
stale state stalest remov state
statu
save
ad state addedst remov state
default
invalid modifi ignor effect transient modif
statu chang invalid statu isvalidstatuschang int int
statu exist modifi exist modifi
transit exist exist modifi
modifi state modifiedst add state
statu exist remov exist remov
transit exist exist modifi exist remov
remov state
statu remov
previou statu previousstatu
statu exist remov exist remov
transient remov remov persist
ignor
statu
entri remov rememb remov
order oper affect
state sync
remov state
statu stale destroi stale destroi
statu stale modifi stale modifi
state stale due extern modif move
collect stale item state
valid omit 'exist modified' state
stale link statu isvalidstatuschang int int
modifi state modifiedst remov state
stale state stalest add state
statu modifi
statu invalid
modifi invalid ignor
log debug item state getnam chang statu statu getnam previou statu previousstatu statu getnam state statu getstatu
log error itemst state getnam invalid statu state statu getstatu
itemstatecreationlisten
itemstatecreationlisten creat itemst
creat item state itemst state
state creat
state statu getstatu statu
ad state addedst add state
