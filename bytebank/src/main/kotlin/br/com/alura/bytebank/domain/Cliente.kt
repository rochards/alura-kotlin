package br.com.alura.bytebank.domain

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: String
) : Autenticavel {

    override fun autentica(senha: String) = this.senha == senha
}