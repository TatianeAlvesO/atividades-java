package POOHeranca;

public class Cavalo extends Animal {

	
	private String correr;
	
	public Cavalo (String nome,int idade,String emiteSom,String correr) {
		super(nome,idade,emiteSom);
		this.correr = correr;
		
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void imprimirInfo() {
		System.out.println("\nNome do cavalo: "+getNome()+"\nIdade do cavalo: "+getIdade()+"\nSom que o cavalo emite: "+getEmiteSom()+"\nComo o cavalo se locomove: "+correr);
}
}