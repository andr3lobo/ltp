package lista10.b;

import java.util.ArrayList;

public class Exe4 {
	
	
	
	
	public static void main(String[] args) {
		// criar uma ArrayList de inteiros
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		// preenche o array com uma quantidade de números
		numeros.add(2); numeros.add(3);
		numeros.add(31); numeros.add(4);
		numeros.add(44);
		
		ArrayList<Integer>  numeros2 = new ArrayList<Integer>();
		numeros2.add(200); numeros.add(33);
		numeros2.add(311); numeros2.add(4);
		numeros2.add(45);
		
		//criar o método totalPares que vai retornar a quantidade de 
		//números pares existentes no Array
		int qtdPares = totalPares(numeros);
		showArrayList(numeros);
		
		System.out.println("\nA quantidade de números pares "
				+ "é: "+qtdPares);
		
		qtdPares = totalPares(numeros2);

	}
	
	public static void showArrayList(ArrayList<Integer> arr) {
		System.out.print("ArrayList: ");
		for (Integer i : arr)
			System.out.print(i+ " ");
	}

	public static int totalPares(ArrayList<Integer> numeros) {
		int contPares=0;
		for (Integer x : numeros) {
			if(x%2==0)
				contPares++;
		}
		
		return contPares;
	}

}
