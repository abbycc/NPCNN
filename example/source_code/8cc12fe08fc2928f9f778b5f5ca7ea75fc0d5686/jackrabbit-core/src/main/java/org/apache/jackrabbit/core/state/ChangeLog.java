org apach jackrabbit core state
org apach common collect map link map linkedmap
org apach jackrabbit core item itemid
java util iter
java util map
regist made state refer consolid
empti
chang log changelog
ad state
suppress warn suppresswarn uncheck
map item itemid item state itemst ad state addedst map item itemid item state itemst link map linkedmap
modifi state
suppress warn suppresswarn uncheck
map item itemid item state itemst modifi state modifiedst map item itemid item state itemst link map linkedmap
delet state
suppress warn suppresswarn uncheck
map item itemid item state itemst delet state deletedst map item itemid item state itemst link map linkedmap
modifi refer
suppress warn suppresswarn uncheck
map node refer nodereferencesid node refer noderefer modifi ref modifiedref map node refer nodereferencesid node refer noderefer link map linkedmap
check chang log method
avoid extra work updat
apach jackrabbit
href http issu apach org jira brows jcr jcr
return code true code log chang
code fals code
updat hasupd
ad state addedst empti isempti modifi state modifiedst empti isempti
delet state deletedst empti isempti modifi ref modifiedref empti isempti
state ad
param state state ad
ad item state itemst state
ad state addedst put state getid state
state modifi state state
collect ad disconnect
local state underli share state add
modifi state collect
param state state modifi
modifi item state itemst state
ad state addedst kei containskei state getid
state disconnect
modifi state modifiedst put state getid state
state delet state state
collect ad disconnect
local state underli share state remov
modifi state collect add
delet state collect
param state state delet
delet item state itemst state
ad state addedst remov state getid
state disconnect
modifi state modifiedst remov state getid
delet state deletedst put state getid state
refer modifi
param ref ref modifi
modifi node refer noderefer ref
modifi ref modifiedref put ref getid ref
return item state return code null code
item state ad modifi
section throw code nosuchitemstateexcept code
item state delet section
return item state code null code
throw nosuchitemstateexcept item delet
item state itemst item itemid item state except nosuchitemstateexcept
item state itemst state ad state addedst
state
state modifi state modifiedst
state
delet state deletedst kei containskei
item state except nosuchitemstateexcept state mark destroi
state
return flag indic item state exist
return code true code item state exist
log code fals code
item itemid
ad state addedst kei containskei modifi state modifiedst kei containskei
return flag indic item state mark
delet log
return code true code item state mark delet
log code fals code
delet item itemid
delet state deletedst kei containskei
return node refer object return
code null code node refer modifi
section
return node refer code null code
node refer noderefer node refer nodereferencesid
modifi ref modifiedref
return iter ad state
return iter ad state
iter item state itemst ad state addedst
ad state addedst valu iter
return iter modifi state
return iter modifi state
iter item state itemst modifi state modifiedst
modifi state modifiedst valu iter
return iter delet state
return iter delet state
iter item state itemst delet state deletedst
delet state deletedst valu iter
return iter modifi refer
return iter modifi refer
iter node refer noderefer modifi ref modifiedref
modifi ref modifiedref valu iter
merg chang log chang log
param chang log
merg chang log changelog
remov state 'added' set delet
iter item state itemst iter delet state deletedst
iter hasnext
item state itemst state iter
ad state addedst remov state getid
delet state deletedst put state getid state
remov possibl modifi state
modifi state modifiedst remov state getid
add modifi state 'added'
iter modifi state modifiedst
iter hasnext
item state itemst state iter
ad state addedst kei containskei state getid
modifi state modifiedst put state getid state
adapt statu replac 'added'
state set statu setstatu item state itemst statu statu
ad state addedst put state getid state
add 'added' state respect previous delet
iter ad state addedst
iter hasnext
item state itemst state iter
item state itemst delet state deletedst delet state deletedst remov state getid
delet state deletedst
newli 'added' state previous delet
merg oper result modifi state
adapt statu modcount add modifi
state set statu setstatu delet state deletedst statu getstatu
state set mod count setmodcount delet state deletedst mod count getmodcount
modifi state modifiedst put state getid state
ad state addedst put state getid state
add ref
modifi ref modifiedref put putal modifi ref modifiedref
push state contain map
item
push
iter item state itemst iter modifi state modifiedst
iter hasnext
iter push
iter delet state deletedst
iter hasnext
iter push
iter ad state addedst
iter hasnext
iter push
state persist updat
intern state notifi listen
persist
iter item state itemst iter modifi state modifiedst
iter hasnext
item state itemst state iter
state set statu setstatu item state itemst statu exist statu exist
state notifi state updat notifystateupd
iter delet state deletedst
iter hasnext
item state itemst state iter
state set statu setstatu item state itemst statu exist remov statu exist remov
state notifi state destroi notifystatedestroi
state discard
iter ad state addedst
iter hasnext
item state itemst state iter
state set statu setstatu item state itemst statu exist statu exist
state notifi state creat notifystatecr
reset chang log remov member insid
map built
reset
ad state addedst clear
modifi state modifiedst clear
delet state deletedst clear
modifi ref modifiedref clear
disconnect state chang log overlaid
state
disconnect
iter item state itemst iter modifi state modifiedst
iter hasnext
iter disconnect
iter delet state deletedst
iter hasnext
iter disconnect
iter ad state addedst
iter hasnext
iter disconnect
undo made item chang log discard
ad item refresh modifi resurrect delet
item
param parent parent manag hold current data
undo item state manag itemstatemanag parent
iter item state itemst iter modifi state modifiedst
iter hasnext
item state itemst state iter
state connect parent item state getitemst state getid
state pull
item state except itemstateexcept
state discard
iter delet state deletedst
iter hasnext
item state itemst state iter
state connect parent item state getitemst state getid
state pull
item state except itemstateexcept
state discard
iter ad state addedst
iter hasnext
iter discard
reset
return string represent chang log diagnost
purpos
return string represent chang log
string string tostr
string buffer stringbuff buf string buffer stringbuff
buf append
buf append addedst append ad state addedst size
buf append modifiedst append modifi state modifiedst size
buf append deletedst append delet state deletedst size
buf append modifiedref append modifi ref modifiedref size
buf append
buf string tostr
