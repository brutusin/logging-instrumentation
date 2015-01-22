/*
 * Copyright 2014 brutusin.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.brutusin.instrumentation.logging;

public class SimpleClass {

    public static final String GREETING = "Hello world";

    public static String sayHello(String name) {
        return "Hello " + name + ", you fool, I love youuu! " + joinTheJoyRide();
    }

    public static String joinTheJoyRide() {
        return "C'mon join the joyrideee!";
    }

    public static String sayGoodBye() {
        return "Goodbye to you, goodbye to broken hearts";
    }

    public static void main(String[] args) {
        System.out.println(sayHello(GREETING));
    }
}
