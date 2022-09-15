package POOPolimorfismo;

public abstract class Animal2 {

	/* Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque o 
	 * método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal. */
	
	private String nome;
	private int idade;
	private String emiteSom;
	
	
	abstract public void seMove (String velocidade);
	
	public Animal2(String nome,int idade,String emiteSom) {
		
		this.nome = nome;
		this.idade = idade;
        this.emiteSom = emiteSom;
	}

	
    public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEmiteSom() {
		return emiteSom;
	}


	public void setEmiteSom(String emiteSom) {
		this.emiteSom = emiteSom;
	}


	public void imprimir() {
    	System.out.println("\nNome do animal: "+nome+"\nIdade do animal: "+idade);
    }

	public void comunica(String string) {
		 
		
	}

	public void comunica(int som) {
		// TODO Auto-generated method stub
		
	}

	
	}