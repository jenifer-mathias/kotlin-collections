package br.com.collection.immutable

import br.com.collection.utils.Funcionario
import br.com.collection.utils.TipoFuncionario

fun main() {
    val joao = Funcionario("João", 2000.0, TipoFuncionario.CLT)
    val maria = Funcionario("Maria", 1500.0, TipoFuncionario.CLT)
    val carmen = Funcionario("Carmen", 4000.0, TipoFuncionario.PJ)

    val funcionarios1 = setOf(joao, maria)
    val funcionarios2 = setOf(carmen)

    println("**** União de conjuntos - Set ****")
    val unionResult = funcionarios1.union(funcionarios2)
    unionResult.forEach { println(it) }

    println("**** Subtração de conjunto - Set ****")
    val funcionarios3 = setOf(joao, maria, carmen)
    val subtractionResult = funcionarios3.subtract(funcionarios2) // retira o que há em comum entre os dois conjuntos
    subtractionResult.forEach { println(it) }

    println("**** Intercepção de conjuntos - Set ****")
    val intersectResult = funcionarios3.intersect(funcionarios2) // retorna o que é comum aos dois conjuntos
    intersectResult.forEach { println(it) }

}