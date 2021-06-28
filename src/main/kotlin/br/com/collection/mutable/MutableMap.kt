package br.com.collection.mutable

import br.com.collection.utils.Funcionario
import br.com.collection.utils.Repository
import br.com.collection.utils.TipoFuncionario

fun main() {
    val joao = Funcionario("João", 2000.0, TipoFuncionario.CLT)
    val maria = Funcionario("Maria", 1500.0, TipoFuncionario.CLT)
    val carmen = Funcionario("Carmen", 4000.0, TipoFuncionario.PJ)

    val repository = Repository<Funcionario>()

    repository.create(joao.nome, joao)
    repository.create(maria.nome, maria)
    repository.create(carmen.nome, carmen)

    println(repository.findById(maria.nome))

    println("*****************************")
   repository.findAll().forEach { println(it) }

    println("*****************************")
    repository.remove(maria.nome)
    repository.findAll().forEach { println(it) }
}