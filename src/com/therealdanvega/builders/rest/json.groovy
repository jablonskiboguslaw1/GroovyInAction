package com.therealdanvega.builders.rest

import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()


builder.books {
    currentBook {
        isbn '978-1935182443'
        title 'Groovy in Action 2nd Edition'
        author(first: 'Dierk', last: 'Koenig', twitter: '@Koenig')
        related 'something', 'nothing'
    }
    nextBook {
        isbn '978-1935182948'
        title 'Making Java Groovy'
        author(first: 'Ken', last: 'Kousen', twitter: '@Kousen')
        related 'something', 'nothing'
    }
}

new File('data/books.json').write(builder.toPrettyString())

