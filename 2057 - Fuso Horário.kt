fun main(args: Array<String>) {
   val (departureTime, flightDuration, timezoneDiff) = readLine()!!.split(" ").map { it.toByte() }
    val adjustedDeparture = departureTime + timezoneDiff
    val arrivalTime = adjustedDeparture + flightDuration
    when {
        arrivalTime in 0..24 -> println(arrivalTime)
        arrivalTime < 0 -> println(arrivalTime + 24)
        else -> println(arrivalTime - 24)
    }
}