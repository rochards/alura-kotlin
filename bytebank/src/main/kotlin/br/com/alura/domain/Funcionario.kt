package br.com.alura.domain

// open -> torna minha classe elegível para ser utilizada em herança
open class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {
    fun bonificacao(): Double {
        return salario * 0.1
    }
}