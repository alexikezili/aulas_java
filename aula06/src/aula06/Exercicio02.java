package aula06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<>();
		
		System.out.println("Insira 10 números não repetidos: ");
		for (int i = 1; i <= 10; i++) {
			System.out.printf("\nInsira o numero %d: ", i);
			numeros.add(sc.nextInt());
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
		sc.close();
	}

}
