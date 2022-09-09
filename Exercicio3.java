package Atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		/* 5- Crie um programa que leia um número do teclado até que encontre um número
		      igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE) */

		Scanner leia = new Scanner(System.in);

		int Num, somaNum = 0;

		do {
			System.out.println("\nDigite um numero: ");
			Num = leia.nextInt();
			somaNum = Num + somaNum;
		}

		while (Num != 0);
		{
           System.out.println("\nA soma dos numeros e de: "+somaNum);
		}

	}

}
