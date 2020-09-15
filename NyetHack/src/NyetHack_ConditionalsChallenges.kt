fun main(args: Array<String>) {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false

// Challenge: Enhancing the Aura
// Currently, if an Aura is displayed, it is always green. For this challenge, have the color of the player's
// aura reflect their current karma.
// Karma has a numeric value from 0 to 20. To determine the player's karma, use the following formula:
//     val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
// Have the displayed aura follow these rules:
//     Karma value | Aura color
//        0 - 5    |    red
//        6 - 10   |   orange
//       11 - 15   |   purple
//       16 - 20   |   green
// Determine the karma value with the formula above and chek the player's aura color using a conditional expression.
// Finally, modify the player status display to report the new color if the aura is visible.


    // Aura
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()
    val auraColor = if (auraVisible) {
        when (karma) {
            in 0..5   -> "RED"
            in 6..10  -> "ORANGE"
            in 11..15 -> "PURPLE"
            else -> "GREEN"
        }
    } else "NONE"

    val healthStatus = when (healthPoints) {
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

// Challenge: Configurable Status Format
// Currently, the player's status display is created by two calls to println. There is no variable that holds
// the value of the full display string.
// The code looks like this:
//    // Player status
//     println("(Aura: $auraColor) " +
//             "(Blessed: ${if (isBlessed) "YES" else "NO"})")
//     println("$name $healthStatus")
// And it produces output like this:
//     (Aura: GREEN) (Blessed: YES)
//     Madrigal has some minor wounds but is healing quite quickly!
// For this most difficult challenge, make the status line configurable with a status format string. Use the
// character B for blessed, A for aura color, H for healthStatus, and HP for healthPoints. For example, a
// status format string of:
//     val statusFormatString = "(HP)(A) -> H"
// should generate a player status display like:
// (HP: 100)(Aura: Green) -> Madrigal is in excellent condition!

    // Player status
    val statusFormatString = "(HP)(A)\n(B) -> H"
    statusFormatString.replace("HP", "P", false).forEach {
        print(when(it) {
            'P' -> "HP: $healthPoints"
            'A' -> "Aura: $auraColor"
            'H' -> "$name $healthStatus"
            'B' -> "Blessed: ${if (isBlessed) "YES" else "NO"}"
            else -> it.toString()
        })
    }
    print("\n")

    // From the
    println(mapOf("HP" to "HP: $healthPoints", "A" to "Aura: $auraColor", "H\\b" to "$name $healthStatus", "B" to "Blessed: ${if (isBlessed) "YES" else "NO"}").toList().fold("(HP)(A) -> (B): (H)") {
        acc, (symbol, value) -> acc.replace(symbol.toRegex()) { value }
    })
}

