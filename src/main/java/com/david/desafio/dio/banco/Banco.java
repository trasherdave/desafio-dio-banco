/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.desafio.dio.banco;

import java.util.List;

/**
 *
 * @author David
 */
public class Banco {

    private String nome;
    private List<Conta> conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
