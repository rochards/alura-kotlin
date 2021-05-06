package br.com.alura.bytebank.domain.conta

import br.com.alura.bytebank.domain.cliente.Cliente

// esse tipo de construtor é chamado de primário
abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set // protected para que assim possa ser acessível dentro das classes filhas

    // o que temos abaixo é um object declaration sendo membro (companion) desta classe
    companion object {
        var total = 0 // esse total vai funcionar como uma variável estática do Java, pois é instanciada apenas uma vez
            private set
    }

    init {
        total++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}
