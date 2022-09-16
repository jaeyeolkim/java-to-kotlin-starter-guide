package lec10

fun main() {
    Derived(300)
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("base init")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("derived init")
        println(number)
    }
}