package org.example.Lesson_4

fun main() {
    val day = 5
    val isArmsAndAbsDay = day % 2 == 1
    val output = """
        Упражнения для рук:       $isArmsAndAbsDay
        Упражнения для ног:       ${!isArmsAndAbsDay}
        Упражнения для спины:     ${!isArmsAndAbsDay}
        Упражнения для пресса:    $isArmsAndAbsDay
    """.trimIndent()

    println(output)
}

