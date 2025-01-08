package org.example.Lesson_17

fun main() {
val victorina= Victorina("сколько?","немало")
    println(victorina._question)
    println(victorina._answer) //я думал что у меня свойство будет question без нижнего подчеркивания из конструктора, почему оно все таки не то?

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

// у меня проблема с тем как мне использовать геттер и сеттер при условии того, что у меня свойства определенны в первичном конструкторе. Как я понял удобно их определять когда свойства прописаны в теле класса


