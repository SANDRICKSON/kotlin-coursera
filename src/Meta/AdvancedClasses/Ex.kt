package Meta.AdvancedClasses

var name: String? = null //? ნიშნავს რომ null იყოს
var i:Int? = null
var c:Char? = null



class User(val name: String)
var user: User? = null;

fun proccessUser(user: User?) : User?{
    return null;
}

fun main(){
    val result: User? = proccessUser(user);
    println(result);
}