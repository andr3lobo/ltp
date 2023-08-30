package lista7;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario(String n, String c, double s) {
		this.nome = n;
		this.cpf = c;
		this.salario = s;
	}
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	@Override
	public String toString() {
		return "\n"+
				"Nome: "+this.nome+"\n"+
				"CPF: "+this.cpf+"\n"+
				"Salário: "+this.salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}