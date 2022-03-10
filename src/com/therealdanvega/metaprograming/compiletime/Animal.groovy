package com.therealdanvega.metaprograming.compiletime;

import groovy.transform.Canonical
import groovy.transform.Sortable;
import groovy.transform.TupleConstructor;

@Sortable(includes =[ "size","species"])
@Canonical
public class Animal {

    String species;
    String size;


    public static void main(String[] args) {


        Animal animal1 = new Animal("Dog", "small");
        Animal animal2 = new Animal("Cat", "large");

        println animal1

        println animal1 == animal2


    }


}
