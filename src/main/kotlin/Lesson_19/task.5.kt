package org.example.Lesson_19

fun main(){
    val humanList= mutableListOf<Human>()
    for (i in 1..5){
    println("Добро пожаловать пользователь. Вбей сначала имя, затем пол")
    val name= readln()

        var sex: Sex? = null
        while (sex == null) {
            println("Введите пол (MALE, FEMALE, ANOTHER):")
            val input = readln().uppercase()

            sex = try {
                Sex.valueOf(input)
            } catch (e: IllegalArgumentException) {
                println("Неверный ввод. Попробуйте еще раз.")
                null
            }
        }
    humanList+= Human(name,sex)
}
    println(humanList.joinToString(", "){"${it.name},${it.sex}"})

}

data class Human(
    val name: String,
   val  sex: Sex,
)
enum class Sex{
    MALE,
    FEMALE,
    ANOTHER,
}