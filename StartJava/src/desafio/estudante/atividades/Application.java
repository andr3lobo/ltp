package desafio.estudante.atividades;

import java.io.IOException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int control = menuGeral(ler);//exibe as informações dos papei
		while (control>0) {
			
			switch (control) {
			case 1:
				menuProfessor(ler);
				break;
				
			case 0:
				break;

			default:
				break;
			}
		}

	}

	private static int menuGeral(Scanner ler) {
		
		System.out.println("Digite uma das opções: \n"
				+ "1 - Professor \n"
				+ "2 - Coordenador \n"
				+ "3 - Estudante \n"
				+ "0 - Sair do Sistema \n");
		
		return ler.nextInt();
	}
	

	
	private static int menuProfessor(Scanner option) {
		limpaConsole();
		System.out.println("Professor, escolha uma das opções: \n"
				+ "1 - Realizar seu cadastro \n"
				+ "2 - Informar coordenação \n"
				+ "3 - Opções de atividades \n"
				+ "20 - Voltar para o menu  inicial \n");
		
		
		switch (option.nextInt()) {
		case 1:
			
			System.out.println("Informa: \n"
					+ "1 - Realizar seu cadastro \n"
					+ "2 - Informar coordenação \n"
					+ "3 - Opções de atividades \n"
					+ "20 - Voltar para o menu  inicial \n");
			
			
			break;

		default:
			break;
		}
		
		return -1;
	}
	
	private static int menuCoord(Scanner ler) {
		
		System.out.println("Coordenador, escolha uma das opções: \n"
				+ "1 - Coordenador \n"
				+ "2 - Professor \n"
				+ "3 - Estudante \n"
				+ "0 - Sair do Sistema \n");
		
		return 0;
	}	


	private static void limpaConsole() {
		for (int i = 0; i < 50; ++i) System.out.println();
	}
}
