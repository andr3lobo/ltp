package lista10.b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExemploHashMap {

	public static void main(String[] args) {
		// <nomeProduto, preçoProdudo
		Map<String, Double>  prices = new HashMap<String, Double>();
		prices.put("Abacate", 2.5);
		prices.put("Cenoura", 1.5);
		prices.put("Alho", 19.99);
		
		int option = 100;
		consultaPrecos(option, prices);
	}

	private static void consultaPrecos(int option, Map<String, Double> prices) {
		Scanner lerOptions = new Scanner(System.in);
		while (option!=0) {
			
			options();
			option = lerOptions.nextInt();
			switch (option) {
			case 0:
				break;
			case 1:
				System.out.println("O valor do Abacate é: "+ prices.get("Abacate"));
				break;
			case 2:
				System.out.println("O valor do Cenoura é: "+ prices.get("Cenoura"));
				break;
			case 3:
				System.out.println("O valor do Alho é: "+ prices.get("Alho"));
				break;
			default:
				System.out.println("Digite uma opção válida! ");
				break;
			}

		}
		
	}

	private static void options() {
		System.out.println("Digite opção para consultar o valor do produto para saber o valor: ");
		System.out.println("1 - Abacate");
		System.out.println("2 - Cenoura");
		System.out.println("3 - Alho");
		System.out.println("0 - Sair");
		
	}

}
