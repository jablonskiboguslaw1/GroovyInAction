package com.therealdanvega.basics

class Ranges {

    static void main(String[] args) {

        Range range = 1..<10
        println range


        println()
        println range.class

        println range.from
        println range.to

        println range.contains(5)


        /////
        10.times { print "=" }
        println()
        Date today = new Date()
        Date oneWeekAway = today + 7

        println today
        println oneWeekAway
        10.times { print "=" }
        println()
        Range days = today..oneWeekAway


        days.each {d->println(d)}


        def letters = 'a'..'z'

        letters.each {l -> print(l)}

    }


}
