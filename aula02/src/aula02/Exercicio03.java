package aula02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salario bruto: ");
		float salarioBruto = sc.nextFloat();
		
		System.out.println("Adicional noturno: ");
		float adicionalNoturno = sc.nextFloat();
		
		System.out.println("Horas extras: ");
		float horasExtras = sc.nextFloat();
		
		System.out.println("Descontos: ");
		float descontos = sc.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("Salario liquido: %.2f", salarioLiquido);
		
		sc.close();
	}

}
