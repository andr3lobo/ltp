package javaBD.conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	// Nome do usuário do mysql
	private static final String USERNAME = "root";
	
	// Senha do Banco de Dados
	private static final String PASSWORD = "";
	
	// Caminho do banco de dados / porta / nome
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/admsalas";
	
	/*
	 * Conexão com o banco de dados
	 */
	public static Connection createConnectionToMySQL() throws ClassNotFoundException, SQLException {
		
		// Carrega a classe de conexão com a JVM
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Cria a conexão com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
		
		return connection;
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = createConnectionToMySQL();
		if(con!= null) {
			con.close();
		}
		con.createStatement();
		System.out.println("Conexão criada com sucesso!");
	}
}
