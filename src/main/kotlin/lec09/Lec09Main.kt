package lec09

fun main() {
    val person = Person("kim", 9)
    println(person.name + "," + person.age)
    person.age = 10
    println(person.age)
}

class Person(
    val name: String,
    var age: Int = 1
) {
    init {
        if (age <= 0) {
            throw java.lang.IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
    }

    // constructor 를 추가하는 것보다 default parameter 를 활용한다
//    constructor(name: String): this(name, 1)

    val isAdult: Boolean
        get() = this.age >= 20
}