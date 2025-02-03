package org.example.Lesson_10


fun main() {
    val myToken = autorization("Bulka31", "QWERTY")
    println(getBasket(myToken))
}

fun generateToken(): String {
    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (1..32).map { chars.random() }.joinToString("")
}

fun autorization(login: String, password: String): String? {
    if (login == LOGIN && password == PASSWORD) {
        val token = generateToken()
        return token
    } else {
        return null
    }
}

private val buy: List<String> = listOf<String>("хлопья", "молоко", "мармелад")
fun getBasket(token: String?): List<String>? {
    if (token == autorization(LOGIN, PASSWORD)) {
        return buy
    } else {
        return null
    }

}

const val LOGIN: String = "Bulka31"
const val PASSWORD: String = "QWERTY"