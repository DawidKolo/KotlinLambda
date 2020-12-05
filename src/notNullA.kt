import java.util.*
import kotlin.system.exitProcess

fun notNullA() {

    println("Please enter any word")
    var wordParser = Scanner(System.`in`)
    var word = wordParser.next()
    
    if (word.length < 2) {
        word = null

        println("The length of the entered word is:  ${word?.length}")
        println("The length of the word is : ${word?.length ?: -1}")
    }
    try {
        println("The length of the entered word is: ${word!!.length}")
    } catch (e: NullPointerException) {
        println("Exception caught: This word has no length")
        notNullA()
    }
    exitProcess(0)
}