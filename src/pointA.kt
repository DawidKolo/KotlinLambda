import java.util.*

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
    main()
}