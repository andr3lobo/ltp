package poo.contaBancaria;

public class AppContaBanco {
	

	public static void main(String[] args) {
		
		Conta cLeandra = new Conta("Leandra", 10000);
		cLeandra.setNumero(1234);
		
		System.out.println("Nome Titular: " + cLeandra.getNomeTitular()+
				" Valor: "+cLeandra.getSaldo());
		
		
		ContaPoupanca contaMariana = new ContaPoupanca();
		contaMariana.setNomeTitular("Mariana");
		contaMariana.setNumero(3456);
		contaMariana.depositar(2000);
		
		System.out.println("Nome Titular: " + contaMariana.getNomeTitular()+
				" Valor: "+contaMariana.getSaldo());
		
		//Leandra vai pagar a Mariana - transferência
		
		cLeandra.transferir(cLeandra, contaMariana, 1000);
		System.out.println("Após a transferência ...");
		
		System.out.println("Nome Titular: " + cLeandra.getNomeTitular()+
				" Valor: "+cLeandra.getSaldo());
		
		System.out.println("Nome Titular: " + contaMariana.getNomeTitular()+
				" Valor: "+contaMariana.getSaldo());
		
		contaMariana.rendimentoMensal();
		System.out.println("Nome Titular: " + contaMariana.getNomeTitular()+
				" Valor: "+contaMariana.getSaldo());
		
		
		
		
	}

}
