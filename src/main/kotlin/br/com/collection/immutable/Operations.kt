package br.com.collection.immutable

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("")
    println("O maior salário é: ${salarios.maxOrNull()}")
    println("O menor salário é: ${salarios.minOrNull()}")
    println("A média dos salários é: ${"%.1f".format(salarios.average()).replace(",", ".").toDouble()}")

    println("")
    val salariosMaioresQue2500 = salarios.filter { it > 2500.0 }
    salariosMaioresQue2500.forEach { println("Salários maiores que 2500.0: \n$it") }

    println("")
    println("Quantidade de salários que estão no intervalo de 2000.0 a 5000.0: \n" + salarios.count { it in 2000.0..5000.0 })

    println("")
    println("Encontra o valor 'x' presente no array\n" + salarios.find { it == 2250.0 })

    println("")
    println("Existem salários iguais a 1000.0? \n" + salarios.any { it == 1000.0 })

}