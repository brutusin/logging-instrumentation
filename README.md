#org.brutusin:logging-instrumentation [![Build Status](https://api.travis-ci.org/brutusin/logging-instrumentation.svg?branch=master)](https://travis-ci.org/brutusin/logging-instrumentation)
This module is an extension of [instrumentation module](https://github.com/brutusin/instrumentation) and defines an interceptor ([LoggingInterceptor](src/main/java/org/brutusin/instrumentation/logging/LoggingInterceptor.java)) aimed at logging executions of third-party code.

## Output
For each execution of an instrumented method, the agent generates a file such as:
```
1-1-org.brutusin.instrumentation.logging.SimpleClass.sayHello().log
```
with a content similar to:
```
#Source: public static java.lang.String org.brutusin.instrumentation.logging.SimpleClass.sayHello(java.lang.String)
#Start: Thu Jan 22 11:40:14 CET 2015
#Parameters:
[ "world" ]
#Elapsed: 414 ms
#Returned:
"Hello world!"
```
Files are ordered according to their execution order, and grouped in folders by the execution thread. Root logging folder is passed as an interceptor parameter via the agent parameters.

## Status of the project
This project is still under development but serves well as an example.

Remark that project tests are run after a fat-agent-jar is created and the *interceptor* class name is passed as the agent options (see [pom.xml](pom.xml))

## Support, bugs and requests
https://github.com/brutusin/logging-instrumentation/issues

## Authors

- Ignacio del Valle Alles (<https://github.com/idelvall/>)

Contributions are always welcome and greatly appreciated!

##License
Apache License, Version 2.0
http://www.apache.org/licenses/LICENSE-2.0