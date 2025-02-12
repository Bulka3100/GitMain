package org.example.Lesson_21

fun main() {
    println(skillsMap.maxCategory())
}

enum class Skills() {
    STRENGTH,
    MAGIC,
    WEAPON,
    ARCHERY,
}

val skillsMap = mapOf<String, Int>(
    Skills.ARCHERY.name to 12,
    Skills.WEAPON.name to 10,
    Skills.MAGIC.name to 40,
    Skills.STRENGTH.name to 10,

    )

fun Map<String, Int>.maxCategory(): String?  {
    return entries.maxByOrNull { it.value }?.key
}


