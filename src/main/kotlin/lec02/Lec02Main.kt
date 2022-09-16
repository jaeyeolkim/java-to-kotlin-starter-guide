package lec02

fun startsWithA(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw java.lang.IllegalArgumentException("null")
}

fun startWithB(str: String?): Boolean? {
    return str?.startsWith("B")
}

fun startsWithC(str: String?): Boolean {
    return str?.startsWith("C") ?: false
}

fun st(str: String?): Boolean {
    return str!!.startsWith("")
}