package org.example.Lesson_6

fun main() {
    println("создайте пароль и логин")
    var isAutorizred = false
    val pasword = readLine()
    println("введи пароль")
    do {
        val passwordEnter = readLine()
        if (passwordEnter != pasword) println("неверная авторизация")
        continue
    } while (passwordEnter != pasword)
    println("авторизация успешна")

}

