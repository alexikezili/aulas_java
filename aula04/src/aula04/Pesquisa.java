package aula04;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int idade, totalIdade = 0, totalResposta = 0, esporte, futebol = 0, voleiM18 = 0, basqueteMn18 = 0;
		double media = 0f;
		String continua = "S";
		
		while (continua.equalsIgnoreCase("S")) {
			
			System.out.println("Digite sua idade: ");
			idade = sc.nextInt();
			
			System.out.println("Digite seu esporte favotiro: (1 - Fut / 2 - Vol / 3 - Basq / 4 - Outros)");
			esporte = sc.nextInt();
			sc.nextLine();
			
			if(esporte == 1) {
				futebol++;
			}
			
			if(esporte == 2 && idade > 17) {
				voleiM18++;
			}
			
			if(esporte == 3 && idade < 18) {
				basqueteMn18++;
			}
			
			totalResposta++;
			totalIdade += idade;
			
			System.out.println("Deseja continuar? (S/N)");
			continua = sc.nextLine().toUpperCase();
			
		}
		
		media = Math.round(totalIdade / totalResposta);
		System.out.printf("\nTotal de pessoas que gostam de futebol: %d", futebol);
		System.out.printf("\nTotal de pessoas que gostam de volei e são maiores de idade: %d", voleiM18);
		System.out.printf("\nTotal de pessoas que gostam de basquete e são menores de idade: %d", basqueteMn18);
		System.out.printf("\nMédia de idade: %.1f", media );
		
		sc.close();
	}

}
