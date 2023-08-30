package av2;

public class AppContaBanco {

	public static void main(String[] args) {
		
		
		Conta c1 = new Conta(7654,"Professor Querido",12000);
		
		Conta c2 = new Conta(7994,"Estudante A",45000);
		
		c1.setLimite(20000);
		c1.setBanco("XP Investimentos");
		c1.setLimite(5000);
		
		c1.setNumero(999999);
		System.out.println(c1.getNumero());
		
		double valorTotal = c1.getSaldo();
		
		valorTotal = c1.getSaldo() + c1.getLimite();
		System.out.println("O valor total que pode ser gasto é: ");
		System.out.println(valorTotal);
		
	}
}