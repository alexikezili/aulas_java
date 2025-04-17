package aula05;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] assentos = {{1, 0, 1, 1, 1, 1},
		                    {1, 0, 1, 1, 1, 1},
		                    {1, 0, 1, 1, 1, 1},
		                    {1, 0, 1, 1, 1, 1},
		                    {1, 0, 1, 1, 1, 1},
		                    {1, 0, 1, 1, 1, 1}
		};
		
		int reservadas = 0, livres = 0;
		
		for(var fileira : assentos) {
			for(var assento : fileira) {
				if(assento == 1) {
					reservadas++;
				} else {
					livres++;
				}
			}
		}
		
		sc.close();
		System.out.println("Assentos reservados: " + reservadas);
		System.out.println("Assentos livres: " + livres);
	}

}
