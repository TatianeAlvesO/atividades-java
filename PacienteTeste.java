package POO;

public class PacienteTeste {

	public static void main(String[] args) {
		/* 7) Crie uma classe paciente e apresente os atributos e métodos referentes esta classe,
	    em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as
	    informações deste objeto no console.  */
		
		
		Paciente paci1 = new Paciente("Mariana Dias",25,"Rua 458",1123456789,"Nova Vida");
		Paciente paci2 = new Paciente("Ruan Almeida",32,"Avenida 8009",113652147,"Saude +");
		Paciente paci3 = new Paciente("Ygor Alves",18,"Rua das Laranjeiras",118954716,"Convenio Plus");
		
		paci1.imprimirInfo();
		System.out.println("***Novo endereco***");
		paci1.setEndereco("Rua das Oliveiras, 14");
		paci1.imprimirInfo();
		
		
		paci2.imprimirInfo();
		System.out.println("***Novo plano de saude***");
		paci2.setPlanoDeSaude("Viva Health");
		paci2.imprimirInfo();
		
		paci3.setNomeDoPaciente("Igor Alves");
		paci3.imprimirInfo();
		
	}

}
