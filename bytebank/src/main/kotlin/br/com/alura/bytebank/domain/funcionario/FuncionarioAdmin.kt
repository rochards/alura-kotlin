package br.com.alura.bytebank.domain.funcionario

/*
* Aqui cria-se a classe FuncionarioAdmin que herda de Funcionario. Quem precisar de autenticação vai herdar
* diretamente de FuncionarioAdmin, pois essa implementa a interface Autenticavel, e continuará indiretamente herdando
* de Funcionario. Essa técnica se faz pq o Kotlin não permite herança múltipla
* */
abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: String
) : Funcionario(nome, cpf, salario), Autenticavel {

    override fun autentica(senha: String) = this.senha == senha
}