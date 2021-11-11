package br.com.jarvis.ifoody.dao;

import java.util.List;

import br.com.jarvis.entity.EnderecoLoja;



public interface EnderecoLojaDAO {
	void gravar(EnderecoLoja endereco);
	List<EnderecoLoja> buscarTodos();
	EnderecoLoja buscarPorId(int id);
	void atualizar (EnderecoLoja endereco);
	void remover (int id);
	
}