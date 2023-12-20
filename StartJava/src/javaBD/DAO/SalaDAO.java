package javaBD.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javaBD.conexaoBD.ConnectionFactory;
import javaBD.model.Sala;

public class SalaDAO {
	
	static Scanner leitor = new Scanner(System.in);//leitor do teclado
	
	
	public List<Sala> getSalas(){
		
		String sql ="SELECT * FROM sala";
		List<Sala> listaSalas = new ArrayList<Sala>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//classe que vai recuperar os dados do BD
		ResultSet rset = null;
		try {
			
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Sala sala = new Sala();
				sala.setNumero(rset.getInt("numero"));
				sala.setDescricao(rset.getString("descricao"));
				sala.setDisponivel(rset.getBoolean("disponivel"));
				
				listaSalas.add(sala);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return listaSalas;
	}
	
	public void setDisponibilidade(Sala sala) {
		String sql_acessos = "UPDATE sala "
				+ "SET disponivel = ? WHERE numero = ?";
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			
			//cria um conexao com o banco de dados
			conn = ConnectionFactory.createConnectionToMySQL();
			
			//criamos uma prepared statement 
			pstm = conn.prepareStatement(sql_acessos);
			
			//colocar valores que são esperados pela query
			
			pstm.setBoolean(1, sala.isDisponivel());
			pstm.setInt(2, sala.getNumero());
			
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
}
