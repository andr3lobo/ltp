package lista3;

import java.util.Scanner;

public class Exe1DanielNeves {

	public static void main(String[] args) {
		
		//VAR
		
		int maior = 0;
		int meio = 0; 
		int menor = 0; 
		
		//LER
		
		Scanner ler = new Scanner (System.in);
		System.out.println("digite um número inteiro: ");
		int a = ler.nextInt();
		
		System.out.println("digite outro número inteiro: ");
		int b = ler.nextInt();
		
		System.out.println("digite outro número inteiro: ");
		int c = ler.nextInt();
		
		//IF(a)
			
			if (a>b && a>c) {
				maior = a;
				if (b>c) {
					meio = b;
					menor = c;
					
				} else {
					meio = c;
					menor = b;
				}
			}
			
			//IF(b)
			
			if (b>a && b>c) {
				maior = b;
				if (a>c) {
					meio = a;
					menor = c;
					
				} else {
					meio = c;
					menor = a;
				}
			}
			
			//IF(c)
			
			if (c>a && c>b) {
				maior = c;
				if (a>b) {
					meio = a;
					menor = b;
					
				} else {
					meio = b;
					menor = a;
				}
			}
		
	
		

//		
//		System.out.printf("A sequencia crescente é Maior: %d Meio: %d Menor: %d /n", maior,menor,meio);
//		
//		System.out.println("A sequencia crescente é \nMaior: "+ maior+"\nMeio: "+meio+"\nMenor: "+menor);
		
		System.out.printf("o maior número é: %d \n",maior);	
		System.out.printf("o número do meio é: %d \n",meio);
		System.out.printf("o menor número é: %d \n",menor);
		
	
	}
}