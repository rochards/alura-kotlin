package br.com.alura.bytebank.domain.conta

import br.com.alura.bytebank.domain.cliente.Cliente
import br.com.alura.bytebank.domain.exception.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(titular, numero) {

    fun transfere(valor: Double, destino: Conta) {
        if (this.saldo < valor) {
            throw SaldoInsuficienteException()
        }

        this.saldo -= valor
    }
}