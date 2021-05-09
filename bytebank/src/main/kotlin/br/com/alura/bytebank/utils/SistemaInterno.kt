package br.com.alura.bytebank.utils

import br.com.alura.bytebank.domain.compartilhado.Autenticavel

class SistemaInterno {

    // login se torna uma higher-order function pq recebe uma outra função como parâmetro
    fun login(autenticavel: Autenticavel, senha: String, acao: () -> Unit = {}) {
        if (autenticavel.autentica(senha)) {
            println("autenticado(a)")
            acao() // preciso chamar, se não nada acontece quando for implementada do lado de fora
        } else {
            println("não autenticado(a)")
        }
    }
}