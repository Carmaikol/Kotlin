open class Animal {

    private var age: Int = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }


    protected var name = "Sam"
    internal val isDangerous = true

    fun isOld(): Boolean {
        return age > 12
    }


}


class Vertebrate : Animal() {

    fun introduceYourself() {
        println(this.name)
    }

}


fun main(args: Array<String>) {
    var animal = Animal()

    println(animal.isOld())


}