package conditionals

fun main(args: Array<String>) {
//age()
    mode()
}


fun age(){
    val adult_age : Int = 21
    val kid_age : Int = 15

    var age = kid_age
    //var age = adult_age


    if(age  < 18){
        println("You shall not pass")
    }else{
        print("Nice")
    }
}


fun mode(){

    val mode: Int = 1

    val result = when(mode){
        1 -> "Lazy"
        2 -> "Second"
        3 -> "Yay"
        else -> "Unknown"
    }

    println(result)


    val x = if(mode < 2){
        println("Mode is less than 2")
        12
    }else{
        42
    }
    println(x)
}