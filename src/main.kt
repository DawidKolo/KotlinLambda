import java.util.Scanner

fun main() {


    val reader = Scanner(System.`in`)
    print("Enter a whole number: ")

    try {
        var x = reader.nextInt()


        val result = when (x) {
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


        println("result ${result}")
    } catch (e: Exception) {
        println("It is not a whole number")
        main()
    }

    val readerA = Scanner(System.`in`)
    println("Enter a whole number: ")
    try {
        val y = readerA.nextInt()
        var q = when (y) {
            0 -> 5
            in 123..500 -> 6
            else -> 777
        }
        println("Number q is ${q}")

    } catch (e: Exception) {
        println("You haven't entered an integer")
        main()
    }


    println("And now, we will try something more advanced")
    println("")
    println("i is equal to square root of -1")
    println("So if i stand for imaginary number,")
    println("is the i to the power of i real or imaginary?")
    println("")

    fun complexEquasion() {
        val equa: (Double) -> Double = { x: Double -> x * (Math.pow(Math.E, (-1 * (Math.PI / 2)))) }

        println("i to the power of i is equal to " + (Math.pow(Math.E, (-1 * (Math.PI / 2))))+" and is real")


        var x = Math.random() * 10

        val res = equa(x)
        println("The value of $x * i ^ i is ${res}")

    }

    complexEquasion()

}