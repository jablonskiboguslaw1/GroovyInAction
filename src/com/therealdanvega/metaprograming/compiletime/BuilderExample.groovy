package com.therealdanvega.metaprograming.compiletime

import groovy.transform.ToString
import groovy.transform.builder.Builder

class BuilderExample {

    static void main(String[] args) {

        Programmer p = Programmer
                .builder()
                .email("some@email.com")
                .last("Kowalski")
                .first("John")
                .hireDate(new Date())
                .languages(["groovy", "java"])
                .build()

        println(p)


    }
}


@ToString
@Builder
class Programmer {

    String first
    String last
    String email
    List languages
    Date hireDate


}
