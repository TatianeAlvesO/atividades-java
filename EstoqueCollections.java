package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueCollections {

	public static void main(String[] args) {
		/* Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo 
		   List do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
           1-Armazenar dados da List
           2-Remover dados da list;
           3-Atualizar dados da list.
           4-Apresentar todos os dados da list. */
		
		Scanner leia = new Scanner(System.in);
		int op;
		
		ArrayList<String> estoque = new ArrayList();
		
	do {
		System.out.println("\n____________________________________________________________");
		System.out.println("\n\t\tBem vindo ao estoque!");
		System.out.println("\n1 - Adicionar um novo item ao estoque");
		System.out.println("\n2 - Remover um item do estoque");
		System.out.println("\n3 - Atualizar um item do estoque");
		System.out.println("\n4 - Verificar todos os itens disponiveis no estoque");
		System.out.println("\n0 - Sair do estoque");
		System.out.println("\nDigite sua opcao: ");
		op = leia.nextInt();
		System.out.println("\n____________________________________________________________");
		
		switch (op) {
		case 1:
			leia.nextLine();
			System.out.println("\nInforme o item que sera adicionado ao estoque: ");
			String item = leia.nextLine();
			estoque.add(item);
			break;
			
		case 2:	
			leia.nextLine();
			System.out.println("\nInforme o item que sera removido do estoque: ");
			String item1 = leia.nextLine();
			if (estoque.contains(item1)) {
				estoque.remove(item1);	
			}else{
			   System.out.println("\nItem nao consta no estoque!");
			}
			break;
			
		case 3:
			leia.nextLine();
			System.out.println("\nInforme o item que sera atualizado no estoque: ");
			String consultar = leia.nextLine();
			System.out.println("\nInforme o item que substituira o "+consultar+ " : ");
			String novo = leia.nextLine();
			if (estoque.contains(consultar)) {
				estoque.remove(consultar);
				estoque.add(novo);
			}else{
				System.out.println("\nItem nao consta no estoque!");
			}
			break;
			
		case 4:
			System.out.println("\nOs itens disponiveis no estoque sao: ");
			System.out.println(estoque);
			break;
			
		case 0:
			System.out.println("\nObrigada por consultar nosso estoque!");
			break;
			default: System.out.println("\nOpcao invalida, tente novamente!");
				
			}
		}
	    while (op != 0);
		
	}
	}
