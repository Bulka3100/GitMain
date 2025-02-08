package org.example.Lesson_21

import java.io.File

fun main() {
val newFile= File("new.txt")
    newFile.addWord()
}
fun File.addWord() {
    println("введите слово для добавления")
    val word = readln()
    val lowerCaseWord = word.lowercase()
    this.writeText(lowerCaseWord)

}