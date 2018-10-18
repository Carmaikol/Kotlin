import java.io.File
import kotlin.math.max

fun main(args: Array<String>) {

    val filePath = "ips.txt"


    val ipToCount = mutableMapOf<String,Int>()

    File(filePath).forEachLine {
        val previous = ipToCount.getOrDefault(it,0)
        ipToCount.put(it,previous+1)
    }

    var maxIp= ipToCount.keys.first()
    var maxCount = 0
    for((ip,count) in ipToCount.entries){
        if(count > maxCount){
            maxCount = count
            maxIp = ip
        }
    }


    println("Most frequent IP Adress is: $maxIp, which appeared $maxCount times")

}