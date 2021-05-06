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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Conta) return false

        if (numero != other.numero) return false
        if (saldo != other.saldo) return false

        return true
    }

    override fun hashCode(): Int {
        var result = numero
        result = 31 * result + saldo.hashCode()
        return result
    }
}
