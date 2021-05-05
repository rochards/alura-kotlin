package br.com.alura.bytebank.domain

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