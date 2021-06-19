package subtask2


class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        //throw NotImplementedError("Not implemented")
        var aLow = a.toLowerCase()
        val bLow = b.toLowerCase()
            for(i in 0..bLow.lastIndex) {
                if(aLow.contains(bLow[i])) {
                    aLow = aLow.substringAfter(bLow[i])
                }
                else{
                    return ("NO")
                }
            }
            return ("YES")
    }
}
