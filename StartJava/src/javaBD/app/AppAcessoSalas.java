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
		ProfessorDAO profDAO = new ProfessorDAO();
		SalaDAO salaDAO = new SalaDAO();
		
		while(option != 3) {
			switch (option) {
			
			case 1:
				System.out.println("### Digite o Nº da chave para retirar:");
				List<Sala> listaSalas = salaDAO.getSalas();
				ArrayList<Integer> chavesDispo = new ArrayList<Integer>();
				for (Sala s : listaSalas) {
					if (s.isDisponivel()) {
						System.out.println("Chave Nº: "+ s.getNumero() + 
								" - "+s.getDescricao());
						chavesDispo.add(s.getNumero());
					}
				}
				
				Sala sala = new Sala( leitor.nextInt() );
				if (chavesDispo.contains( sala.getNumero() ) ) {
					System.out.println("Digite seu nome: ");
					Professor prof = new Professor(leitor.next());
					
					//adicionar id ao objeto professor
					profDAO.verificaProf(prof); //verificar se nome é válido
					if (prof.getId() > 0) {
						sala.setDisponivel(false);
						profDAO.retirarChave(prof, sala);
					}
					
				} else {
					System.out.println("A chave não está disponível.\n"
							+ " Informe uma  das opções.");
				}
				
				break;
			
			case 2: // devolver chave
				System.out.println("### Digite o Nº da chave para devolver:");
				List<Sala> chaves =salaDAO.getSalas();
				ArrayList<Integer> chavesInd = new ArrayList<Integer>();
				for (Sala s : chaves) {
					if (s.isDisponivel() == false) {
						System.out.println("Chave Nº: "+ s.getNumero() + 
								" - "+s.getDescricao());
						chavesInd.add(s.getNumero());
					}
				}
				
				Sala sa = new Sala( leitor.nextInt() );
//				if (chaves.contains( sa.getNumero() ) ) {
				if (chavesInd.contains(sa.getNumero()) ) {
					System.out.println("Digite seu nome: ");
					Professor prof = new Professor(leitor.next());
					
					//adicionar id ao objeto professor
					profDAO.verificaProf(prof); //verificar se nome é válido
					if (prof.getId() > 0) {
						sa.setDisponivel(true);
						profDAO.devolverChave(prof, sa);
					}
					
				} else {
					System.out.println("A chave não está disponível.\n"
							+ " Informe uma  das opções.");
				}
				break;
			case 3: //sair
				break;

			default: System.out.println("Digite uma opção válida!");
				break;
			}
			option = opcoes();
		}

		
	}

	/**
	 * 
	 * @return uma string correspondente a data e horário atual
	 */
	private static String getDateTime() { 
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date date = new Date();
		return dateFormat.format(date); 
	}

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
