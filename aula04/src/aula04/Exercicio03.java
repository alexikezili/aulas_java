package aula04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero, somaNumeros = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = sc.nextInt();
			if (numero > 0) {
				somaNumeros += numero;
			}
		} while (numero != 0);

		sc.close();
		System.out.printf("\nA soma dos números positivos é: %d", somaNumeros);
	}

}
