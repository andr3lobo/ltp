package lista6;

public class Estudante extends Pessoa {
	
	public Estudante(String n, String cpf, int idade) {
		super(n,cpf,idade);
	}
	
	@Override
	public void papelReuniaoIFMT() {
		System.out.println("Modo de Participação: Convidado\n");
	}	
}