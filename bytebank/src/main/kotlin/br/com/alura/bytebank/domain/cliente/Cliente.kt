package br.com.alura.bytebank.domain.cliente

import br.com.alura.bytebank.domain.compartilhado.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: String
) : Autenticavel {

    override fun autentica(senha: String) = this.senha == senha
}