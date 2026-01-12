package Meta.AdvancedClasses

sealed class Shape

class Circle(val radius: Double) : Shape()
class Rectangle(val width: Double, val height: Double) : Shape()
