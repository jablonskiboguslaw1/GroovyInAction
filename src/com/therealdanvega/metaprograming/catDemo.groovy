import com.therealdanvega.HelloWorld
import com.therealdanvega.metaprograming.StringCategory

//String.metaClass.shout = { -> toUpperCase()}


use(StringCategory) {
    println "Hello World!".shout()
}
