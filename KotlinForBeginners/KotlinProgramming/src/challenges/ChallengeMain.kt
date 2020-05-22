package challenges

import kotlin.random.Random

fun main(args: Array<String>) {
//    conditionalsChallenge()
    loopsChallenge()
}

fun loopsChallenge() {
    var sum = 0L
    for (i in 100..100000L) {
        sum += i
    }
    println(sum)
}

fun conditionalsChallenge() {
    val random = Random.nextInt(50) + 1

    when(random) {
        in 1..10 -> println("$random is between 1 and 10")
        in 11..20 -> println("$random is between 11 and 20")
        in 21..30 -> println("$random is between 21 and 30")
        in 31..40 -> println("$random is between 31 and 40")
        else -> println("$random is above 40")
    }
}