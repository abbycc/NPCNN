org apach jackrabbit core
org apach jackrabbit core config workspac config workspaceconfig
org apach jackrabbit core state share item state manag shareditemstatemanag
org apach jackrabbit core state item state manag xaitemstatemanag
org apach jackrabbit core state local item state manag localitemstatemanag
javax jcr workspac except nosuchworkspaceexcept
workspac extens work environ
workspac xaworkspac workspac impl workspaceimpl
workspac info attribut transact context
string attr workspac info attr workspac info
repositori impl repositoryimpl workspac info workspaceinfo getnam
protect constructor
param wspconfig workspac configur
param statemgr share item state manag
param rep repositori
param session session
workspac xaworkspac workspac config workspaceconfig wsp config wspconfig
share item state manag shareditemstatemanag state mgr statemgr repositori impl repositoryimpl rep
session impl sessionimpl session
wsp config wspconfig state mgr statemgr rep session
inheritdoc
local item state manag localitemstatemanag creat item state manag createitemstatemanag share item state manag shareditemstatemanag share
item state manag xaitemstatemanag share rep item state cach factori getitemstatecachefactori
return intern xaresourc begin
resourc chain link xasessionimpl init resourc lock
workspac code prepar code
return intern xaresourc
intern resourc internalxaresourc resourc begin getxaresourcebegin
intern resourc internalxaresourc
associ transact context transactioncontext
oper beforeoper transact context transactioncontext
prepar transact context transactioncontext
transact except transactionexcept
repositori impl repositoryimpl workspac info workspaceinfo wsp info wspinfo
rep workspac info getworkspaceinfo wsp config wspconfig getnam
wsp info wspinfo lock acquir lockacquir
set attribut setattribut attr workspac info attr workspac info wsp info wspinfo
workspac except nosuchworkspaceexcept
transact except transactionexcept error prepar transact
commit transact context transactioncontext
rollback transact context transactioncontext
oper afteroper transact context transactioncontext
return intern xaresourc end
resourc chain link xasessionimpl init resourc unlock
workspac code commit code code rollback code
return intern xaresourc
intern resourc internalxaresourc resourc end getxaresourceend
intern resourc internalxaresourc
associ transact context transactioncontext
oper beforeoper transact context transactioncontext
prepar transact context transactioncontext
commit transact context transactioncontext
repositori impl repositoryimpl workspac info workspaceinfo wsp info wspinfo
repositori impl repositoryimpl workspac info workspaceinfo
attribut getattribut attr workspac info attr workspac info
wsp info wspinfo
wsp info wspinfo lock releas lockreleas
remov attribut removeattribut attr workspac info attr workspac info
rollback transact context transactioncontext
repositori impl repositoryimpl workspac info workspaceinfo wsp info wspinfo
repositori impl repositoryimpl workspac info workspaceinfo
attribut getattribut attr workspac info attr workspac info
wsp info wspinfo
wsp info wspinfo lock releas lockreleas
remov attribut removeattribut attr workspac info attr workspac info
oper afteroper transact context transactioncontext
