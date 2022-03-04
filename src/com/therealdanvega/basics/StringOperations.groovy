package com.therealdanvega.basics

class StringOperations {


    static void main(String[] args) {
        //Java

        char c = 'c'
        println c.class

        println "string".class


        //Groovy

        def c2 = 'c'
        def string = "this is string"

        println c2.class
        println string.class

        0.upto(30) { print '-' }
        println()
        def string1 = "string interpolation from ${string}"

        println string1.class

        println 'string ${string}'.class


        println "gString ${string}".class

//multiline String
        def ms = '''multiline
                         message'''

        println ms
        println ms.class

        //dollar slashy

        def folder =$/C:\groovy\something/$
        def folder2 =/C:\groovy\something/

        println folder
        println folder2

    }

}
