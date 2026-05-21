package org.example;

public class Cliente {
    private String nome;
    private String endereco;
    private double saldo;
    private double limite;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.saldo = saldo;
        this.limite = limite;
    }
    public String getNome (){return nome;}
    public String getEndereco(){return endereco;};
    public double getSaldo() {return saldo;};
    public double getLimite() {return limite;};



}
