package com.therealdanvega.builders

import groovy.xml.MarkupBuilder

FileWriter writer = new FileWriter('html/about.html')
MarkupBuilder mb = new MarkupBuilder(writer)


List courses = [[id: 1, name: 'Apache Groovy'], [id: 2, name: 'Java'], [id: 3, name: 'Spring']]


mb.html {
    head {
        title "About me"
        discription "this is about me page"
        keywords 'groovy, java, spring'
    }
    body {
        h1 'About me'
        p 'This is a bunch of text about me'
        section {
            h2 'Courses'
            table {
                tr {
                    th 'id'
                    th 'name'
                }
                courses.each { course ->
                    {
                        tr {
                            td course.id
                            td course.name
                        }
                    }
                }
            }
        }
    }
}
