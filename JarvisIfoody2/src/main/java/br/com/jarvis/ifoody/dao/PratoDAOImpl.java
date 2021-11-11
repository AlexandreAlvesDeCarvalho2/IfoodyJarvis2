package br.com.jarvis.ifoody.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.jarvis.entity.Prato;

import br.com.jarvis.jdbc.DbMananger;

public class PratoDAOImpl implements PratoDAO {

private Connection conexao;
PreparedStatement pstmt = null;










@Override
public void gravar(Prato prato) {
	try {
		conexao = DbMananger.obterConexao();
		pstmt = conexao.prepareStatement("INSERT INTO T_PRATO "
				+ "(SEQ_PRATOS.NEXTVAL, cd_prato, nm_prato, desc_prato, vl_prato, cd_restaurante, cd_tipo_comida, cd_estilo_cozinha)"
				+ " VALUES (?, ?, ?, ?, ?, ?)"
				);
		
		pstmt.setString(1, prato.getNm_prato());
		pstmt.setString(2, prato.getDesc_prato());
		pstmt.setInt(3, prato.getVl_prato());
		pstmt.setInt(4, prato.getCd_tipo_comida());
		pstmt.setInt(5, prato.getCd_estilo_cozinha());
		
		
		

		pstmt.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			pstmt.close();
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}





@Override
public ArrayList<Prato> buscarTodos() {
	
	ArrayList<Prato> pratos = new ArrayList<Prato>();
	ResultSet rs = null;

	try {
		conexao = DbMananger.obterConexao();
		pstmt = conexao.prepareStatement("SELECT * FROM T_PRATO");
		rs = pstmt.executeQuery();

		// Percorre todos os registros encontrados
		while (rs.next()) {

			Prato prato = new Prato();

			prato.setCd_prato(rs.getInt("cd_prato"));
			prato.setNm_prato(rs.getString("nm_prato"));
			prato.setDesc_prato(rs.getString("desc_prato"));
			prato.setVl_prato(rs.getInt("vl_prato"));
			prato.setCd_restaurante(rs.getInt("cd_restaurante"));
			prato.setCd_tipo_comida(rs.getInt("cd_tipo_comida"));
			prato.setCd_estilo_cozinha(rs.getInt("cd_estilo_cozinha"));
			

			pratos.add(prato);
		}

	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			pstmt.close();
			rs.close();
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	return pratos;
}


@Override
public Prato buscarPorId(int id) {
	// TODO Auto-generated method stub
	return null;
}





@Override
public void atualizar(Prato prato) {
	// TODO Auto-generated method stub
	
}





@Override
public void remover(int id) {
	// TODO Auto-generated method stub
	
}


}
