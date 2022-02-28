/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.david.desafio.dio.banco;

/**
 *
 * @author David
 */
public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("David");

        Conta corrente = new ContaCorrente(cliente);
        corrente.depositar(1500);

        Conta poupanca = new ContaPoupanca(cliente);
        corrente.transferir(1000, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
