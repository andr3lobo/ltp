package lista10.a;

import java.util.HashMap;
import java.util.Scanner;

public class Exe9 {
	
	static Scanner ler = new Scanner(System.in);
	static HashMap<String, Double [] > disciplinas = new HashMap<String, Double[]>();
	
	public static void main(String[] args) {
		int option = menuGeral();
		
		while(option != 3) {
			
			switch (option) {
			case 1:
				System.out.println("## Cadastro de disciplinas ##");
				System.out.println("Digite o nome: ");
				String nome = ler.next();
				Double [] notas = cadastraNotas();
				disciplinas.put(nome, notas);
				break;
			case 2:
				consultaNotas();
				break;

			default:
				System.out.println("Digite uma opção válida!");
				break;
			}
			limpaTela();
			option = menuGeral();
			
		}
	}
	
	private static void limpaTela() {
		for (int i = 0; i < 100; i++) {
			System.out.println("\n");
		}
		
	}

	private static void consultaNotas() {
		System.out.println("## Consulta de notas ##");
		System.out.println("Digite o nome da disciplina: ");
		String nome = ler.next();
		
		if (disciplinas.containsKey(nome)) {
			Double [] notas = disciplinas.get(nome);
			for (Double n : notas)
				System.out.print(n+ "  ");
			
		} else
			System.out.println("Disciplina não cadastrada!");
		
	}

	/*
	 * Método que cadastra as quatro notas do bimestre no array n
	 */
	private static Double[] cadastraNotas() {
		Double [] n = new Double[4];
		for (int i = 0; i < n.length; i++) {
			System.out.println("Digite a nota do Bimestre: " + (i+1));
			n[i] = ler.nextDouble();
		}
		
		return n;
	}

	private static int menuGeral() {
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Cadastrar notas");
		System.out.println("2 - Consultar notas");
		System.out.println("3 - Sair");
		
		return ler.nextInt();
	}

}
