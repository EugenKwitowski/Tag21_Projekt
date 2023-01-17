fun main(){
    var umgedrehterSatz = listOf(".", "rückwärts ", "mehr", "nicht", "ist ", "Satz ", "Dieser ")
    satzAusgabe(umgedrehterSatz)
}

fun satzAusgabe(list: List<String>) : MutableList<String> {
    // hier dein code
var i = list.size-1
    var list2 = mutableListOf<String>(
        while (i >= 0) {
            var list2.add(list[i])
            i--
            return
        }
}