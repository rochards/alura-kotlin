package br.com.alura

import br.com.alura.domain.Cliente
import br.com.alura.domain.Diretor
import br.com.alura.domain.Gerente
import br.com.alura.utils.SistemaInterno

fun testaSistemaInterno() {

    val gerente = Gerente("João", "111.111.111-11", 15000.0, "secret")
    val diretor = Diretor("Maria", "222.222.222-22", 25000.0, "secret2", 1500.0)
    val cliente = Cliente("Lito", "333.333.333-33", "secret3")

    val sistemaInterno = SistemaInterno()
    sistemaInterno.login(gerente, "secret")
    sistemaInterno.login(diretor, "secret2")
    sistemaInterno.login(cliente, "secret3")
}