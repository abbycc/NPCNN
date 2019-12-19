org apach jackrabbit core virtual
org apach jackrabbit core item itemid
org apach jackrabbit core node nodeid
org apach jackrabbit core properti propertyid
org apach jackrabbit core qname
org apach jackrabbit core state item state except itemstateexcept
org apach jackrabbit core state item state manag itemstatemanag
org apach jackrabbit core state item state except nosuchitemstateexcept
javax jcr repositori except repositoryexcept
interfac defin virtual item state provid
virtual item state provid virtualitemstateprovid item state manag itemstatemanag
check refer root virtual tree
param
return
virtual root isvirtualroot item itemid
return root node virtual tree
return
node nodeid virtual root getvirtualrootid
check node exist item state provid
param
return
node state hasnodest node nodeid
check properti exist item state provid
param
return
properti state haspropertyst properti propertyid
return node state node
param
return
throw itemstateexcept
throw nosuchitemstateexcept
virtual node state virtualnodest node state getnodest node nodeid
item state except itemstateexcept item state except nosuchitemstateexcept
return properti state give properti
param
return
throw itemstateexcept
throw nosuchitemstateexcept
virtual properti state virtualpropertyst properti state getpropertyst properti propertyid
item state except itemstateexcept item state except nosuchitemstateexcept
creat virtual properti state
param parent
param
param type
param multivalu
return
throw repositoryexcept
virtual properti state virtualpropertyst creat properti state createpropertyst virtual node state virtualnodest parent
qname type
multi valu multivalu
repositori except repositoryexcept
creat virtual node state
param parent
param
param uuid
param nodetypenam
return
throw repositoryexcept
virtual node state virtualnodest creat node state createnodest virtual node state virtualnodest parent qname
string uuid qname node type nodetypenam
repositori except repositoryexcept
