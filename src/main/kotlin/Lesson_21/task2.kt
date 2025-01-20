package org.example.Lesson_21

fun main() {
    val numbers = listOf<Int>(4, 5, 6, 7, 10)
    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    return filter { it % 2 == 0 }.sum() //this.filter { it % 2 == 0 } эквивалентно
}