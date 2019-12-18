org apach jackrabbit core lock
org apach jackrabbit core node impl nodeimpl
org apach jackrabbit core session impl sessionimpl
org apach jackrabbit spi path
javax jcr repositori except repositoryexcept
javax jcr session
javax jcr lock lock
javax jcr lock lock except lockexcept
defin function need lock unlock node
lock manag lockmanag
lock node check node lock
return lock object node
param node node
param isdeep lock appli node
param issessionscop lock session scope
return lock object
throw lockexcept node lock descend
node lock code isdeep code code true code
javax jcr node lock
lock lock node impl nodeimpl node deep isdeep session scope issessionscop
lock except lockexcept repositori except repositoryexcept
lock node check node lock
return lock object node
param node node creat lock
param isdeep lock appli node
param issessionscop lock session scope
param timeouthint desir lock timeout second
param ownerinfo option string act inform owner
return lock
throw lockexcept node lock descend
node lock code isdeep code code true code
javax jcr lock lockmanag lock string boolean boolean long string
throw repositoryexcept
lock lock node impl nodeimpl node deep isdeep session scope issessionscop timeout hint timeouthint string owner info ownerinfo
lock except lockexcept repositori except repositoryexcept
return lock object appli node lock
node deep lock node node
param node node
return lock object
throw lockexcept node lock
javax jcr node getlock
lock lock getlock node impl nodeimpl node lock except lockexcept repositori except repositoryexcept
return lock own session
param session session
return arrai lock object
throw repositoryexcept error occur
sessionimpl getlock
lock lock getlock session impl sessionimpl session repositori except repositoryexcept
remov lock node path
param node node
throw lockexcept node lock session
correct lock token
javax jcr node unlock
unlock node impl nodeimpl node lock except lockexcept repositori except repositoryexcept
return code true code node hold lock
return code fals code
param node node
return code true code node hold lock
return code fals code
javax jcr node holdslock
throw javax jcr repositoryexcept except occur
hold lock holdslock node impl nodeimpl node repositori except repositoryexcept
return code true code node lock result
lock held node deep lock node
node return code fals code
param node node
return code true code node lock result
lock held node deep lock node
node return code fals code
javax jcr node islock
throw javax jcr repositoryexcept except occur
lock islock node impl nodeimpl node repositori except repositoryexcept
check node lock
current session access allow node lock
session hold lock node session
lock token lock
param node node check
throw lockexcept write access node allow
throw repositoryexcept error occur
check lock checklock node impl nodeimpl node
lock except lockexcept repositori except repositoryexcept
check path lock
session access allow node lock
session hold lock node session
lock token lock
param path path check
param session session
throw lockexcept write access path allow
throw repositoryexcept error occur
check lock checklock path path session session
lock except lockexcept repositori except repositoryexcept
return code true code session allow unlock
node return code fals code
param session session
param node node
return code true code session allow access node
code fals code
throw lockexcept write access path allow
throw repositoryexcept error occur
check unlock checkunlock session session node impl nodeimpl node lock except lockexcept
repositori except repositoryexcept
invok session inform lock token ad
param session session ad lock token
param ad lock token
throw lockexcept
throw repositoryexcept
add lock token addlocktoken session impl sessionimpl session string lock except lockexcept repositori except repositoryexcept
invok session inform lock token remov
param session session remov lock token
param remov lock token
throw lockexcept
throw repositoryexcept
remov lock token removelocktoken session impl sessionimpl session string lock except lockexcept repositori except repositoryexcept
