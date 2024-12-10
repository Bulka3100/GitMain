package org.example.Lesson_6

import kotlin.random.Random

fun main() {
    println("создайте пароль и логин")
    val pasword = readLine()
    val randomNumber1 = Random.nextInt(0, 10)
    val randomNumber2 = Random.nextInt(0, 10)
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
//        if (passwordEnter != pasword) println("неверная авторизация") else continue

    } while (passwordEnter != pasword)
    println("авторизация успешна")
}