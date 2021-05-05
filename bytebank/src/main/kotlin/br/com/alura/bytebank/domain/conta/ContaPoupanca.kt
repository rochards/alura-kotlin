package br.com.alura.bytebank.domain.conta

import br.com.alura.bytebank.domain.cliente.Cliente

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(titular, numero) {

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

}