package poo.contaBancaria;

public class Conta {
	
	private int numero;
	private String nomeTitular;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta (String nome, double valor) {
		this.nomeTitular = nome;
		this.saldo = valor;
	}
	
	public void sacar(double valor) {
		
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque de R$ "
			+valor+" autorizado!");
		}
	}
	
	public void depositar (double v) {
		this.saldo = this.saldo + v;
//		this.saldo+=v;
	}
	
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
