package POOHeranca;

public class Preguica extends Animal {

	private String sobeArvore;
	
	public Preguica(String nome,int idade,String emiteSom,String sobeArvore) {
		super(nome,idade,emiteSom);
		this.sobeArvore = sobeArvore;
	}

	public String getSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(String sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome da preguica: "+getNome()+"\nIdade da preguica: "+getIdade()+"\nSom que a preguica emite: "+getEmiteSom()+"\nComo a preguica se locomove: "+sobeArvore);
	
}
}