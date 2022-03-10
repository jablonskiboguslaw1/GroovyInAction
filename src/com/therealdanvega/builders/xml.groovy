package com.therealdanvega.builders

import groovy.xml.MarkupBuilder


MarkupBuilder mb = new MarkupBuilder()


//mb.sports({})   since closure is the one element we can skip '()'
mb.omitEmptyAttributes = true
mb.omitNullAttributes = true
mb.sports {
    sport(id: 1) {
        name "baseball"
    }
    sport(id: 2) {
        names {
            {
                UKname "football"
            }
            {
                USname "soccer"
            }
        }
    }
    sport(id: 3) {
        name "basketball"
    }
    sport(id: 4) {
        name "hockey"
    }
    sport(id: null,foo ='') {
        name ""
    }

}