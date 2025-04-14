package aula02;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double numero2 = sc.nextDouble();
		
		System.out.printf("\n%.2f + %.2f = %.2f", numero1, numero2, (numero1 + numero2));
		System.out.printf("\n%.2f - %.2f = %.2f", numero1, numero2, (numero1 - numero2));
		System.out.printf("\n%.2f x %.2f = %.2f", numero1, numero2, (numero1 * numero2));
		System.out.printf("\n%.2f / %.2f = %.2f", numero1, numero2, (numero1 / numero2));
		System.out.printf("\n%.2f ^ %.2f = %.2f", numero1, numero2, Math.pow(numero1, numero2));
		System.out.printf("\n%.2f Raiz 2 = %.2f", numero1, numero2, Math.sqrt(numero1));
	}

}
