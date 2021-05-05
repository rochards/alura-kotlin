package br.com.alura.bytebank.domain.conta

import br.com.alura.bytebank.domain.cliente.Cliente

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(titular, numero) {

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)

            return true
        }

        return false
    }
}