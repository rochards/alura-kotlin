package br.com.alura.domain

class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(titular, numero) {

    override fun saca(valor: Double) {
        super.saca(valor + 0.1)
    }
}