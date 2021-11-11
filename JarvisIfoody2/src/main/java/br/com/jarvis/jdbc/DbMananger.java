package br.com.jarvis.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbMananger {
	
	public static Connection obterConexao() {
		Connection conexao = null; 
		try { 
			//define o Driver

			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			
			
			conexao = DriverManager.getConnection(    // interface JDBC cuja implementação DriveManagemenger abre uma conexao com a url definida para o banco de dados
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
					"RM87840",
					"130990");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}

}
