package aula04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int par = 0, impar = 0, numero;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("\nDigite o %d numero: ", i);
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				par ++;
			} else {
				impar ++;
			}
		}
		
		sc.close();
		
		System.out.printf("\nTotal de números pares: %d", par);
		System.out.printf("\nTotal de números ímpares: %d", impar);
	}

}
