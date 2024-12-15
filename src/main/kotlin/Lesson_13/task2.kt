package org.example.Lesson_13

fun main() {
    val client1 = Client(
        name = "Ростик",
        number = 88005553535,
        company = "VK"
    )
    client1.showInfo()
}

class Client(
    val name: String,
    val number: Long,
    val company: String? = null ?: "не указано",
) {
    fun showInfo() {
        println("имя:$name \nномер:$number \nкомпания:$company")
    }
}