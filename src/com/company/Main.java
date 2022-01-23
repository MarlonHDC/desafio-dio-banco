package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       // Cliente 1
        Cliente marlon = new Cliente();
        marlon.setNome("Marlon");

	Conta cc = new ContaCorrente(marlon);
        Conta poupanca = new ContaPoupanca(marlon);
        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
       // cc.imprimirInfosComuns();

       // Cliente 2
        Cliente sarah = new Cliente();
        sarah.setNome("Sarah");

        Conta cc2 = new ContaCorrente(sarah);
        Conta poupanca2 = new ContaPoupanca(sarah);
        cc2.depositar(80);
        cc2.transferir(40, poupanca2);

       cc2.imprimirExtrato();
       poupanca2.imprimirExtrato();
        // cc2.imprimirInfosComuns();

        // Adição de lista de clientes
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(marlon);
        clientes.add(sarah);

        System.out.println("Lista de clientes: ");
        for(Cliente c : clientes) {
            System.out.println( c.getNome()); }

    }


}
