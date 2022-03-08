package com.therealdanvega.closures

class GDKExercise {

    static List people = [
            [name: "Mark", city: "New York"],
            [name: "Dan", city: "New York"],
            [name: "John", city: "New York"],
            [name: "Amy", city: "Cleveland"],
            [name: "Mary", city: "Cleveland"],
            [name: "Tom", city: "Cleveland"],
            [name: "Jane", city: "Cleveland"]
    ]

    static void main(String[] args) {
        println people.find { person -> person.city == "Cleveland" }

        println()

        println people.findAll { person -> person.city == "Cleveland" }


        println()

        println people.any { person -> person.city == "Cleveland" }


        println()


        println people.every() { person -> person.city == "Cleveland" }
        println people.every() { person -> person.name.size() >= 3 }

        def peopleByCity = people.groupBy { person -> person.city }
        println peopleByCity

        def newYorkers = peopleByCity["New York"]
        def clevleanders = peopleByCity.Cleveland

        println "Clevelanders"
        clevleanders.each { print it }
        println()
        println "NewYorkers"
        newYorkers.each { print it }

    }

}
