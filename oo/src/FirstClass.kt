


class Person(val name: String, var age: Int){

    init{
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


fun main(args: Array<String>) {
    val person = Person("Jack",17)
    println(person.name)
    println(person.age)


    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())

    println(person.name)
    println(person.age)




}