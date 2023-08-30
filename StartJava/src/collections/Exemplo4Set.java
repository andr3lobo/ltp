package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exemplo4Set {
	
	public static void main(String[] args) {
		
		//registro da frequencia com duplicidades
		List<String> frequencias = registro(30);
		
		for (String s: frequencias)
			System.out.println(s);
		
		//adicionando no hashset e formando o subconjunto
		Set<String> presentesSemana = new HashSet<String>();
		for (String pessoa: frequencias)
			presentesSemana.add(pessoa);
		
		System.out.println("\n\nPresentes da Semana:");
		//iterando sobre o hashet
		Iterator<String> it = presentesSemana.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	private static ArrayList<String> registro(int qtdRegistro) {
		Random r = new Random();
		String [] s = {"Pedro", "José","Maria","Helena", "Lucas",
				"João","Rosinha"};
		
		List<String> regs = new ArrayList<String>();
		int i = 0;
		while(i<qtdRegistro) {
			String x = s[r.nextInt(0, 7)];
			if (!x.equals("José") && !x.equals("Rosinha"))
				regs.add(x);
			i++;
		}
		
		return (ArrayList<String>) regs;
	}

}
