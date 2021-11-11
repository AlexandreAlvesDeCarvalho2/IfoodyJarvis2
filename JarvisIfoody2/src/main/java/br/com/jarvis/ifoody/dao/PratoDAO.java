package br.com.jarvis.ifoody.dao;

import java.util.*;

import br.com.jarvis.entity.Prato;



public interface PratoDAO {
	void gravar(Prato prato);
	ArrayList<Prato> buscarTodos();
	Prato buscarPorId(int id);
	void atualizar (Prato prato);
	void remover (int id);
	
}


/*

public static void main(String[] args) {

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
				"RM87840", "130990");

		System.out.println("Conectado!");
		
		PreparedStatement pstmt = conexao.prepareStatement("INSERT INTO T_PRATO "
				+ "(nm_prato, desc_prato, vl_prato, cd_restaurante, cd_tipo_comida, cd_estilo_cozinha)"
				+ " VALUES (?, ?, ?, ?, ?, ?)"
				);
		
		pstmt.setString(1, "X BACON ONION DUPLO ARTESANAL");
		pstmt.setString(2, "Pão, dois hambúrgueres suculentos de 130g, bacon crocante, anéis de cebola, maionese.");
		pstmt.setInt(3, 34);
		pstmt.setInt(4, 4);
		pstmt.setInt(5, 2);
		pstmt.setInt(6, 3);
		pstmt.executeUpdate();
				

//		Statement stmt = conexao.createStatement();
//		stmt.executeUpdate("INSERT INTO T_RESTAURANTE (  cd_restaurante, nm_restaurante, nr_cnpj, vl_pedido_min)"
//				+ " VALUES (seq_rest.NEXTVAL, 'San do it', 85296374169, 15)");


		ResultSet result = pstmt.executeQuery("SELECT * FROM T_PRATO");
		while (result.next()) {
			System.out.println(result.getInt("cd_prato") + " " + result.getString("nm_prato") + " "
					+ result.getInt("vl_prato") + " " + result.getInt("cd_restaurante") + " " + result.getInt("cd_tipo_comida") + " " + result.getInt("cd_estilo_cozinha"));
		}
		
//		CallableStatement cs = conexao.prepareCall("{call SP_INSERT_RESTAURANTE(?, ?, ?)}");
//		cs.setString(1, "Applebees");
//		cs.setString(2, "74196385272");
//		cs.setInt(3, 15);
//		cs.executeUpdate();
		
		conexao.close();

	} catch (SQLException e) {
		System.err.println("Não foi possível conectar no Banco de Dados");
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		System.err.println("O Driver JDBC não foi encontrado!");
		e.printStackTrace();
	}

}
*/