/*
import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient


@Grab(group = 'org.codehaus.groovy.modules.http-builder', module = 'http-builder', version = '0.7.1')

String base = 'https://api.chucknorris.io'


def chuck = new RESTClient(base)

chuck.contentType = ContentType.JSON

chuck.get(path: '/jokes/random') { response, json ->
    println response.status
    println json
}


*/ //IT DOESN'T WORK
