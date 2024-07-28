package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    private String nome;
    private String dataNascimanto;
    private String telefone;

    public Cliente(String nome, String dataNascimanto, String telefone) {
        this.nome = nome;
        this.dataNascimanto = dataNascimanto;
        this.telefone = telefone;
    }

}
