package Atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		/* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
		 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
     
    int N;
    double R;
    
    Scanner leia = new Scanner(System.in);
    
    System.out.println("\nEntre com um numero: ");
    N = leia.nextInt();
    
    if(N % 2 == 0) {
    	R = Math.sqrt(N);
    }else {
    	R = Math.pow(N, 2);
    	
    }
		System.out.println("\nResultado: "+R);
		
	}

}
