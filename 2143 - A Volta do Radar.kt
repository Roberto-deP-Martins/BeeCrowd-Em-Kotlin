fun main(args: Array<String>) {
    var testsAmount = readLine()!!.toInt()
    while (testsAmount != 0) {
        repeat(testsAmount) {
            val amountOfPeople = readLine()!!.toInt()
            if (amountOfPeople % 2 != 0) println((amountOfPeople - 1) * 2 + 1)
            else println(((amountOfPeople - 2) * 2 + 2))
        }
        testsAmount = readLine()!!.toInt()
    }
}