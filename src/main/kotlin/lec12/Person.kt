package lec12

fun main() {
    println(Singleton.age)
    Singleton.age = 10
    println(Singleton.age)

    moveSomething(object : Movable {
        override fun fly() {
            println("fly!")
        }
    })
}

class Person private constructor(
    val name: String,
    val age: Int
) {
    // static -> companion object
    companion object {
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}

object Singleton {
    var age: Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.fly()
}

interface Movable {
    fun fly()
}