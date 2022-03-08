package com.therealdanvega.controlstructures

class GroovyLoops {

    static void main(String[] args) {
        List numbers = [1, 2, 3]

        while (numbers) {
            ///something
            numbers.remove(0)
        }
        boolean b = numbers


        print "numbers has some elements - $b"


//for (variable in iterable)

        List nums = [2, 3, 4, 5]

        for (num in nums) {
            print num
        }

        println()

        for (Integer in 3..11) {
            println "3..11"
        }


        for (String s in 'a'..'z') {
            if (s == 'a') continue
            println s
            if (s > 'b') break
        }


    }


}
