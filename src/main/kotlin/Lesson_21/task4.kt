package org.example.Lesson_21

import java.io.File

fun main() {

}
fun File.addWord() {
    println("введите слово для добавления")
    val word = readln()
    val lowerCaseWord = word.lowercase() //среда зачеркивает .toLowerCase, но боты пишут что верный именно он. Так какой более актуальный?
    writeText(lowerCaseWord)

} // как будто мало и ещё не понимаю работы. Доработать