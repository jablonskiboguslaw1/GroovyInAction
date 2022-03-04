package com.therealdanvega.basics

import java.util.regex.*
import java.util.regex.Pattern

class Regex {


    static void main(String[] args) {
        //java

        Pattern javaPattern = Pattern.compile("a\\\\b")


        //groovy

        def groovySlashy = /a\b/
        def groovyDollarSlashy = $/http://something/$

        def pattern = ~'a*b+'  //pattern
        def pattern1 = ~groovyDollarSlashy
        def pattern2 = ~groovySlashy


        def text = "Being a Cleveland Sports Fan is no way to go through life"

        def pattern3 = ~"Cleveland Sports Fan"

        def finder = text =~ pattern3

        println(finder)
        println(finder.size())

        def matcher= text ==~ pattern3

        println matcher    // must match exact


        def text2 = text.replaceFirst(pattern3, "buffalo Sports Fan")

        println text2


    }
}
