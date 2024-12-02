package org.example.Lesson_6

import kotlin.concurrent.thread

fun main() {

    println("сколько секунд засечь?")
    var seconds = readlnOrNull()!!.toInt()
    var initialSeconds = seconds

    do {
        println(seconds--)
        Thread.sleep(1000)
    } while (seconds > 0)
    println("прошло $initialSeconds секунд(ы)")

}