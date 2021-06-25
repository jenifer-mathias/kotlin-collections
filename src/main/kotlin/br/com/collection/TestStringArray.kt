package br.com.collection

fun main() {
    val names = Array(3) {""}
    names[0] = "Maria"
    names[1] = "Silvana"
    names[2] = "Jenifer"

    for (name in names) {
        println(name)
    }

    println("")

    names.sort()
    names.forEach { println(it) }

    println("")

    val names2 = arrayOf("Maria", "Silvana", "Jenifer")
    names2.sort()
    names2.forEach { println(it) }
}
