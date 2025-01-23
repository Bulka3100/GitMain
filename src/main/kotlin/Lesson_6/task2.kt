package org.example.Lesson_6

import kotlin.concurrent.thread

fun main() {

    println("сколько секунд засечь?")
    var seconds = readln().toLong()
    Thread.sleep(1000L * seconds)
    println("прошло $seconds секунд(ы)")
}