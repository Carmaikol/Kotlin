


class Person{
    var name: String = "Sarah"
    var age: Int = 42


    fun speak() {
        println("Hello")
    }


    fun greet(name: String) {
        println("Hello $name!")
    }

  //  fun getYearOfBirth(): Int {

    //    return 2018 - age
    //}

    fun getYearOfBirth() = 2016 - age

}


fun main(args: Array<String>) {
    val person = Person()
    println(person.name)
    println(person.age)


    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())

    person.name = "Peter"
    println(person.name)

}