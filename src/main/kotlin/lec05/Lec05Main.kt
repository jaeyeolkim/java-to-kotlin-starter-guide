package lec05

fun getPassOrFail(score: Int): String {
    return if (score > 50) {
        "P"
    } else {
        "F"
    }
}

fun validateScore(score: Int) {
    if (score in 1..100) {
        println("1과 100 사이입니다")
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        in 90..99 -> "A"
        8 -> "B"
        else -> "F"
    }
}

fun startsWith(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}