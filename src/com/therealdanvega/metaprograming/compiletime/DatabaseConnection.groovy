package com.therealdanvega.metaprograming.compiletime

@Singleton
class DatabaseConnection {


    static void main(String[] args) {

        def instance1 = DatabaseConnection.getInstance()

        def instance2 = DatabaseConnection.getInstance()


        println instance1 == instance2
    }
}
