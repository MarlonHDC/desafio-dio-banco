package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente marlon = new Cliente();
        marlon.setNome("Marlon");

	Conta cc = new ContaCorrente(marlon);
        Conta poupanca = new ContaPoupanca(marlon);
        cc.depositar(100);
        cc.transferir(50, poupanca);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();
    }
}
