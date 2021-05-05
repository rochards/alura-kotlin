package br.com.alura.domain

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {

    abstract fun bonificacao(): Double
}