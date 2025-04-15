package aula03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		if((numero % 2) == 0) {
			if(numero >=0) {
				System.out.printf("O número %d é par e positivo", numero);
			} else {
				System.out.printf("O número %d é par e negativo", numero);
			}
		}
		
		if((numero % 2) != 0) {
			if(numero >=0) {
				System.out.printf("O número %d é ímpar e positivo", numero);
			} else {
				System.out.printf("O número %d é ímpar e negativo", numero);
			}
		}
		
		sc.close();
	}

}
