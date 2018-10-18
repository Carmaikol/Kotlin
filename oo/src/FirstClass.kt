open class Person(open val name: String, open var age: Int) {

    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello")
    }


    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2018 - age


}


class Student(override val name: String, override var age: Int, val studentId: Long) : Person(name, age) {

    fun isIntelligent() = true

}


class Employee(override val name: String, override var age: Int) : Person(name, age) {

    fun receivePayment() {
        println("payment received")
    }

}


fun main(args: Array<String>) {
    val person = Person("Jack", 17)
    println(person.name)
    println(person.age)


    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())

    println(person.name)
    println(person.age)

    //

    val student = Student("John", 25, 9999999)
    student.speak()


    val employee = Employee("Mary", 32)
    student.getYearOfBirth()

    employee.receivePayment()

}