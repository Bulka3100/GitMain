package org.example.Lesson_10

fun main() {
    println(goRound())
    do{
        println("хотите бросить кости еще раз?")
        val question= readln()
        if (question.equals("да", ignoreCase = true)) println(goRound())
        else if (question.equals("нет", ignoreCase = true)) println("количество побед:winCounter как сюда вернуть")
        else println("нет такого варианта")
    }while(question.equals("да", ignoreCase = true))

}

fun throwDust(): Int {
    val dust = 1..6
    val result = dust.random()
    println(result) //нормально что в функции и println и return
    return result
}

fun goRound(): String {
    val Robot = throwDust()
    val Human = throwDust()
    var winCounter = 0
    if (Robot > Human) return ("Robot")
    else if (Robot < Human) {
        return ("Human")
        winCounter += 1
    } else return ("ничья")
}