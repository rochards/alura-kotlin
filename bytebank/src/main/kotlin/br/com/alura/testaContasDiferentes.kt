package br.com.alura

import br.com.alura.domain.ContaCorrente
import br.com.alura.domain.ContaPoupanca
import br.com.alura.domain.ContaSalario

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente("Lionel", 1000)
    val contaPoupanca = ContaPoupanca("Zenety", 2001)
    val contaSalario = ContaSalario("Lit", 3001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)
    println("saldo de conta corrente: ${contaCorrente.saldo}")
    println("saldo de conta poupança: ${contaPoupanca.saldo}")
    println("saldo de conta salário: ${contaSalario.saldo}")

    contaCorrente.saca(150.0)
    contaPoupanca.saca(150.0)
    contaSalario.saca(150.0)
    println("saldo de conta corrente após saque: ${contaCorrente.saldo}")
    println("saldo de conta poupança após saque: ${contaPoupanca.saldo}")
    println("saldo de conta salário após saque: ${contaSalario.saldo}")

    contaCorrente.transfere(149.9, contaPoupanca)
    println("saldo de conta corrente após fazer transferência: ${contaCorrente.saldo}")
    println("saldo de conta poupança após receber transferência: ${contaPoupanca.saldo}")
}