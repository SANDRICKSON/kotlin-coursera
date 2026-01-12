package Meta

fun main() {
    var a = "A"
    var b = 3.14
    println(b::class)
    println(1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    println(141::class)
    println(50 + 2 * 3)
    println(150 + 2 + 100 * 2)
    println(150 + (2 + 100) * 2)

    val x = 5
    val y = 3
    val z = 8
    println(x + y * z)

    val num = 10
    println("Result is $num")

    println("Result is ${num + 20}")


    println("---------------------------------------------")


    val finishedHomework = true
    val cleanedRoom = true
    val passedMathExam = false
    val canPlayGames = finishedHomework && cleanedRoom
    val canEatSweets = finishedHomework && passedMathExam
    print(canPlayGames)
    print(canEatSweets)


    println("-------------------------------")

    val hour = 11
    val userName = "admin"
    if (hour <= 10) {
        print("Good morning, ")
    } else if (hour >= 20) {
        print("Good evening, ")
    } else {
        print("Hello, ")
    }

    if (userName == "admin") {
        println("what would you like to do?")
    } else {
        println("how can I help you, $userName?")
    }


    val password = "ABC"
    val error = if (password.length < 7) "Password is too short." else "Password is ok."
    print(error)


    val time = 20
    val greeting =
        if (time < 18) {
            "Good day."
        } else {
            "Good evening."
        }
    println(greeting)

}