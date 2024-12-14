package org.example.Lesson_12

fun main() {
        val November15 = Weather(
            _dayTemp = 13,
            _nightTemp = 11,
        )
        November15.showAll()
    }

    class Weather(
        _dayTemp: Int,
        _nightTemp: Int,
    ) {
        var dayTemp=_dayTemp
        var nightTemp=_nightTemp
        fun showAll() {
         println("днём $dayTemp вечером $nightTemp")
        }
    }//я правильно понял что именно так я не занимаю память в конструкторе?
//я правильно понял что само свойство у нас dayTemp а _dayTemp это всего лишь обращение через него в конструкторе
// свойство и поле это разные вещи?
