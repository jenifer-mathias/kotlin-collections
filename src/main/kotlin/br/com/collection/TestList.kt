package br.com.collection

enum class TipoFuncionario(tipo: String) {
    CLT("Regime de contratação CLT"),
    PJ("Regime de contratação PJ")
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao : TipoFuncionario
) {
    override fun toString(): String =
        """
            
            Nome:     $nome
            Salário:  $salario
            
        """.trimIndent()
}

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




