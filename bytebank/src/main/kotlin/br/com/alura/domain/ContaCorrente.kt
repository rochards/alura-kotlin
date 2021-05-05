package br.com.alura.domain

class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(titular, numero) {

    override fun saca(valor: Double) {
        val valorTaxado = valor + 0.10
        if (this.saldo >= valorTaxado) {
            this.saldo -= valorTaxado
        }
    }
}