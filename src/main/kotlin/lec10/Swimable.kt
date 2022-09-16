package lec10

interface Swimable {
    val swimAbility: Int

    fun act() {
        println("swim act")
    }
}