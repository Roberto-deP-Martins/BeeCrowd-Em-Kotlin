data class Player(val choice: Byte = Byte.MIN_VALUE, val num: Byte = Byte.MIN_VALUE,var hasWon: Boolean = false)

fun main(args: Array<String>) {
    val inputLine = readLine()!!.split(" ").map {it.toByte()}

    // Invertido para simplificar condicional depois. 0 passa a ser escolher par e 1 escolher ímpar
    val player1 = Player(choice = if (inputLine[0] == 1.toByte()) 0 else 1, num = inputLine[1])
    val player2 = Player(choice = if (inputLine[0] == 1.toByte()) 1 else 0, num = inputLine[2])
    val p1Cheated: Boolean = inputLine[3] == 1.toByte()
    val p2Accused: Boolean = inputLine[4] == 1.toByte()
    if (((player1.num + player2.num) % 2.toByte()).toByte() == player1.choice) {
        player1.hasWon = true
        if (p1Cheated && p2Accused) {
            player1.hasWon = false
            player2.hasWon = true
        }
    }
    else {
        player2.hasWon = true
        if (p1Cheated && !p2Accused) {
            player1.hasWon = true
            player2.hasWon = false
        }
    }
    if (player1.hasWon) println("Jogador 1 ganha!") else println("Jogador 2 ganha!")
}