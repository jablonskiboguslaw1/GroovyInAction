package com.therealdanvega.metaprograming.compiletime

import groovy.transform.Immutable
import groovy.transform.ToString

@ToString
@Immutable
class ImmutablePerson {

    String first
    String last
    String email


    static void main(String[] args) {


        ImmutablePerson ip = new ImmutablePerson("Joe", "Biden", "some@email.com")
        println ip



       // ip.first="Andy" cannot assign to final field


    }

}
