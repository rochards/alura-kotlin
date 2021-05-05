package br.com.alura.bytebank.utils

import br.com.alura.bytebank.domain.Funcionario

class TotalDeBonificacao {

    var total = 0.0
        private set

    // quando chamado, fará uso da herança para decidir qual método bonificacao chamar
    fun registraBonificacao(funcionario: Funcionario) {
        this.total += funcionario.bonificacao()
    }
}