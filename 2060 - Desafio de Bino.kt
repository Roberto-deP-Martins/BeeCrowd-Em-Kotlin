fun main(args: Array<String>) {
    readLine()
    val amountOfMultiples = intArrayOf(0, 0, 0, 0)  // idx 0 = múltiplos de 2, 1 = múltiplos de 3...
    val numbersList = readLine()!!.split(" ").map { it.toInt() }
    for (number in numbersList) {
        if (number % 2 == 0) {
            amountOfMultiples[0]++
        }
        if (number % 3 == 0) {
            amountOfMultiples[1]++
        }
        if (number % 4 == 0) {
            amountOfMultiples[2]++
        }
        if (number % 5 == 0) {
            amountOfMultiples[3]++
        }
    }
    val factors = listOf(2, 3, 4, 5)
    for ((index, amount) in amountOfMultiples.withIndex()) {
        println("$amount Multiplo(s) de ${factors[index]}")
    }
}