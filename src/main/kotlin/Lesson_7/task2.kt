package org.example.Lesson_7

fun main() {
    val range = 1..9
    var code = ""
    for (i in 1..4) {
        code += range.random()
    }
    do {

        println("ваш код авторизации $code")
        println("введите код авторизации")
        val enterCode = readlnOrNull()
    } while (code != enterCode)

    println("авторизация успешна")
}