fun main(args: Array<String>) {
    while (true) {
        val sentence = readLine() ?: break
        var newSentence = ""
        var newChar : Char
        var currCharIsCapital = false
        for (letter in sentence) {
            if (letter.isLetter()) {
                /* toUpperCase e toLowerCase foram descontinuados, mas BeeCrowd usa versão antiga do Kotlin e não aceita
                métodos alternativos * */

                if (!currCharIsCapital)  newChar = letter.toUpperCase()
                else newChar = letter.toLowerCase()
                currCharIsCapital = !currCharIsCapital
            }
            else newChar = ' '  // Se é espaço em branco
            newSentence += newChar
        }
        println(newSentence)
    }
}