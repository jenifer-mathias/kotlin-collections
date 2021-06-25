package br.com.collection

fun main() {
    val joao = Funcionario("João", 2000.0, TipoFuncionario.CLT)
    val maria = Funcionario("Maria", 1500.0, TipoFuncionario.CLT)
    val carmen = Funcionario("Carmen", 4000.0, TipoFuncionario.PJ)

    // instancia lista imutável
    val funcionarios = listOf(joao, maria, carmen)

    funcionarios.forEach { print(it) }

    println("\n **** Informações da funcionária Maria: ****")
    println(funcionarios.find { it.nome == "Maria" })

    println("**** Ordena os funcionários por salário em ordem crecente: ****")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) } // método coletor

    println("**** Ordena os funcionários por tipo de contratação: ****")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println("\n $it") } // método coletor
}




