package poo.contaBancaria.b;

public class Conta {
	private int numero;
	private String nomeTitular;
	private double saldo;
	
	public Conta() {
	}
	
	public Conta(String n, double v, int id) {
		this.nomeTitular = n;		
		this.numero = id;
		this.saldo = v;
	}
	
	public void sacar(double valorSaque) {
		if (valorSaque <= this.saldo) {
			this.saldo = this.saldo - valorSaque;
			System.out.println("Saque de R$ "+
			valorSaque+" realizado com sucesso!");
		}
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Depósito de R$ "+
		valor+" realizado com sucesso!");
	}
	
	public void transferir(Conta co, Conta de, double v) {
		co.sacar(v); //debitar da conta origem - co
		de.depositar(v);  //creditar na conta destino - de
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