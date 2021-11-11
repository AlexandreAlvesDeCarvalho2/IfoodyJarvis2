package br.com.jarvis.entity;

import java.io.Serializable;

public class Parceiro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int ID_PARCEIRO;
	private String NM_PARCEIRO;
	private String CEL_PARCEIRO;
	private String EMAIL_PARCEIRO;
	
	
	public Parceiro() {
		
	}
	

	
	public Parceiro(int ID_PARCEIRO, String NM_PARCEIRO, String CEL_PARCEIRO, String EMAIL_PARCEIRO) {
		super();
		this.ID_PARCEIRO = ID_PARCEIRO;
		this.NM_PARCEIRO = NM_PARCEIRO;
		this.CEL_PARCEIRO = CEL_PARCEIRO;
		this.EMAIL_PARCEIRO = EMAIL_PARCEIRO;
	}



	public int getID_PARCEIRO() {
		return ID_PARCEIRO;
	}
	public void setID_PARCEIRO(int iD_PARCEIRO) {
		ID_PARCEIRO = iD_PARCEIRO;
	}
	public String getNM_PARCEIRO() {
		return NM_PARCEIRO;
	}
	public void setNM_PARCEIRO(String nM_PARCEIRO) {
		NM_PARCEIRO = nM_PARCEIRO;
	}
	public String getCEL_PARCEIRO() {
		return CEL_PARCEIRO;
	}
	public void setCEL_PARCEIRO(String cEL_PARCEIRO) {
		CEL_PARCEIRO = cEL_PARCEIRO;
	}
	public String getEMAIL_PARCEIRO() {
		return EMAIL_PARCEIRO;
	}
	public void setEMAIL_PARCEIRO(String eMAIL_PARCEIRO) {
		EMAIL_PARCEIRO = eMAIL_PARCEIRO;
	}



	@Override
	public String toString() {
		return "Parceiro [ID_PARCEIRO=" + ID_PARCEIRO + ", NM_PARCEIRO=" + NM_PARCEIRO + ", CEL_PARCEIRO="
				+ CEL_PARCEIRO + ", EMAIL_PARCEIRO=" + EMAIL_PARCEIRO + "]";
	}



	public String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}
