package com.therealdanvega.controlstructures

import java.util.regex.Matcher

class WhatIsTruth {

    static void main(String[] args) {

        println "Boolean"
        if (true)
            println "true"

        def matcher1 = 'a' =~ /a/
        boolean matcher = 'a' =~ /a/

        println " matching matcher as boolean"


        List emptyList = []
        println "Empty collection as boolean"
        boolean emptyListBoolean = emptyList
        println emptyListBoolean
        List nonEmptyList = [1]
        println "NonEmpty collection as boolean"
        boolean nonEmptyListBoolean = nonEmptyList
        println nonEmptyListBoolean

        boolean emptyString = ""
        println "emptyString as boolean"
        println emptyString
        boolean nonEmptyString = "something"
        println "nonEmptyString as boolean"
        println nonEmptyString


        boolean zero = 0
        boolean one = 1

        println "zero is evaluated as $zero   when other values are evaluated as $one "


        Object object = null;

        println "Object with null ref is treated as $object"

    }


}
