package Meta.AdvancedClasses.Pair

class Example {
}

fun main() {
    val pair = Pair(1.0, 'A')
    println(pair.first) // 1.0
    println(pair.second) // A
    val (number, letter) = pair
    println(number) // 1.0
    println(letter) // A
}