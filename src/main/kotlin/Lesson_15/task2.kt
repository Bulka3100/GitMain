package org.example.Lesson_15

import sun.awt.www.content.audio.wav

fun main() {
    val temp = Temperature(12.5)
    val preci = PrecipitationAmount(43.4)
    val weatherServer = WeatherServer()
    weatherServer.sentData(temp)
    weatherServer.sentData(preci)
}

abstract class WeatherStationStats(

) {

}

class Temperature(
    val temp: Double
) : WeatherStationStats() {
    override fun toString(): String {
        return temp.toString()
    }
}

class PrecipitationAmount(
    val preci: Double
) : WeatherStationStats() {
    override fun toString(): String {
        return preci.toString()
    }
}

class WeatherServer {
    fun sentData(data: WeatherStationStats) {
        if (data is Temperature) {
            println("температура на сегодня $data")
        } else if (data is PrecipitationAmount) {
            println("количчество  осадков на сегодня $data")
        }
    }
}