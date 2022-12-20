fun main(args: Array<String>) {
    val pi = 3.14
    while (true) {
        var volume : Double?
        var diameter : Double?
        volume = readLine()?.toDouble() ?: break
        diameter = readLine()?.toDouble() ?: break
        val radius = diameter / 2.0
        val radiusSquared = radius * radius
        val height = volume / (pi * radiusSquared)
        val baseArea = pi * (radiusSquared)
        println("ALTURA = %.2f".format(height))
        println("AREA = %.2f".format(baseArea))
    }
}