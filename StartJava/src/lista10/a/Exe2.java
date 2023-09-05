package lista10.a;

import java.util.Scanner;

public class Exe2 {
	
	public static void main(String[] args) {
		
		//vetor com 15 elementos
		int [] A = new int [15];
		preencheA(A);
		int [] B = new int[15];
		quadradoDeA(A,B);
		
	}

	public static void quadradoDeA(int[] a, int[] b) {
		System.out.println("\n");
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i]*a[i];
			System.out.print(b[i]+ " ");
		}
		
	}

	public static void preencheA(int[] a) {
		
		Scanner ler = new Scanner(System.in);
		int c = 0;
		while(c<15) {
			System.out.println("Digite o número para a posição "+c+ " de A: ");
			a[c] = ler.nextInt();
			c+=1;
		}
		
//		for (int i = 0; i < a.length; i++) {
//			a[i] = i;
//			System.out.print(a[i]+ " ");
//		}
		
	}

}