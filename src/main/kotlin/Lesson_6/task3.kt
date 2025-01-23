package org.example.Lesson_6

fun main() {

    println("сколько секунд засечь?")
    var seconds = readlnOrNull()!!.toInt()
    while (seconds > 0) {
        println("осталось секунд ${seconds--}")
        Thread.sleep(1000)
    }
    println("время вышло!")
}