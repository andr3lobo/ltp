package poo.contaBancaria.b;

public class ContaPoupanca extends Conta {
	
	public void rendimentoMensal() {
		double rend = getSaldo() * 0.02;
		depositar(rend);
	}
}
