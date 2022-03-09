class CodeWriter {

    List languages = []


    def methodMissing(String name, args) {
        println "$name() method was called ..."

        if (name.startsWith('write')) {
            String language = name.split('write')[1]
            if (languages.contains(language)) {
                def impl = { Object[] theArgs ->
                    println "I like to write code in $language"
                }
                getMetaClass()."$name" = impl
                return impl(args)
            }
        }
    }
}

CodeWriter codeWriter = new CodeWriter()

codeWriter.languages << "Groovy"
codeWriter.languages << "Java"
println codeWriter.metaClass.methods.size()

codeWriter.writeGroovy()
codeWriter.writeGroovy()
codeWriter.writeGroovy()
println codeWriter.metaClass.methods.size()
codeWriter.writeJava()
codeWriter.writeJava()
println codeWriter.metaClass.methods.size()