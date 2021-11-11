package br.com.jarvis.entity;

import java.io.Serializable;

public class Prato implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int cd_prato;
	
	
	public int getCd_prato() {
		return cd_prato;
	}
	public void setCd_prato(int cd_prato) {
		this.cd_prato = cd_prato;
	}
	private String nm_prato;
	private String desc_prato; 
	private int vl_prato;
	private int cd_restaurante;
	private int cd_tipo_comida;
	private int cd_estilo_cozinha;
	
	public String getNm_prato() {
		return nm_prato;
	}
	public void setNm_prato(String nm_prato) {
		this.nm_prato = nm_prato;
	}
	public String getDesc_prato() {
		return desc_prato;
	}
	public void setDesc_prato(String desc_prato) {
		this.desc_prato = desc_prato;
	}
	public int getVl_prato() {
		return vl_prato;
	}
	public void setVl_prato(int vl_prato) {
		this.vl_prato = vl_prato;
	}
	public int getCd_restaurante() {
		return cd_restaurante;
	}
	public void setCd_restaurante(int cd_restaurante) {
		this.cd_restaurante = cd_restaurante;
	}
	public int getCd_tipo_comida() {
		return cd_tipo_comida;
	}
	public void setCd_tipo_comida(int cd_tipo_comida) {
		this.cd_tipo_comida = cd_tipo_comida;
	}
	public int getCd_estilo_cozinha() {
		return cd_estilo_cozinha;
	}
	public void setCd_estilo_cozinha(int cd_estilo_cozinha) {
		this.cd_estilo_cozinha = cd_estilo_cozinha;
	}
	
	public Prato() {
		
	}
	
	
	
	


	
	public Prato(int cd_prato, String nm_prato, String desc_prato, int vl_prato, int cd_restaurante, int cd_tipo_comida,
			int cd_estilo_cozinha) {
		super();
		this.cd_prato = cd_prato;
		this.nm_prato = nm_prato;
		this.desc_prato = desc_prato;
		this.vl_prato = vl_prato;
		this.cd_restaurante = cd_restaurante;
		this.cd_tipo_comida = cd_tipo_comida;
		this.cd_estilo_cozinha = cd_estilo_cozinha;
	}
	@Override
	public String toString() {
		return "Prato [cd_prato=" + cd_prato + ", nm_prato=" + nm_prato + ", desc_prato=" + desc_prato + ", vl_prato="
				+ vl_prato + ", cd_restaurante=" + cd_restaurante + ", cd_tipo_comida=" + cd_tipo_comida
				+ ", cd_estilo_cozinha=" + cd_estilo_cozinha + "]";
	}



}
