fun main(){
    var ersteListe = listOf(0, 1, 2, 3, 4, 5)
    var zweiteListe = zweitesElement(ersteListe)
    println(zweiteListe)
}

fun zweitesElement(liste: List<Int>): MutableList<Int> {
    var zweiteListe = mutableListOf<Int>()
    var i = 1
    while (i < liste.size) {
        zweiteListe.add(liste[i])
    i += 2
    }
    return zweiteListe
}