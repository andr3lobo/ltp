package poo.contaBancaria;

public class AppContaBanco {

	public static void main(String[] args) {
		
//		Conta c1 = new Conta();
//		c1.setNomeTitular("Felipe Ferraz");
//		c1.setSaldo(1000);
//		c1.setNumero(1239809);
//		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setNomeTitular("Júlia K");
		cp.setSaldo(1000);
		cp.setNumero(12309883);
		
		
		System.out.println("Saldo: "+cp.getSaldo());
		
		cp.rendimentoMensal();
		cp.depositar(500);
		
		System.out.println("Saldo: "+cp.getSaldo());
		
		
		
		
//		System.out.println("Saldo: "+c1.getSaldo());
//		c1.sacar(100);
//		System.out.println("Saldo: "+c1.getSaldo());
//		
//		c1.depositar(200);
//		System.out.println("Saldo: "+c1.getSaldo());	
	}

}
