package org.example.Lesson_4

fun main() {
    val good1Weight = 20
    val good1Volume = 80
    val good2Weight = 50
    val good2Volume = 100
    println("Груз весом 20кг и объёмом 80 л соответствует категории 'Avverage':${(good1Weight > 35 && good1Weight <= 100) && good1Volume < 100}")
    println("Груз весом 20кг и объёмом 80 л соответствует категории 'Avverage':${(good2Weight > 35 && good2Weight <= 100) && good2Volume < 100}")
}