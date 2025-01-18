package org.example.Lesson_19

fun main(){
    println("Добро пожаловать пользователь. Вбей сначала имя, затем пол")
    val humanList= mutableListOf<Human>()
    val name= readln()
    val sex: Sex=readln()
    val human1= Human(name,sex)
    val human2= Human(name,sex)
    val human3= Human(name,sex)
    val human4=Human(name,sex)
    val human5=Human(name,sex)
    humanList.add(human5)

}

class Human(
    name: String,
    sex: Sex,
)
enum class Sex{
    MALE,
    FEMALE,
    ANOTHER,
}