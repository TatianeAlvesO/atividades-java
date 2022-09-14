package POOHeranca;

public class Animal {

	/* 1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal: Cachorro, Cavalo, Preguiça*/
	
	private String nome;
	private int idade;
	private String emiteSom;
	
	public Animal(String nome,int idade,String emiteSom) {
		
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
	
	}
	
    

