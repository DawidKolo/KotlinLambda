import java.util.*
import kotlin.system.exitProcess

fun pointB() {
    val reader = Scanner(System.`in`)
    print("Enter a whole number: ")

    try {


        when (reader.nextInt()) {
            0 -> {
                println("x is equal to zero")

            }
            1, 2, 3, 4, 5, 6 -> {
                println("x belongs to the set of integers {1 to 6} ")

            }
            in 8..20 -> {
                println("x is within the range of 8..20")

            }
            else -> {
                println("is greater than 21")

            }


        }

    } catch (e: Exception) {
        println("It is not a whole number")
        pointB()
    }
    exitProcess(0)
}