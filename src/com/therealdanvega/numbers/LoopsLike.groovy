package com.therealdanvega.numbers

class LoopsLike {


    static void main(String[] args) {

        20.times { print '-' }

        1.upto(8) { num -> println num }


        9.downto(3) { num -> print num }
        println()

        8.step(9, 0.1) { num -> println num }


    }
}
