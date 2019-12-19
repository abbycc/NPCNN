org apach jackrabbit spi common queri
java util arrai
javax jcr repositori except repositoryexcept
org apach jackrabbit spi
org apach jackrabbit spi path
util class dump link querynod tree stringbuff
queri tree dump querytreedump queri node visitor querynodevisitor
current indent level
indent
pad arrai fill space
pad
pad charact whitespac
pad char pad char
arrai fill pad pad char pad char
dump node tree buffer
param node root node
param buffer dump tree
throw repositoryexcept
queri tree dump querytreedump queri node querynod node string buffer stringbuff buffer repositori except repositoryexcept
node accept buffer
dump queri node tree string code buffer code
param node root node queri tree
param buffer string buffer dump tree structur
throw repositoryexcept
dump queri node querynod node string buffer stringbuff buffer repositori except repositoryexcept
queri tree dump querytreedump node buffer
object visit queri root node queryrootnod node object data repositori except repositoryexcept
string buffer stringbuff buffer string buffer stringbuff data
buffer append root node
buffer append
select properti
select node select properti getselectproperti
buffer append select properti
select length
buffer append
string comma
select length
buffer append comma
buffer append select string tostr
comma
buffer append
path
travers queri node querynod node locat node getlocationnod buffer
order
order queri node orderquerynod order node order node getordernod
order
travers queri node querynod order buffer
buffer
object visit queri node orquerynod node object data repositori except repositoryexcept
string buffer stringbuff buffer string buffer stringbuff data
buffer append pad indent
buffer append orquerynod
buffer append
travers node operand getoperand buffer
buffer
object visit queri node andquerynod node object data repositori except repositoryexcept
string buffer stringbuff buffer string buffer stringbuff data
buffer append pad indent
buffer append andquerynod
buffer append
travers node operand getoperand buffer
buffer
object visit queri node notquerynod node object data repositori except repositoryexcept
string buffer stringbuff buffer string buffer stringbuff data
buffer append pad indent
buffer append notquerynod
buffer append
travers node operand getoperand buffer
buffer
object visit exact queri node exactquerynod node object data
string buffer stringbuff buffer string buffer stringbuff data
buffer append pad indent
buffer append exactquerynod
buffer append prop append node properti getpropertynam
buffer append append node getvalu
buffer append
buffer
object visit node type queri node nodetypequerynod node object data
string buffer stringbuff buffer string buffer stringbuff data
buffer append pad indent
buffer append nodetypequerynod
buffer append prop append node properti getpropertynam
buffer append append node getvalu
buffer append
buffer
object visit textsearch queri node textsearchquerynod node object data
string buffer stringbuff buffer string buffer stringbuff data
buffer append pad indent
buffer append textsearchquerynod
buffer append path
path rel path relpath node rel path getrelativepath
rel path relpath
buffer append
path element element rel path relpath element getel
string slash
element length
buffer append slash
slash
node refer properti getreferencesproperti element length
buffer append
buffer append element
buffer append queri append node queri getqueri
buffer append
buffer
object visit path queri node pathquerynod node object data repositori except repositoryexcept
string buffer stringbuff buffer string buffer stringbuff data
buffer append pad indent
buffer append pathquerynod
buffer append
travers node operand getoperand buffer
buffer
object visit locat step queri node locationstepquerynod node object data repositori except repositoryexcept
string buffer stringbuff buffer string buffer stringbuff data
buffer append pad indent
buffer append locationstepquerynod
buffer append nodetest
node test getnametest
buffer append
buffer append node test getnametest
buffer append descend append node includ descend getincludedescend
buffer append index
node index getindex locat step queri node locationstepquerynod
buffer append
node index getindex locat step queri node locationstepquerynod
buffer append
buffer append node index getindex
buffer append
travers node operand getoperand buffer
buffer
object visit relat queri node relationquerynod node object data repositori except repositoryexcept
string buffer stringbuff buffer string buffer stringbuff data
buffer append pad indent
buffer append relationquerynod
buffer append queri constant queryconst oper name oper name getnam node oper getoper
buffer append prop
path queri node pathquerynod rel path relpath node rel path getrelativepath
rel path relpath
buffer append rel path relpath
visit rel path relpath buffer
buffer append type append queri constant queryconst type name type name getnam node type getvaluetyp
node type getvaluetyp queri constant queryconst type date type date
buffer append append node date getdatevalu
node type getvaluetyp queri constant queryconst type doubl type doubl
buffer append append node doubl getdoublevalu
node type getvaluetyp queri constant queryconst type long type long
buffer append append node long getlongvalu
node type getvaluetyp queri constant queryconst type posit type posit
buffer append append node posit getpositionvalu
node type getvaluetyp queri constant queryconst type string type string
buffer append append node string getstringvalu
node type getvaluetyp queri constant queryconst type timestamp type timestamp
buffer append append node date getdatevalu
buffer append
travers node operand getoperand buffer
buffer
object visit order queri node orderquerynod node object data
string buffer stringbuff buffer string buffer stringbuff data
buffer append pad indent
buffer append orderquerynod
buffer append
order queri node orderquerynod order spec orderspec spec node order spec getorderspec
spec length
buffer append pad indent
buffer append
append path appendpath spec properti path getpropertypath buffer
buffer append asc append spec ascend isascend
buffer append
buffer
object visit deref queri node derefquerynod node object data repositori except repositoryexcept
string buffer stringbuff buffer string buffer stringbuff data
buffer append pad indent
buffer append derefquerynod
buffer append nodetest
node test getnametest
buffer append
buffer append node test getnametest
buffer append descend append node includ descend getincludedescend
buffer append index
node index getindex locat step queri node locationstepquerynod
buffer append
node index getindex locat step queri node locationstepquerynod
buffer append
buffer append node index getindex
buffer append
travers node operand getoperand buffer
buffer
object visit properti function queri node propertyfunctionquerynod node object data
string buffer stringbuff buffer string buffer stringbuff data
buffer append pad indent
buffer append propertyfunctionquerynod
buffer append node function getfunctionnam
buffer append
buffer
travers queri node querynod node string buffer stringbuff buffer repositori except repositoryexcept
indent
indent pad length
tmp indent
arrai fill tmp pad char pad char
pad tmp
node length
node accept buffer
indent
append rel path code buffer code
delimit path element
param relpath rel path
param buffer buffer append path
append path appendpath path rel path relpath string buffer stringbuff buffer
path element element rel path relpath element getel
string slash
element length
buffer append slash
slash
buffer append element
