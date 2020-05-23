package oo

import java.util.*

class Person(val name: String, val age: Int) {

    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2016 - age
}

fun main(args: Array<String>) {
    val person = Person("Jack", 17)

    person.speak()
    person.greet("World")
    println(person.getYearOfBirth())

    println(person.name)
    println(person.age)
}

//class Person {
//    var name: String = "Sarah"
//    var age: Int = 42
//
//    fun speak() {
//        println("Hello!")
//    }
//
//    fun greet(name: String) {
//        println("Hello $name!")
//    }
//
////    fun getYearOfBirth(): Int {
////        return 2020 - age
////    }
//
//    fun getYearOfBirth() = 2016 - age
//}
//
//fun main(args: Array<String>) {
//    val person = Person()
//
//    person.speak()
//    person.greet("World")
//    println(person.getYearOfBirth())
//
//    person.name = "Peter"
//    println(person.name)
//}