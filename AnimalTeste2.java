package POOPolimorfismo;

import java.util.Scanner;

public class AnimalTeste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner leia = new Scanner (System.in);
		
		Cachorro2 cachorro = new Cachorro2("Thor",4,"latido","correndo");
		Cavalo2 cavalo = new Cavalo2("Flash",2,"relincha","correndo");
		Preguica2 preguica = new Preguica2("Jurema",1,"balidos","subindo em arvores");
		
		Animal2 animal = null;
		
		System.out.println("\nGostaria de saber mais sobre nossos animais? ");
		cachorro.imprimirInfo();
		cavalo.imprimirInfo();
		preguica.imprimirInfo();
		
		
		System.out.println("\nCenheca nossos animais:");
		System.out.println("\n1 - Cachorro");
		System.out.println("\n2 - Cavalo");
		System.out.println("\n3 - Preguica");
		System.out.println("\nQual o seu animal favorito?");
		int n = leia.nextInt();
		

		switch(n) {
		case 1: animal = cachorro;
		break;
		case 2: animal = cavalo;
		break;
		case 3: animal= preguica;
		break;
		default:System.out.println("\nQue pena, nao encontramos esse animal :(");
		}
		
		
		int i = (int) (Math.random()*3.0);
		
		if(animal != null) {
			
			animal.comunica(i);
			animal.seMove("a certa velocidade");
		}
		 


	}

}
