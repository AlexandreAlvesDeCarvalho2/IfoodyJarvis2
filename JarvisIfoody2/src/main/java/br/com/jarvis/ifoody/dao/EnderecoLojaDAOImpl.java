package br.com.jarvis.ifoody.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.jarvis.entity.EnderecoLoja;
import br.com.jarvis.jdbc.DbMananger;

public class EnderecoLojaDAOImpl implements EnderecoLojaDAO {

	private Connection conexao;
	PreparedStatement pstmt = null;

	@Override
	public void gravar(EnderecoLoja endereco) {

		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("INSERT INTO T_ENDERECO_LOJA (ID_ENDERECO, ENDERECO_LOJA, CEP_LOJA, ESTADO_LOJA, BAIRRO_LOJA, NUMERO_LOJA) VALUES (SEQ_ENDERECO.NEXTVAL, ?, ?, ?, ?, ?)");

			pstmt.setString(1, endereco.getENDERECO_LOJA());
			pstmt.setInt(2, endereco.getCEP_LOJA());
			pstmt.setString(3, endereco.getESTADO_LOJA());
			pstmt.setString(4, endereco.getBAIRRO_LOJA());
			pstmt.setInt(5, endereco.getNUMERO_LOJA());
			

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
	public List<EnderecoLoja> buscarTodos() {
		
		List<EnderecoLoja> enderecos = new ArrayList<EnderecoLoja>();
		ResultSet rs = null;

		try {
			conexao = DbMananger.obterConexao();
			pstmt = conexao.prepareStatement("SELECT * FROM T_ENDERECO_LOJA");
			rs = pstmt.executeQuery();

			// Percorre todos os registros encontrados
			while (rs.next()) {

				EnderecoLoja endereco = new EnderecoLoja();

				endereco.setID_ENDERECO(rs.getInt("ID_ENDERECO"));
				endereco.setENDERECO_LOJA(rs.getString("ENDERECO_LOJA"));
				endereco.setCEP_LOJA(rs.getInt("CEP_LOJA"));
				endereco.setESTADO_LOJA(rs.getString("ESTADO_LOJA"));
				endereco.setBAIRRO_LOJA(rs.getString("BAIRRO_LOJA"));
				endereco.setNUMERO_LOJA(rs.getInt("NUMERO_LOJA"));

				enderecos.add(endereco);
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

		return enderecos;
	}


	@Override
	public void atualizar(EnderecoLoja endereco) {
		
		try {
			conexao = DbMananger.obterConexao(); 
			pstmt = conexao.prepareStatement("UPDATE T_ENDERECO_LOJA SET "
					+ "ENDERECO_LOJA = ?, CEP_LOJA = ?, ESTADO_LOJA = ?, BAIRRO_LOJA = ?, NUMERO_LOJA = ? " + " WHERE ID_ENDERECO = ?");

			pstmt.setString(1, endereco.getENDERECO_LOJA());
			pstmt.setInt(2, endereco.getCEP_LOJA());
			pstmt.setString(3, endereco.getESTADO_LOJA());
			pstmt.setString(4, endereco.getBAIRRO_LOJA());
			pstmt.setInt(5, endereco.getNUMERO_LOJA());
			

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
			pstmt = conexao.prepareStatement("DELETE FROM T_ENDERECO_LOJA WHERE ID_ENDERECO = ?");
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
	public EnderecoLoja buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}	
