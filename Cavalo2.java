package POOPolimorfismo;

public class Cavalo2 extends Animal2 {

	
private String correr;
	
	public Cavalo2(String nome,int idade,String emiteSom,String correr) {
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
	
	@Override
	public void comunica (int som) {
		for(int x=0;x<som;x++) {
			System.out.println("\nIhhhh Ihhhh Ihh");
		}
	}
	
	@Override
	public void seMove (String velocidade) {
		System.out.println("\nO cavalo corre "+velocidade+" durante as competicoes!");
	}

	
	}
	
