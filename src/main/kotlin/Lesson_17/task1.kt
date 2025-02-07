package org.example.Lesson_17

fun main() {
val victorina= Victorina("сколько?","немало")
    println(victorina._question)
    println(victorina._answer)

}
class Victorina(question: String,answer: String){
    val _question=question
        get()=field
    var _answer=answer
        get()=field
        set(value){
            field=value
        }
}



