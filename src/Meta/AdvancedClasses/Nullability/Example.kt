package Meta.AdvancedClasses.Nullability

class User(var name: String){
    fun cheer(){
        println("Cheer $name")
    }



}


fun printName(user: User?){
    println("${user?.name}")
    user?.cheer();

}