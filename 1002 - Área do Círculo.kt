fun main(args: Array<String>) {

    val radius : Double = readLine()!!.toDouble()
    val area = 3.14159 * (radius * radius)
    println("A=%.4f".format(area))
}
