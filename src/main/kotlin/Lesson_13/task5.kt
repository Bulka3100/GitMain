package org.example.Lesson_13

fun main() {
    val сlientlist = mutableListOf<Client>()
    println("введите номер телефона")
    val phoneNumber = readln()
    try {
        val correct = phoneNumber.toLong()
        val client1 = Client(
            name = "Alex",
            number = correct
        )
        client1.showInfo()
    } catch (e: NumberFormatException) {
        println("ошибка: ${e.message}")
    }

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