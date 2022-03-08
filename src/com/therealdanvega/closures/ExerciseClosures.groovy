package com.therealdanvega.closures

class ExerciseClosures {


    def myMethod(Closure c) {
        c()
    }

    def foo = {
        println "foo..."
    }

    static List names = ["Joe Doe", "John Doe", "Jonny Doe", "Johnny Doe"]
    static Map namesMap = [Joe: "Doe", John: "Doe", Jonny: "Doe", Johnny: "Doe"]


    def greet = { String greeting, String name -> println "$greeting, $name" }


    static void main(String[] args) {
        ExerciseClosures ce = new ExerciseClosures()

        ce.myMethod(ce.foo)
        names.each { name -> println name }

        namesMap.each { k, v -> println "$k $v" }

        ce.greet("Hello", "Dan")
        def sayHello =  ce.greet.curry("hello")
        sayHello("Rambo")


    }


}
