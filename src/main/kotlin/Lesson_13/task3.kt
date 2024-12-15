package org.example.Lesson_13

fun main() {
    val client1 = Client(
        name="abob",
        number =1349494949,
        company = null
    )
    val client2 = Client(
        name="john",
        number =9909494949,
        company = "null"
    )
    val client3 = Client(
        name="alex",
        number =5549494949,
        company = "sky"
    )
    val client4 = Client(
        name="arut",
        number =559494949,
        company = "sorlex"
    )
    val client5 = Client(
        name="slonnik",
        number =9509494949,
        company = null
    )
    val companiesList = listOf<Client>(client1, client2, client3, client4, client5)
    val companies = companiesList.mapNotNull{ it.company }
    println(companies)
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