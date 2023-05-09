package lista2;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		// porcentagem do IPI
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o IPI da peça 1: ");
		double ipi =ler.nextDouble();
		
		//código da peça 1
		System.out.println("Digite o código da peça 1: ");
		String codigo1 = ler.next();
		
		//valor unitário da peça 1
		System.out.println("Digite o valor unitário da peça 1: ");
		double valor1 = ler.nextDouble();
		
		// qtde de unidades da peça 1
		System.out.println("Digite a quantidade de unidades "
				+ "de peças 1: ");
		double qtde1 = ler.nextDouble();
		
		//código da peça 2
		System.out.println("Digite o código da peça 2: ");
		String codigo2 = ler.next();
		
		//valor unitário da peça 2
		System.out.println("Digite o valor unitário da peça 2: ");
		double valor2 = ler.nextDouble();
		
		// qtde de unidades da peça 2
		System.out.println("Digite a quantidade de unidades "
				+ "de peças 2: ");
		double qtde2 = ler.nextDouble();	
		
		//valortotal = (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
		double valorTotal = (valor1*qtde1 + valor2*qtde2)*(ipi/100+1);
		System.out.println();
		
	}

}
