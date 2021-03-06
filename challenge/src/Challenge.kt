import java.util.*

/**
 * @author Miguel Aguilera
 *
 * Solutions for the coding challenges  inside the Udemy course.
 */
fun main(args: Array<String>) {

    //conditionals()
    //loops()
    //recapBasics()
    books()

}


/**
 *  Conditionals
 * Generate a random number between 0 and 49 and checks in which range it is.
 */
fun conditionals() {
    val random = Random().nextInt(50) + 1

    val result = when (random) {
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
fun loops() {

    var result: Long = 0            // Bad result with Int
    for (i in 100..100000) {
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
fun recapBasics() {
    val bookList = arrayListOf("Song of Ice and Fire", "The Dark Tower", "1984", "Rayuela", "Los Detectives Salvajes", "The Art of War", "Tao Te Ching", "I Ching")

    for (book in bookList) {
        if (book.contains('e')) {
            for (char in book) {
                println(char)
            }
            println("-")                //Better readability
        }
    }

}


/**
 * Classes.
 * Create a class representing a book. Every book has a title, an author, a
 * publication year and is either borrowed or not. Choose an appropriate
 * data type for each of these properties.
 *  A book can be borrowed from you or returned to you. In both cases, the
 *  borrowed property is updated accordingly. Also, a book should be able
 *  to print itself to the command line, including its title, author, and
 *  publication year.
 */

fun books() {
    val book = Book("The Dark Tower", "Stephen King", 1982, false,"Fantasy")
    val book2 = Book("Rayuela", "Julio Cortazar", 1963, true,"Novel")
    val book3 = Book("1984", "George Orwell", 1948, false,"Mistery")


    book.print()
    book.borrow()

    book.print()
    book2.borrow()
    book2.returnBook()

    book3.print()
    book3.returnBook()

}

class Book(override val title: String, private val author: String, override val publicationYear: Int, override var isBorrowed: Boolean, override val genre: String) : InventoryItem(title, genre, publicationYear,isBorrowed) {

    fun print() {
        println("BOOK = [Title: $title , Author: $author , Publication Year: $publicationYear]")
    }

    override fun borrow() {
        return if (isBorrowed) {
            println("Oops, this book is already borrowed")

        } else {
            isBorrowed = true

        }

    }


    fun returnBook(): Boolean {
        return if (!isBorrowed) {
            println("Oops, this book was not borrowed")
            false
        } else {
            isBorrowed = false
            true
        }

    }


}


/**
 * Object Orientation.
 * Let’s say we’re running a library where you can lend books and also some
 * movies. We want to write an application to keep track of our inventory.
 * Create an interface Lendable that defines a borrow() method. Then create an
 * abstract class InventoryItem and two classes Book and DVD which inherit from
 * InventoryItem. InventoryItem should implement the Lendable interface.
 * Books and DVDs both have a title, genre and publication year. Books also have
 * an author whereas DVDs have a length in seconds. Add each property to the
 * most suitable class.
 */
interface Lendable {
    open fun borrow()
}

abstract class InventoryItem(open val title: String, open val genre: String, open val publicationYear: Int, open var isBorrowed: Boolean) : Lendable


class DVD(override val title: String, override val genre: String, override val publicationYear: Int, override var isBorrowed: Boolean, private val length: Int) : InventoryItem(title, genre, publicationYear, isBorrowed) {
    override fun borrow() {
        return if (isBorrowed) {
            println("Oops, this book is already borrowed")

        } else {
            isBorrowed = true

        }

    }


    fun returnBook() {
        return if (!isBorrowed) {
            println("Oops, this book was not borrowed")

        } else {
            isBorrowed = false

        }

    }

}