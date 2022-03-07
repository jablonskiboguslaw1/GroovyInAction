package com.therealdanvega.closures

class GroovyClosures {

    def static foo = { println it }

    def static noParams = {
        println "no params...."
    }

    def static noParamsOnly = { ->
        println "no params...."
    }


    def static sayHello = { first, last -> println "Hello, $first $last" }


    def static sayHelloWithTypes = { String first, String last -> println "Hello, $first $last" }
    //still valid, prevents by using other types than String


    def static greet = { String name, String greeting -> println "$greeting $name" }
    def static greetDefault = { String name, String greeting = "Hi" -> println "$greeting $name" }


    def static concat = {
        String... args -> args.join("")
    }

    def static someMethod(Closure c) {
        println "..."
        println c.maximumNumberOfParameters
        println c.parameterTypes
    }

    def static someClosure = { int x, int y -> x + y
    }

    static void main(String[] args) {

        foo("bbb")
        noParams()
        noParams(2)

//        noParamsOnly(2) // arrow with no params prevent to use params when calling the closure


        sayHello("dan", "vega")
        sayHelloWithTypes("dan", "vega")

        greet("Johnny", "Hello")
        greetDefault("Johnny", "Hello")
        greetDefault("Johnny")

        println concat("abc", "degf", "GHi")

        someMethod(someClosure)


    }


}
