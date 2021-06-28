package br.com.collection.utils

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
            
            Nome:                  $nome
            Salário:               $salario
            Regime de contratação: $tipoContratacao
            
        """.trimIndent()
}