package lec14

fun main() {
    val personDto1 = PersonDto("kim", 10)
    val personDto2 = PersonDto("kim", 10)
    println(personDto1 == personDto2)
    println(personDto1)
}

data class PersonDto(
    val name: String,
    val age: Int,
)