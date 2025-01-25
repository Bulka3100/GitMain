package org.example.Lesson_10

fun main() {
    println("введите логин")
    val login = get()

    println("введите пароль")
    val password = get()
    println("добрый вечер!")
}

fun get(): String {
    var loginOr: String
    do {
        loginOr = readln()
        if (loginOr.length < 4) println("меньше 4х символов")
    } while (loginOr.length < 4)
    return loginOr
}
