fun main(args: Array<String>) {
    while (true) {
        val inputPair = readLine() ?: break
        val inputPairList = inputPair.split(" ").map {it.toInt()}
        val (month, day) = Pair(inputPairList[0], inputPairList[1])
        if (month == 12 && day >= 24) {
            when (day) {
                25 -> println("E natal!")
                24 -> println("E vespera de natal!")
                else -> println("Ja passou!")
            }
        }
        else {
            val previousMonthsDaysSum = hashMapOf<Int, Int>(0 to 0, 1 to 31, 2 to 60, 3 to 91,
                4 to  121, 5 to 152, 6 to 182, 7 to 213, 8 to 244, 9 to 274, 10 to 305, 11 to 335)
            println("Faltam ${(366 - 6) - (previousMonthsDaysSum[month - 1]!! + day)} dias para o natal!")
        }
    }
}