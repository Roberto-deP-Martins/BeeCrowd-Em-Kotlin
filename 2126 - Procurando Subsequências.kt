class Subsequence(var content: String, val size: Int = content.length, val isUnitary: Boolean = size == 1, var currentIdx : Int = 0) {
    fun resetIdx() { this.currentIdx = 0 }

    fun getCurrIdxChar(): Char = this.content[this.currentIdx]  // Pega char da subseq. localizado no Idx atual
}

fun main(args: Array<String>) {
    var caseNumber = 1
    while (true) {
        val subsequence = Subsequence(readLine() ?: break)
        val fullString = readLine()!!
        var subsequentMatches = 0  // Quantos chars igual subsequentes
        var subsequenceAmount : Long = 0
        var tempStarPos = -1  // Mantem possível pos inical até que se confirme se é subsquencia ou não
        var startPos = -1  // Pos inicial da substring na string inteira
        for ((index, char) in fullString.withIndex()) {
            if (char != subsequence.getCurrIdxChar()) {
                // Reinicia parâmetros
                subsequentMatches = 0
                subsequence.resetIdx()
            }
            if (char == subsequence.getCurrIdxChar()) {
                if (subsequence.currentIdx == 0) tempStarPos = index  // Se está testando primeiro char da substring, atribui pos inicial
                subsequence.currentIdx++
                subsequentMatches++
                if (subsequentMatches == subsequence.size) {  // Encontrou subsequencia
                    subsequenceAmount++
                    subsequence.resetIdx()
                    subsequentMatches = 0
                    startPos = tempStarPos
                    if (char == subsequence.getCurrIdxChar() && !subsequence.isUnitary) {  // Verifica se dígito que encerrou subseq. anterior começa a próxima
                        // Evita que pos inicial mude quando se verifica último dígito da seq. e a subseq. não é unitária
                        if (index + 1 != fullString.length) tempStarPos = index

                        subsequence.currentIdx++
                        subsequentMatches++
                    }
                }
            }
        }
        when (subsequenceAmount) {
            0.toLong() -> println("Caso #$caseNumber:\nNao existe subsequencia\n")
            else -> println("Caso #$caseNumber:\nQtd.Subsequencias: $subsequenceAmount\nPos: ${startPos + 1}\n")
        }
        caseNumber++
    }
}