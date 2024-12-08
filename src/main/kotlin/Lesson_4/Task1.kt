package org.example.Lesson_4

fun main() {

    val tablesReservedToday = 13
    val tablesReservedTomorrow = 9
    println("Доступность столиков на сегодня: ${NUMBER_OF_TABLES > tablesReservedToday}")
    println("Доступность столиков на завтра: ${NUMBER_OF_TABLES > tablesReservedTomorrow}")

}
const val NUMBER_OF_TABLES = 13