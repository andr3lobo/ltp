package lista3;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		int maior=0;
		int menor=0;
		int meio=0;
		// ler 3 inteiros
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe o número 1: ");
		//criar uma variavel maior e atribuir o primeiro numero lido
		int a = ler.nextInt();//
		//ler segundo numero
		System.out.printf("Informe o número 2: ");
		int b = ler.nextInt();//
		if (a > b) {
			maior = a;
			menor = b;
		} else {
			menor = a;
			maior = b;
		}	
		System.out.printf("Informe o número 3: ");
		int c = ler.nextInt();//
		int aux = 0;
		if (c >=maior) {//comparação 3º número com maior
			aux = maior;
			maior = c;
			meio = aux;
		} else {
			if (c <=menor) {//comparação 3º úmero com menor
				aux = menor;
				menor=c;
				meio = aux;
			} else {
				meio = c;
			}
		}
		System.out.println("O maior número é: "+maior+
				"\nO número do meio é: "+meio+ "\nO menor número é: "+menor);
	}
}