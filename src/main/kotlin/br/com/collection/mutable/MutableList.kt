package br.com.collection.mutable

import br.com.collection.utils.Funcionario
import br.com.collection.utils.TipoFuncionario

fun main() {
    val joao = Funcionario("João", 2000.0, TipoFuncionario.CLT)
    val maria = Funcionario("Maria", 1500.0, TipoFuncionario.CLT)
    val carmen = Funcionario("Carmen", 4000.0, TipoFuncionario.PJ)

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }
    println("*****************************")

    funcionarios.add(carmen)
    funcionarios.forEach { println(it) }

    println("*****************************")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

}