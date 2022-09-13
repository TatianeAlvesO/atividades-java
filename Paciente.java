package POO;

public class Paciente {
	
	/* 7) Crie uma classe paciente e apresente os atributos e métodos referentes esta classe,
	    em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as
	    informações deste objeto no console.  */
	
	private String nomeDoPaciente;
	private int idade;
	private String endereco;
	private int telefone;
	private String planoDeSaude;
	
	public Paciente(String nomeDoPaciente,int idade,String endereco,int telefone,String planoDeSaude) {
		
		this.nomeDoPaciente = nomeDoPaciente;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.planoDeSaude = planoDeSaude;
		
	}

	public String getNomeDoPaciente() {
		return nomeDoPaciente;
	}

	public void setNomeDoPaciente(String nomeDoPaciente) {
		this.nomeDoPaciente = nomeDoPaciente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getPlanoDeSaude() {
		return planoDeSaude;
	}

	public void setPlanoDeSaude(String planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
	
	public void imprimirInfo() {
		System.out.println(nomeDoPaciente+" tem "+idade+" anos, e residente da "+endereco+", pode ser contatado(a) atraves do numero "+telefone+" e possui o plano de saude: "+planoDeSaude);
	
	
	}
}
