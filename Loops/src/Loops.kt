



fun main(args: Array<String>) {

    //for
    var sum = 0
    for(i in 1..100) {
        sum++

    }
    println(sum)



    //for each
    val list = listOf("Java", "Kotlin", "Pyhton")
    for (element in list){
        println(element)
    }

    for((index,value) in list.withIndex()){
        println("element at $index is $value")
    }





    //while
    var x = 9
    while (x > 0){
        println(x)
        x--
    }

    var i = 1
    while (i <= 10){
        println(i)
        i++
    }


    // Break
    for (c in "Python"){
        if(c == 'o'){
            break
        }
        println(c)
    }

    //Continue
    val list2 = listOf("Book", "Table", "Laptop")
        for(str in list2){
            if(!str.contains('o')){
                continue
            }
            //Calculations...
            println(str)
        }




    //Naming loops

    outer@ for(y in 1..10){
        for(j in 1..10){
            if(y - j == 5){
                break@outer
            }
            println("$y - $j")
        }
    }



}