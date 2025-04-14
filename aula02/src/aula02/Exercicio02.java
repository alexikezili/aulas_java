package aula02;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totalNotas = 4;
		double[] notas = new double[totalNotas];
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Nota %d: ", i + 1);
			notas[i] = sc.nextDouble();
			soma += notas[i];
		}
		
		double media = soma / totalNotas;
		System.out.printf("Media final: %.1f", media);
		
		sc.close();
	}
}
