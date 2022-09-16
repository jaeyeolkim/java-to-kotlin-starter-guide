package lec03

import com.lannstark.lec03.Person

fun main() {
    val name = "kim"

    val trimIndent = """
        my name is
        ${name}
    """.trimIndent()

    println(trimIndent)

    val str = "abc"
    println(str[0])
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}