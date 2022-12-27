fun nearestIndex(value: Int): Int {  // Retorna idx da 1ª nota com valor menor daquele passado como parâmetro
    return when (value) {
        in 0..4 -> 0
        in 5..9 -> 1
        in 10..19 -> 2
        in 20..49 -> 3
        in 50..99 -> 4
        else -> 5
    }
}

fun main(args: Array<String>) {
    var inputData = readLine()!!.split(" ").map {it.toInt()}
    while (inputData[0] != 0 && inputData[1] != 0) {
        val purchasePrice = inputData[0]
        val payedValue = inputData[1]
        val change = payedValue - purchasePrice
        val billsList = listOf(2, 5, 10, 20, 50, 100)
        if (change > 200 || change < 4) println("impossible")  // 4 e 200 são os menores e maiores valores possíveis
        else {
            if (billsList.contains(change / 2)) println("possilbe")  // Qualquer valor gerado por 2 notas iguais é possível
            else {
                val nearestSmallerValue = billsList[nearestIndex(change)]
                val lastPossibleIdx = nearestIndex(change - nearestSmallerValue)  // Idx do último valor que dará soma menor que troco
                var isPossible = false
                for (i in 0..lastPossibleIdx) {
                    if (nearestSmallerValue + billsList[i] == change) {
                        isPossible = true
                        break
                    }
                }
                if (isPossible) println("possible") else println("impossible")
            }
        }
        inputData = readLine()!!.split(" ").map {it.toInt()}
    }
}