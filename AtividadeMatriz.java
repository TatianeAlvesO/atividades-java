package Atividades;

import java.util.Scanner;

public class AtividadeMatriz {

	public static void main(String[] args) {
		// 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		Scanner leia = new Scanner(System.in);
		
		float[][] matriz = new float[3][3];
		int linha,coluna,cont10=0;
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.printf("\nDigite o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna] = leia.nextFloat();

			}
		}
		
		System.out.println("\nOs elementos da matriz maiores que 10 sao: ");
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				if(matriz[linha][coluna]>10) {
					cont10++;	
				System.out.println(matriz[linha][coluna]);

			}
			}
		}
		
		System.out.println("\nA quantidade de numeros maior que 10 e de: "+cont10);	
		

	}

}
