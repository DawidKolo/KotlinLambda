import kotlin.system.exitProcess

fun notNullB(){
    var name:String? = "Dawid"

    name?.let{
        println("The value of the string is equal to: ${it}")
    }.also{
        println("This is the first part of the block 'also'")
    }

    if(true)
        name = null
    else
        name = "David"

    name?.let{
        println("The value of the string is equal to: ${it}")
    }.also {
        println("This is the second part od the block 'also'")
    }
    exitProcess(0)
}