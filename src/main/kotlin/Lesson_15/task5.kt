package org.example.Lesson_15

// важный момент, тут я добавил поле name чтобы перед каждым дейсьвием выводилось сначала $name и дажее текст, но из-за того что методы внутри интерфейсов они просто не видят полей класса. Я бы мог реализовать все методы прямо внутри абстрактного класса для видимости, но это противоречит заданию. Подскажите пожалуйста как реализовать
fun main() {
    val lightCar = LightAuto("легковой автомобиль")
    val loadCar = LoadAuto("грузовой автомобиль")
    println("осталось перевезти $passengersToMove человек и $cargoToMove тонн(ы) груза")
    lightCar.chooseDestination()
    loadCar.chooseDestination()
    lightCar.toMove()
    loadCar.toMove()
    loadCar.loadCargo()
    lightCar.loadPassengers()
    lightCar.MinusPassenger()
    lightCar.loadPassengers()
    println("осталось перевезти $passengersToMove человек и $cargoToMove тонн(ы) груза")


}

var passengersToMove: Int = 6
var cargoToMove: Int = 2

abstract class Auto(
    val name: String,
    val capacity: Int,
    var passengerCapacity: Int,
)

class LoadAuto(
    name: String,
    capacity: Int = 2,
    passengerCapacity: Int = 1,
) : Auto(name, capacity, passengerCapacity), Movement, Load {
    override fun loadCargo() {
        super.loadCargo()
        passengersToMove -= passengerCapacity
        cargoToMove -= capacity
    }
}

class LightAuto(
    name: String,
    capacity: Int = 0,
    passengerCapacity: Int = 3,
) : Auto(name, capacity, passengerCapacity), Movement, LoadPass {
    override fun loadPassengers() {
        super.loadPassengers()
        passengersToMove -= passengerCapacity
    }

    fun MinusPassenger() {
        println("высадить одного пассажира")
        passengerCapacity = 2
    }
}

interface Movement {
    fun chooseDestination() {
        println(":маршрут выбран")
    }

    fun toMove() {
        println("автомобиль едет")

    }
}

interface Load {
    fun loadCargo() {
        println("груз выгружен")
    }

}

interface LoadPass {

    fun loadPassengers() {
        println("пассажиры выгружены")
    }
}