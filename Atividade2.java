package Atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		// 2- Faça um programa que entre com três números e coloque em ordem crescente.
		
		int x,y,z;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro numero: ");
		x = leia.nextInt();
		System.out.println("\nEntre com o segundo numero: ");
		y = leia.nextInt();
		System.out.println("\nEntre com o terceiro numero: ");
		z = leia.nextInt();    
	    
		if(x<=y && y<=z) {
			System.out.println("\nOrdem crescente: "+x+" , "+y+" e "+z);
		}else if(x<=z && z<=y) {
			System.out.println("\nOrdem crescente: "+x+" , "+z+" e "+y);
		}else if(y<=x && x<=z) {
			System.out.println("\nOrdem crescente: "+y+" , "+x+" e "+z);
		}else if(y<=z && z<=x) {
			System.out.println("\nOrdem crescente: "+y+" , "+z+" e "+x);
		}else if(z<=x && x<=z) {
			System.out.println("\nOrdem crescente: "+z+" , "+x+" e "+y);
		}else{
			System.out.println("\nOrdem crescente: "+z+" , "+y+" e "+x);
		}
	}

}
