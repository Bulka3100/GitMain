package org.example.Lesson_8

    fun main() {
        var arrayOfIngredients = arrayOf("лук", "чеснок", "чипсы", "паприка", "вермишель")
        println("Что заменить?")
        val change = readlnOrNull()
            val index = arrayOfIngredients.indexOf(change)

            if (index >= 0) {
                println("Что хотели бы добавить?")
                val changeOn = readln()
                arrayOfIngredients[index] = changeOn
                println(arrayOfIngredients.joinToString())
            } else {
                println("Нет такого в списке")
            }
    }