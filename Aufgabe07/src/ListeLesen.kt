fun main() {
    val list: List<String> = listOf("Hallo", "Welt", "!", "Was", "für", "ein", "schöner", "Tag", "!")
    //Erstelle unter diesem Kommentar eine Schleife, die die Liste oben auslesen kann
    //var i = 0
    //while (list.size > i) {
        //println(list)
        //i++
    //}

    var i = 0
    while (i < list.size) {
        println(list[i])
        i++
    }
}

