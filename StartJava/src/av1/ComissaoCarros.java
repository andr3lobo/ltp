package av1;

import java.util.Scanner;

public class ComissaoCarros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double percCompacto = 0.0003;
		double percMedio = 0.05/100;
		double percGrande = 0.07/100;
		
		System.out.println("Digite o nome do vendedor: ");
		String nome = ler.next();
		
		System.out.println("Digite a quantidade de carros compactos vendidos: ");
		int qtdCompacto = ler.nextInt();
		System.out.println("Digite o valor de um carro compacto: ");
		double valorCompacto = ler.nextDouble();
		
		System.out.println("Digite a quantidade de carros médios vendidos: ");
		int qtdMedio = ler.nextInt();
		System.out.println("Digite o valor de um carro médio: ");
		double valorMedio = ler.nextDouble();
		
		System.out.println("Digite a quantidade de carros grandes vendidos: ");
		int qtdGrande = ler.nextInt();
		System.out.println("Digite o valor de um carro Grande: ");
		double valorGrande = ler.nextDouble();
		
		double comissao = qtdCompacto*valorCompacto*percCompacto + qtdMedio*valorMedio*percMedio+ qtdGrande*valorGrande*percGrande;
		
		System.out.println("A comissão do vendedor "+ nome + "é: "+ comissao);
		
		

	}

}
