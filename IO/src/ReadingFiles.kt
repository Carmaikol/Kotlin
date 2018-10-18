import java.io.File

fun main(args: Array<String>) {
    val filePath = "inputfile.txt"
    var lineNumber = 0
    File(filePath).forEachLine {
        ++lineNumber
        println("#$lineNumber: $it")

    }
}