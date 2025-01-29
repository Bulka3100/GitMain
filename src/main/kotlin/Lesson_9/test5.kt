package org.example.Lesson_9

fun main() {
    val ingredients = List(5) { readln() }
    val withoutRepeat = ingredients.toSet()
    val result = withoutRepeat.mapIndexed { index, element -> if (index == 0) element.capitalize() else element }
    println(result.joinToString())
}