package flowcontrol

fun main() {
    val a = 10
    when (a) {
        // (1, 10]
        in 1..10 -> println("A positive number less than 11.")
        // (10, 100]
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
    }
}