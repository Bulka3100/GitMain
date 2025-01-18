package org.example.Lesson_19

fun main() {
    println(Fish.values())
    for(i in Fish.values()){(findFish(i))}


}
enum class Fish{
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}
fun findFish(fish: Fish){
    when(fish){
        Fish.GUPPY -> println("guppy")
        Fish.ANGELFISH -> println("angelfish")
        Fish.GOLDFISH -> println("goldfish")
        Fish.SIAMESE_FIGHTING_FISH -> println()
    }

}