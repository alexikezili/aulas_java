package aula05;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf("Informe o número da posição [%d][%d]", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		for (var linha : matriz) {
			for (var numero : linha) {
				System.out.printf("%d ", numero);
			}
			System.out.println();
		}
		
		System.out.println("\nElementos da diagonal principal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("%d ", matriz[i][i]);
			somaPrincipal += matriz[i][i];
		}
		
		System.out.println("\n\nElementos da diagonal secundária: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("%d ", matriz[i][matriz.length - 1 - i]);
			somaSecundaria += matriz[i][matriz.length - 1 - i];
		}
		
		System.out.printf("\n\n Soma da diagonal principal: %d", somaPrincipal);
		System.out.printf("\n Soma da diagonal secundária: %d", somaSecundaria);
		
		sc.close();
	}

}
