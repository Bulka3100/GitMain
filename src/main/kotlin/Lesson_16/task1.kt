package org.example.Lesson_16

import kotlin.random.Random

fun main() {
    val dust = Dust()
    dust.printInfo()
}

class Dust(
    private val number: Int = Random.nextInt(1, 7)
) {
    fun printInfo() {
        println(number)
    }
}