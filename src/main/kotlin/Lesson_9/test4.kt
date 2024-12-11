package org.example.Lesson_9

fun main() {
  val ingredients=readln()
   val input = ingredients.split(",")
    val sorted = input.sorted()
    println("отсортированный список: $sorted")
}