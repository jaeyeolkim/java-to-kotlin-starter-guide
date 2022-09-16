package lec15

fun main() {

    val array = arrayOf(1, 2)
    println("=== array ===")
    for ((idx, value) in array.withIndex()) {
        println("${idx} ${value}")
    }

    val numbers = listOf(1, 2)
    val emptyList = emptyList<Int>()

    println("=== list ===")
    for (number in numbers) {
        println("${number}")
    }
    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }

    val mutableList = mutableListOf(1, 2)
    mutableList.add(3)
    for (i in mutableList) {
        println("${i} ${mutableList.get(i-1)}")
    }

    val set = mutableSetOf(100L)
    for (num in set) {
        println("=== set ===")
        println(num)
    }

    println("=== map ===")
    val mutableMap = mutableMapOf<Int, String>()
    mutableMap[1] = "MON"
    mutableMap[2] = "TUE"

    val mapOf = mapOf(1 to "MON", 2 to "TUE")
    println(mutableMap)
    println(mapOf)

    for (key in mutableMap.keys) {
        println("${key} ${mutableMap[key]}")
    }
    for ((key, value) in mapOf.entries) {
        println("${key} ${value}")
    }
}