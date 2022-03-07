package com.therealdanvega.closures

class GroovyClosuresBasic {


    def static timesTen(num, closure) {
        closure(num * 10)
    }


    static void main(String[] args) {

        def c = {}

        println c.class.name

        println c instanceof Closure


        def sayHello = { println "Hello" }

        sayHello()

        def sayHelloName = { name -> println "Say Hello $name" }

        sayHelloName("Dan")


        def nums = [1, 4, 7, 34, 57]

        nums.each { println it }
        nums.each { num -> println num }


        timesTen(2) { println it }
        timesTen(5) { println it }


        10.times { { print it } }
        println()
        Random rand = new Random()

        3.times {
            println rand.nextInt()
        }

    }

}