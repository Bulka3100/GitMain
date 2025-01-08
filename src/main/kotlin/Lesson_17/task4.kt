package org.example.Lesson_17

fun main() {
    val autoAccessory = Package(1, "Mexico", 0)
    println(autoAccessory.counter)
    autoAccessory.currentPlace = "Russia"
    println(autoAccessory.counter)

}

class Package(id: Int, currentPlace: String, counter: Int) {
    val id: Int = id //нормально ли так инициализировать свойства в двух местах если хочу геттер вписать? Может надо назвать иначе или создать
    var currentPlace = currentPlace
        set(value) {
            counter += 1
            field = value
        }
    var counter = counter
}

