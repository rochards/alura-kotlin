package br.com.alura.bytebank.teste

import br.com.alura.bytebank.domain.cliente.Cliente
import br.com.alura.bytebank.domain.conta.ContaCorrente
import br.com.alura.bytebank.domain.conta.ContaPoupanca
import br.com.alura.bytebank.domain.conta.ContaSalario

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(Cliente("Lionel", "111.111.111-11", "secret"), 1000)
    val contaPoupanca = ContaPoupanca(Cliente("Zenety", "222.222.222-22", "secret"), 2001)
    val contaSalario = ContaSalario(Cliente("Lit", "333.333.333-33", "secret"), 3001)

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