package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Exemplo3LinkedList {

	public static void main(String[] args) {
		//cada cenário tem uma sequência de 55 telas
		LinkedList<String> cenario1 = new LinkedList<String>();
		geradorTelas(cenario1,20);
		
		//iterando em uma linkedlist
		Iterator<String> it = cenario1.iterator();
		while(it.hasNext())
			System.out.print(it.next());
	}

	private static void geradorTelas(LinkedList<String> cenario1, int qtdeTelas) {
		int i = 1;
		while(i<=qtdeTelas) {
			cenario1.add("Tela"+i+"-->");
			i++;
		}
	}

}
