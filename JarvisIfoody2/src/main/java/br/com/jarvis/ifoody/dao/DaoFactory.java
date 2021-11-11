package br.com.jarvis.ifoody.dao;


	
	public abstract class DaoFactory {
		public static ParceiroIfoodyDAO getParceiroIfoodyDAO(){
		return new ParceiroIfoodyDAOImpl();
		}
	
	
		public static EnderecoLojaDAO getEnderecoLojaDAO(){
		return new EnderecoLojaDAOImpl();
		}
		
		public static RestauranteDAO getRestauranteDAO(){
			return new RestauranteDAOImpl();
			}
		
		public static PratoDAO getPratoDAO(){
			return new PratoDAOImpl();
			}
		
}
