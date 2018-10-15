

abstract class Course(private val topic: String, val price: Double) {
    open fun learn(){
        println("Learning a $topic course.")
    }


}

interface  Learnable {
    fun learn(){
        println("Learning...")
    }

}



open class KotlinCourse : Course("Kotlin", 999.9), Learnable {
    final override fun learn(){
        super<Learnable>.learn()
        println("Im one of the first people to learn Kotlin")
    }

}


fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.learn()
}