fun main(args: Array<String>) {
    val testAmount : Int = readLine()!!.toInt()
    repeat(testAmount) {
        val player1 = readLine()!!
        val player2 = readLine()!!
        if (player1 == "ataque") {
            when (player2) {
                "ataque" -> println("Aniquilacao mutua")
                "pedra", "papel" -> println("Jogador 1 venceu")
            }
        }
        else if (player1 == "pedra") {
            when (player2) {
                "ataque" -> println("Jogador 2 venceu")
                "pedra" -> println("Sem ganhador")
                "papel" -> println("Jogador 1 venceu")
            }
        }
        else if (player1 == "papel") {
            when (player2) {
                "pedra", "ataque" -> println("Jogador 2 venceu")
                "papel" -> println("Ambos venceram")
            }
        }
    }
}