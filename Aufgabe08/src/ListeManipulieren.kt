fun main() {
    var list: MutableList<Int> = mutableListOf(0, 1, 2, 3, 4, 5)
    //Implementiere unter diesem Kommentar die in der Aufgabe beschriebene while-Schleife
    var i = 0
    while (i < list.size) {
        var ergänzung = list[i] * 2
        list[i] = ergänzung
        i++

    }
    println(list)
}
/*
var i = 0
var list2: MutableList<Int> = mutableListOf()
while (i < list.size) {
    //println(list[1])
    var ergebnis = list[1] * 2
    list2.add(i, ergebnis)
    println(ergebnis)
    i ++
}
list.clear()
list.addAll(list2)
}

fun  aufgabe8() {
var list: MutableList<Int> = mutableListOf(0, 1, 2, 3, 4, 5)

var i = 0
var size = list.size

while (i < size) {
    var ergebnis = list[i] * 2
    list.add(i, ergebnis)
    println(ergebnis)
    i ++
}
}
*/
