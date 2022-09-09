package Atividades;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* 4- Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		  o número de pessoas calmas;
		  o número de mulheres nervosas;
		  o número de homens agressivos;
		  o número de outros calmos;
		  o número de pessoas nervosas com mais de 40 anos;
		  o número de pessoas calmas com menos de 18 anos. */
				

				int idade,genero,fp,contpc=0,contmn=0,contha=0,contndc=0,contpn40=0,contpc18=0,pessoas=1;
			    
				Scanner leia = new Scanner(System.in);
				
				while(pessoas<=6) {
					System.out.println("\nEntre com a sua idade: ");
					idade = leia.nextInt();
					System.out.println("\nEntre com o genero: \n(1)Feminino\n(2)Masculino\n(3)Não declarado ");
					genero = leia.nextInt();
					System.out.println("\nEntre com o seu fator pscicologico:\n(1)Calmo\n(2)Nervoso\n(3)Agressivo ");
					fp = leia.nextInt();
					
					if(fp == 1) {
						contpc++;
					}
					
					if(genero == 1 && fp == 2) {
					    contmn++;
				}
					if(genero == 2 && fp == 3) {
		                 contha++;
			}
					if(genero == 3 && fp == 1) {
		                  contndc++;
		}
					if(fp == 2 && idade > 40) {
						 contpn40++;
					}
					if(fp == 1 && idade < 18) {
						contpc18++;
					}
					
					pessoas++;
					
				}
					System.out.println("\nNumero de pessoas calmas: "+contpc);
					System.out.println("\nNumero de mulheres nervosas: "+contmn);
					System.out.println("\nNumero de homens agressivos: "+contha);
					System.out.println("\nNumero de pessoas nao declaradas calmas: "+contndc);
					System.out.println("\nNumero de pessoas nervosas com mais de 40 anos: "+contpn40);
					System.out.println("\nNumero de pessoas calmas com menos de 18 anos: "+contpc18);
		  
		  
		  
		  
		  
		  
     
	}

}
