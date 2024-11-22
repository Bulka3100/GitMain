package org.example.Lesson_2

fun main() {
    val crystalOreMined = 7
    val ironOreMined = 11
    val Buffed = 1 + 0.20
    val crystalOreMinedWithBuff = ((crystalOreMined * Buffed) - crystalOreMined).toInt()
    val IronOreMinedWithBuff = ((ironOreMined * Buffed) - ironOreMined).toInt()

    println(crystalOreMinedWithBuff)
    println(IronOreMinedWithBuff)
}