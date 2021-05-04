package br.com.alura

import br.com.alura.domain.Diretor
import br.com.alura.domain.Funcionario
import br.com.alura.domain.Gerente
import br.com.alura.utils.TotalDeBonificacao

fun main(args: Array<String>) {

    val f1 = Funcionario("Luiz", "123.654.321.31", 1000.0)
    println("nome: ${f1.nome}")
    println("cpf: ${f1.cpf}")
    println("salario: ${f1.salario}")
    println("bonificação: ${f1.bonificacao()}")

    val f2 = Gerente("Laís", "364.799.131-36", 9500.57, "secret")
    println()
    println("nome: ${f2.nome}")
    println("cpf: ${f2.cpf}")
    println("salario: ${f2.salario}")
    println("bonificação: ${f2.bonificacao()}")
    if (f2.autentica("secret")) {
        println("${f2.nome} autenticada")
    } else {
        println("${f2.nome} não autenticada")
    }

    val f3 = Diretor("Lima", "247.874.347-36", 19500.57, "secret2", 1500.0)
    println()
    println("nome: ${f3.nome}")
    println("cpf: ${f3.cpf}")
    println("salario: ${f3.salario}")
    println("bonificação: ${f3.bonificacao()}")
    if (f3.autentica("secret")) {
        println("${f3.nome} autenticado")
    } else {
        println("${f3.nome} não autenticado")
    }

    val totalBonificacao = TotalDeBonificacao()
    totalBonificacao.registraBonificacao(f1)
    totalBonificacao.registraBonificacao(f2)
    totalBonificacao.registraBonificacao(f3)
    println()
    println("Total de bonificação: ${totalBonificacao.total}")
}
