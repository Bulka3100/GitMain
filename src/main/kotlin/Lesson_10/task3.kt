package org.example.Lesson_10

fun main() {
    val password = generetePass(9)
    println(password)
}

fun generetePass(numberOfSymbols: Int): String {
    var result = ""
    for (i in 1..numberOfSymbols) {
        if (i % 2 == 0) result += addSymbol() else result += addInt()
    }
    return result
}

fun addInt(): String {
    val arrayInt = 0..9
    return arrayInt.random().toString()

}

fun addSymbol(): Char {
    val special = (' '..'/').toList()
    return special.random()
}
