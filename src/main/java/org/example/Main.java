package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Banco banco = new Banco("Banco GLBanks", new ArrayList<>());

        System.out.println("Bem vindo ao GLBansks");

        // Coleta de informações do cliente
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua data de nascimento (dd/MM/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite o seu telefone: ");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome, dataNascimento, telefone);

        // Escolha do tipo de conta
        System.out.println("Escolha o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipoConta = scanner.nextInt();

        Conta conta;
        if (tipoConta == 1) {
            conta = new ContaCorrente(cliente);
            System.out.println("Sua Conta Corrente foi criada com sucesso " + nome);
        } else {
            conta = new ContaPoupanca(cliente);
            System.out.println("Sua Conta Poupança foi criada com sucesso " + nome);
        }

        // Adicionando a conta à lista de contas que tem dentro da classe Conta
        banco.getContas().add(conta);

        // Menu de operações
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Imprimir Extrato");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    System.out.println("Saque realizado com sucesso!");
                    break;
                case 3:
                    System.out.print("Digite o número da conta de destino: ");
                    int numeroContaDestino = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Escolha o tipo de conta de destino:");
                    System.out.println("1. Conta Corrente");
                    System.out.println("2. Conta Poupança");
                    int tipoContaDestino = scanner.nextInt();

                    System.out.print("Digite o valor que deseja transferir: ");
                    double valorTransferencia = scanner.nextDouble();

                    // Encontrar a conta de destino
                    Conta contaDestino = null;
                    for (Conta c : banco.getContas()) {
                        if (c.getNumero() == numeroContaDestino &&
                                ((tipoContaDestino == 1 && c instanceof ContaCorrente) ||
                                        (tipoContaDestino == 2 && c instanceof ContaPoupanca))) {
                            contaDestino = c;
                            break;
                        }
                    }

                    if (contaDestino != null) {
                        conta.transferir(valorTransferencia, contaDestino);
                        System.out.println("Transferência realizada com sucesso!");
                    } else {
                        System.out.println("Conta de destino não encontrada ou tipo de conta não corresponde.");
                    }
                    break;
                case 4:
                    conta.imprimirExtrato();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}