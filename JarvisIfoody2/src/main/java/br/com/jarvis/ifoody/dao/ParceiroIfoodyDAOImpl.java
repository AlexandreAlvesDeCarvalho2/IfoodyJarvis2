package br.com.jarvis.ifoody.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.jarvis.entity.Parceiro;
import br.com.jarvis.jdbc.DbMananger;

public class ParceiroIfoodyDAOImpl implements ParceiroIfoodyDAO {

	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public void gravar(Parceiro parceiro) {
		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement(
					"INSERT INTO T_PARCEIRO_RESTAURANTE " + "(ID_PARCEIRO, NM_PARCEIRO, CEL_PARCEIRO, EMAIL_PARCEIRO)"
							+ " VALUES (SEQ_RESTAURANTE.NEXTVAL, ?, ?, ?)");

			pstmt.setString(1, parceiro.getNM_PARCEIRO());
			pstmt.setString(2, parceiro.getCEL_PARCEIRO());
			pstmt.setString(3, parceiro.getEMAIL_PARCEIRO());
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
	public List<Parceiro> buscarTodos() {

		List<Parceiro> parceiros = new ArrayList<Parceiro>();
		ResultSet rs = null;

		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("SELECT * FROM T_PARCEIRO_RESTAURANTE");
			rs = pstmt.executeQuery();

			// Percorre todos os registros encontrados
			while (rs.next()) {

				Parceiro parceiro = new Parceiro();

				parceiro.setID_PARCEIRO(rs.getInt("ID_PARCEIRO"));
				parceiro.setNM_PARCEIRO(rs.getString("NM_PARCEIRO"));
				parceiro.setCEL_PARCEIRO(rs.getString("CEL_PARCEIRO"));
				parceiro.setEMAIL_PARCEIRO(rs.getString("EMAIL_PARCEIRO"));

				parceiros.add(parceiro);
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

		return parceiros;

	}



	@Override
	public void atualizar(Parceiro parceiro) {

		try {
			conexao = DbMananger.obterConexao(); 
			pstmt = conexao.prepareStatement("UPDATE T_PARCEIRO_RESTAURANTE SET "
					+ "NM_PARCEIRO = ?, CEL_PARCEIRO = ?, EMAIL_PARCEIRO = ?" + " WHERE ID_PARCEIRO = ?");

			pstmt.setString(1, parceiro.getNM_PARCEIRO());
			pstmt.setString(2, parceiro.getCEL_PARCEIRO());
			pstmt.setString(3, parceiro.getEMAIL_PARCEIRO());
			pstmt.setInt(4, parceiro.getID_PARCEIRO());

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
	public void remover(int id) {

		try {

			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("DELETE FROM T_PARCEIRO_RESTAURANTE WHERE ID_PARCEIRO = ?");
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
	public Parceiro buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
