org apach jackrabbit core local
org apach jackrabbit core file system filesystem
org apach jackrabbit core file system except filesystemexcept
org apach jackrabbit core random access output stream randomaccessoutputstream
org apach log4j logger
java file
java file filter filefilt
java file found except filenotfoundexcept
java file output stream fileoutputstream
java except ioexcept
java input stream inputstream
java output stream outputstream
java random access file randomaccessfil
java file input stream fileinputstream
code localfilesystem code
local file system localfilesystem file system filesystem
logger log logger logger getlogg local file system localfilesystem
file root
handl monitor handlemonitor monitor
default constructor
local file system localfilesystem
string path getpath
root
root path getpath
set path root directori local filesystem note
method call reflect initi
alter
param rootpath path root directori
set path setpath string root path rootpath
set root setroot file path ospath root path rootpath
set root setroot file root
root root
string path ospath string gener path genericpath
file separ equal separ
gener path genericpath
gener path genericpath replac separ char separ char file separ char separatorchar
java lang object overrid
equal object obj
obj
obj local file system localfilesystem
local file system localfilesystem local file system localfilesystem obj
root
root
root equal root
return satisfi object equal hashcod contract
class mutabl meant hash kei
return
object hashcod
hash code hashcod
filesystem
inheritdoc
init file system except filesystemexcept
root
string msg root directori set
log debug msg
file system except filesystemexcept msg
root exist
root directori isdirectori
string msg path denot folder
log debug msg
file system except filesystemexcept msg
root mkdir
string msg fail creat root
log debug msg
file system except filesystemexcept msg
log info locaafilesystem initi root path getpath
monitor
log info localfilesystem handl monitor
inheritdoc
close file system except filesystemexcept
root
inheritdoc
copi string src path srcpath string dest path destpath file system except filesystemexcept
file src file root path ospath src path srcpath
file dest file root path ospath dest path destpath
file util fileutil copi src dest
except ioexcept ioe
string msg copi src path getpath dest path getpath fail
log debug msg
file system except filesystemexcept msg ioe
inheritdoc
creat folder createfold string folder path folderpath file system except filesystemexcept
file file root path ospath folder path folderpath
exist
string msg path getpath exist
log debug msg
file system except filesystemexcept msg
mkdir
string msg fail creat folder path getpath
log debug msg
file system except filesystemexcept msg
inheritdoc
delet file deletefil string file path filepath file system except filesystemexcept
file file root path ospath file path filepath
file isfil
string msg path getpath denot exist file
file system except filesystemexcept msg
file util fileutil delet
except ioexcept ioe
string msg fail delet path getpath
monitor monitor open isopen
log error unabl delet open stream
monitor dump
file system except filesystemexcept msg ioe
inheritdoc
delet folder deletefold string folder path folderpath file system except filesystemexcept
file file root path ospath folder path folderpath
directori isdirectori
string msg path getpath denot exist folder
log debug msg
file system except filesystemexcept msg
file util fileutil delet
except ioexcept ioe
string msg fail delet path getpath
log debug msg
file system except filesystemexcept msg ioe
inheritdoc
exist string path file system except filesystemexcept
file file root path ospath path
exist
inheritdoc
input stream inputstream input stream getinputstream string file path filepath file system except filesystemexcept
file file root path ospath file path filepath
monitor
file input stream fileinputstream
monitor open
file found except filenotfoundexcept fnfe
string msg path getpath denot exist file
log debug msg
file system except filesystemexcept msg fnfe
inheritdoc
output stream outputstream output stream getoutputstream string file path filepath file system except filesystemexcept
file file root path ospath file path filepath
file output stream fileoutputstream
file found except filenotfoundexcept fnfe
string msg fail output stream path getpath
log debug msg
file system except filesystemexcept msg fnfe
inheritdoc
random access output stream randomaccessoutputstream random access output stream getrandomaccessoutputstream string file path filepath
file system except filesystemexcept
file file root path ospath file path filepath
raf output stream rafoutputstream random access file randomaccessfil
except ioexcept
string msg fail output stream path getpath
log debug msg
file system except filesystemexcept msg
inheritdoc
children haschildren string path file system except filesystemexcept
file file root path ospath path
exist
string msg path getpath exist
log debug msg
file system except filesystemexcept msg
file isfil
list length
inheritdoc
file isfil string path file system except filesystemexcept
file file root path ospath path
file isfil
inheritdoc
folder isfold string path file system except filesystemexcept
file file root path ospath path
directori isdirectori
inheritdoc
modifi lastmodifi string path file system except filesystemexcept
file file root path ospath path
modifi lastmodifi
inheritdoc
length string file path filepath file system except filesystemexcept
file file root path ospath file path filepath
exist
length
inheritdoc
touch string file path filepath file system except filesystemexcept
file file root path ospath file path filepath
set modifi setlastmodifi system current time milli currenttimemilli
inheritdoc
string list string folder path folderpath file system except filesystemexcept
file file root path ospath folder path folderpath
string entri list
entri
string msg folder path folderpath denot folder
log debug msg
file system except filesystemexcept msg
entri
inheritdoc
string list file listfil string folder path folderpath file system except filesystemexcept
file folder file root path ospath folder path folderpath
file file folder list file listfil file filter filefilt
accept file
file isfil
file
string msg folder path folderpath denot folder
log debug msg
file system except filesystemexcept msg
string entri string file length
file length
entri file getnam
entri
inheritdoc
string list folder listfold string folder path folderpath file system except filesystemexcept
file file file root path ospath folder path folderpath
file folder file list file listfil file filter filefilt
accept file
directori isdirectori
folder
string msg folder path folderpath denot folder
log debug msg
file system except filesystemexcept msg
string entri string folder length
folder length
entri folder getnam
entri
inheritdoc
move string src path srcpath string dest path destpath file system except filesystemexcept
file src file root path ospath src path srcpath
file dest file root path ospath dest path destpath
dest exist
move exist file folder
file util fileutil delet dest
except ioexcept ioe
string msg move src path getpath dest path getpath fail
log debug msg
file system except filesystemexcept msg ioe
file dest parent destpar dest parent file getparentfil
dest parent destpar exist
creat destin parent folder
dest parent destpar mkdir
string msg move src path getpath dest path getpath fail
log debug msg
file system except filesystemexcept msg
readi move renam file folder
src renam renameto dest
string msg move src path getpath dest path getpath fail
log debug msg
file system except filesystemexcept msg
fileutil copi src dest
fileutil delet src
catch ioexcept ioe
string msg move src getpath dest getpath fail
log debug msg
throw filesystemexcept msg ioe
enabl usag handl monitor
param enabl
set enabl handl monitor setenablehandlemonitor string enabl
set enabl handl monitor setenablehandlemonitor boolean valueof enabl boolean booleanvalu
return handl monitor enabl
string enabl handl monitor getenablehandlemonitor
monitor fals true
enabl usag handl monitor
param enabl
set enabl handl monitor setenablehandlemonitor enabl
enabl monitor
monitor handl monitor handlemonitor
enabl monitor
monitor
