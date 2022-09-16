package lec06

fun main() {
    for (i in 1..3) {
        println(i)
    }
    println("===")
    for (i in 3 downTo 1) {
        println(i)
    }
    println("===")
    for (i in 1..5 step 2) {
        println(i)
    }
}
