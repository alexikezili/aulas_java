package aula05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = {2, 5, 1 ,3, 4, 9, 7, 8, 10, 6};
		int numero;
		boolean encontrado = false;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = sc.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			if (numero == vetor[i]) {
				System.out.printf("O número %d está localizado na posição: %d", numero, i);
				encontrado = true;
			}
		}
		
		if (encontrado == false) {
			System.out.printf("O número %d não foi encontrado!", numero);
		}
		
		sc.close();
	}

}
