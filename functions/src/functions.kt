import java.util.*

//No parameters, no return value
fun helloWorld() {
    println("Hello world")

}


//Kotlin -> K o t l i n
fun printWithSpaces(text: String){
    for (char in text){
        print("$char ")
    }
    println()
}

//No parameters, returns Date
fun getCurrentDate(): Date {
    return Date()
}

//2 parameters, returns Int
fun max(a: Int, b: Int): Int{
    return if(a>=b){
        a
    }else{
        b
    }
}

fun main(args: Array<String>) {
    helloWorld()
    printWithSpaces("Kotlin is awesome")
    println(getCurrentDate())
    println(max(17,42))
}