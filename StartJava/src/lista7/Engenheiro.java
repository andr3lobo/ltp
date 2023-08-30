package lista7;

public class Engenheiro extends Funcionario {
	
	private String crea;
	
	public Engenheiro(String nome, String cpf, double salario, String numeroCrea) {
		super(nome, cpf, salario);
		this.crea = numeroCrea;
	}
	
	@Override
	public String toString() {
		return super.toString() +"\n"+
				"CREA: "+this.crea;
	}
	
	@Override
	public double getBonificacao() {
		return getSalario() * 0.15;
	}
}