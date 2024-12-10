package org.example.Lesson_4

fun main() {
    fun main() {
        val isInjured: Boolean = readln().toBoolean()
        val isPeople = readln().toInt()
        val enoughBoxes = readlnOrNull()!!.toInt()
        val weatherIsFine: Boolean = readln().toBoolean()
        val shipIsReady = isInjured == true && isPeople in RECOMMENDED_PEOPLE_FROM..RECOMMENDED_PEOPLE_TO && enoughBoxes > BOXES_NEEDED && weatherIsFine == true
        println("Готовность коробля: $shipIsReady")
    }
}
const val BOXES_NEEDED = 50
const val RECOMMENDED_PEOPLE_TO = 70
const val RECOMMENDED_PEOPLE_FROM = 55
