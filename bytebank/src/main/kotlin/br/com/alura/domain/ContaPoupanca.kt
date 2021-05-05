package br.com.alura.domain

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(titular, numero) {

    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

}