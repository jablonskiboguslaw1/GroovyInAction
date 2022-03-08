package com.therealdanvega.controlstructures

class GroovyExceptions {


    def static foo() {
        throw new Exception("GroovyException")
    }


    static void main(String[] args) {


        List log = []


        try {
            foo()
        } catch (Exception e) {
            log << e.message
        }
        finally {
            log << 'finally'
        }

        println log

        //multicatch exception available like in Java

        try {
            //do stuff
        } catch (FileNotFoundException | NullPointerException e) {
            println e.class.name
            println e.message
        }


    }


}
