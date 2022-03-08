package com.therealdanvega.closures

class DelegateClosures {

    def outerClosure = {
        println this.class.name
        println owner.class.name
        println delegate.class.name
        def nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        nestedClosure()
    }

    def writer = {
        append 'Dan'
        append ' lives in Cleveland'
    }

    def append(String s) {
        println("append() called with argument of $s")
    }


    static void main(String[] args) {

        def demo = new DelegateClosures()
        demo.outerClosure()
        10.times { print '-' }
        println()


        StringBuffer sb = new StringBuffer()
        println "This is default strategy"
        demo.writer.delegate = sb

        demo.writer()
        println sb
        demo.writer.resolveStrategy = Closure.DELEGATE_FIRST

        println "This is delegate first"
        demo.writer()
        println sb


        println "this is delegate only"

        demo.writer.resolveStrategy = Closure.DELEGATE_ONLY

        demo.writer
        println sb


    }

}

