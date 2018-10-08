
import java.util.*

/**
 * @author Miguel Aguilera
 *
 * Solutions for the coding challenges  inside the Udemy course.
 */
fun main(args: Array<String>) {

    //conditionals()
    loops()

}


/**
 *  Conditionals
 * Generate a random number between 0 and 49 and checks in which range it is.
 */
fun conditionals(){
    val random = Random().nextInt(50) +1

    val result = when(random) {
        in 1..10 -> "Range is 1 to 10. Number is $random"
        in 11..20 -> "Range is 11 to 20. Number is $random"
        in 21..30 -> "Range is 21 to 30. Number is $random"
        in 31..40 -> "Range is 31 to 40. Number is $random"
        else -> "Range is above 40. Number is $random"
    }

    println(result)
}


/**
 *  Loops
 *  write a program that calculates the sum of all
 *  numbers from 100 to 100,000 and prints out the result.
 */
fun loops(){

    var result: Int = 0
    for(i in 100..100000){
        result += i
    }
    println("Result: $result")

}