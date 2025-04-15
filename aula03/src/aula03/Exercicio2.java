package aula03;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua idade");
		int idade = sc.nextInt();
		
		System.out.println("Primeira vez doando sangue? (s/n)");
		char primeiraVez = sc.next().charAt(0);
		
		if(idade > 17 && idade < 60) {
			System.out.printf("%s está apto/a para doar sangue!", nome);
		} else if(idade > 59 && idade < 70 && primeiraVez == 'n') {
			System.out.printf("%s está apto/a para doar sangue!", nome);
		} else {
			System.out.printf("%s não está apto/a para doar sangue!", nome);
		}
		
		sc.close();
	}

}
