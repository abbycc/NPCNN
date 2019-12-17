org apach jackrabbit rmi remot
java rmi remot
java rmi remot except remoteexcept
javax jcr repositori except repositoryexcept
remot version jcr link javax jcr observ observationmanag observationmanag
interfac
link org apach jackrabbit rmi server serverobservationmanag serverobservationmanag
link org apach jackrabbit rmi client clientobservationmanag clientobservationmanag
adapt base class provid transpar rmi access remot observ
manag
href observ packag html code observ code
packag comment descript event listen registr
notif implement
javax jcr observ observationmanag
org apach jackrabbit rmi client clientobservationmanag
org apach jackrabbit rmi server serverobservationmanag
remot observ manag remoteobservationmanag remot
remot version
link javax jcr observ observationmanag addeventlisten javax jcr observ eventlisten int string boolean string string boolean observationmanag addeventlisten
method class comment explan
code listenerid code
param listenerid identif listen client
side event direct
param eventtyp mask event type listen
param abspath root item defin subtre event
deliv
param isdeep code true code event complet subtre
root code abspath code item
path
param uuid option list node uuid event
code null code paramet
param nodetypenam option list node type name event
code null code paramet
param noloc code true code event
origin session instanc belong
throw repositoryexcept repositori error
throw remoteexcept rmi error
add event listen addeventlisten listen listenerid event type eventtyp
string ab path abspath deep isdeep string uuid
string node type nodetypenam local noloc
repositori except repositoryexcept remot except remoteexcept
remot version
link javax jcr observ observationmanag removeeventlisten javax jcr observ eventlisten observationmanag removeeventlisten
method class comment explan
code listenerid code
param listenerid identif listen client
side event direct
throw repositoryexcept repositori error
throw remoteexcept rmi error
remov event listen removeeventlisten listen listenerid
repositori except repositoryexcept remot except remoteexcept
return event dispatch regist event listen
event method block
timeout expir
param timeout time millisecond wait event
dispatch neg method wait
return link remoteeventcollect dispatch code null code
return method time wait event
dispatch
throw remoteexcept rmi error
remot event collect remoteeventcollect event getnextev timeout
remot except remoteexcept
