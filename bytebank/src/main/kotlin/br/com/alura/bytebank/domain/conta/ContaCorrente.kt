package br.com.alura.bytebank.domain.conta

import br.com.alura.bytebank.domain.cliente.Cliente

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(titular, numero) {

    override fun saca(valor: Double) {
        val valorTaxado = valor + 0.10
        if (this.saldo >= valorTaxado) {
            this.saldo -= valorTaxado
        }
    }
}