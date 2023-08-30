package lista7;

public class Gerente extends Funcionario{
	
	private String setor;
	
	public Gerente(String nome, String cpf, double salario, String setor) {
		super(nome, cpf, salario);
		this.setor = setor;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString()+"\n"+
				"Gerente do Setor: "+ this.setor;
	}
	
	@Override
	public double getBonificacao() {
		return getSalario() * 0.25;
	}
}
