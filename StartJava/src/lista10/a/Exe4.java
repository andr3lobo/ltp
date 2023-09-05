package lista10.a;

import java.util.ArrayList;

public class Exe4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		preencheArrayList(numeros);
		int qtdPares = totalPares(numeros);
		mostraResultado(qtdPares);
		
		for (Integer integer : numeros) {
			System.out.print(integer+" ");
		}

	}
	
	private static void preencheArrayList(ArrayList<Integer> numeros) {
		numeros.add(2);	numeros.add(4);
		numeros.add(7); numeros.add(9);
		numeros.add(10); numeros.add(20);
		numeros.add(20); numeros.add(20);numeros.add(20);
		
	}


	private static void mostraResultado(int qtd) {
		System.out.println("A quantidade de numeros pares é: "+qtd);
	}
	
	private static int totalPares(ArrayList<Integer> numeros) {
		int contador=0;
		for (Integer num : numeros) {
			if (num % 2 == 0) {
				contador+=1;
			}
		}
		return contador;
	}

}
