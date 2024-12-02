package org.example.Lesson_6

fun main() {
    println("отгадай число от 1 до 9")
    var counterOfGuesses = 5
    do {
        val number = readlnOrNull()?.toInt()
        println(counterOfGuesses--)
    } while (number != INITIAL_NUMBER && counterOfGuesses > 0)
    println("было загадано число $INITIAL_NUMBER")

}
const val INITIAL_NUMBER = 3