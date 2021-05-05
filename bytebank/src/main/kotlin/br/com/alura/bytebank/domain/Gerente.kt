package br.com.alura.bytebank.domain

// Gerente herda de FuncionarioAdmin que herda de Funcionario
class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String
) : FuncionarioAdmin(nome, cpf, salario, senha) {

    override fun bonificacao(): Double {
        return salario
    }
}