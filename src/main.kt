import java.util.Scanner

fun main() {

    println("Simple addidng")
    println("Please enter an integer")
    val addReader = Scanner(System.`in`)
    var i = addReader.nextInt()

    println("Please enter another integer")
    var j = addReader.nextInt()


    val add = { i: Int, j: Int -> i + j }
    val sub = { i: Int, j: Int -> i - j }
    val div = { i: Int, j: Int -> i / j.toDouble() }

    println("The sum of your numbers is: " + math(i, j, add))
    println("The result of subtraction is: " + math(i, j, sub))
    println("The result of division is: " + mathDouble(i, j, div))


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
            1,2,3,4->666
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

        println("i to the power of i is equal to " + (Math.pow(Math.E, (-1 * (Math.PI / 2)))) + " and is real")


        var x = Math.random() * 10

        val res = equa(x)
        println("The random value of x is: " + x)
        println("The value of $x * i ^ i is ${res}")

    }

    complexEquasion()






    numberToString()



}

fun math(i: Int, j: Int, f: (Int, Int) -> Int): Int {
    return f(i, j)
}

fun mathDouble(i: Int, j: Int, f: (Int, Int) -> Double): Double {
    return f(i, j)
}

fun numberToString(){
    println("Please enter an your name")
    val name = Scanner(System.`in`)
    var a = name.next()

    println("Please enter an integer")
    var b = name.nextInt()

    println("Please enter another number")
    var c = name.nextInt().toDouble()

    val f:(String,Int,Double)->String = {
            a:String,b:Int,c:Double->
        println("Hello "+a+" There is "+b*c+" PLN on your account")
        "$a $b $c"
    }

    println(f(a,b,c))
}

