package collections;

public class ExemploArray {

	public static void main(String[] args) {
		
		//Exemplo 1:
		//Declarando um Array
		int [] km = new int [4]; // alocando memória para 4 inteiros
		
		// Colocando valor no recipiente
		km[0] = 3;
		km[1] = 41;
		km[2] = 28;
		km[3] = 79;
		
		// O tamanho de um array
		int tam = km.length;
		
		//Percorrendo Arrays
		// for com índice
		for (int i=0;i<km.length;i++)
			System.out.println(km[i]);
		
		//foreach
		for(int elemento: km)
			System.out.println(elemento);
		
		
		
	}

}
