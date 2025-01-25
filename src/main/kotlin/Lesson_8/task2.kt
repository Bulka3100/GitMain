package org.example.Lesson_8

fun main() {
    val listOfIngredients = arrayOf("egg", "rice", "milk")
    val ingredient = readLine()
    var counter = 0
    for (i in listOfIngredients) {
        if (i == ingredient) {
            println("есть в списке")
            counter += 1
        } else counter += 0
    }
    if (counter==0){
        println("нет в списке")
    }
}