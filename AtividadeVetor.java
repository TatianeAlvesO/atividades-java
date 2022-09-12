package Atividades;

import java.util.Scanner;

public class AtividadeVetor {

	public static void main(String[] args) {
		/* 2- Faça um programa que receba 6 números inteiros e mostre: 
              Os números pares digitados;  
              A soma dos números pares digitados; 
              Os números ímpares digitados; 
              A quantidade de números ímpares digitados.
*/
		
		int[]vetor = new int[6];
		int x,somaPar=0,contPar=0,contImpar=0;

		Scanner leia = new Scanner(System.in);


		for (x=0;x<6;x++) {
			System.out.println("\nDigite um numero inteiro: ");
			vetor[x] = leia.nextInt();
			if (vetor[x] % 2 == 0) {
				somaPar += vetor[x];
				contPar++;
			} else {
				contImpar++;
			}

		}
		
		System.out.println("\nNumeros pares digitados: ");
		for(x=0;x<6;x++) {
		if (vetor[x] % 2 == 0) {

			System.out.println(vetor[x] + " ");
		}

		}
		System.out.println("\nSoma dos numeros pares digitados: "+somaPar);
		System.out.println("\nNumeros impares digitados: ");
		for (x=0;x<6;x++) {

		if (vetor[x] % 2 != 0) {
			System.out.println(vetor[x] + " ");
		}

		}
		System.out.println("\nQuantidade de numeros impares digitados: "+contImpar);
	}
		
}
		

	


