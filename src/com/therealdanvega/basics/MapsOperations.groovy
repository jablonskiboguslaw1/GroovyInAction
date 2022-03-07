package com.therealdanvega.basics

class MapsOperations {

    static void main(String[] args) {

        def map = [:]

        println map

        println map.getClass().getName()


        def person = [first: "Dan", last: "Vega", email: "danvega@gmail.com"]


        println person
        println person.first


        person.twitter = "@therealdanvega"
        println person

        def emailKey = "Email Address"

        def twitter = [username: "@therrealdanveg", (emailKey): "danvega@gmail.com"]
        println twitter


        println person.size()
        println person.sort()


        // looping through map


        for (entry in person) {
            println entry
        }

        for (key in person.keySet()) {
            //   println key
            println "$key:${person[key]}"

        }

        10.times { print('=') }

        println()


        def dayRange = Days.SUNDAY..Days.FRIDAY


        for (day in dayRange) {
            println(day)
        }


        dayRange.forEach { day -> println(day) }

        println dayRange.size()
        println dayRange.contains(Days.TUESDAY)
        println dayRange.from
        println dayRange.to

        def integers = 11..15

        integers.forEach { it -> println(it) }

        10.upto(18) { println(it) }


        def days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]


        println days
        println days.size()
        days.removeLast()
        println days
        days << "Saturday"
        println days
        println days[3]


        def dayMap = [1: "Sunday", 2: "Monday", 3: "Tuesday", 4: "Wednesday", 5: "Thursday", 6: "Friday", 7: "Saturday"]

        println dayMap
        println dayMap.getClass().getName()
        println dayMap.size()
        println dayMap.values()

       for (entry in dayMap){
           println entry
       }

        for (key in dayMap.keySet())
            println "$key : ${dayMap[key]}"


    }

    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }


}