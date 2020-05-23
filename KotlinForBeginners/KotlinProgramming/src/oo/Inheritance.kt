package oo

//open class Person(open val name: String, open val age: Int) {
//
//    init {
//        println("Object was created")
//    }
//
//    fun speak() {
//        println("Hello!")
//    }
//
//    fun greet(name: String) {
//        println("Hello $name!")
//    }
//
//    fun getYearOfBirth() = 2016 - age
//}

//abstract class Person(open val name: String, open val age: Int) {
//
//    abstract fun speak()
//
//    fun greet(name: String) {
//        println("Hello $name!")
//    }
//
//    fun getYearOfBirth() = 2016 - age
//}
//
//class Student(override val name: String, override val age: Int): Person(name, age) {
//
//    fun isIntelligent() = true
//
//    override fun speak() {
//        println("Hi there, I'm a student")
//    }
//}
//
//class Employee(override val name: String, override val age: Int): Person(name, age) {
//
//    fun receivePayment(){
//        println("Receive payment.")
//    }
//
//    override fun speak() {
//        println("Hi there, I'm an employee")
//    }
//}
//
//fun main(args: Array<String>) {
//    val student = Student("John", 25)
//    student.speak()
//
//    val employee = Employee("Mary", 32)
//    employee.speak()
//    employee.receivePayment()
//}