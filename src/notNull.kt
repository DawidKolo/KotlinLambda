import java.util.*
import kotlin.system.exitProcess

fun notNull() {
    try {
        println("Enter 1 to start notNull part of the program")
        val t = Scanner(System.`in`)
        val h = t.nextInt()

        if (h == 1) {

            val table: Array<Int?> = arrayOf(1, 2, null, 3, 4, 5, null, null)
            val tableA = table.filterNotNull()

            println("This is a original table: " + table.asList())
            println("This is a filtered one: " + tableA)


        } else {
            exitProcess(0)
        }
    } catch (e: Exception) {
        println("Just numbers please")
        notNull()
    }
    main()

}