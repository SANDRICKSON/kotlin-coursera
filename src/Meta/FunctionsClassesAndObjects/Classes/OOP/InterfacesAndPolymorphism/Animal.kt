package Meta.FunctionsClassesAndObjects.Classes.OOP.InterfacesAndPolymorphism

interface Animal {
    val breed: String
    fun pet()
}


class Cat(
    val name: String,
    override val breed: String,
) : Animal {
    override fun pet() {
        println("meow")
    }

}


fun main(){
    val miau = Cat("Jia","Veto")
    println(miau.pet())
}
