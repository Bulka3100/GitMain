package org.example.Lesson_6


fun main() {
    println("создайте пароль и логин")
    val pasword = readLine()
    val randomNumber1 = (1..9).random()
    val randomNumber2 = (1..9).random()
    println("введи пароль")
    var counter = 3
    do {
        val passwordEnter = readLine()
        println("решите пример $randomNumber1+$randomNumber2")
        var result = randomNumber1 + randomNumber2
        do {
            val res = readlnOrNull()?.toInt()
            counter--
        } while (counter > 0 && result != res)

    } while (passwordEnter != pasword)
    println("авторизация успешна")
}