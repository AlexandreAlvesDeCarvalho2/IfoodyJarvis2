package br.com.jarvis.ifoody.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import br.com.jarvis.entity.Restaurante;
import br.com.jarvis.jdbc.DbMananger;

public class RestauranteDAOImpl implements RestauranteDAO {
	
	private Connection conexao;
	PreparedStatement pstmt = null;
	
	
	
	
	
	@Override
	public void gravar(Restaurante restaurante) {
		
		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("INSERT INTO T_RESTAURANTE "
					+ "(ID_RESTAURANTE, NM_RESTAURANTE, CNPJ_RESTAURANTE, ID_PARCEIRO_RESTAURANTE, ID_ENDERECO_RESTAURANTE) "
					+ "VALUES (SEQ_ENDERECO.NEXTVAL, ?, ?, ?, ?)");

			pstmt.setString(1, restaurante.getNM_RESTAURANTE());
			pstmt.setInt(2, restaurante.getCNPJ_RESTAURANTE());
			pstmt.setInt(3, restaurante.getID_PARCEIRO_RESTAURANTE());
			pstmt.setInt(4, restaurante.getID_ENDERECO_RESTAURANTE());
			
			

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
	public ArrayList<Restaurante> buscarTodos() {
		ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
		ResultSet rs = null;

		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("SELECT * FROM T_RESTAURANTE");
			rs = pstmt.executeQuery();

			// Percorre todos os registros encontrados
			while (rs.next()) {

				Restaurante restaurante = new Restaurante();

				restaurante.setID_RESTAURANTE(rs.getInt("ID_RESTAURANTE"));
				restaurante.setNM_RESTAURANTE(rs.getString("NM_RESTAURANTE"));
				restaurante.setCNPJ_RESTAURANTE(rs.getInt("CNPJ_RESTAURANTE"));
				restaurante.setID_PARCEIRO_RESTAURANTE(rs.getInt("ID_PARCEIRO_RESTAURANTE"));
				restaurante.setID_ENDERECO_RESTAURANTE(rs.getInt("ID_ENDERECO_RESTAURANTE"));
				

				restaurantes.add(restaurante);
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

		return restaurantes;
	}

	@Override
	public void atualizar(Restaurante restaurante) {try {
		conexao = DbMananger.obterConexao(); 
		pstmt = conexao.prepareStatement("UPDATE T_RESTAURANTE SET "
				+ "NM_RESTAURANTE = ?, CNPJ_RESTAURANTE = ?, ID_PARCEIRO_RESTAURANTE = ?,"
				+ " ID_ENDERECO_RESTAURANTE = ? WHERE ID_RESTAURANTE = ?");

		pstmt.setString(1, restaurante.getNM_RESTAURANTE());
		pstmt.setInt(2, restaurante.getCNPJ_RESTAURANTE());
		pstmt.setInt(3, restaurante.getID_PARCEIRO_RESTAURANTE());
		pstmt.setInt(4, restaurante.getID_ENDERECO_RESTAURANTE());
		pstmt.setInt(4, restaurante.getID_RESTAURANTE());
		
		
		

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
	public void remover(int id) {try {

		conexao = DbMananger.obterConexao();
		pstmt = conexao.prepareStatement("DELETE FROM T_RESTAURANTE WHERE ID_RESTAURANTE = ?");
		pstmt.setInt(1, id);
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
	public Restaurante buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
