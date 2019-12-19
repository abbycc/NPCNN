org apach jackrabbit core queri lucen
org apach lucen util prioriti queue priorityqueu
org apach lucen util version
org apach lucen index index reader indexread
org apach lucen index term
org apach lucen index term freq vector termfreqvector
org apach lucen search boolean claus booleanclaus
org apach lucen search default similar defaultsimilar
org apach lucen search similar
org apach lucen search term queri termqueri
org apach lucen search boolean queri booleanqueri
org apach lucen search queri
org apach lucen analysi analyz
org apach lucen analysi token stream tokenstream
org apach lucen analysi standard standard analyz standardanalyz
org apach lucen analysi tokenattribut term attribut termattribut
org apach lucen document document
java util list
java util set
java util hash map hashmap
java util map
java util collect
java util iter
java except ioexcept
java reader
java file
java string reader stringread
java file reader fileread
java input stream reader inputstreamread
java net url
java util arrai list arraylist
gener similar queri
base mail
code pre
lucen access document frequenc term indexread docfreq
term frequenc comput token text singl document
fast docfreq term document
slow
heurist prune set term avoid call docfreq
maxim idf score interest
term high choos threshold low radic
reduc number term consider heurist term
high idf low tend longer threshold term
number charact select charact
sort heurist find small set ten fewer term
pretti good job character document
depend eek percent
precis recal comput difficulti win trec
competit techniqu mention useless
provid button search result page decent job
good perform techniqu
effici effect queri gener great contribut
anyone' interest imagin reader string document'
text analyz analyz return set repres term heurist
frequenc length threshold paramet
doug
pre code
initi usag
class lot option make effici flexibl
code pre
indexread
indexsearch
morelikethi mlt morelikethi
reader target orig sourc doc find similar
queri queri mlt target
hit hit search queri
usual iter 'hits' thing watch make
ignor doc match 'target' document similar
pre code
normal lucen setup search
creat morelikethi
text doc find similari
call call gener similar queri
call searcher find similar doc
advanc usag
link setfieldnam setfieldnam examin
multipl field bodi titl similar
depend size index size makeup document
call set method control similar queri
gener
link setmintermfreq setmintermfreq
link setmindocfreq setmindocfreq
link setminwordlen setminwordlen
link setmaxwordlen setmaxwordlen
link setmaxqueryterm setmaxqueryterm
link setmaxnumtokenspars setmaxnumtokenspars
link setstopword setstopword
pre
mark harwood
bugfix refactor optimis
bugfix retrieveterm int docnum work index termvector ad miss code
bugfix signific term creat field termvector
count occur term field pair calcul includ frequenc info termvector
refactor move common code isnoiseword
optimis termvector support maxnumtermspars limit amount token
pre
morelikethi
default maximum number token pars doc field store termvector support
getmaxnumtokenspars
default max num token pars default max num token pars
default analyz pars sourc doc
getanalyz
analyz default analyz default analyz standard analyz standardanalyz version lucen
ignor term frequenc sourc doc
getmintermfreq
setmintermfreq
default min term freq default min term freq
ignor word occur doc
getmindocfreq
setmindocfreq
default min doc freq default min doc freq
boost term queri base score
isboost
setboost
default boost default boost
default field name null field name look
runtim provid reader
string default field name default field name string content
ignor word length effect
getminwordlen
setminwordlen
default min word length default min word length
ignor word greater length effect
getmaxwordlen
setmaxwordlen
default max word length default max word length
default set stopword
null mean stop word
setstopword
getstopword
set string default stop word default stop word
current set stop word
set string stop word stopword default stop word default stop word
return queri term
booleanqueri getmaxclausecount
getmaxqueryterm
setmaxqueryterm
default max queri term default max queri term
analyz pars doc
analyz analyz default analyz default analyz
ignor word freqent
min term freq mintermfreq default min term freq default min term freq
ignor word occur doc
min doc freq mindocfreq default min doc freq default min doc freq
appli boost queri base score
boost default boost default boost
field analyz
string field name fieldnam default field name default field name
maximum number token pars doc field store termvector support
max num token pars maxnumtokenspars default max num token pars default max num token pars
ignor word len
min word len minwordlen default min word length default min word length
ignor word greater len
max word len maxwordlen default max word length default max word length
return queri longer
max queri term maxqueryterm default max queri term default max queri term
idf calcul
similar similar privat similar similar defaultsimilar
indexread
index reader indexread
constructor requir indexread
morelikethi index reader indexread
default similar defaultsimilar
morelikethi index reader indexread similar sim
similar sim
similar similar getsimilar
similar
set similar setsimilar similar similar
similar similar
return analyz pars sourc doc default analyz
link default analyz
return analyz pars sourc doc
default analyz
analyz analyz getanalyz
analyz
set analyz analyz requir gener queri
link int method 'like' method requir analyz
param analyz analyz token text
set analyz setanalyz analyz analyz
analyz analyz
return frequenc term sourc doc default
frequenc link default min term freq
return frequenc term sourc doc
min term freq getmintermfreq
min term freq mintermfreq
set frequenc term sourc doc
param mintermfreq frequenc term sourc doc
set min term freq setmintermfreq min term freq mintermfreq
min term freq mintermfreq min term freq mintermfreq
return frequenc word occur
doc default frequenc link default min doc freq
return frequenc word occur
doc
min doc freq getmindocfreq
min doc freq mindocfreq
set frequenc word occur
doc
param mindocfreq frequenc word occur
doc
set min doc freq setmindocfreq min doc freq mindocfreq
min doc freq mindocfreq min doc freq mindocfreq
return boost term queri base score default
link default boost
return boost term queri base score
setboost
boost isboost
boost
set boost term queri base score
param boost true boost term queri base score fals
isboost
set boost setboost boost
boost boost
return field name gener 'more this' queri
default field name link default field name
return field name gener 'more this' queri
string field name getfieldnam
field name fieldnam
set field name gener 'more this' queri
set null field name determin runtim indexread
provid constructor
param fieldnam field name gener 'more this'
queri
set field name setfieldnam string field name fieldnam
field name fieldnam field name fieldnam
return minimum word length word set
minimum word length default link default min word length
return minimum word length word
min word len getminwordlen
min word len minwordlen
set minimum word length word
param minwordlen minimum word length word
set min word len setminwordlen min word len minwordlen
min word len minwordlen min word len minwordlen
return maximum word length word set
maximum word length default link default max word length
return maximum word length word
max word len getmaxwordlen
max word len maxwordlen
set maximum word length word
param maxwordlen maximum word length word
set max word len setmaxwordlen max word len maxwordlen
max word len maxwordlen max word len maxwordlen
set set stopword
word set consid uninterest
analyz stopword morelikethi code ignor
purpos document similar reason assum stop word interest
param stopword set stopword null mean stop word
org apach lucen analysi stopfilt makestopset stopfilt makestopset
getstopword
set stop word setstopword set string stop word stopword
stop word stopword stop word stopword
current stop word
setstopword
set string stop word getstopword
stop word stopword
return maximum number queri term includ gener queri
default link default max queri term
return maximum number queri term includ gener queri
max queri term getmaxqueryterm
max queri term maxqueryterm
set maximum number queri term includ gener queri
param maxqueryterm maximum number queri term includ
gener queri
set max queri term setmaxqueryterm max queri term maxqueryterm
max queri term maxqueryterm max queri term maxqueryterm
return maximum number token pars doc field store termvector support
default max num token pars
max num token pars getmaxnumtokenspars
max num token pars maxnumtokenspars
param maximum number token pars doc field store termvector support
set max num token pars setmaxnumtokenspars
max num token pars maxnumtokenspars
return queri return doc pass lucen document
param docnum documentid lucen doc gener 'more queri
return queri return doc pass lucen document
queri doc num docnum except ioexcept
field name fieldnam
gather list valid field lucen
collect string field field name getfieldnam index reader indexread field option fieldopt index
field name fieldnam field arrai toarrai string field size
creat queri createqueri retriev term retrieveterm doc num docnum
return queri return doc pass file
return queri return doc pass file
queri file except ioexcept
field name fieldnam
gather list valid field lucen
collect string field field name getfieldnam index reader indexread field option fieldopt index
field name fieldnam field arrai toarrai string field size
file reader fileread
return queri return doc pass url
return queri return doc pass url
queri url except ioexcept
input stream reader inputstreamread open connect openconnect input stream getinputstream
return queri return doc pass stream
return queri return doc pass stream
queri java input stream inputstream except ioexcept
input stream reader inputstreamread
return queri return doc pass reader
return queri return doc pass reader
queri reader except ioexcept
creat queri createqueri retriev term retrieveterm
creat queri priorityqueu
queri creat queri createqueri prioriti queue priorityqueu
boolean queri booleanqueri queri boolean queri booleanqueri
object cur
qterm
score bestscor
cur pop
object object cur
term queri termqueri jackrabbit term queri jackrabbittermqueri term string string
boost
qterm
score bestscor float float floatvalu
score myscor float float floatvalu
set boost setboost score myscor score bestscor
queri add boolean claus booleanclaus occur
boolean queri booleanqueri claus toomanyclaus ignor
qterm
max queri term maxqueryterm qterm max queri term maxqueryterm
queri
creat priorityqueu word map
param word map word kei word string int object valu
prioriti queue priorityqueu creat queue createqueu map string int word except ioexcept
collect word doc freq
num doc numdoc num doc numdoc
freq freqq re freq freqq word size freqq re freqq word size order word score
iter map entri string int word entri set entryset iter
hasnext hasnext word
map entri string int entri
string word entri kei getkei
entri getvalu int entri getvalu term freq sourc doc
min term freq mintermfreq min term freq mintermfreq
continu filter word occur time sourc
field find largest document frequenc
string top field topfield field name fieldnam
doc freq docfreq
field name fieldnam length
freq doc freq docfreq term field name fieldnam word
top field topfield freq doc freq docfreq field name fieldnam top field topfield
doc freq docfreq freq doc freq docfreq freq doc freq docfreq
min doc freq mindocfreq doc freq docfreq min doc freq mindocfreq
continu filter word occur doc
doc freq docfreq
continu index updat problem
idf similar idf doc freq docfreq num doc numdoc
score idf
1st entri troubleshoot
re insert overflow insertwithoverflow object word re insertwithoverflow object word word
top field topfield topfield top field
float score float score score
float idf float idf idf
integ doc freq docfreq integ docfreq freq doc
integ
re
describ paramet control queri form
string describ param describeparam
string buffer stringbuff string buffer stringbuff
append tmaxqueryterm append max queri term maxqueryterm append
append tminwordlen append min word len minwordlen append
append tmaxwordlen append max word len maxwordlen append
append tfieldnam
string delim
field name fieldnam length
string field fieldnam field name fieldnam
append delim append field fieldnam
delim
append
append tboost append boost append
append tmintermfreq append min term freq mintermfreq append
append tmindocfreq append min doc freq mindocfreq append
string tostr
find word queri
param docnum lucen document find term
prioriti queue priorityqueu retriev term retrieveterm doc num docnum except ioexcept
map string int term freq map termfreqmap hash map hashmap string int
field name fieldnam length
string field fieldnam field name fieldnam
term freq vector termfreqvector vector term freq vector gettermfreqvector doc num docnum field fieldnam
field store term vector info
vector
document document doc num docnum
string text valu getvalu field fieldnam
text
text length
add term frequenc addtermfrequ string reader stringread text term freq map termfreqmap field fieldnam
add term frequenc addtermfrequ term freq map termfreqmap vector
creat queue createqueu term freq map termfreqmap
add term frequenc found vector map termfreqmap
param termfreqmap map term frequenc
param vector list term frequenc doc field
add term frequenc addtermfrequ map string int term freq map termfreqmap term freq vector termfreqvector vector
string term vector term getterm
freq vector term frequenc gettermfrequ
term length
string term term
nois word isnoiseword term
increment frequenc
int cnt int term freq map termfreqmap term
cnt
cnt int
term freq map termfreqmap put term cnt
cnt freq
cnt freq
add term frequenc found token text reader map word
param sourc text token
param termfreqmap map term frequenc
param fieldnam analyz special field analysi
add term frequenc addtermfrequ reader map string int term freq map termfreqmap string field fieldnam
except ioexcept
token stream tokenstream analyz token stream tokenstream field fieldnam
token count tokencount
token
increment token incrementtoken
term attribut termattribut term attribut getattribut term attribut termattribut
string word term term
token count tokencount
token count tokencount max num token pars maxnumtokenspars
nois word isnoiseword word
increment frequenc
int cnt term freq map termfreqmap word
cnt
term freq map termfreqmap put word int
cnt
end
close
determin pass term interest comparison
param term word consid
return true fals analysi
nois word isnoiseword string term
len term length
min word len minwordlen len min word len minwordlen
max word len maxwordlen len max word len maxwordlen
stop word stopword stop word stopword term
find word queri
result prioriti queue arrai entri word document
arrai element
element
word string
top field word string
score word float
idf float
frequenc word index integ
frequenc word sourc document integ
advanc routin gener 1st entri arrai interest
method expos identifi interest word document
easier method call link retrieveinterestingterm retrieveinterestingterm
param reader content document
return interest word document order score highest score entri
retrieveinterestingterm
prioriti queue priorityqueu retriev term retrieveterm reader except ioexcept
map string int word hash map hashmap string int
field name fieldnam length
string field fieldnam field name fieldnam
add term frequenc addtermfrequ word field fieldnam
creat queue createqueu word
retrieveinterestingterm java reader
string retriev interest term retrieveinterestingterm doc num docnum except ioexcept
list string arrai list arraylist string max queri term maxqueryterm
prioriti queue priorityqueu retriev term retrieveterm doc num docnum
object cur
lim max queri term maxqueryterm int lim maxqueryterm care retrieveterm return word caller
return top word
cur pop lim
object object cur
add string add string 1st entri interest word
arrai toarrai string size
conveni routin make easi return interest word document
advanc user call link retrieveterm java reader retrieveterm directli
param sourc document
return interest word document
retrieveterm java reader
setmaxqueryterm
string retriev interest term retrieveinterestingterm reader except ioexcept
list string arrai list arraylist string max queri term maxqueryterm
prioriti queue priorityqueu retriev term retrieveterm
object cur
lim max queri term maxqueryterm int lim maxqueryterm care retrieveterm return word caller
return top word
cur pop lim
object object cur
add string add string 1st entri interest word
arrai toarrai string size
priorityqueu order word score
freq freqq prioriti queue priorityqueu
freq freqq
initi
lessthan object object
object object
object object
float float
float float
float floatvalu float floatvalu
frequenc avoid renew integ
int
int
