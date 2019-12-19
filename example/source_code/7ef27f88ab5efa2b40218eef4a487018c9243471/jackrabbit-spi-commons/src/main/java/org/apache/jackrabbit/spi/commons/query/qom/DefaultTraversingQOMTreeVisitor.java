org apach jackrabbit spi common queri qom
code defaulttraversingqomtreevisitor code default implement
travers link qomtreevisitor
default travers qom tree visitor defaulttraversingqomtreevisitor default qom tree visitor defaultqomtreevisitor
call accept attach constraint node
object visit impl andimpl node object data except
constraint impl constraintimpl node constraint1 getconstraint1 accept data
constraint impl constraintimpl node constraint2 getconstraint2 accept data
data
call accept operand comparison node
object visit comparison impl comparisonimpl node object data except
dynam operand impl dynamicoperandimpl node operand1 getoperand1 accept data
static operand impl staticoperandimpl node operand2 getoperand2 accept data
data
call accept sourc join condit join node
object visit join impl joinimpl node object data except
sourc impl sourceimpl node getright accept data
sourc impl sourceimpl node left getleft accept data
join condit impl joinconditionimpl node join condit getjoincondit accept data
data
call accept properti length node
object visit length impl lengthimpl node object data except
properti impl propertyvalueimpl node properti getpropertyvalu accept data
data
call accept dynam operand lower case node
object visit lower case impl lowercaseimpl node object data except
dynam operand impl dynamicoperandimpl node operand getoperand accept data
data
call accept constraint node
object visit impl notimpl node object data except
constraint impl constraintimpl node constraint getconstraint accept data
data
call accept dynam operand order node
object visit order impl orderingimpl node object data except
dynam operand impl dynamicoperandimpl node operand getoperand accept data
data
call accept attach constraint node
object visit impl orimpl node object data except
constraint impl constraintimpl node constraint1 getconstraint1 accept data
constraint impl constraintimpl node constraint2 getconstraint2 accept data
data
call accept contain qom node
sourc
constraint
order
column
object visit queri object model tree queryobjectmodeltre node object data except
node sourc getsourc accept data
constraint impl constraintimpl constraint node constraint getconstraint
constraint
constraint accept data
order impl orderingimpl order node order getord
order length
order accept data
column impl columnimpl column node column getcolumn
column length
column accept data
data
call accept dynam operand lower case node
object visit upper case impl uppercaseimpl node object data except
dynam operand impl dynamicoperandimpl node operand getoperand accept data
data
