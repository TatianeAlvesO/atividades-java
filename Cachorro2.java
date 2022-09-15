package POOPolimorfismo;

public class Cachorro2 extends Animal2 {
	
private String correr;
	
	public Cachorro2 (String nome,int idade,String emiteSom,String correr) {
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
		System.out.println("\nNome do cachorro: "+getNome()+"\nIdade do cachorro: "+getIdade()+"\nSom que o cachorro emite: "+getEmiteSom()+"\nComo o cachorro se locomove: "+correr);
	}
	
	@Override
	public void comunica (int som) {
		for(int x=0;x<som;x++) {
			System.out.println("\nAu Auu Auuuu");
		}
	}
	
	@Override
	public void seMove (String velocidade) {
		System.out.println("\nO cachorro corre "+velocidade+" quando vai ao parque!");
	}
	
}