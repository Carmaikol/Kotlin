



enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }

}


fun main(args: Array<String>) {
    //hexadecimal
    println(0x10) //16
    println(0x1F) //31



    //bit
    print(0b1010) // 10
    print(0b11111111) // 255 = 0xFF

    //            1101
    //     and    0011
    //            0001
    println(0b1101 and 0b0011)



    //  0x01CAFE and 0XFF0000 = 0x010000
    println(Color.RED.containsRed())  //true
    println(Color.BLUE.containsRed()) //false
    println(Color.GREEN.containsRed()) //false
    println(Color.YELLOW.containsRed())//true


    //bitwise operators
    //       1101
    //or     1101
    //       1101

    println(0b1101 or 0b1000)  //13

    //         1101
    //xor      1101
    //         0101

    println(0b1101 xor 0b1000)  //5


    //inverse
    //10011 inverse == 01100
    //                      mask to filter not needed data
    println(0b10011.inv() and 0x0000001F)  // 0b01100


}


class BadColor {

    public val RED = 1
    public val BLUE = 2
    public val GREEN = 3
    public val YELLOW = 4

}