#org.brutusin:logging-instrumentation [![Build Status](https://api.travis-ci.org/brutusin/logging-instrumentation.svg?branch=master)](https://travis-ci.org/brutusin/logging-instrumentation)
An extension of [instrumentation module](https://github.com/brutusin/instrumentation) to log executions of third-party code.

This module defines an interceptor ([LoggingInterceptor](src/main/java/org/brutusin/instrumentation/logging/LoggingInterceptor.java)) aimed at logging executions of third-party code.

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