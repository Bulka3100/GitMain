package org.example.Lesson_7

fun main() {
    println("Enter Quantity of symbols")
    val enterNumberOfSymbols = readln().toInt()
    var password = mutableListOf<Char>()
    val rangeInt = '1'..'9'
    val rangeChar = 'a'..'z'
    val rangeCharUpper = 'A'..'Z'
    password.add(rangeInt.random()) // через add () можно только по спискам проходится, поэтому изменил подход
    password.add(rangeChar.random())
    password.add(rangeCharUpper.random())

    val operations = listOf(
        { password.add(rangeInt.random().toChar()) },
        { password.add(rangeCharUpper.random()) },
        { password.add(rangeChar.random()) }
    ) //избавился от бесполезного кода
        if (enterNumberOfSymbols < 6) println("пароль должен быть длиннее 6и символов")
    for (i in 1..enterNumberOfSymbols - 3) {
        operations.random().invoke()
    }
    println(password.joinToString(""))
}