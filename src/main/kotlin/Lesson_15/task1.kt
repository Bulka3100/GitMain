package org.example.Lesson_15

fun main() {
    val seagull = Seagull()
    val fish = Fish()
    val duck = Duck()
    seagull.toFly()
    duck.toSwim()
    duck.toFly()
    fish.toSwim()
}

class Fish() : Swim {
    override fun toSwim() {
        println("Рыба:")
        super.toSwim()
    }
}

class Duck() : Swim, Fly {
    override fun toFly() {
        println("Утка:")
        super.toFly()
    }

    override fun toSwim() {
        println("Утка:")
        super.toSwim()
    }
}

class Seagull() : Fly {
    override fun toFly() {
        println("Чайка:")
        super.toFly()
    }
}


interface Fly {
    fun toFly() {
        println("летает")
    }
}

interface Swim {
    fun toSwim() {
        println("плывёт")
    }
}