import java.util.*

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
            println("Hello " + a + "! \nThere is " + b * c + " PLN on your account")
            "$a $b $c"
        }

        println(f(a, b, c))
    } catch (e: Exception) {
        numberToString()
    }
main()
}