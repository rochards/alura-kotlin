package br.com.alura.bytebank.utils

import br.com.alura.bytebank.domain.Autenticavel

class SistemaInterno {

    fun login(autenticavel: Autenticavel, senha: String) {
        if (autenticavel.autentica(senha)) {
            println("autenticado(a)")
        } else {
            println("não autenticado(a)")
        }
    }
}