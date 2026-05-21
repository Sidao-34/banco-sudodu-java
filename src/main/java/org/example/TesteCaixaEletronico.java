package org.example;
import java.util.Scanner;

public class TesteCaixaEletronico {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Cliente c1 = new Cliente("Marco Antonio", "São Paulo");
        Conta minhaConta = new Conta("00098-X", c1, 500.00);

        System.out.println("=== BEM-VINDO AO BANCO SUDOSU ===");
        System.out.println("1 - Apanes Sacar");
        System.out.println("2 - Apenas Depositar");
        System.out.println("Escolha uma opção:");
        int opcao = leitor.nextInt();

        if (opcao == 1) {
            System.out.println("\n Digite o valor que deseja SACAR: R$ ");
            double valorSaque = leitor.nextDouble();
            minhaConta.sacar(valorSaque);
        } else if (opcao == 2) {
            System.out.println("\n Digite o valor que deseja DEPOSITAR: R$ ");
            double valorDeposito = leitor.nextDouble();
            minhaConta.depositar(valorDeposito);
        } else {
            System.out.println("Opção Onválida");
        }

        System.out.println("\n === FIM DA OPERAÇÃO ===");
        minhaConta.exibirExtrato();
        leitor.close();
    }
}

