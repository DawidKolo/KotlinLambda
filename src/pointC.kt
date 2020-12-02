import java.util.*
import kotlin.system.exitProcess

fun pointC() {
    val readerA = Scanner(System.`in`)
    println("Enter a whole number: ")
    try {
        val q = when (readerA.nextInt()) {
            0 -> 5
            in 123..500 -> 6
            1, 2, 3, 4 -> 666
            else -> 777
        }
        println("Number q is $q")

    } catch (e: Exception) {
        println("You haven't entered an integer")
        pointC()
    }
    exitProcess(0)
}