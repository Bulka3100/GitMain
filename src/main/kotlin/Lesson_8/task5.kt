package org.example.Lesson_8

fun main() {
    print("Введите количество ингредиентов: ")
    val size = readln().toInt()

    val ingredients = Array(size) { readln() }
    println("Ингредиенты: ${ingredients.joinToString(", ")}")
}

