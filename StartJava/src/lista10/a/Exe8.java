package lista10.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exe8 {

	public static void main(String[] args) {
		HashMap<String, Double> notas = new HashMap<String, Double>();
//		HashMap<Chave, Valor>
		
		notas.put("André Lôbo", 10.0);
		notas.put("Ana Hippler", 10.0);
		notas.put("João", 7.5);
		notas.put("Leandra", 10.0);
		notas.put("Lucas", 9.2);
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome para saber a nota: ");
		String nome = ler.nextLine();
		
		if (notas.containsKey(nome)) {
			System.out.println("A nota de "+nome+" é: "+notas.get(nome));
			
		} else {
			System.out.println("Nome não encontrado!");
		}
		
	}

}
