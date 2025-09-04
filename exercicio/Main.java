package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\t=== BEM-VINDO AO BANCO ===");

		int opcao = 0;

		while (opcao < 1 || opcao > 3) {
			System.out.println("\nEscolha o tipo de conta:");
			System.out.println("\n1 - Conta Corrente");
			System.out.println("2 - Conta Poupança");
			System.out.println("3 - Conta Pessoa Jurídica");
			System.out.print("Digite a opção: ");
			opcao = sc.nextInt();

			if (opcao < 1 || opcao > 3) {
				System.out.println("Opção inválida! Tente novamente.\n");
			}
		}

		sc.nextLine();
		System.out.print("Digite o nome do titular: ");
		String nome = sc.nextLine();

		Conta conta = null;

		switch (opcao) {
		case 1:
			conta = new ContaCorrente();
			break;
		case 2:
			conta = new ContaPoupanca();
			break;
		case 3:
			conta = new ContaPJ();
			break;
		}

		conta.titular = nome;
		System.out.println("\nConta criada com sucesso " + conta.titular + ", aproveite muito!");

		int escolha = -1;

		while (escolha != 0) {
			System.out.println("\n\t=== MENU DE OPERAÇÕES ===");
			System.out.println("\n1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Exibir Saldo");
			System.out.println("4 - Ver Tarifa Mensal");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: " );
			escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				System.out.print("Digite o valor para depositar " + conta.titular + ":");
				double deposito = sc.nextDouble();
				conta.depositar(deposito);
				break;
			case 2:
				System.out.print("Digite o valor para sacar: ");
				double saque = sc.nextDouble();
				conta.sacar(saque);
				break;
			case 3:
				conta.exibirSaldo();
				break;
			case 4:
				System.out.println("Tarifa mensal: R$" + conta.calcularTarifaMensal());
				break;
			case 0:
				System.out.println("\nObrigado por usar o banco! Volte sempre " + conta.titular + "!");
				break;
			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
		}

		sc.close();
	}
}