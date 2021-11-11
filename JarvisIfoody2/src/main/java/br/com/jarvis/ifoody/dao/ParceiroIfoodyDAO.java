package br.com.jarvis.ifoody.dao;

import java.util.List;

import br.com.jarvis.entity.Parceiro;

public interface ParceiroIfoodyDAO {
	void gravar(Parceiro parceiro);
	List<Parceiro> buscarTodos();
	Parceiro buscarPorId(int id);
	void atualizar (Parceiro parceiro);
	void remover (int id);
}
