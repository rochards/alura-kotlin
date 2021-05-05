package br.com.alura.bytebank.domain.funcionario

// quem quiser se autenticar vai precisar implementar essa interface
interface Autenticavel {

    fun autentica(senha: String): Boolean
}