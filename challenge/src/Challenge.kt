
import java.util.*

/**
 * @author Miguel Aguilera
 *
 * Solution for the coding challenge on conditionals inside the Udemy course.
 * Generate a random number between 0 and 49 and checks in which range it is.
 */
fun main(args: Array<String>) {
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