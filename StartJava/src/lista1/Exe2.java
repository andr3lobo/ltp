package lista1;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lerTeclado = new Scanner(System.in);
		//criar variaveis n1, n2 e n3 para salvar as notas para cada critério
		
		System.out.println("Digite a nota do criterio Historia: ");
		double n1 = lerTeclado.nextDouble();
		System.out.println("Digite a nota do criterio Exemplos: ");
		double n2 = lerTeclado.nextDouble();
		System.out.println("Digite a nota do criterio Clareza: ");
		double n3 = lerTeclado.nextDouble();
		
		//criar variável notaFinal para receber a fórmula notafinal = 0.3*n1 + 0.4*n2 + 0.3*n3
		double notaFinal = 0.3*n1+0.4*n2+0.3*n3;
		System.out.println("A nota do trabalho é: "+ notaFinal + " pontos.");
		
		if(notaFinal<6) {
			
			System.out.println("Este trabalho não está digno de um estudante dedicado do IFMT! Se esforce mais!");
	
		}
		
		if (notaFinal >=6 && notaFinal<8) {
			System.out.println("Sem comentários...");
		}
		
		if (notaFinal >= 8 && notaFinal < 10) {
			System.out.println("Bom trabalho!");
		}
		if (notaFinal == 10) {
			System.out.println("Estudante do IFMT - "
					+ "Campus Barra do Garças!");
		}
		
		
	}

}
