package Meta.FunctionsClassesAndObjects.Classes

class SomeClass {
    private val privateProperty = "ABC"
    protected fun protectedFunction() {}
    fun publicFunction() {}
    internal val internalProperty = "ABC"
}

fun test() {
    val o = SomeClass()
    // here
}


abstract class A {
    abstract fun a()
}
class B: A() {
    override fun a() {println("Hello")}
}
fun main() {
    val b = B()
    b.a()
}