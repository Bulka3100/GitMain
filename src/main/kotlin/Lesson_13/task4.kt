package org.example.Lesson_13

fun main() {
    val сlientlist = mutableListOf<Client>()
    println("введите номер телефона")
    val phoneNumber = readln().toLongOrNull()
    if (phoneNumber != null) {
        val correctNumber = phoneNumber // почему тип long? по умолчанию если я ввел проверку что это не нулл
        println("введите название компании ")
        val companyName: String? = readln()
        println("введите имя")
        val name: String = readln() //можно самому проставить что readln возвращает ?

        val client1 = Client(name,correctNumber,companyName)
        сlientlist.add(client1)
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