package com.therealdanvega.builders

import groovy.xml.MarkupBuilder

books =
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


MarkupBuilder mb = new MarkupBuilder()

mb.books {
    books.each { boo ->
        book(isbn: boo.isbn) {
            title boo.title
            author boo.author
            price boo.price
        }
    }
}


mb.html {
    head {
        title("My favorite books")
    }
    body {
        h1("my fav books")
        table {
            tr {
                th("ISBN")
                th("TITLE")
                th("AUTHOR")
                th("PRICE")
            }
            books.each { book ->
                tr {
                    td(book.isbn)
                    td(book.title)
                    td(book.author)
                    td(book.price)
                }
            }
        }
    }
}






