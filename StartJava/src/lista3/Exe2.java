package lista3;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a média para aprovação: ");
		double mediaAP = ler.nextDouble();
		System.out.println("Digite a nota do 1ºBim: ");
		double n1 = ler.nextDouble();
		System.out.println("Digite a nota do 2ºBim: ");
		double n2 = ler.nextDouble();
		System.out.println("Digite a nota do 3ºBim: ");
		double n3 = ler.nextDouble();
		System.out.println("Digite a nota do 4ºBim: ");
		double n4 = ler.nextDouble();
		double notaFinal = (n1+n2+n3+n4)/4;
		
		if(notaFinal>=mediaAP) {
			System.out.println("Estudante Aprovado!");
		} else {
			System.out.println("Estudante Reprovado!");
		}
	}

}
