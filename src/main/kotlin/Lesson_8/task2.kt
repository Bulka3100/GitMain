package org.example.Lesson_8

fun main() {
    val listOfIngredients = arrayOf("egg", "rice", "milk")
    val ingredient = readLine()
    var flag: Boolean = false
    for (i in listOfIngredients) {
        if (i == ingredient) {
            println("есть в списке")
            flag = true
        }
    }
    if (flag == false) println("нет в списке")
}