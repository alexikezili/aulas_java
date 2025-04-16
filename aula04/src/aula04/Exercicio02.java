package aula04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, menor21 = 0, maior50 = 0;
		
		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = sc.nextInt();
			
			if (idade < 21 && idade >= 0) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}
		}
		
		sc.close();
		
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d", menor21);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", maior50);
	}

}
