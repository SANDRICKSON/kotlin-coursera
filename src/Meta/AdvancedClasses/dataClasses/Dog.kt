package Meta.AdvancedClasses.dataClasses

data class Dog(var name: String, var age: Int)

class Cat(var name: String, var age: Int)

fun main(){
    val dog = Dog("Frost", 23)

    val cat = Cat("Frost", 23)
    println(cat) //ეს მისამართს წერს
    println(dog) //ეს მონაცემებს წერს დატა კლასი
    println(dog.age)
}