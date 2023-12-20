package javaBD.DAO;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

import javaBD.conexaoBD.ConnectionFactory;
import javaBD.model.Professor;
import javaBD.model.Sala;

public class ProfessorDAO {
	
	/**
	 * Atualiza a tabela acessos com as informações dos objetos abaixo:
	 * @param professor
	 * @param sala
	 */
	public void retirarChave(Professor professor, Sala sala) {
		
		// String com a query de grava as informações necessárias para retirar a chave
		String sql_acessos = "INSERT INTO acessos "
				+ "(retirada, professor_id, sala_num) VALUES "
				+ "(?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			
			//cria um conexao com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//criamos uma prepared statement 
			pstm = conn.prepareStatement(sql_acessos);
			
			sala.setDisponivel(false);
			//colocar valores que são esperados pela query
			
				//capta a data e hora atual para gravar no BD 
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
			Date date = new Date();
			String s = dateFormat.format(date).toString(); 
			
			pstm.setString(1, s);
			pstm.setInt(2, professor.getId());
			pstm.setInt(3, sala.getNumero());
			
			//executar a query
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if (conn !=null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void devolverChave(Professor prof, Sala sala) {
		String sql_acessos = "UPDATE acessos SET "
				+ "devolucao = ? WHERE professor_id = ? AND sala_num = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			
			//cria um conexao com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//criamos uma prepared statement 
			pstm = conn.prepareStatement(sql_acessos);
			
			sala.setDisponivel(false);
			//colocar valores que são esperados pela query
			
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
			Date date = new Date();
			String s = dateFormat.format(date).toString(); 
			
			pstm.setString(1, s);
			pstm.setInt(2, prof.getId());
			pstm.setInt(3, sala.getNumero());
			
			//executar a query
			pstm.execute();
			
			sala.setDisponivel(true);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if (conn !=null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
	public List<Professor> getProfessores(){
		
		String sql ="SELECT * FROM professor";
		List<Professor> professores = new ArrayList<Professor>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//classe que vai recuperar os dados do banco
		ResultSet rset = null;
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Professor prof = new Professor();
				prof.setId(rset.getInt("id"));
				prof.setNome(rset.getString("nome"));
				prof.setSenha(rset.getString("senha"));
				professores.add(prof);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return professores;
	}

	public void verificaProf(Professor professor) {
		String sql ="SELECT id FROM professor WHERE nome = ?";
		List<Professor> professores = new ArrayList<Professor>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//classe que vai recuperar os dados do banco
		ResultSet rset = null;
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			//colocar valores que são esperados pela query
			pstm.setString(1, professor.getNome());
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				professor.setId(rset.getInt("id"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if (conn !=null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	
}