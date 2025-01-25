package org.example.Lesson_2

fun main() {
    val crystalOreMined = 7
    val ironOreMined = 11
    val buffed = 1 + (BUFFED_PERCENT / 100.0)
    val crystalOreMinedWithBuff = ((crystalOreMined * buffed) - crystalOreMined).toInt()
    val IronOreMinedWithBuff = ((ironOreMined * buffed) - ironOreMined).toInt()

    println(crystalOreMinedWithBuff)
    println(IronOreMinedWithBuff)
}

const val BUFFED_PERCENT = 20