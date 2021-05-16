# springmongo
Mongo is nosql database entity that stores more records in json based in a columns
<h3><b>Starting Mondo Db with installation steps  in windows <b><h3>
  <h6>
    <ol><li>Download & Install Mongo from comminity center <link>https://www.mongodb.com/try/download/community?tck=docs_server</link></li> 
     <li>Create data/db folder inside  C Drive  otherwise give runtime exception :{"error":"NonExistentPath: Data directory C:\\data\\db\\ not found</li>
    <li>Go to bin folder on mongo installation path (C:\Program Files\MongoDB\Server\4.4\bin)& Open Command prompt after creation of db folder and type " mongod"</li>
    <li>Open another terminal then go to  path (C:\Program Files\MongoDB\Server\4.4\bin) and type mongo  to run mongo dabase</li>
    <li>Install robo 3t <link>https://robomongo.org/</link></li>
    <li>Open Robo 3T and Manage connection Note: please make sure mongo and mongod both are running in command prompt to make or manage connection
        <br/>type: File-->connect-->save with no changes ->connect
  </li>
  <li>command to check and to create database manually from command prompt</li>
  <li> show databases [show database created otherwise gives blank]</li>

<li> show collections[show database created records otherwise gives blank]
<li> use employee; [switched to db employee] </li>
<li> db.employee.insert({"empid":011,"empname":"Ranjan"});[inserts records to db as json]</li>
<li> show collections [shows tables]</li>
<li>  db.employee.find();[shows table records in json  ]</li> <ol>   
     </h6>
