fun getTag(isFirst: Boolean, tagType: Char) : MutableList<Char> {
    if (isFirst) return mutableListOf('<', tagType, '>')
    else return  mutableListOf('<', '/' ,tagType, '>')
}

fun main(args: Array<String>) {
    while (true) {
        var string = readLine() ?: break
        val stringList = mutableListOf<Char>()
        var isFirstItalic = true
        var isFirstBold = true
        for (i in string) {
            if (i != '_' && i != '*') {
                stringList.add(i)
            }
            else {
                if (i == '_') {
                    stringList += getTag(isFirstItalic, 'i')
                    isFirstItalic = !isFirstItalic
                }
                else {
                    stringList += getTag(isFirstBold, 'b')
                    isFirstBold = !isFirstBold
                }
            }
        }
        string = ""
        for (i in stringList) { string += i }
        println(string)
    }
}