package aula07;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio02 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<>();
		
		int opcao;
		
		do {
			System.out.println("*****************************************************\n");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("\n*****************************************************");
			System.out.println("Entre com a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 0:
				System.out.println("Programa Finalizado!");
				break;
				
			case 1:
				System.out.println("Digite o nome: ");
				pilha.push(sc.nextLine());
				System.out.println("\nPilha: \n");
				Iterator<String> iPilha = pilha.iterator();
				while (iPilha.hasNext()) {
					System.out.println(iPilha.next());
				}
				System.out.println("\nLivro adicionado!\n");
				break;
				
			case 2:
				System.out.println("Lista de Livros na Pilha: \n");
				Iterator<String> iPilha1 = pilha.iterator();
				while (iPilha1.hasNext()) {
					System.out.println(iPilha1.next());
				}
				System.out.println();
				break;

			case 3: 
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!\n");
				} else {
					pilha.pop();
					System.out.println("\nPilha: \n");
					Iterator<String> iPilha2 = pilha.iterator();
					while (iPilha2.hasNext()) {
						System.out.println(iPilha2.next());
					}
					System.out.println("\nUm Livro foi retirado do pilha!");
				}
				break;
				
			default:
				System.out.println("Insira uma opção válida!");
				break;
			}
		} while (opcao != 0 );
		
		sc.close();

	}

}
