org apach jackrabbit jcr2spi oper
javax jcr access deni except accessdeniedexcept
javax jcr item exist except itemexistsexcept
javax jcr item found except itemnotfoundexcept
javax jcr repositori except repositoryexcept
javax jcr unsupport repositori oper except unsupportedrepositoryoperationexcept
javax jcr lock lock except lockexcept
javax jcr nodetyp constraint violat except constraintviolationexcept
javax jcr nodetyp node type except nosuchnodetypeexcept
javax jcr version version except versionexcept
org apach jackrabbit jcr2spi hierarchi hierarchi manag hierarchymanag
org apach jackrabbit jcr2spi hierarchi node entri nodeentri
org apach jackrabbit jcr2spi state item state valid itemstatevalid
org apach jackrabbit jcr2spi state node state nodest
org apach jackrabbit jcr2spi util log util logutil
org apach jackrabbit spi
org apach jackrabbit spi node nodeid
org apach jackrabbit spi path
org apach jackrabbit spi common convers path resolv pathresolv
org slf4j logger
org slf4j logger factori loggerfactori
code move code
move transient oper transientoper
logger log logger factori loggerfactori logger getlogg move
move option move option item state valid itemstatevalid check access check access
item state valid itemstatevalid check lock check lock
item state valid itemstatevalid check version check version
item state valid itemstatevalid check constraint check constraint
node nodeid src srcid
node nodeid dest parent destparentid
dest destnam
node state nodest src state srcstate
node state nodest src parent state srcparentst
node state nodest dest parent state destparentst
session move sessionmov
move node state nodest src node state srcnodest node state nodest src parent state srcparentst node state nodest dest parent state destparentst dest destnam session move sessionmov
repositori except repositoryexcept
session move sessionmov move option move option item state valid itemstatevalid check check
src srcid node nodeid src node state srcnodest getid
dest parent destparentid dest parent state destparentst node getnodeid
dest destnam dest destnam
src state srcstate src node state srcnodest
src parent state srcparentst src parent state srcparentst
dest parent state destparentst dest parent state destparentst
session move sessionmov session move sessionmov
add affect item state addaffecteditemst src node state srcnodest
add affect item state addaffecteditemst src parent state srcparentst
add affect item state addaffecteditemst dest parent state destparentst
oper
param visitor
accept oper visitor operationvisitor visitor lock except lockexcept constraint violat except constraintviolationexcept access deni except accessdeniedexcept item exist except itemexistsexcept unsupport repositori oper except unsupportedrepositoryoperationexcept version except versionexcept repositori except repositoryexcept
throw unsupportedoperationexcept move oper transient
modif move state parent state
invalid
oper persist
persist repositori except repositoryexcept
recurs invalid
todo tobefix move state definit
occur
oper undo
overrid
undo repositori except repositoryexcept
access oper paramet
node nodeid sourc getsourceid
src srcid
node nodeid destin parent getdestinationparentid
dest parent destparentid
node state nodest sourc state getsourcest
src state srcstate
node state nodest sourc parent state getsourceparentst
src parent state srcparentst
node state nodest destin parent state getdestinationparentst
dest parent state destparentst
destin getdestinationnam
dest destnam
factori
oper creat path src path srcpath path dest path destpath
hierarchi manag hierarchymanag hier mgr hiermgr
path resolv pathresolv resolv
session move sessionmov
item exist except itemexistsexcept node type except nosuchnodetypeexcept repositori except repositoryexcept
src ancestor destin
src path srcpath ancestor isancestorof dest path destpath
string msg invalid destin path descend sourc path log util logutil safe jcr path safegetjcrpath dest path destpath resolv log util logutil safe jcr path safegetjcrpath src path srcpath resolv
log debug msg
repositori except repositoryexcept msg
destin index
index dest path destpath index getindex
index path index undefin index undefin
subscript element
string msg invalid destin path subscript element allow log util logutil safe jcr path safegetjcrpath dest path destpath resolv
log debug msg
repositori except repositoryexcept msg
root node move
src path srcpath denot root denotesroot dest path destpath denot root denotesroot
string msg move root node
log debug msg
repositori except repositoryexcept msg
node state nodest src state srcstate node state getnodest src path srcpath hier mgr hiermgr
node state nodest src parent state srcparentst node state getnodest src path srcpath ancestor getancestor hier mgr hiermgr
node state nodest dest parent state destparentst node state getnodest dest path destpath ancestor getancestor hier mgr hiermgr
dest destnam dest path destpath getnam
session move sessionmov
node entri nodeentri dest entri destentri node entri nodeentri dest parent state destparentst hierarchi entri gethierarchyentri
forc child node entri list present move execut
hierarchi entri
assert child node entri assertchildnodeentri src parent state srcparentst
assert child node entri assertchildnodeentri dest parent state destparentst
dest entri destentri node entri hasnodeentri dest destnam
node entri nodeentri exist dest entri destentri node entri getnodeentri dest destnam path index default index default
exist session move sessionmov
exist node state getnodest definit getdefinit sibl allowssamenames
item exist except itemexistsexcept node exist move destin sibl
item found except itemnotfoundexcept
exist appar valid conflict
move move move src state srcstate src parent state srcparentst dest parent state destparentst dest destnam session move sessionmov
move
