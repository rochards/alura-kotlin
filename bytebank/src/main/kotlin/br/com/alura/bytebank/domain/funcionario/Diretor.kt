package br.com.alura.bytebank.domain.funcionario

// Diretor herda de FuncionarioAdmin que herda de Funcionario
class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String,
    val plr: Double
) : FuncionarioAdmin(nome, cpf, salario, senha) {

    // uma forma mais enxuta de declarar um método/função
    override fun bonificacao() = salario + plr
}