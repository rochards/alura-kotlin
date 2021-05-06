package br.com.alura.bytebank.teste

import br.com.alura.bytebank.domain.cliente.Cliente
import br.com.alura.bytebank.domain.conta.ContaPoupanca
import br.com.alura.bytebank.domain.exception.SaldoInsuficienteException

fun testaTransferenciaEntreContas() {

    val contaLuna = ContaPoupanca(Cliente("Luna", "111.111.111-11", "secret"), 10)
    val contaMara = ContaPoupanca(Cliente("Mara", "222.222.222-22", "secret"), 10)

    contaLuna.deposita(2500.0)
    contaMara.deposita(2500.0)

    println("Saldo de ${contaLuna.titular.nome}: ${contaLuna.saldo}")
    println("Saldo de ${contaMara.titular.nome}: ${contaMara.saldo}")

    println()
    try {
        contaLuna.transfere(200.0, contaMara, "secret")
        println("Transferência realizada com sucesso!")
    } catch (e: SaldoInsuficienteException) {
        println(e.message)
        e.printStackTrace()
    }
    println("Saldo de ${contaLuna.titular.nome}: ${contaLuna.saldo}")
    println("Saldo de ${contaMara.titular.nome}: ${contaMara.saldo}")

    println()
    try {
        contaLuna.transfere(3000.0, contaMara, "secret")
        println("Transferência realizada com sucesso!")
    } catch (e: SaldoInsuficienteException) {
        println(e.message)
        e.printStackTrace()
    }
    println("Saldo de ${contaLuna.titular.nome}: ${contaLuna.saldo}")
    println("Saldo de ${contaMara.titular.nome}: ${contaMara.saldo}")
}