package conditionals

fun main(args: Array<String>) {
    val x = 3
    when(x) {
        5 -> println("x is 5")
        3*12 -> println("x is 3*12")
        "Hey".length -> println("x is the length of the string 'Hey'")
        in 1..10 -> println("x is between 1 and 10")
        !in 1..10 -> println("x is not between 1 to 9")
    }
}

//fun main(args: Array<String>) {
//    val mode: Int = 2
//
//    val result = when (mode) {
//        1 -> "First mode."
//        2 -> {
//            println("This is second mode.")
//            val i: Int = 3
//            "It is a very useful mode."
//        }
//        3 -> "Third is the most advanced mode."
//        else -> "Don't know what mode this is."
//    }
//
//    println(result)
//
//    val x = if (mode < 2) {
//        println("Mode is less than 2.")
//        17
//    } else {
//        42
//    }
//
//    println(x)
//}

//fun main(args: Array<String>) {
//    val mode: Int = 2
//
//    when (mode) {
//        1 -> println("First mode.")
//        2 -> {
//            println("This is second mode.")
//            println("It is a very useful mode.")
//        }
//        3 -> println("Third is the most advanced mode.")
//        else -> println("Don't know what mode this is.")
//    }
//}

//fun main(args: Array<String>) {
//    val age: Int = 24
//    if (age < 18) {
//        println("You cannot register.")
//    } else if (age < 21) {
//        println("Well, maybe you can register.")
//    } else if (age < 27) {
//        println("You should be able to register.")
//    } else {
//        println("You're good to go!")
//    }
//
//    println("The end.")
//}