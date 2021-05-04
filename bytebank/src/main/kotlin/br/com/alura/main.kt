package br.com.alura

import br.com.alura.domain.Funcionario

fun main(args: Array<String>) {

    val f1 = Funcionario("Luiz", "123.654.321.31", 1000.0)
    println("nome: ${f1.nome}")
    println("cpf: ${f1.cpf}")
    println("salario: ${f1.salario}")
}
