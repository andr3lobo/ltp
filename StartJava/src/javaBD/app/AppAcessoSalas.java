package javaBD.app;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javaBD.DAO.ProfessorDAO;
import javaBD.DAO.SalaDAO;
import javaBD.conexaoBD.ConnectionFactory;
import javaBD.model.Professor;
import javaBD.model.Sala;


public class AppAcessoSalas {
	static Scanner leitor = new Scanner(System.in);//leitor do teclado
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {		
		
		int option = opcoes();
		
		while(option != 3) {
			switch (option) {
			case 1:
				retirarChave();
				break;
			
			case 2:
				devolverChave();
				break;
			case 3:
				//sair
				break;

			default:
				System.out.println("Digite uma opção válida!");
				break;
			}
			option = opcoes();
		}
		
	}

	private static void devolverChave() {
		ProfessorDAO profDAO = new ProfessorDAO();
		SalaDAO salaDAO = new SalaDAO();
		
		System.out.println("### Digite o Nº da chave para devolver:");
		List<Sala> chaves =salaDAO.getSalas(); 
		ArrayList<Integer> chavesInd = new ArrayList<Integer>(); // 
		for (Sala s : chaves) {
			if (s.isDisponivel() == false) {
				System.out.println("Chave Nº: "+ s.getNumero() + 
						" - "+s.getDescricao());
				chavesInd.add(s.getNumero());
			}
		}
		
		Sala sa = new Sala( leitor.nextInt() );
		
		if (chavesInd.contains(sa.getNumero()) ) {
			System.out.println("Digite seu nome: ");
			Professor prof = new Professor(leitor.next());
			
			//adicionar id ao objeto professor
			profDAO.verificaProf(prof); //verificar se nome é válido
			if (prof.getId() > 0) {
				sa.setDisponivel(true);// coloca a sala como disponível 
				profDAO.devolverChave(prof, sa);
				salaDAO.setDisponibilidade(sa); // grava a sala como disponível no BD
			}
			
		} else {
			System.out.println("Chave não encontrada.\n"
					+ " Informe uma opção válida.");
		}
		
	}

	private static void retirarChave() {
		ProfessorDAO profDAO = new ProfessorDAO();
		SalaDAO salaDAO = new SalaDAO();
		
		System.out.println("### Digite o Nº da chave para retirar:");
		List<Sala> listaSalas = salaDAO.getSalas(); // lista de todas as salas cadastradas no BD
		ArrayList<Integer> chavesDispo = new ArrayList<Integer>(); // lista vazia para adicionar somente as salas disponíveis 
		
		//laço para percorrer a lista de salas exibindo as opções ao usuário
		for (Sala s : listaSalas) {
			if (s.isDisponivel()) {
				System.out.println("Chave Nº: "+ s.getNumero() + 
						" - "+s.getDescricao()); // exibindo as informações
				chavesDispo.add(s.getNumero()); // adicionando as salas disponíveis
			}
		}
		
		// o usuário digita a sala que deseja retirar e cria-se um objeto com o número informado
		Sala sala = new Sala( leitor.nextInt() ); 
		if (chavesDispo.contains( sala.getNumero() ) ) {
			System.out.println("Digite seu nome: ");
			
			// o usuário digita o nome do professor e cria-se um objeto com o nome informado
			Professor prof = new Professor(leitor.next()); 
			
			profDAO.verificaProf(prof); //verifica se existe professor com o nome digitado
			
			if (prof.getId() > 0) { // se o banco retornar um valor - ok
				profDAO.retirarChave(prof, sala); // método invocado para registrar no BD uma retirada de chave
				sala.setDisponivel(false);
				salaDAO.setDisponibilidade(sala); // método invocado para alterar a disponibilidade de uma sala
				
			}
			
		} else {
			System.out.println("A chave não está disponível.\n"
					+ " Informe uma  das opções.");
		}
		
	}

	/**
	 * @return a opção do usuário dentre as principais opções do sistema
	 */
	private static int opcoes() {
		String menu = "\n####Sistema de Acesso as Salas ####\n"
		+ "Informe o número da opção desejada:\n"
		+ "1 - Retirar Chave\n"
		+ "2 - Devolver Chave\n"
		+ "3 - Sair";
		
		System.out.println(menu);
		return leitor.nextInt();
	}

}
