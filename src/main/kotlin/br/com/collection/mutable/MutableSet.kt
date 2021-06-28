package br.com.collection.mutable

import br.com.collection.utils.Funcionario
import br.com.collection.utils.TipoFuncionario

fun main() {
    val joao = Funcionario("João", 2000.0, TipoFuncionario.CLT)
    val maria = Funcionario("Maria", 1500.0, TipoFuncionario.CLT)
    val carmen = Funcionario("Carmen", 4000.0, TipoFuncionario.PJ)

    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }
    println("*****************************")

    funcionarioSet.add(carmen)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }
    println("*****************************")

    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}