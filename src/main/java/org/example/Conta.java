package org.example;

public class Conta {
    private String numeroDaConta;
    private Cliente titular;
    private double saldo;
    private double limite;

    public Conta(String numeroDaConta, Cliente nome , double limite){
        this.numeroDaConta = "01241-8";
        this.titular = nome;
        this.saldo = 0.00;
        this.limite = 500.00;
    }
    public void depositar(double valor){
        if (valor >0){
            this.saldo = this.saldo + valor;
            System.out.println("Desposito de R$" + valor + " Realizado com sucesso");
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }
    public void sacar(double valor) {
        if (valor >0 && valor <= (this.saldo + this.limite)) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque se R$" + valor + " Realizado com sucesso");
        } else if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser maior que zero.");
        } else {
            System.out.println("Erro: Saldo Insuficiente para realizar o saque");
        }
    }
    public void exibirExtrato() {
        System.out.println("---EXTRATO---");
        System.out.println("Conta:" + this.numeroDaConta);
        System.out.println("Saldo Atual: R$" + this.saldo);
        System.out.println("Limite Disponivel: R$" + this.limite);
        System.out.println("----------------------------------");
    }

}

