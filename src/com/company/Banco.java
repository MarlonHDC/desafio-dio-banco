package com.company;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;


    public List<Conta> getContas() {
        return contas;
    }


}
