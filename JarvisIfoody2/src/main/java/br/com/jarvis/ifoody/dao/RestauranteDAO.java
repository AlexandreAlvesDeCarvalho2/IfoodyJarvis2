package br.com.jarvis.ifoody.dao;

import java.util.List;

import br.com.jarvis.entity.Restaurante;


public interface RestauranteDAO {
	void gravar(Restaurante restaurante);
	List<Restaurante> buscarTodos();
	Restaurante buscarPorId(int id);
	void atualizar (Restaurante restaurante);
	void remover (int id);
	
}