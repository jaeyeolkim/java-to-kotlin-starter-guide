package lec07

import java.io.BufferedReader
import java.io.FileReader

fun parseIntOrNull(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun readFile() {
    BufferedReader(FileReader(".")).use { reader ->
        println(reader.readLine())
    }
}