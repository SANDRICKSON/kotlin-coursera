package Meta.AdvancedClasses.Collections

val shoppingList = listOf(
    "Tomatoes","Spaghetti","Chicker"
)

val todoList = mutableListOf("Tomatoes","Spaghetti","Chicken")


val shoppingSet = mutableSetOf("Tomatoes","Spaghetti","Chicken","Tomatoes") //უნიკალური სია

fun main(){
    for(element in shoppingList){
        println(element)
    }

    println(shoppingList.size)


    todoList.add("Chabana")

    println(shoppingSet)

    val l = listOf("A", "B")
    val l2 = listOf("D")
    print(l + "C" + l2)
    print(l)

    val s = setOf("A", "B", "A")
    println(s)

    val n = mapOf('a' to "Alex", 'a' to "Anna")
    print(n)

    val m = mapOf('a' to "Alex", 'b' to "Barbara")
    print(m['b'])

    val k = mapOf('a' to "Alex", 'b' to "Barbara")
    print(k['c'])

    println("--------------------")

    print(listOf("A", "B", "C").size)
    print(setOf(0).size)
    print(mapOf('a' to "Alex", 'b' to "Barbara").size)
}