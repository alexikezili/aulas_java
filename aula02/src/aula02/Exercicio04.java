package aula02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float[] numeros = new float[4];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("numero %d: ", i + 1);
			numeros[i] = sc.nextFloat();
		}
		
		float diferenca = (numeros[0] * numeros[1]) - (numeros[2] * numeros[3]);
		System.out.printf("Diferenca: %.2f", diferenca);
		
		sc.close();
	}

}
