package av2;

public class Conta {
	
	private int numero;
	private String banco;
	private String nome;
	private double saldo;
	private double limite;
	
	//construtor sem parâmetro
	public Conta() {}
	
	//construtor com parâmetro
	public Conta(int id, String n, double s) {
		this.numero = id;
		this.nome = n;
		this.saldo = s;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double l) {
		this.limite = l;
	}

	
	
}
