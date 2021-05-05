package br.com.alura.domain

class SistemaInterno {

    fun login(admin: FuncionarioAdmin, senha: String) {
        if (admin.autentica(senha)) {
            println("${admin.nome} autenticado(a)")
        } else {
            println("${admin.nome} não autenticado(a)")
        }
    }
}