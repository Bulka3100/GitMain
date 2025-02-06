package org.example.Lesson_13

fun main() {
    val сlientlist = mutableListOf<Client>()
    println("введите номер телефона")
    val phoneNumber = readln().toLongOrNull()
    if (phoneNumber != null) {
        val correctNumber = phoneNumber
        println("введите название компании ")
        val companyName: String? = readln()
        println("введите имя")
        val name: String = readln()

        val client1 = Client(name,correctNumber,companyName)
        сlientlist.add(client1)
        client1.showInfo()
    } else println("вы не ввели номер")


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