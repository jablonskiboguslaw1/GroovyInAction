package com.therealdanvega.controlstructures

class GroovyControlStructures {


    static void main(String[] args) {


        def num = 12


        switch (num) {
            case 1:
                print "1"
                break
            case 2:
                print '2'
                break
            case [3, 5, 7]:
                print "is inside the list above"
                break
            case 8..12:
                print "is within range"
                break
            case Integer:
                "is Integer"
                break
            case Float:
                "is float"
                break
            default:
                print "whatever"
        }
                //
                println()


                def validAges = 18..35
                def someAge = 19

                 print someAge in validAges


        }


    }



