package challenges

import kotlin.random.Random

class Book(val title: String, val author: String, val year: Int, var isBorrowed: Boolean) {

    fun borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true
        } else {
            println("Sorry, the book is already borrowed.")
        }
    }

    fun returnBook() {
        if (isBorrowed) {
            isBorrowed = false
        } else {
            println("The book was not borrowed so it cannot be returned.")
        }
    }

    fun printInfo() {
        println("Title: $title")
        println("Author: $author")
        println("Year: $year")
        println("Borrowed: $isBorrowed")
    }
}

fun main(args: Array<String>) {
//    conditionalsChallenge()
//    loopsChallenge()
//    basicsRecapChallenge()
    classesChallenge()
}

fun classesChallenge() {
    val book = Book("The Martian", "Andy Weir", 2011, false);
    book.borrowBook()
    book.printInfo()
}

fun basicsRecapChallenge() {
    val books = arrayListOf("Harry Potter", "Lord of the Rings", "1984", "Animal Farm")
    for (book in books) {
        if (book.contains('e')) {
            for (c in book) {
                println(c)
            }
            println()
        }
    }
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