fun main(args: Array<String>) {
    while (true) {
        val senha = readLine() ?: break
        println(senha.toInt() - 1)
    }
}