package aula03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float saldo = 1000f;
		float valor = 0f;
		
		System.out.println("Código da operação | Operação");
		System.out.println("       1           | Saldo");
		System.out.println("       2           | Saque");
		System.out.println("       3           | Depósito");
		
		System.out.println("Digite uma opção: ");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f", saldo);
			break;
		case 2:
			System.out.println("Digite o valor do saque: ");
			valor = sc.nextFloat();
			System.out.println("Operação - Saque");
			if(saldo < valor) {
				System.out.println("Saldo insuficiente!");
			} else {
				saldo -= valor;
				System.out.printf("Novo saldo: R$ %.2f", saldo);
			}
			break;
		case 3:
			System.out.println("Digite o valor do depósito: ");
			valor = sc.nextFloat();
			System.out.println("Operação - Depósito");
			saldo += valor;
			System.out.printf("Novo saldo: R$ %.2f", saldo);
			break;

		default:
			System.out.println("Operação inválida!");
			break;
		}
		
		sc.close();
		
	}

}
