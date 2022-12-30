fun main(args: Array<String>) {
    repeat(readLine()!!.toInt()) {
        val (hours, minutes, isOpen) = readLine()!!.split(" ").map {it.toByte()}
        val doorString = if (isOpen == 1.toByte()) "A porta abriu!" else "A porta fechou!"
        println("%02d:%02d - $doorString".format(hours, minutes))
    }
}