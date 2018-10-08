
import java.util.*

/**
 * @author Miguel Aguilera
 *
 * Solutions for the coding challenges  inside the Udemy course.
 */
fun main(args: Array<String>) {

    //conditionals()
    //loops()
    recapBasics()

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

    var result: Long = 0            // Bad result with Int
    for(i in 100..100000){
        result += i
    }
    println("Result: $result")      // 5000045050

}

/**
 * Recap the basics.
 * Create an array list of your favorite book titles. Loop over this list and, if
 * the title contains the letter ‘e’, print each character of the name on a new
 * line.
 */
fun recapBasics(){
    val bookList = arrayListOf("Song of Ice and Fire","The Dark Tower","1984","Rayuela","Los Detectives Salvajes","The Art of War","Tao Te Ching", "I Ching")

    for(book in bookList){
        if(book.contains('e')){
            for(char in book){
                println(char)
            }
            println("-")                //Better readability
        }
    }

}