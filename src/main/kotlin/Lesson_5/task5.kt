package org.example.Lesson_5

import kotlin.random.Random

fun main() {
    val first = Random.nextInt(0, 43)
    val second = Random.nextInt(0, 43)
    val third = Random.nextInt(0, 43)
    val loteryListOf = mutableListOf<Int>()

    loteryListOf.add(first)
    loteryListOf.add(second)
    loteryListOf.add(third)

    println("введи первое число")
    val inputFirst = readln().toInt()
    println("введи второе число")
    val inputSecond = readln().toInt()
    println("введи третье число")
    val inputThird = readln().toInt()
    val loteryInputList = mutableListOf<Int>()
    loteryInputList.add(inputFirst)
    loteryInputList.add(inputSecond)
    loteryInputList.add(inputThird)
    val commonElements = loteryListOf.intersect(loteryInputList)
    when (commonElements.size) {
        1 -> println("1 угадано:утешительный прииз")
        2 -> println("2 угадано: крупный приз")
        3 -> println("3 угадано: джекпот")
        else -> println("не угадал!")
    }
    println(
        """
        $first
        $second
        $third
    """.trimIndent()
    )


}