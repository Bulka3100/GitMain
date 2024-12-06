package org.example.Lesson_4

fun main() {
    val quantityOfTables = 13
    val tablesReservedToday = 13
    val tablesReservedTomorrow = 9
    println("Доступность столиков на сегодня: ${quantityOfTables != tablesReservedToday}")
    println("Доступность столиков на завтра: ${quantityOfTables != tablesReservedTomorrow}")

}