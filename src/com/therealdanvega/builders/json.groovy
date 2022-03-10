package com.therealdanvega.builders

import groovy.json.JsonBuilder

book =
        [[
                 isbn  : "978-1935182443",
                 title : "Groovy in Action 2nd Edition",
                 author: "Dierk Koenig",
                 price : 50.58
         ], [
                 isbn  : "978-1935182948",
                 title : "Making Java Groovy",
                 author: "Ken Kousen",
                 price : 33.96
         ], [
                 isbn  : "978-1937785307",
                 title : "Programming Groovy 2: Dynamic Productivity for the Java Developer",
                 author: "Venkat Subramaniam",
                 price : 28.92]]


JsonBuilder builder = new JsonBuilder()


builder {
    books book.collect {
        [
                title : it.title,
                isbn  : it.isbn,
                author: it.author,
                price : it.price]
    }

}

println builder.toPrettyString()

new File('json/books.json').write(builder.toPrettyString())