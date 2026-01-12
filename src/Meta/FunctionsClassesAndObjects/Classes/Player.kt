package Meta.FunctionsClassesAndObjects.Classes

class Player(val name: String, var surname: String, var totalScore: Int = 0) {
    // Personal best property
    var personalBestScore: Int = 0

    // Method to get full name
    fun fullName(): String {
        return "$name $surname"
    }
}


class Scores {
    fun checkBest(currentBest: Int, newScore: Int): Int {
        return if (newScore > currentBest) newScore else currentBest
    }
}



fun main()
{
    // initalise Player objects
    val P1 = Player("Nicola", "Tesla")
    val P2 = Player("Thomas", " Edison " )
// create working variables
    val scoring = Scores()  // instance of the Scores class to allow access to checkBest function
    var lvlScore= 0 // variable to simulate Player level score

// Level 1
    lvlScore = 12 // insert simulated values for level score
    P1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore
// suppy the parameters for the checkBest function by accessing the Player properties
    P1.personalBestScore = scoring.checkBest(P1.personalBestScore,lvlScore);

    lvlScore = 34
    P2.totalScore += lvlScore;
    P2.personalBestScore = scoring. checkBest(P2.personalBestScore,lvlScore);

// Level 2
    lvlScore = 56 // insert simulated values for level score
    P1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore
// suppy the parameters for the checkBest function by accessing the Player properties
    P1.personalBestScore = scoring.checkBest(P1.personalBestScore,lvlScore);

    lvlScore = 78 // insert simulated values for level score
    P2.totalScore += lvlScore;
    P2.personalBestScore = scoring. checkBest(P2.personalBestScore,lvlScore);

// Level 3
    lvlScore = 99 // insert simulated values for level score
    P1.totalScore += lvlScore; // use the combined operator (+=) to add the lvlScore to totalScore
// suppy the parameters for the checkBest function by accessing the Player properties
    P1.personalBestScore = scoring.checkBest(P1.personalBestScore,lvlScore);

    lvlScore = 10
    P2.totalScore += lvlScore;
    P2.personalBestScore = scoring.checkBest(P2.personalBestScore,lvlScore);

// conditional check using an if statement to determine the winner
    if(P1.totalScore > P2.totalScore)
    {
// access the Player properties to construct the String to print
        println("The winner is "+ P1.fullName() +  " with a Score of  "+P1.totalScore);
        println("Personal Best Score is = " +P1.personalBestScore);
    }
    else
    {
        println("The winner is "+ P2.fullName() + " with a Score of "+P2.totalScore);
        println("Personal Best Score is = " +P2.personalBestScore);
    }
}
