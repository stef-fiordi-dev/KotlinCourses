package oo

import javax.lang.model.util.Elements

class Stack<T>(vararg val items: T) {

    val elements = items.toMutableList()

    fun push(element: T) {
        elements.add(element)
    }

    fun pop(): T? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    fun isEmpty(): Boolean = elements.isEmpty()
}

fun <T> stackOf(vararg elements: T): Stack<T> {
    return Stack(*elements)
}

fun main(args: Array<String>) {
    val stack = Stack(3, 5, 2, 8)
    stack.push(11)

    val stack2 = stackOf("Hi", "Hey", "Hello")
    for (i in 1..3) {
        println(stack2.pop())
    }

    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
}