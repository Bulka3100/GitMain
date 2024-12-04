package org.example.Lesson_7

fun main() {
    var password = ""
    val rangeInt = 1..9
    val rangeChar = 'a'..'z'
    val rangeCharUpper = 'A'..'Z'
    var x: Int // не знал как вынести нужную переменную за пределы цикла поэьому создал отдельную и записал в нее значения из цикла
    val operations = listOf(
        { password += rangeInt.random() },
        { password += rangeCharUpper.random() },
        { password += rangeChar.random() }
    )
    do {
        println("Enter Quantity of symbols")
        val enterNumberOfSymbols = readlnOrNull()!!.toInt()
        if (enterNumberOfSymbols < 6) println("пароль должен быть длиннее 6и символов")
        x = enterNumberOfSymbols
    } while (enterNumberOfSymbols < 6)
    for (i in 1..x) {
        operations.random().invoke()
    }
    println(password)
}