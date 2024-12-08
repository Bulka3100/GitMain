package org.example.Lesson_4

fun main() {
    val weatherTodaySunny: Boolean = true
    val tentIsOpened: Boolean = true
    val airWet: Int = 20
    val currentTimeOfTheYear: String = "Winter"
    val message = "Благоприятные ли условия сейчас для роста бобовых?"
    println("$message ${weatherTodaySunny == true && tentIsOpened == true && airWet == airWet && currentTimeOfTheYear != "Winter"}")
}
