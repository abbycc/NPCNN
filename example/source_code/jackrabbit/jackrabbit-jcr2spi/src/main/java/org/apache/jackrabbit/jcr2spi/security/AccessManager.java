org apach jackrabbit jcr2spi secur
org apach jackrabbit spi path
org apach jackrabbit jcr2spi state item state itemst
org apach jackrabbit jcr2spi state node state nodest
javax jcr item found except itemnotfoundexcept
javax jcr workspac except nosuchworkspaceexcept
javax jcr repositori except repositoryexcept
code accessmanag code queri determin permiss
grant perform specif action specif item
access manag accessmanag
predefin action constant
string read action read action javax jcr session action read action read
string remov action remov action javax jcr session action remov action remov
string add node action add node action javax jcr session action add node action add node
string set properti action set properti action javax jcr session action set properti action set properti
string read string read action read action
string remov string remov action remov action
determin code permiss code grant
item path
param parentst node state exist ancestor
param relpath rel path point exist target item
param action arrai action check
return code true code action grant code fals code
throw itemnotfoundexcept target item exist
throw repositoryexcept error occur
grant isgrant node state nodest parent state parentst path rel path relpath string action item found except itemnotfoundexcept repositori except repositoryexcept
determin code permiss code grant
item path
param itemst
param action arrai action check
return code true code action grant code fals code
throw itemnotfoundexcept target item exist
throw repositoryexcept error occur
grant isgrant item state itemst item state itemst string action item found except itemnotfoundexcept repositori except repositoryexcept
return true exist item code itemid code
read
param itemst
return
throw itemnotfoundexcept
throw repositoryexcept
read canread item state itemst item state itemst item found except itemnotfoundexcept repositori except repositoryexcept
return true exist item state remov
param itemst
return
throw itemnotfoundexcept
throw repositoryexcept
remov canremov item state itemst item state itemst item found except itemnotfoundexcept repositori except repositoryexcept
determin subject current context grant access
workspac
param workspacenam workspac
return code true code subject current context
grant access workspac code fals code
throw nosuchworkspaceexcept workspac exist
throw repositoryexcept error occur
access canaccess string workspac workspacenam workspac except nosuchworkspaceexcept repositori except repositoryexcept
