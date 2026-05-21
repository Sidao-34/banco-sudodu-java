package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Cliente c1 = new Cliente("Sidnei Castanha", "São Paulo");
        Conta minhaConta = new Conta("00098-X", c1, 500.00);

        System.out.println("=== BEM-VINDO AO BANCO ELITE===");
        System.out.println("Digite o valor deseja DEPOSITAR: R$ ");
        Double valorDepositado = leitor.nextDouble();

        // O Java pega o que você digitou e joga no seu método"
        minhaConta.depositar(valorDepositado);
        System.out.print("\n Digite o valor que deseja SACAR: R$  ");
        double valorSaque = leitor.nextDouble();
        System.out.println("\n === FIM DA OPERAÇÃO ===");
        minhaConta.exibirExtrato();

        leitor.close();
    }

}
