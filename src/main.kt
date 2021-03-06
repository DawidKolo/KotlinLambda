import java.util.Scanner
import kotlin.system.exitProcess

fun main() {

    println("Where would you like to start? ")
    println(
        "Type 1 to start from begin. (P_A)" +
                "\n2 to jump to the second starting point (P_B)" +
                "\n3 to jump to the third starting point. (P_C)" +
                "\n4 if you wish to play with the last function (P_D)" +
                "\n5 if you would like to check the numberToString function" +
                "\n6 to get to notNull (NotN)" +
                "\n7 to go for notNull 2 (NotN_A)" +
                "\n8 to find out the notNull 3 (NotN_B)"
    )

    try {
        val menu = Scanner(System.`in`)
        when (menu.nextInt()) {
            1 -> pointA()
            2 -> pointB()
            3 -> pointC()
            4 -> pointD()
            5 -> numberToString()
            6 -> notNull()
            7 -> notNullA()
            8 -> notNullB()
            else -> exitProcess(0)
        }
    } catch (e: Exception) {
        println("Please try again")
        main()
    }
}