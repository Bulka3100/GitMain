package org.example.Lesson_20

fun main() {
    val stringList: List<String> = listOf("кнопка1", "кнопка2", "кнопка3", "кнопка4")
    val lambdaEl = stringList.mapIndexed { index, view -> { "нажат элемент $view" } }
    println(lambdaEl) // плохо понимаю в чем ошибка GPT говорит что тут я создал не лямбды, но я не понимаю разницы
    for ((index, lambda) in lambdaEl.withIndex()) {
        if (index % 2 == 0)
            println(lambda())
    }

}