package com.therealdanvega.metaprograming.compiletime;

import groovy.transform.AutoClone
import groovy.transform.Canonical;

@Canonical
@AutoClone
public class Clone {
    String first
    String last
    String email


    static void main(String[] args) {

        Clone dolly = new Clone("Dolly", "Sheep", "dolly@sheep.com")
        def dollyClone = dolly.clone()

        println dolly.is(dollyClone)

        print dolly == (dollyClone)


    }

}

