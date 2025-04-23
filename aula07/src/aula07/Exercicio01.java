package aula07;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<>();
		
		int opcao;
		
		do {
			System.out.println("*****************************************************\n");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
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
				fila.add(sc.nextLine());
				System.out.println("\nFila: ");
				Iterator<String> iFila = fila.iterator();
				while (iFila.hasNext()) {
					System.out.println(iFila.next());
				}
				System.out.println("\nCliente Adicionado!\n");
				break;
				
			case 2:
				System.out.println("Lista de Clientes na Fila: \n");
				Iterator<String> iFila1 = fila.iterator();
				while (iFila1.hasNext()) {
					System.out.println(iFila1.next());
				}
				break;

			case 3: 
				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!\n");
				} else {
					fila.poll();
					System.out.println("\nFila: ");
					Iterator<String> iFila2 = fila.iterator();
					while (iFila2.hasNext()) {
						System.out.println(iFila2.next());
					}
					System.out.println("\nO Cliente foi Chamado!");
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
