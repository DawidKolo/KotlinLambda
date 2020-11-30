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
                    println("x belongs to the set of {1,2,3,4,5,6} ")

                }
                in 8..20 -> {
                    println("x is in the range of 8..20")

                }
                else -> {
                    println("is greater than 21")

                }
            }


            println("result ${result}")
        }catch (e: Exception){
            println("It is not a whole number")
            main()
        }
    }