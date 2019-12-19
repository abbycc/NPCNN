org apach jackrabbit jcr2spi oper
org apach jackrabbit jcr2spi util log util logutil
org apach jackrabbit jcr2spi hierarchi hierarchi manag hierarchymanag
org apach jackrabbit jcr2spi hierarchi node entri nodeentri
org apach jackrabbit jcr2spi state node state nodest
org apach jackrabbit spi path
org apach jackrabbit spi
org apach jackrabbit spi node nodeid
org apach jackrabbit spi common convers path resolv pathresolv
org slf4j logger factori loggerfactori
org slf4j logger
javax jcr repositori except repositoryexcept
javax jcr access deni except accessdeniedexcept
javax jcr item exist except itemexistsexcept
javax jcr unsupport repositori oper except unsupportedrepositoryoperationexcept
javax jcr item found except itemnotfoundexcept
javax jcr version version except versionexcept
javax jcr nodetyp constraint violat except constraintviolationexcept
javax jcr nodetyp node type except nosuchnodetypeexcept
javax jcr lock lock except lockexcept
code move code
move abstract oper abstractoper
logger log logger factori loggerfactori logger getlogg move
node nodeid src srcid
node nodeid dest parent destparentid
dest destnam
node state nodest src state srcstate
node state nodest src parent state srcparentst
node state nodest dest parent state destparentst
session move sessionmov
move node state nodest src node state srcnodest node state nodest src parent state srcparentst node state nodest dest parent state destparentst dest destnam session move sessionmov
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
visitor visit
throw unsupportedoperationexcept move oper transient
modif move state parent state
invalid
oper persist
persist
session move sessionmov
unsupport oper except unsupportedoperationexcept persist implement transient modif
recurs invalid
src state srcstate node entri getnodeentri move dest destnam dest parent state destparentst node entri getnodeentri
todo tobefix move state definit
repositori except repositoryexcept
occur
log error intern error
src parent state srcparentst hierarchi entri gethierarchyentri invalid
dest parent state destparentst hierarchi entri gethierarchyentri invalid
src state srcstate hierarchi entri gethierarchyentri invalid
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
path element dest element destel dest path destpath element getnameel
destin index
index dest element destel index getindex
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
node state nodest src state srcstate node state getnodest src path srcpath hier mgr hiermgr resolv
node state nodest src parent state srcparentst node state getnodest src path srcpath ancestor getancestor hier mgr hiermgr resolv
node state nodest dest parent state destparentst node state getnodest dest path destpath ancestor getancestor hier mgr hiermgr resolv
dest destnam dest element destel getnam
session move perform lazi check exist item destin
hierarchi complet conflict
detect save 'move'
node entri nodeentri dest entri destentri node entri nodeentri dest parent state destparentst hierarchi entri gethierarchyentri
dest entri destentri properti entri haspropertyentri dest destnam session move sessionmov
item exist except itemexistsexcept move destin exist properti
forc childnodeentri list present move execut
hierarchi entri
dest entri destentri node entri hasnodeentri dest destnam
node entri nodeentri exist dest entri destentri node entri getnodeentri dest destnam path index default index default
exist session move sessionmov
exist node state getnodest definit getdefinit sibl allowssamenames
item exist except itemexistsexcept node exist move destin sibl
item found except itemnotfoundexcept
exist appar valid conflict
move move move src state srcstate src parent state srcparentst dest parent state destparentst dest destnam session move sessionmov
move
