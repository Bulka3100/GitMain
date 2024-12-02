package org.example.Lesson_6

fun main() {
    println("создайте пароль и логин")
    var iaAutorizred = false
    val pasword = readLine()
    println("введи пароль")
    do {
        val passwordEnter = readLine()
        if (passwordEnter != pasword) println("неверная авторизация") else continue
    } while (passwordEnter != pasword)
    println("авторизация успешна")


}

