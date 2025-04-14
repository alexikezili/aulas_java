package aula02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		float salario = sc.nextFloat();
		
		System.out.println("Digite o Abono: ");
		float abono = sc.nextFloat();
		
		float novoSalario = salario + abono;
		
		System.out.printf("Novo salário: %.2f", novoSalario);
		
		sc.close();
	}

}
