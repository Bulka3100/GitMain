package org.example.Lesson_20

import kotlin.String

fun main() {
val robotV1= Robot()
    robotV1.say()
    robotV1.setModifier(SpeechStyle.POLITE)
    robotV1.say()
    robotV1.setModifier(SpeechStyle.ANGRY)
    robotV1.say()
    robotV1.setModifier(SpeechStyle.NORMAL)
    robotV1.say()

}

class Robot(
    private var currentPhrase: String =phraseList.random()
    ) {
    init {
        println("создан прототип робота")
    }

    fun say() {
        println(currentPhrase)
    }

    fun setModifier( style: SpeechStyle) {
        val basePhrase=phraseList.random()
        when (style){
            SpeechStyle.POLITE -> currentPhrase=forPolite+basePhrase
            SpeechStyle.ANGRY -> currentPhrase=forAngey+basePhrase
            SpeechStyle.NORMAL -> currentPhrase=basePhrase
            else -> println("error")
        }

    }

    companion object {
        val forPolite = "Мисье,"
        val forAngey = "Негодяй,"
        val forNormal = ""
        val phraseList = listOf<String>(
            "Доброе утро",
            "Добрый день",
            "здравствуйте",
            "чем вам помочь?"
        )
    }
    /*private fun getRandomElement(list: List<*>) { // * Нормальный орбщий элеммент или Т использовать? Пишет по-разному
        val size = list.size
        val randomIndex = Random.nextInt(0, size - 1)
        val randomListElement = list[randomIndex]
        return randomListElement
    } в итоге это оказалось не нужно, но все равно интересно*/
}

enum class SpeechStyle {
    POLITE,
    ANGRY,
    NORMAL,
}