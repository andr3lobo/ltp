package poo.contaBancaria;

public class ContaPoupanca extends Conta {
	
	public void rendimentoMensal() {
		double saldo = getSaldo();
		saldo = saldo + (saldo * 0.01);
		setSaldo(saldo);
		
		System.out.println("Rendimento Ok!");
	}
}
