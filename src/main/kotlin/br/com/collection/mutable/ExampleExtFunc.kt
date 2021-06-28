package br.com.collection.mutable

import br.com.collection.utils.media
import br.com.collection.utils.somatoria

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("*****************************")
    println(salarios.somatoria())

    println("*****************************")
    println(salarios.media())
}