package br.com.alura.domain

// Gerente herda de Funcionario
class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: String
) : Funcionario(nome, cpf, salario) {

    fun autentica(senha: String): Boolean {
        return this.senha == senha
    }

    override fun bonificacao(): Double {
        return super.bonificacao() + salario
    }
}