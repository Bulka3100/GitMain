package org.example.Lesson_18

fun main() {
val screen= Screen()
    screen.drawCircle(1,3,5)
    screen.drawCircle(1.0f,3.0f,5.0f)

}
class Screen(){
 fun drawCircle(x:Int,y:Int,r:Int){
     println("создан круг с координатами центра $x $y и радиусом $r")
 }
    fun drawCircle(x: Float, y: Float, r: Float){
        println("создан круг с координатами центра $x $y и радиусом $r")
    }
 fun drawDot(x: Int, y: Int){
     println("создана точка с координатами ($x,$y)")
 }
    fun drawDot(x: Float, y: Float){
        println("создана точка с координатами ($x,$y)")
    }
    fun drawSquare(x:Int,y:Int, edgeLength:Int){
        println("создан квадрат с левым верзнем углом в ($x,$y) и длиноой стороны $edgeLength")
    }


    }

