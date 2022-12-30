import kotlin.math.ln

fun main(args: Array<String>) {
    val n = readLine()!!.toDouble()
    val min = n / ln(n)
    val max = 1.25506 * (n / ln(n))
    println("%.1f %.1f".format(min, max))
}