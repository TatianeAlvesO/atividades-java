package Atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
    // 1- Faça um programa que receba três inteiros e diga qual deles é o maior.  ok 
		
	int N1,N2,N3;
	
	Scanner leia = new Scanner(System.in);
	
    System.out.println("\nEscreva o primeiro numero: ");
    N1 = leia.nextInt();
    System.out.println("\nEscreva o segundo numero: ");
    N2 = leia.nextInt();
    System.out.println("\nEscreva o terceiro numero: ");
    N3 = leia.nextInt();
	
    if(N1>=N2 && N1>=N3){
    System.out.println("\nO maior numero e: "+N1);
    }else if (N2>=N1 && N2>=N3) {
    		System.out.println("\nO maior numero e: "+N2);	
    }else{
    	 System.out.println("\nO maior numero e: "+N3);	
    	 
    	}
    }

	}


