package org.example.Lesson_9

fun main() {
    println("введите 5 ингридиентов")
    val ingredients = readln()
    val input = ingredients.split(", ")
    val sorted = input.sorted()
    println("отсортированный список: $sorted")
}