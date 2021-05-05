package br.com.alura.bytebank.domain

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