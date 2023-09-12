package lista10.a;

import java.util.HashMap;
import java.util.Scanner;

public class Exemplo1_HashMap {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Double> produtos = new HashMap<String, Double>();
		
		Scanner ler = new Scanner(System.in);
		int option = menuOpcoes(ler);

		while (option != 0) {
			switch (option) {
			case 1:
				cadastrarProduto(ler,produtos);
				break;
			case 2:
				consultarProduto(ler, produtos);
				break;
			default:
				System.out.println("Digite uma opção válida!!!");
				break;
			}
			limpaTela();
			
			option = menuOpcoes(ler);
		}
	}

	private static void consultarProduto(Scanner ler, HashMap<String, Double> produtos) {
		
		System.out.println("Digite o nome do produto para consultar o seu valor: ");
		String nome = ler.next();
		if (produtos.containsKey(nome)){
			System.out.println("Produto "+nome+": "+produtos.get(nome));
		} else {
			System.out.println("O produto não está cadastrado!"
					+ "/nDigite uma opção válida!");
		}
		
	}

	private static void cadastrarProduto(Scanner ler, HashMap<String, Double> produtos) {
		
		System.out.println("Digite o nome do produto para cadastrar: ");
		String nome = ler.next();
		
		if(produtos.containsKey(nome)) {
			System.out.println("O produto já está cadastrado!"
					+ "/nDigite uma opção válida!");
		} else {
			
			System.out.println("Digite o valor do produto para cadastrar: ");
			Double valor = ler.nextDouble();
			produtos.put(nome, valor);
		}
	}

	private static int menuOpcoes(Scanner ler) {
		
		System.out.println("Digite um número dentre as opções: ");
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Consultar valor de produto");
		System.out.println("0 - Sair");
		
		return ler.nextInt();
		
	}
	
	
	public static void limpaTela() {
		for (int i = 0; i < 80; i++) {
			System.out.println(" ");
		}
	}

}
