package com.therealdanvega.metaprograming.compiletime

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@TupleConstructor
@EqualsAndHashCode(excludes = ["email"])
@ToString(includeNames = true, excludes = ["email"])
class Person {

    String first
    String last
    String email


    static void main(String[] args) {
        def person1 = new Person(first: "dan", last: "vega", email: "danvega@gmail.com")
        def person2 = new Person(first: "dan", last: "vega", email: "vega@gmail.com")

        println person2


        println person1 == person2


        def person3 = new Person("Dan", "Vega", "someEmail")

        println person3

    }
}

