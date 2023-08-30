package lista6;

public class Professor extends Pessoa{
	
	public Professor(String n, String cpf, int idade) {
		super(n, cpf, idade);
	}
	
	@Override
	public void papelReuniaoIFMT() {
		System.out.println("Modo de Participação: Organizador\n");
	}
}
