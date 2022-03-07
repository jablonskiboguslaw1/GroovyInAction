package com.therealdanvega.closures

class ClosuresWithCollections {


    static List favNums = [23, 5, 7, 8, 23, 63, 123]
    static def days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]

    static void main(String[] args) {

        for (num in favNums) {
            println num
        }

        favNums.each { print it + " " }

        favNums.eachWithIndex { int entry, int i -> println("$entry : $i ") }


        //find all
        List weekend = days.findAll { it.startsWith("S") }
        println days
        println weekend


        //collect


        List nums = [1, 2, 2, 7, 2, 3, 4, 8, 6]
        List numsTimesTen = []

        nums.each { num -> numsTimesTen << num * 10 }

        println numsTimesTen



        List newTimesTen = nums.collect(num -> num *10 )

        println newTimesTen

    }
}
