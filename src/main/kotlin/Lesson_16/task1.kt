package org.example.Lesson_16

fun main() {
    val dust = Dust()
    dust.printInfo()
}
class Dust(
    private val number: Int = (1..6).random()
) {
    fun printInfo() {
        println(number)
    }
}