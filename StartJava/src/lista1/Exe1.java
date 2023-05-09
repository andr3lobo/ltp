package lista1;

public class Exe1 {

	public static void main(String[] args) {
		/*letra a)*/
		
		int salario = 10000;
		System.out.println(salario);
		
		/*letra b)*/
		float salarioF = (float) salario;
		System.out.println(salarioF);
		
		/*letra c)*/
		float bonus1 = 200;
		System.out.println("Salário acrescido do bônus 1:" + (salarioF + bonus1));
		
		/* letra d) */
		float percentualBonus2 = 10;
		float bonus2 = salarioF*percentualBonus2/100;
		System.out.println("Salário acrescido do bônus 2: "+ (salarioF + bonus2));
		
		/* plus: imprimindo com duas casas decimais */
		float s = salarioF+bonus2;
		System.out.printf("Salário com bônus 2: R$ %.2f",s);

	}

}
