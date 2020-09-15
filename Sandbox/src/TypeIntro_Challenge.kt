// Challenge: hasSteed
// Here is your first challenge: In the text adventure game, players may acquire a dragon or minotaur they can ride.
// Define a variable called hasSteed to track whether the player has acquired one.
// Give the variable an initial state indicating that the player does not have one yet.

// Challenge: The Unicorn's Horn
// Imagine this scene from the adventure game:
//    The hero Estragon arrives at a pub know as the Unicorn's Horn. The publican asks, "Do you nee to stable a steed?"
//    "No," Estragon replies, "I have no steed. But I do have 50 gold pieces, and I would like a drink."
//    "Excellent!" says the publican. "I have mead, wine, and LaCroix. What will you have?"
//
// For this Challenge,add below your hasSteed variable. The variables required for the scene at the
// Unicorn's Horn, using type inference and assigned values where possible. Add variables to hold values
// for the name of the pub, the name of the current publican on duty, and how much gold the player has
// acquired so far.
// Notice that the Unicorn's Horn has a menu of drinks the hero can select from. What type might you use
// to represent the menu? If you need to, consult Table 2.1

fun main(args: Array<String>) {
    val playerName = "Estragon"
    val hasSteed = false
    val pubName = "Unicorn\'s Horn"
    val publicanName = "Larry"
    val goldPieces = 50
    val menu = setOf("mead", "wine", "LaCroix")

    println("The Adventures of $playerName")
    println ("Our hero $playerName arrives at a pub know as $pubName.")
    println("$publicanName the publican asks, \"Do you need to stable a steed?\"")
    if (hasSteed) {
        println("\"Yes,\" $playerName replies, \"I do have a steed. And")
    }
    else {
        println("\"No,\" $playerName replies, \"I have no steed. But")
    }
    println("I do have $goldPieces gold pieces, and I would like a drink.\"")
    println("\"Excellent!\", says $publicanName the publican. \"I have ${menu.elementAt(0)}, ${menu.elementAt(1)} and ${menu.elementAt(2)}. What will you have?\"")

    // Challenge: Magic Mirror
    // Refreshed, Estragon is ready for a challenging quest. Are you?
    // The hero discovers a magic mirror that shows a player the reflection of their playerName. Using the
    // String type's magic, transform the playerName string "Estragon" into "nogartsE", a reflection of its
    // value.

    // To solve this challenge, consult the documentation for String at kotlinlang.org/api/latest/jvm/
    // stdlib/kotlin/-string/index.html. You will find that, fortunately, the actions that a particular type
    // can perform are usually very intuitively name (hint).
    println("Magic mirror reflects : ${playerName.reversed()}")
}