package org.example.Lesson_5

fun main() {
    val distance = readln().toDouble()
    val fuelConsumeration = readln().toDouble()
    val currentPrice = readln().toDouble()
    val fuelNeeded = (distance * fuelConsumeration) / 100
    val endPrice = fuelNeeded * currentPrice
    val formatedresult = String.format("%.2f", endPrice)
    println(formatedresult)
}