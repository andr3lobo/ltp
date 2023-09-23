package desafio.calculadora;
import java.util.*;

public class ExeDeque {

	public static void main(String[] args) {
		Deque<String> q = new ArrayDeque<String>(); //criando a lista
		q.add("André");//inserindo elementos
		q.add("Assis");
		q.add("Lôbo");
		System.out.println("Elementos da fila: "+q);//imprimindo os elementos
		System.out.println("Início da fila: "+q.peek());//Elemento no topo
		System.out.println("Final da fila: "+q.peekLast());//Elemento no final
		System.out.println("Removido: "+q.remove());;//primeira remoção
		System.out.println("Elementos da fila: "+q);
		
		q.add("Oliveira");//adicionando mais um elemento
		System.out.println("Elementos da fila: "+q);//imprimindo os elementos 
		
		for (Iterator iterator = q.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
		}
	}
}


