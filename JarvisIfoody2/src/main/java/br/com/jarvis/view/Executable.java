package br.com.jarvis.view;

import br.com.jarvis.ifoody.dao.DaoFactory;
import br.com.jarvis.ifoody.dao.ParceiroIfoodyDAO;
import br.com.jarvis.ifoody.dao.RestauranteDAO;
import br.com.jarvis.ifoody.dao.EnderecoLojaDAO;




import java.util.List;

import br.com.jarvis.entity.EnderecoLoja;
import br.com.jarvis.entity.Parceiro;
import br.com.jarvis.entity.Restaurante;


public class Executable {
	
	public static void main(String[] args) {
		
		try {
			
			
//----------------------------------------ParceiroIfoody -----------------------------------------------		

			
		    	
			Parceiro parceiro = new Parceiro();
			ParceiroIfoodyDAO dao = DaoFactory.getParceiroIfoodyDAO();
			
			
			parceiro.setNM_PARCEIRO("Alexandre Alves de Carvalho");
			parceiro.setCEL_PARCEIRO("(11)97102-7117");
			parceiro.setEMAIL_PARCEIRO("alexandrealvesdecarvalho2@gmail.com");
				
			
			//dao.gravar(parceiro);
			
			parceiro.setID_PARCEIRO(2);
			parceiro.setNM_PARCEIRO("Alexandre Carvalho");
			parceiro.setCEL_PARCEIRO("(11)97102-7117");
			parceiro.setEMAIL_PARCEIRO("alexandrealvesdecarvalho2@gmail.com");			
			
			//dao.atualizar(parceiro);
			
			List<Parceiro> parceiros = dao.buscarTodos();
			for(Parceiro c: parceiros) {
				System.out.println(c.toString());
			}

			
//--------------------------------------EnderecoLoja -----------------------------------------------		
			
			//---------------------- Gravar endereço----------------------- //
			
			EnderecoLoja endereco = new EnderecoLoja();
			EnderecoLojaDAO dao2 = DaoFactory.getEnderecoLojaDAO();
			
			
			endereco.setENDERECO_LOJA("Av augusta");
			endereco.setCEP_LOJA(389789854);
			endereco.setESTADO_LOJA("São Paulo");
			endereco.setBAIRRO_LOJA("Bela Cintra");
			endereco.setNUMERO_LOJA(678);
			
			
			
			//dao2.gravar(endereco);
			
			
			//---------------------- Alterar endereco ----------------------- 
			
			endereco.setENDERECO_LOJA("Av augusta");
			endereco.setCEP_LOJA(389789854);
			endereco.setESTADO_LOJA("São Paulo");
			endereco.setBAIRRO_LOJA("Bela Vista");
			endereco.setNUMERO_LOJA(678);
			
			//dao2.atualizar(endereco);
			
			
			List<EnderecoLoja> enderecos = dao2.buscarTodos();
			for(EnderecoLoja c: enderecos) {
				System.out.println(c.toString());
			}

			//----------------------------------------Restaurantes -----------------------------------------------		

						
					    	
						Restaurante restaurante = new Restaurante();
						RestauranteDAO dao3 = DaoFactory.getRestauranteDAO();
						
						
						restaurante.setNM_RESTAURANTE("Alexandre Alves de Carvalho");
						restaurante.setCNPJ_RESTAURANTE(21123700/0001);
						restaurante.setID_PARCEIRO_RESTAURANTE(2);
						restaurante.setID_ENDERECO_RESTAURANTE(1);
							
						
						//dao3.gravar(restaurante);
						
						restaurante.setNM_RESTAURANTE("Alexandre Alves de Carvalho");
						restaurante.setCNPJ_RESTAURANTE(21123700/0001);
						restaurante.setID_PARCEIRO_RESTAURANTE(2);
						restaurante.setID_ENDERECO_RESTAURANTE(1);			
						
						//dao3.atualizar(restaurante);
						
						List<Restaurante> restaurantes = dao3.buscarTodos();
						for(Restaurante c: restaurantes) {
							System.out.println(c.toString());
						}
			
			} catch (Exception e) {
				System.err.println("Erro ao enviar os arquivos");
				e.printStackTrace();

	
			
	}	

		
}
}
