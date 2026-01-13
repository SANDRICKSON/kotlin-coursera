package Meta.AdvancedClasses


class Person (val name:String? , val surname:String?)

fun printName(person: Person) {
    val name: String = person.name ?: "(unknown name)"
    val surname: String = person.surname ?: "(unknown surname)"
    println("$name $surname")
}

fun main() {
    printName(Person("John", "Locke"))
}