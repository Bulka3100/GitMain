package org.example.Lesson_6

fun main() {

    println("сколько секунд засечь?")
    var seconds = readlnOrNull()!!.toInt()

    do {
        println("остаось секунд ${seconds--}")
        Thread.sleep(1000)
    } while (seconds > 0)
    println("время вышло!")
}