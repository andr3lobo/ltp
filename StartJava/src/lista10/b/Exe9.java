package lista10.b;

import java.util.HashMap;
import java.util.Scanner;

public class Exe9 {
	
	static Scanner leitor = new Scanner(System.in);
	static HashMap<String, Double [] > disciplinas = new HashMap<String, Double []>();

	public static void main(String[] args) {
		
		int option = menuGeral();
		while(option != 3) {
			switch (option) {
			case 1:
				System.out.println("Digite o nome da disciplina: ");
				String nome = leitor.next();
				Double notasB [] = capturaNotas();
				disciplinas.put(nome, notasB);
				break;
				
			case 2:
				consultarNotas();
				break;
			case 3:
				break;

			default:
				System.out.println("Digite uma opção válida!");
				break;
			}
			
			option = menuGeral();
		}
		

	}
	
	private static void consultarNotas() {
		System.out.println("Digite o nome da disciplina: ");
		Double v [] = disciplinas.get(leitor.next());
		for (Double n : v)
			System.out.print(n+ " ");
		
		System.out.println();
	}
	/*
	 * Método que retorna vetor com as notas preenchidas do teclado
	 */
	private static Double[] capturaNotas() {
		Double notas [] = new Double[4];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota do bimestre: " + (i+1));
			notas[i] = leitor.nextDouble();
		}
		
		return notas;
	}

	private static int menuGeral() {
		System.out.println("Escolha uma das opções: ");
		System.out.println("1 - Cadastrar notas");
		System.out.println("2 - Consultar notas");
		System.out.println("3 - Sair");
		
		return leitor.nextInt();
	}

}
