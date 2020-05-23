package loops

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 6, 8, 9)
    println(reverse(numbers))
    println(reverseNew(numbers))
}

fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in list.indices) { //list.indices is equal to 0..list.size - 1
        result.add(list[list.size - 1 - i])
    }
    return result
}

fun reverseNew(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in list.size -1 downTo 0) {
        result.add(list.get(i))
    }
    return result
}