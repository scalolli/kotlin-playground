package practice.regex

fun main() {
    val filePath = "/Users/basu/repos/contenthub/Readme.md"

    val directory = filePath.substringBeforeLast("/")
    val fileName = filePath.substringAfterLast("/")
    val extension = filePath.substringAfterLast(".")

    println("Directory Name is: $directory")
    println("File Name is: $fileName")
    println("Extension is: $extension")

    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(filePath)
    if (matchResult != null) {
        val (dir, fileName, extension) = matchResult.destructured
        println("Dir: $dir, file-name: $fileName and extension is: $extension")
    }
}