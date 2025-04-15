package aula03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double valorTotal = 0f;
		
		System.out.println("*******************************");
		System.out.println("       CARDÁPIO JAVA 82");
		System.out.println("*******************************\n");
		System.out.println("1 - Cachorro quente - R$ 10,00");
		System.out.println("2 - X-Salada        - R$ 15,00");
		System.out.println("3 - X-Bacon         - R$ 18,00");
		System.out.println("4 - Bauru           - R$ 12,00");
		System.out.println("5 - Refrigerante    - R$  8,00");
		System.out.println("6 - Suco de laranja - R$ 13,00");
		System.out.println("\nEscolha seu produto: (Digite o número do produto desejado) ");
		int escolha = sc.nextInt();
		
		System.out.println("Digite a quantidade desejada: ");
		int quantidade = sc.nextInt();
		
		switch (escolha) {
		case 1: {
			System.out.println("Produto: Cachorro quente");
			valorTotal = quantidade * 10;
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		}
		case 2: {
			System.out.println("Produto: X-Salada");
			valorTotal = quantidade * 15;
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		}
		case 3: {
			System.out.println("Produto: X-Bacon");
			valorTotal = quantidade * 18;
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		}
		case 4: {
			System.out.println("Produto: Bauru ");
			valorTotal = quantidade * 12;
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		}
		case 5: {
			System.out.println("Produto: Refrigerante");
			valorTotal = quantidade * 8;
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		}
		case 6: {
			System.out.println("Produto: Suco de laranja");
			valorTotal = quantidade * 13;
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		}
		default:
			System.out.println("Opção inválida");
			sc.close();
			return;
		}
		
		sc.close();
		
	}

}
