package org.example.Lesson_4

fun main() {
    val good1Weight = 20
    val good1Volume = 80
    val good2Weight = 50
    val good2Volume = 100
    val message1 = "Груз весом 20кг и объёмом 80 л соответствует категории 'Avverage'"
    val message2 = "Груз весом 50кг и объёмом 100 л соответствует категории 'Avverage'"

    println("$message1:${(good1Weight > WEIGHT_RESTRICTION && good1Weight <= WEIGHT_RESTRICTION) && good1Volume < VOLEME_RESTRICTION}")
    println("$message2:${(good2Weight > WEIGHT_RESTRICTION && good2Weight <= VOLEME_RESTRICTION) && good2Volume < VOLEME_RESTRICTION}")
}
const val WEIGHT_RESTRICTION = 35
const val VOLEME_RESTRICTION = 100