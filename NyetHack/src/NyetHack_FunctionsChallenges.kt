fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 89
    var isBlessed = true
    val isImmortal = false

    // Aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    // Player status
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    castFireball((1..50).random())
}

private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

// Challenge: Single-Expression Functions
// Earlier, you saw the single-expression function syntax as a way to make functions that execute one
// statement more concise. Can you convert auraColor to use the single-expression function syntax?
private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String =
    if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String =
    when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

// Challenge: Fireball Inebriation Level
// Casting fireballs does not just print a message to the console. While NyetHack fireballs are more
// delicious than strong, they do have an intoxicating effect on the caster. Make the castFireball
// function return a resulting inebriation value that depends on the number of fireballs cast. The
// inebriation value should be between 1 and 50, with 50 being the maximum level of intoxication in the
// game.
//    private fun castFireball(numFireballs: Int = 2) =
//        println("A glass of Fireball springs into existence. (x$numFireballs) " +
//                "${if (numFireballs in 1..50) "Inebration Level: $numFireballs" else "50"}"
//
//        )

// Challenge: Inebriation Status
// Building on your last challenge, display the player's inebriation status based on the inebriation value
// returned from castFireball. Have the displayed inebriation status follow these rules:
//     Inebriation Level    |    Inebriation status
//           1 - 10         |           tipsy
//          11 - 20         |          sloshed
//          21 - 30         |           soused
//          31 - 40         |           stewed
//          41 - 50         |         ..t0aSt3d
private fun castFireball(numFireballs: Int = 2) =
        println("A glass of Fireball springs into existence (x$numFireballs) " +
                "${if (numFireballs in 1..50) "Inebriation level: $numFireballs" else "50"} " +
                "(Inebriation Status: " +
                "${when (numFireballs) {
                    in 1..10 -> "typsy"
                    in 11..20 -> "sloushed"
                    in 21..30 -> "soused"
                    in 31..40 -> "stewed"
                    in 41..50 -> "..t0aSt3d"
                    else -> "nope"
                } })"
        )