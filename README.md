#org.brutusin:logging-instrumentation [![Build Status](https://api.travis-ci.org/brutusin/logging-instrumentation.svg?branch=master)](https://travis-ci.org/brutusin/logging-instrumentation)
An extension of [instrumentation module](https://github.com/brutusin/instrumentation) to log executions of third-party code.

Current implementation is not finished but serves well as an example.

Remark that project tests are run after a fat-agent-jar is created and the *interceptor* class name is passed as the agent options (see [pom.xml](pom.xml))
