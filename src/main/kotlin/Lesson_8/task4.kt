package org.example.Lesson_8

fun main() {
    var arrayOfIngredients = arrayOf("лук", "чеснок", "чипсы", "паприка", "вермишель")
    println("что заменить?")
    val change = readlnOrNull()
    if (change in arrayOfIngredients) {
        println("что хотели бы добавить?")
        val changeOn = readln()
        arrayOfIngredients = arrayOfIngredients.filterNot { it == change }.toTypedArray()
        arrayOfIngredients += changeOn
        println(arrayOfIngredients.joinToString())
    }
    else if(change !in arrayOfIngredients){
        println("нет такого в списке")
    }
    else println("ошибка")
}