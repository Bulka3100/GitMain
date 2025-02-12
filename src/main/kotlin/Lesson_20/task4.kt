package org.example.Lesson_20

fun main() {
    val stringList: List<String> = listOf("кнопка1", "кнопка2", "кнопка3", "кнопка4")
    val lambdalist: List<()-> Unit> = stringList.map{ view -> {println( "нажат элемент $view") }}

    for ((index, lambda) in lambdalist.withIndex()) {
        if (index % 2 != 0)
            lambda()
    }

}