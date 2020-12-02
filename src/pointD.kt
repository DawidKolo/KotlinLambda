import kotlin.math.pow
import kotlin.system.exitProcess

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
    exitProcess(0)
}