# java-cli-mill-orientdb-client-graph-edge-query

## Description
A java mill build, that connects to orientdb database.

Creates a new database `Health` and adds document `Doctor`.

Creates self joins with `edges`. Uses sql to query incoming
and outgoing edges.

## Tech stack
- mill

## Docker stack
- orientdb:latest
- nightscape/scala-mill

## To run
`sudo ./install.sh -u`
- [OrientDB studio](http://localhost:2480/studio/index.html)
  - user: admin
  - password: admin

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Edge querries](https://stackoverflow.com/questions/49798428/orientdb-query-for-getting-all-vertices-connected-by-edge-of-specyfic-type)
- [Source based on](https://gist.github.com/Jaquitori/b9158b0979a8f815c5270cff0e785b00)
- [Create init database](https://orientdb.com/docs/last/java/Document-API-Database.html)
- [Default logins](https://orientdb.com/docs/last/java/Document-API-Database.html)
