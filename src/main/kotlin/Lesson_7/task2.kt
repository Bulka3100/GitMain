package org.example.Lesson_7

fun main() {
    val range = 1000..9999
    do {
        var code = range.random().toString()
        println("ваш код авторизации $code")
        println("введите код авторизации")
        val enterCode = readlnOrNull().toString()
    } while (code != enterCode)

    println("авторизация успешна")
}