package org.example.Lesson_1
fun main(){

    val quantityOfSeconds: Short=6485
    val minutes = (quantityOfSeconds/60)-60 // понимаем минут остаётся
    var hours: Int= quantityOfSeconds/60/60
    var seconds:Int= quantityOfSeconds- minutes*60 -hours*3600
    /* хотел вот так сделать для отображения минут и часов 2мя цифрами. Выдаёт ошибку
        if (hours<10) { hours.toString()
        hours= "0$hours"} else
        hours (через when не получилось ): )*/

//    я могу написать конструкцию с if для общего решения, но мне кажется вы этого не предусматривали. Интересно посмотреть ваше решение

   println("время в полёте 0$hours:$minutes:0$seconds")

}


