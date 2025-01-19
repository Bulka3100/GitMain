package org.example.Lesson_20

fun main() {
    println("Введите имя пользователя")
    val userName = readln()
    val splashGreetings: (String)-> Unit ={name:String-> println("С наступающим Новым Годом, $name!")}
    splashGreetings(userName);
    {it:String-> println("с новой годой $it") }("пользователь")

}
