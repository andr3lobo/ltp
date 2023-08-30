package lista7;

public class EmpresaApp {

	public static void main(String[] args) {
		
		
		RH rh = new RH();
		
		//funcionario comum 10%
		Funcionario f1 = 
				new Funcionario("Joao Silva", "067.782.998-87", 7000);
//		System.out.println(f1.toString());
		System.out.println("Bonificação: "+f1.getBonificacao());
		rh.addFuncionario(f1);
		
		// engenheiro 15%
		Funcionario e1 = 
				new Engenheiro("Assis", "089.156.578-98", 12000, "45623");
//		System.out.println(e1.toString());
		System.out.println("Bonificação: "+e1.getBonificacao());
		rh.addFuncionario(e1);

		//gerente 25%
		Funcionario g1 =
				new Gerente("Oliveira", "989.923.156-67", 20000, "Administrativo");
		
//		System.out.println(g1.toString());
		System.out.println("Bonificação: "+g1.getBonificacao());
		rh.addFuncionario(g1);
		
		System.out.println("Qtde Funcionário: "+rh.getQtdFuncionario());
		
		
		
		
		
	}
}
