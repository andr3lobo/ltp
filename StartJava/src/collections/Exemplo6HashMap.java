package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exemplo6HashMap {

	public static void main(String[] args) {
		Map<String, double[] >  notas = new HashMap<String, double[] >();
		//notas das disciplinas nos 4 bimestres
		double [] notas_ltp = {10.0,9.7,8.0,10.0};
		double [] notas_mat = {10.0,9.9,10.0,10.0};
		double [] notas_port = {9.0,8.5,10.0,9.3};
		
		//adicionando na HashMap
		notas.put("LTP",notas_ltp);
		notas.put("Matemática", notas_mat);
		notas.put("Português", notas_port);
		
		// resgatando todas as notas de uma disciplina
		double [] x = notas.get("LTP");
		System.out.print("LTP: ");
		for (double d : x)
			System.out.print(d+", ");
		
		//resgatando a nota de um bimestre específico
		System.out.println("\nNota do primeiro bimestre de LTP: "+
		notas.get("LTP")[1]);
		
		// imprimindo as notas de todas as disciplinas e de todos os bimestres
		for (String key:notas.keySet()) {
			System.out.println("\n"+key+": ");
			for (double d : notas.get(key))
				System.out.print(d+", ");
		}

	}

}
