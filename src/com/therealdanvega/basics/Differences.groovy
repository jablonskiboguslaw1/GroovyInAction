package com.therealdanvega.basics;

class Differences {

    static void main(String[] args) {


        //BY DEFAULT
        println 10.class       //Integer
        println 6545645555.class   //Long
        println 99999999999870978797.class //BigInteger

        println 7.5.class  //BigDecimal


        println 4 / 6     //division decimal  //0.6666666667
        println 4.intdiv(6)  //int division   //0


        println 5.0d - 4.1d   //0.9000000000000004

        println 5 - 4.1    //by default bigDecimals better precision 0.9

        //other methods

        def integer = 2.5.toInteger()   //Integer
        def i = 2.5 as Integer   //Integer

        def ii = (int) 2.5

        def number = '5.56'.isNumber() //Boolean

        def integer1 = '7'.toInteger()  //Integer







    }


}
