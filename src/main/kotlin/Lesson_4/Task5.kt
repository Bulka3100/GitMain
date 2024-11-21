package org.example.Lesson_4

fun main() {
    fun main() {
        val isInjured: Boolean = readln().toBoolean()
        val isPeople = readlnOrNull()!!.toInt()
        val enoughBoxes = readlnOrNull()!!.toInt()
        val weatherIsFine: Boolean = readln().toBoolean()
        val shipIsReady = isInjured == true && isPeople in 55..70 && enoughBoxes > 50 && weatherIsFine == true
        println("Готовность коробля: $shipIsReady")
    }
}