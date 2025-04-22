package aula06;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.printf("\nDigite a cor número %d: ", i);
			cores.add(sc.next());
		}
		
		System.out.println("\nListar todas as cores: ");
		cores.forEach(System.out::println);
		
		cores.sort(null);
		System.out.println("\nOrdenar as cores: ");
		cores.forEach(System.out::println);
		
		sc.close();
	}

}
