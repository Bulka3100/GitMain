package org.example.Lesson_18

import kotlin.random.Random

fun main() {
    val bone4 = Bone4()
    val bone6 = Bone6()
    val bone8 = Bone8()
    val boneList: List<Bone> = listOf<Bone>(bone8, bone4, bone6)
    for (i in boneList) {
        println(i.getNubmer())
    }
}

abstract class Bone() {
    open fun getNubmer(): String {
        return ""
    }
}

class Bone4(
    val nubmer: Int = Random.nextInt(1, 4),
) : Bone() {
    override fun getNubmer(): String {
        return nubmer.toString()
    }
}

class Bone6(
    val nubmer: Int = Random.nextInt(1, 6),

    ) : Bone() {
    override fun getNubmer(): String {
        return nubmer.toString()
    }
}

class Bone8(
    val nubmer: Int = Random.nextInt(1, 8),
) : Bone() {
    override fun getNubmer(): String {
        return nubmer.toString()
    }
}


