package br.com.alura.bytebank.domain

// esse tipo de construtor é chamado de primário
abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set // protected para que assim possa ser acessível dentro das classes filhas

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}
