import java.io.File
import kotlin.math.max

fun main(args: Array<String>) {

    val filePath = "ips.txt"

    val ipToCount = mutableMapOf<String,Int>()

    File(filePath).forEachLine {
        val previous = ipToCount.getOrDefault(it,0)
        ipToCount.put(it,previous+1)
    }

    val (maxIp, maxCount) = ipToCount.entries.maxBy { it.value }!!


    println("Most frequent IP Adress is: $maxIp, which appeared $maxCount times")

}