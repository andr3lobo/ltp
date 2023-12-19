package javaBD.app;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javaBD.DAO.ProfessorDAO;
import javaBD.DAO.SalaDAO;
import javaBD.conexaoBD.ConnectionFactory;
import javaBD.model.Professor;
import javaBD.model.Sala;


public class AppAcessoSalas {
	static Scanner leitor = new Scanner(System.in);//leitor do teclado

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//System.out.println(getDateTime());
		ConnectionFactory.createConnectionToMySQL().createStatement();
//		
//		int option = opcoes();
//		while(option != 3) {
//			SalaDAO salaDAO = new SalaDAO();
//			
//			switch (option) {
//			case 1:
//				System.out.println("### RETIRADA DE CHAVE ###");
//				System.out.println("#### Digite o número da sala:");
//				exibirSalasDisponiveis();
//				break;
//			case 2:
//				break;
//			case 3:
//				break;
//
//			default:
//				break;
//			}
//			option = opcoes();
//		}
		
		Professor prof = new Professor("Andre Lobo","esquecinovamente");
		prof.setId(3);
		ProfessorDAO profDAO = new ProfessorDAO();
		
		Sala sala = new Sala();
		sala.setNumero(2);
		
		profDAO.retirarChave(prof, sala);
		
		
//		profDAO.save(prof);
//		for (Professor c: profDAO.getProfessores()) {
//			System.out.println("Id: " + c.getId() + " Professor: "+c.getNome());
//		}
//		
//		SalaDAO salaDAO = new SalaDAO();
//		for(Sala s: salaDAO.getSalas()) {
//			System.out.println("ID: "+ s.getNumero() + 
//					" Sala: "+s.getDescricao() + " Disp.: "+s.isDisponivel());
//		}
		
	}
	
	private static String getDateTime() { 
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date date = new Date();
		return dateFormat.format(date); 
	}

	private static void exibirSalasDisponiveis() {
		SalaDAO salaDAO = new SalaDAO();
		for(Sala s: salaDAO.getSalas()) {
			if (s.isDisponivel()) {
				System.out.println("Número: "+ s.getNumero() + 
						" - "+s.getDescricao());
			}
			
		}
		
	}

	private static int opcoes() {
		String menu = "\n#### Acesso as Salas ####\n"
		+ "Informe o número da opção desejada:\n"
		+ "1 - Retirar Chave\n"
		+ "2 - Devolver Chave\n"
		+ "3 - Sair\n";
		
		System.out.println(menu);
		return leitor.nextInt();
	}

}
