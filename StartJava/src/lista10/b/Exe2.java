package lista10.b;

public class Exe2 {
	
	
	public static void main(String[] args) {
		
		int A [] = criaVetor(4);
		imprimeVetor(A, "Vetor A");
		int B [] = quadradoVetor(A);
		imprimeVetor(B, "Vetor B");
	}
	
	
	
	
	/**
	 * @param x: vetor que será impresso
	 * @param ms: mensagem que será exibida antes da impressão do vetor
	 */
	public static void imprimeVetor(int [] x, String ms) {
		System.out.print("\n"+ ms+": ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+ " ");
		}
	}

	private static int[] quadradoVetor(int[] A) {
		int b [] = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			b[i] = A[i] * A[i];
		}
		return b;
	}

	public static int[] criaVetor(int tam) {
		int a [] = new int[tam];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
	
		}
		
		return a;
	}

}
