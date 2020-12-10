package introduction.inputoutput
import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    val integer: Int = reader.nextInt()

    print("You entered: $integer")
}