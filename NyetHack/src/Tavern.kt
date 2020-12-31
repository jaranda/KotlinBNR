fun main(Args: Array<String>) {
    var beverage = readLine()?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "Buttered Ale"
        }
    }
//    beverage = null

    print(beverage)
}