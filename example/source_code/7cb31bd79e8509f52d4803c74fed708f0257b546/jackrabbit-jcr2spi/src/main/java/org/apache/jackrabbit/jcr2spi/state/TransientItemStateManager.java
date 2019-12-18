org apach jackrabbit jcr2spi state
org apach jackrabbit jcr2spi oper oper
org apach jackrabbit jcr2spi hierarchi node entri nodeentri
org apach jackrabbit spi
org apach jackrabbit spi node definit qnodedefinit
org apach jackrabbit spi properti definit qpropertydefinit
org apach jackrabbit spi qvalu
org slf4j logger factori loggerfactori
org slf4j logger
javax jcr item exist except itemexistsexcept
javax jcr repositori except repositoryexcept
javax jcr nodetyp constraint violat except constraintviolationexcept
java util iter
code transientitemstatemanag code add support transient
link itemst method creat item state
modif invok item state instanc
creat node state
link createnewnodest string qnodedefinit nodest
link createnewpropertyst nodest qpropertydefinit qvalu int
transient item state manag transientitemstatemanag item state creation listen itemstatecreationlisten
logger instanc class
logger log logger factori loggerfactori logger getlogg transient item state manag transientitemstatemanag
chang log track maintain hard refer
chang item state
chang log changelog chang log changelog
transient item state manag transientitemstatemanag
chang log changelog chang log changelog
return oper record
iter oper getoper
chang log changelog oper getoper
add oper list oper record
transientitemstatemanag
param oper
add oper addoper oper oper
chang log changelog add oper addoper oper
return code true code transient ism pend
pend haspendingchang
chang log changelog empti isempti
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
node state nodest node state nodest node entri nodeentri parent hierarchi entri gethierarchyentri add node entri addnewnodeentri node nodenam uniqu uniqueid node type nodetypenam definit
parent mark modifi markmodifi
repositori except repositoryexcept
node state nodest hierarchi entri gethierarchyentri remov
node state nodest
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
properti state propertyst prop state propstat node entri nodeentri add properti entri addnewpropertyentri prop propnam definit
prop state propstat set valu setvalu valu properti type propertytyp
parent mark modifi markmodifi
repositori except repositoryexcept
prop state propstat hierarchi entri gethierarchyentri remov
prop state propstat
dispos transient item state manag clear refer
transient modifi item state
dispos
chang log changelog reset
remov state oper list changelog
intern changelog
param subchangelog
dispos chang log changelog chang log subchangelog
chang log changelog remov removeal chang log subchangelog
itemstatelifecyclelisten
depend statu state adapt chang log
revert state reset statu 'exist modified'
'existing' state 'existing' 'exist modified'
modifi set chang log
itemstatelifecyclelisten statuschang itemst int
statu chang statuschang item state itemst state previou statu previousstatu
chang log changelog empti isempti
state statu getstatu
statu exist
statu exist modifi exist modifi
statu exist remov exist remov
statu remov
chang log changelog statu chang statuschang state previou statu previousstatu
statu stale destroi stale destroi
statu stale modifi stale modifi
state stale modifi wait refresh
statu modifi
modifi exist state
transient modif state
ignor
statu invalid
log error itemst invalid statu state statu getstatu
itemstatecreationlisten
itemstatecreationlisten creat itemst
creat item state itemst state
state creat
state statu getstatu statu
chang log changelog ad state
