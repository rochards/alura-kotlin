package br.com.alura.domain

// quem quiser se autenticar vai precisar implementar essa interface
interface Autenticavel {

    fun autentica(senha: String): Boolean
}