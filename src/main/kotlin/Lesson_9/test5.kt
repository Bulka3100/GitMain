package org.example.Lesson_9

fun main() {
    val ingredients = mutableSetOf<String>()
    val first = readln().uppercase()
    val second = readln()
    val third = readln()
    val fourth = readln()
    val fifth = readln()
    ingredients.add(first)
    ingredients.add(second)
    ingredients.add(third)
    ingredients.add(fourth)
    ingredients.add(fifth)
    val sorted = ingredients.toSortedSet()
    println(sorted.joinToString())
}