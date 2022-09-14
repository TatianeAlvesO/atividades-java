package POOHeranca;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro cach = new Cachorro("Thor",4,"latido","correndo");
		Cachorro cach2 = new Cachorro("Lili",5,"latido","correndo");
		Cavalo cav = new Cavalo("Jujuba",9,"relincha","correndo");
		Cavalo cav2 = new Cavalo("Flash",2,"relincha","correndo");
		Preguica preg = new Preguica("Ravi",7,"balidos","subindo em arvores");
		Preguica preg2 = new Preguica("Jurema",1,"balidos","subindo em arvores");
		
		cach.imprimirInfo();
		cach2.imprimirInfo();
		cav.imprimirInfo();
		cav2.imprimirInfo();
		preg.imprimirInfo();
		preg2.imprimirInfo();

	}

}
