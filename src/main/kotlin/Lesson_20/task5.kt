package org.example.Lesson_20

import kotlin.String

fun main() {
val robotV1= Robot()
    robotV1.say()
    robotV1.setModifier({it.reversed()})
    robotV1.say()
    robotV1.setModifier({it.uppercase()})
    robotV1.say()
    robotV1.setModifier({"Мисье,$it"})
        robotV1.say()

}

class Robot(
    private var modifier: (String) -> String = { it }
    ) {
    init {
        println("создан прототип робота")
    }

    fun say() {
        val randomPhrase =(phraseList.random())
        val finalPhrase = modifier(randomPhrase)
        println(finalPhrase)
    }

    fun setModifier( modifier: (String) -> String ) {
        this.modifier = modifier

        }



    companion object {
        val phraseList = listOf<String>(
            "Доброе утро",
            "Добрый день",
            "здравствуйте",
            "чем вам помочь?"
        )
    }}