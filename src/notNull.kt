import java.util.*
import kotlin.system.exitProcess

fun notNull() {
    try {
        println("Enter 1 to start notNull part of the program")
        val t = Scanner(System.`in`)
        val h = t.nextInt()

        if (h == 1) {
            val z = (75025/46368.0)
            val table: Array<Double?> = arrayOf(1.0, null, z , 2.0, null, Math.PI,  5.0, null, Math.E)
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
    exitProcess(0)

}