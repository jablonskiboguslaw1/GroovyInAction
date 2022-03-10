import groovy.json.JsonSlurper

def books = '''{
    "books": {
        "currentBook": {
            "isbn": "978-1935182443",
            "title": "Groovy in Action 2nd Edition",
            "author": {
                "first": "Dierk",
                "last": "Koenig",
                "twitter": "@Koenig"
            },
            "related": [
                "something",
                "nothing"
            ]
        },
        "nextBook": {
            "isbn": "978-1935182948",
            "title": "Making Java Groovy",
            "author": {
                "first": "Ken",
                "last": "Kousen",
                "twitter": "@Kousen"
            },
            "related": [
                "something",
                "nothing"
            ]
        }
    }
}'''


//JsonSlurper slurper = new JsonSlurper()
//
//def json = slurper.parseText(books)
//
//println json
//println json.getClass().getName()
//
//println json.books.nextBook.title


JsonSlurper slurper = new JsonSlurper()

def json = slurper.parse(new File('data/books.json'))

println json.books.currentBook.author.twitter

println json.books.nextBook.title
