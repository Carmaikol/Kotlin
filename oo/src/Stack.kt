
// Keep your code DRY    DONT REPEAT YOURSELF


class Stack<T>(vararg val items : T) {

    val elements = items.toMutableList()


    fun push(element : T) {
       elements.add(element)

    }


    fun pop(): T? {
        if(!isEmpty()) {
            return elements.removeAt(elements.size - 1)
        }
        return null
    }

    private fun isEmpty() : Boolean {
        return elements.isEmpty()
    }
}

fun <T> stackOf(vararg elements: T) : Stack<T>{
    return Stack(*elements)
}


fun main(args: Array<String>) {
    val stack = Stack(3,5,2,8)

    val stack2 = stackOf("Hi","Hey","hello")

    for (i in 1..3) {
        println(stack2.pop())
    }

    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

}