class GroovyDeveloper {

    String first
    String last
    String email
    List languages

    GroovyDeveloper() {
    }

    def invokeMethod(String name, Object args) {
        println "invokeMethod() called $name with args $args"
    }

    def getProperty(String property) {
        println "getProperty called ..."
        metaClass.getProperty(this, property)
    }

    void setProperty(String property, Object newValue) {
        println "setProperty() called  with name $property and newValue $newValue"
        metaClass.setProperty(this, property, newValue)
    }
}


GroovyDeveloper gd = new GroovyDeveloper(first: "dan", last: "Vega", email: "danvega@gmail.com")
gd.writeCode("Groovy")
println gd.first
gd.languages = ["Groovy", "Java"]
