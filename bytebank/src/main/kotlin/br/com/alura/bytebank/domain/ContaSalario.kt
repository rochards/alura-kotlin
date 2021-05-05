package br.com.alura.bytebank.domain

class ContaSalario(titular: String, numero: Int) : Conta(titular, numero) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}