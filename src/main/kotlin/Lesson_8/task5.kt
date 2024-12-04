package org.example.Lesson_8

fun main() {
    println("сколько ингредиенттов добавить?")
    val numberOfIngredients = readlnOrNull()!!.toInt()
     val x = readln()
    val y= readln()
    var arrayOfIngredients =arrayOf<String>()
    arrayOfIngredients+=x
    arrayOfIngredients+=y
    println(arrayOfIngredients.joinToString(separator = ","))

}
//доработать
