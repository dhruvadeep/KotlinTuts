package introduction.expstatblock

fun main() {
    val a = 12
    val b = 13
    val max: Int

    max = if (a > b) a else b
    println("$max")
}