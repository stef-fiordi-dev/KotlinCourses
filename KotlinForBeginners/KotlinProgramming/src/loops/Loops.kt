package loops

fun main(args: Array<String>) {
    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                break@outer
            }
            println("$i - $j")
        }
    }
}

//fun main(args: Array<String>) {
//    for (c in "Python") {
//        if (c == 'o') {
//            break
//        }
//        print(c)
//    }
//
//    println()
//
//    val list = listOf("Book", "Table", "Laptop")
//    for (str in list) {
//        if (!str.contains('o')) {
//            continue
//        }
//
//        println(str)
//    }
//}

//fun main(args: Array<String>) {
//    var x = 9
//    while (x >= 0){
//       println(x)
//        x--
//    }
//}

//fun main(args: Array<String>) {
//    var sum = 0
//    for (i in 1..100) {
//        sum += i
//    }
//    println(sum)
//
//    val list = listOf("Java", "Kotlin", "Python")
//    for (element in list) {
//        println(element)
//    }
//
//    for ((index, value) in list.withIndex()) {
//        println("Element at $index is $value")
//    }
//}