package br.com.alura.domain

/*
* Aqui cria-se a classe FuncionarioAdmin que herda de Funcionario. Quem precisar de autenticação vai herdar
* diretamente de FuncionarioAdmin e continuará indiretamente herdando de Funcionario. Essa técnica se faz pq
o Kotlin não permite herança múltipla
* */
abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: String
) : Funcionario(nome, cpf, salario) {

    fun autentica(senha: String) {
        if (this.senha == senha) {
            println("${this.nome} autenticado(a)")
        } else {
            println("${this.nome} não autenticado(a)")
        }
    }
}