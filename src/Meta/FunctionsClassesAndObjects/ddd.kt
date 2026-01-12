package Meta.FunctionsClassesAndObjects


fun printSurrounded(value: String = "", prefix: String = "<", postfix: String = ">") {

    println("$prefix$value$postfix")
}

fun main() {
    printSurrounded(postfix = ".")
}