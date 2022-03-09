
class Developer {


}



Expando e = new Expando()
e.name = 'bogus'
e.writeCode = { -> println "hello $name" }
e.writeCode()


println()



//per instance
Developer dev = new Developer()

dev.metaClass.name = "BOGU"
dev.metaClass.callMe = {-> println "siemano $name"}
dev.callMe()

//it doesn't work for other instances
//Developer dev2 = new Developer()
//dev2.callMe()



//FOR EVERY INSTANCE
String.metaClass.shout = { -> toUpperCase()}

println "Hello Bogus".shout()
