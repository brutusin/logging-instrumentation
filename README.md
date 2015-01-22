#org.brutusin:logging-instrumentation [![Build Status](https://api.travis-ci.org/brutusin/logging-instrumentation.svg?branch=master)](https://travis-ci.org/brutusin/logging-instrumentation)
This module is an extension of [instrumentation module](https://github.com/brutusin/instrumentation) and defines an interceptor ([LoggingInterceptor](src/main/java/org/brutusin/instrumentation/logging/LoggingInterceptor.java)) aimed at logging executions of third-party code.

## Output

For each execution of an instrumented method, the agent generates a file such with the following information of the execution:

* Source: Method instrumented
* Start: Execution start date
* Parameters: Serialization (if possible) of the method arguments
* Elapsed: Execution duration
* Returned: Serialization (if possible) of the method arguments/exceptions

Files are ordered according to their execution order, and grouped in folders by the execution thread. Root logging folder is passed as an interceptor parameter via the agent parameters.

## Tests
Remark that project tests are run after a fat-agent-jar is created and the *interceptor* class name is passed as the agent options (see [pom.xml](pom.xml))

In this example the only instrumented methods are those of the [LoggingInterceptor](/src/test/java/org/brutusin/instrumentation/logging/SimpleClass.java), being the relevant application code ([LoggingInterceptorTest](src/test/java/org/brutusin/instrumentation/logging/LoggingInterceptorTest.java)):
```java
SimpleClass.sayHello("world");
SimpleClass.sayGoodBye();
```

## Status of the project
This project is still under development but serves well as an example.



## Support, bugs and requests
https://github.com/brutusin/logging-instrumentation/issues

## Authors

- Ignacio del Valle Alles (<https://github.com/idelvall/>)

Contributions are always welcome and greatly appreciated!

##License
Apache License, Version 2.0
http://www.apache.org/licenses/LICENSE-2.0