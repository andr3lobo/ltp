package poo.contaBancaria.b;

public class AppBanco {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("André Lôbo", 400,12376);
//		c1.sacar(100);
//		System.out.println("Saldo atual " + c1.getSaldo());
//		c1.depositar(500.0);
//		System.out.println("Saldo atual " + c1.getSaldo());
		
//		
//		Conta c2 = new Conta("Juarez", 0, 12354);
//		
//		c1.transferir(c1, c2, 200);
//		System.out.println("Titular : "+ c1.getNomeTitular()+ 
//				" Saldo atual " + c1.getSaldo());
//		
//		System.out.println("Titular : "+ c2.getNomeTitular()+ 
//				" Saldo atual " + c2.getSaldo());
		
		Conta contaP = c1;
		contaP.setNomeTitular("André Lôbo");
		contaP.setNumero(12376);
		contaP.setSaldo(400);
		
		System.out.println("Titular : "+ c1.getNomeTitular()+ 
				" Saldo atual " + c1.getSaldo());
		
//		contaP.rendimentoMensal();
		
		if (c1.equals(contaP)) {
			System.out.println("São iguais");
		} else {
			System.out.println("Não são iguais! ");
		}
		
		System.out.println("Titular : "+ contaP.getNomeTitular()+ 
				" Saldo atual " + contaP.getSaldo());
		
	}

}
