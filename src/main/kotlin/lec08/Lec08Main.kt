package lec08

fun main() {
    repeat("hello!")
    repeat("hello!", useNewLine = false)

    varargTest("A", "B")
    val strings = arrayOf("A", "B")
    varargTest(*strings)
}

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun varargTest(vararg strs: String): Unit {
    for (str in strs) {
        println(str)
    }
}