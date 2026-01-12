package Meta.FunctionsClassesAndObjects.Classes

class Employee (
    var name: String,
    var position: String,
    var age: Int,
)


fun main(){
    val employee1 = Employee(name = "John", position = "M", age = 18)
    println(employee1.name)
}