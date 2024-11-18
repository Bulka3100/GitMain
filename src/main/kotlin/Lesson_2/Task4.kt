package org.example.Lesson_2

fun main() {
    val crystalOreMined = 7
    val ironOreMined = 11
    val crystalOreMinedWithBuff = ((crystalOreMined * 1.2) - crystalOreMined).toInt()
    val IronOreMinedWithBuff = ((ironOreMined * 1.2) - ironOreMined).toInt()

    println(crystalOreMinedWithBuff)
    println(IronOreMinedWithBuff)
}