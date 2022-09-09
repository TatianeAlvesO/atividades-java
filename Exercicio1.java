package Atividades;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/* 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5. (FOR) */
		
		float Num;
		
		Scanner leia = new Scanner(System.in);
		
		for(Num=1000;Num<=1999;Num++) {
			if(Num%11==5) {
		System.out.println("\nOs numeros entre 1000 e 1999 que divididor por 11 obtemos o resto=5 sao: "+Num);
				
			}
		}

	}

}
