org apach jackrabbit core secur
org apach jackrabbit core item itemid
org apach jackrabbit core secur author access control provid accesscontrolprovid
org apach jackrabbit core secur author workspac access manag workspaceaccessmanag
org apach jackrabbit spi
org apach jackrabbit spi path
javax jcr access deni except accessdeniedexcept
javax jcr item found except itemnotfoundexcept
javax jcr repositori except repositoryexcept
code accessmanag code queri determin privileg
grant specif item
access manag accessmanag
read permiss constant
deprec
read
write permiss constant
deprec
write
remov permiss constant
deprec
remov
initi access manag code accessdeniedexcept code
thrown subject code context code
grant access workspac
param context access manag context
throw accessdeniedexcept subject grant access
workspac
throw except error occur
init context amcontext context access deni except accessdeniedexcept except
initi access manag code accessdeniedexcept code
thrown subject code context code
grant access workspac
param context access manag context
param acprovid access control provid
param wspaccessmgr workspac access manag
throw accessdeniedexcept subject grant access
workspac
throw except error occur
init context amcontext context access control provid accesscontrolprovid provid acprovid
workspac access manag workspaceaccessmanag wsp access mgr wspaccessmgr access deni except accessdeniedexcept except
close access manag close access manag
oper object treat illeg throw
throw except error occur
close except
determin code permiss code grant
item code code target item
param target item
param permiss combin constant
encod bitmask
code read code
code write code
code remov code
throw accessdeniedexcept permiss deni
throw itemnotfoundexcept target item exist
throw repositoryexcept error occur
deprec
check permiss checkpermiss item itemid permiss
access deni except accessdeniedexcept item found except itemnotfoundexcept repositori except repositoryexcept
determin code permiss code grant
item code code target item
param abspath path item
param permiss combin
link org apach jackrabbit core secur author permiss
constant encod bitmask
throw accessdeniedexcept permiss deni
throw repositoryexcept error occur
check permiss checkpermiss path ab path abspath permiss access deni except accessdeniedexcept repositori except repositoryexcept
determin code permiss code grant
repositori level
param permiss permiss check
throw accessdeniedexcept permiss deni
throw repositoryexcept error occur
check repositori permiss checkrepositorypermiss permiss access deni except accessdeniedexcept repositori except repositoryexcept
determin code permiss code grant
item code code target item
param target item
param permiss combin constant
encod bitmask
code read code
code write code
code remov code
return code true code permiss grant code fals code
throw itemnotfoundexcept target item exist
throw repositoryexcept error occur
deprec
grant isgrant item itemid permiss
item found except itemnotfoundexcept repositori except repositoryexcept
determin code permiss code grant
item code abspath code target
item exist
param abspath absolut path test
param permiss combin
link org apach jackrabbit core secur author permiss
constant encod bitmask
return code true code permiss grant
code fals code
throw repositoryexcept error occur
grant isgrant path ab path abspath permiss repositori except repositoryexcept
determin code permiss code grant
item repres combin
code parentpath code code childnam code target
item exist
param parentpath path exist parent node
param childnam child item exist
param permiss combin
link org apach jackrabbit core secur author permiss
constant encod bitmask
return code true code permiss grant
code fals code
throw repositoryexcept error occur
grant isgrant path parent path parentpath child childnam permiss repositori except repositoryexcept
determin item code itempath code
code itemid code read paramet
code null code
note method call persist item
item visibl permiss evalu
item link isgrant path int
method call path itemid left
evalu paramet
param itempath path item code null code itemid
determin read permiss
param itemid item test code null code
itempath determin permiss
return code true code item read code fals code
throw repositoryexcept item itemid
error occur
read canread path item path itempath item itemid item itemid repositori except repositoryexcept
determin subject current context grant access
workspac note implement free test
exist workspac case
expect return code fals code workspac
exist
param workspacenam workspac
return code true code subject current context
grant access workspac code fals code
throw repositoryexcept error occur
access canaccess string workspac workspacenam repositori except repositoryexcept
