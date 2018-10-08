


fun main(args: Array<String>) {

    //Arrays
    val array = arrayOf("Texas","Iowa","California")
    val mixed = arrayOf("Kotlin",17,3.0,false)
    val numbers = arrayOf(1,2,3,4,5)


    println(mixed[0])   // Kotlin
    mixed[2] = 3.1415
    println(mixed[2])   // 3.1415
    val str = "Udemy"
    println(str[0])     // U

    val states = arrayOf("Nevada","Florida")
    val allStates = array + states

    println(allStates.size)  //5

    val empty : Boolean = numbers.isEmpty()

    if(states.contains("Kentucky")){
        println("It contains Kentucky")
    }else{
        println("It does not")
    }



    //Lists
    //val list = listOf("Orange", "Apple", "Bananas")



    val arrayList = arrayListOf("Patrick","Michael","Sarah")
    val list = arrayListOf("Peter")
    println(arrayList[0]) // Patrick
    println(arrayList + list) // [Patrick, Michael, Sarah, Peter]
    println(arrayList.size) // 3
    println(arrayList.isEmpty()) // false
    println(arrayList.contains("Sarah")) // true

    arrayList.add("Josh")
    val changed = arrayList.add(1,"Jack")
    println(arrayList)   //[Patrick, Jack, Michael, Sarah, Josh]

    val removed = arrayList.remove("Michael")
    println(arrayList)  //[Patrick, Jack, Sarah, Josh]
    println(removed)    //true

    val sublist = arrayList.subList(1,3)
    println(sublist)    //[Jack, Sarah]




}
