package av1;

import java.util.Scanner;

public class BibliotecaQ1 {

	public static void main(String[] args) {
		//ler a categoria do teclado
		Scanner ler = new Scanner(System.in);
		System.out.println("Busca: ");
		String genero = ler.next();
		//identificar a categoria
			//classificar as possibilidades: Infantil, Ficção e Literatura
		
		if(genero.equals("Infantil")) {
			System.out.println("Livros Infantis: ");
		} else if(genero.equals("Ficção")) {
			System.out.println("Livros de Ficção: ");
		} else if(genero.equals("Literatura")){
			System.out.println("Livros de Literatura: ");
		} else {
			System.out.println("Digite uma busca válida!");
		}
		
		//emitir a mensagem padrão

	}

}
