package org.example.Lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7
    println(year)
    println(String.format("%02d", hour))
    println(String.format("%02d", minute))
    hour = 10
    minute = 55
    print(String.format("%02d", hour))
    print(":")
    print(String.format("%02d", minute))
}