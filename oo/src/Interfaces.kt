
interface Driveable {

    fun drive()

}


interface Buildeable{
    val timeRequired: Int
    fun build()

}


class Car(val color: String) : Driveable, Buildeable {
    override val timeRequired: Int = 120


    override fun build() {
        println("Built a shiny $color car")
    }

    override fun drive() {
        println("Driving $color car...")
    }

}


class Motorcycle(val color:String): Driveable {
    override fun drive() {
        println("Driving $color motorcycle.")
    }

}


fun main(args: Array<String>) {
    val car : Driveable = Car("blue")
    car.drive()

    val motorcycle: Driveable = Motorcycle("red")
    motorcycle.drive()


}