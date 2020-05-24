package oo

//abstract class Course(val topic: String, val price: Double) {
//    open fun learn() {
//        println("Learning $topic.")
//    }
//}
//
//interface Learnable {
//    fun learn() {
//        println("Learning...")
//    }
//}
//
//open class KotlinCourse(): Learnable, Course("Kotlin", 999.99) {
//    final override fun learn() { //Cannot be overridden anymore
//        super<Course>.learn()
//        println("I'm one of the first people to learn Kotlin!")
//    }
//}
//
//
//
//fun main(args: Array<String>) {
//    val course = KotlinCourse()
//    course.learn()
//}