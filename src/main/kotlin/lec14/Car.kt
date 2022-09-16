package lec14

fun main() {
    handleCar(Avante())
}

private fun handleCar(car: Car) {
    when (car) {
        is Avante -> println("this is avante")
        is Sonata -> println("this is sonata")
    }
}

sealed class Car(
    val name: String
)

class Avante : Car("avante")

class Sonata : Car("sonata")