import java.util.Scanner
import kotlin.math.pow
import kotlin.system.exitProcess

fun main() {

    println("Where would you like to start? ")
    println("Type 1 to start from begin. \n2 to jump to the second starting point\n3 to jump to the third starting point.\nAnd finally, 4 if you wish to play with the last function ")

    try {
        val menu = Scanner(System.`in`)
        when (menu.nextInt()) {
            1 -> pointA()
            2 -> pointB()
            3 -> pointC()
            4 -> pointD()
            else -> exitProcess(0)
        }
    } catch (e: Exception) {
        println("Please try again")
        main()
    }
    numberToString()
    notNull()
}

// Function defined below


fun pointA() {
    println("Simple sum")
    println("Please enter an integer")


    try {
        val addReader = Scanner(System.`in`)
        val i = addReader.nextInt()

        println("Please enter another integer")

        val j = addReader.nextInt()


        val add = { i: Int, j: Int -> i + j }
        val sub = { i: Int, j: Int -> i - j }
        val div = { i: Int, j: Int -> i / j.toDouble() }

        println("The sum of your numbers is: " + math(i, j, add))
        println("The result of subtraction is: " + math(i, j, sub))
        println("The result of division is: " + mathDouble(i, j, div))
    } catch (e: Exception) {
        println("Something has gone wrong. Please make sure you entered an integer")
        pointA()
    }
}

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
}

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
}

fun pointD() {
    println("And now, we will try something more advanced")
    println("")
    println("i is equal to square root of -1")
    println("So if i stand for imaginary number,")
    println("is the i to the power of i real or imaginary?")
    println("")

    fun complexEquation() {
        val equa: (Double) -> Double = { x: Double -> x * (Math.E.pow((-1 * (Math.PI / 2)))) }

        println("i to the power of i is equal to " + (Math.E.pow((-1 * (Math.PI / 2)))) + " and is real")


        val x = Math.random() * 10

        val res = equa(x)
        println("The random value of x is: $x")
        println("The value of $x * i ^ i is $res")

    }
    complexEquation()
}


fun math(i: Int, j: Int, f: (Int, Int) -> Int): Int {
    return f(i, j)
}

fun mathDouble(i: Int, j: Int, f: (Int, Int) -> Double): Double {
    return f(i, j)
}

fun numberToString() {
    try {
        println("Please enter an your name")
        val name = Scanner(System.`in`)
        val a = name.next()

        println("Please enter an integer")
        val b = name.nextInt()

        println("Please enter another number")
        val c = name.nextDouble()

        val f: (String, Int, Double) -> String = { a: String, b: Int, c: Double ->
            println("Hello " + a + "! \n1There is " + b * c + " PLN on your account")
            "$a $b $c"
        }

        println(f(a, b, c))
    } catch (e: Exception) {
        numberToString()
    }

}



fun notNull(){
    try {
        println("Enter 1 to start notNull part of the program")
        val t = Scanner(System.`in`)
        val h = t.nextInt()

        if (h == 1) {

            val table: Array<Int?> = arrayOf(1, 2, null, 3, 4, 5, null, null)
            val tableA = table.filterNotNull()

            println("This is a original table: "+table.asList())
            println("This is a filtered one: "+tableA)


        } else {
            exitProcess(0)
        }
    } catch (e: Exception) {
        println("Just numbers please")
        notNull()
    }

}






