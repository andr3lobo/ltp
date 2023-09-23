package collections;

import java.util.HashMap;
import java.util.Map;

public class Exemplo5HashMap {

	public static void main(String[] args) {
		
		HashMap<String, Double>  notas = new HashMap<String, Double>();
		// listagem de disciplinas
		notas.put("LTP", 10.0);
		notas.put("Matemática", 10.0);
		notas.put("Português", 9.5);
		notas.put("História", 9.2);
		notas.put("Banco de Dados", 9.7);
		
		//resgatando por uma chave específica
		Double x = notas.get("Banco de Dados");
		x = notas.get("Português");
		
		System.out.println("BD::"+x);
		
		
		//imprimindo a chave e o valor
		for (String key:notas.keySet())
			System.out.println(key+": "+notas.get(key));
	}

}
