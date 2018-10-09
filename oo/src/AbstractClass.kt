


abstract class PersonA(open val name: String, open var age: Int){

    init{
        println("Object was created")
    }

    abstract fun speak()


    open fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2018 - age

}



class StudentA(override val name: String,override var age: Int, val studentId: Long): PersonA(name,age){
    override fun speak() {
        println("Hi there, Im a student")
    }

    override fun greet(name: String) {
        println("Howdy $name")
    }

    fun isIntelligent() = true

}


class EmployeeA(override val name: String,override var age: Int): PersonA(name,age){

    fun receivePayment(){
        println("payment received")
    }

    override fun speak() {
        println("Hi  Im an employee")
    }

}









fun main(args: Array<String>) {
    val person = Person("Jack",17)
    println(person.name)
    println(person.age)


    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())

    println(person.name)
    println(person.age)

    //

    val student = Student("John",25,9999999)
    student.speak()


    val employee = Employee("Mary",32)
    student.getYearOfBirth()

    employee.receivePayment()

}