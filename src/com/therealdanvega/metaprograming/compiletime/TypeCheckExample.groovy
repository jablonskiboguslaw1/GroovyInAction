package com.therealdanvega.metaprograming.compiletime

import groovy.transform.TypeChecked

@TypeChecked
class TypeCheckExample {

    String firstName
    String lastName

    String getFullName(){
 //       "$firstName  $lastname" //// lastname is undeclared --compilation error
        "$firstName  $lastName"

    }

}
