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
        if (loginOr.length < MAX_SYMBOLS) println("меньше ${MAX_SYMBOLS}х символов")
    } while (loginOr.length < MAX_SYMBOLS)
    return loginOr
}
const val MAX_SYMBOLS = 4