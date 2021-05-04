package br.com.alura.domain

// Diretor herda de Funcionario
class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: String,
    val plr: Double
) : Funcionario(nome, cpf, salario) {

    fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}