package br.com.jarvis.entity;

import java.io.Serializable;

public class EnderecoLoja implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private int  ID_ENDERECO;
	private String  ENDERECO_LOJA;
	private int  CEP_LOJA;
	private String  ESTADO_LOJA;
	private String  BAIRRO_LOJA;
	

	public EnderecoLoja() {}
	
	
	public EnderecoLoja(int ID_ENDERECO, String ENDERECO_LOJA, int CEP_LOJA, String ESTADO_LOJA, String BAIRRO_LOJA,
			int NUMERO_LOJA) {
		super();
		this.ID_ENDERECO = ID_ENDERECO;
		this.ENDERECO_LOJA = ENDERECO_LOJA;
		this.CEP_LOJA = CEP_LOJA;
		this.ESTADO_LOJA = ESTADO_LOJA;
		this.BAIRRO_LOJA = BAIRRO_LOJA;
		this.NUMERO_LOJA = NUMERO_LOJA;
	}
	
	
	
	public int getID_ENDERECO() {
		return ID_ENDERECO;
	}

	public void setID_ENDERECO(int iD_ENDERECO) {
		ID_ENDERECO = iD_ENDERECO;
	}

	public String getENDERECO_LOJA() {
		return ENDERECO_LOJA;
	}

	public void setENDERECO_LOJA(String eNDERECO_LOJA) {
		ENDERECO_LOJA = eNDERECO_LOJA;
	}

	public int getCEP_LOJA() {
		return CEP_LOJA;
	}

	public void setCEP_LOJA(int cEP_LOJA) {
		CEP_LOJA = cEP_LOJA;
	}

	public String getESTADO_LOJA() {
		return ESTADO_LOJA;
	}

	public void setESTADO_LOJA(String eSTADO_LOJA) {
		ESTADO_LOJA = eSTADO_LOJA;
	}

	public String getBAIRRO_LOJA() {
		return BAIRRO_LOJA;
	}

	public void setBAIRRO_LOJA(String bAIRRO_LOJA) {
		BAIRRO_LOJA = bAIRRO_LOJA;
	}

	public int getNUMERO_LOJA() {
		return NUMERO_LOJA;
	}

	public void setNUMERO_LOJA(int nUMERO_LOJA) {
		NUMERO_LOJA = nUMERO_LOJA;
	}

	private int NUMERO_LOJA;
	
	


	@Override
	public String toString() {
		return "EnderecoLoja [ID_ENDERECO=" + ID_ENDERECO + ", ENDERECO_LOJA=" + ENDERECO_LOJA + ", CEP_LOJA="
				+ CEP_LOJA + ", ESTADO_LOJA=" + ESTADO_LOJA + ", BAIRRO_LOJA=" + BAIRRO_LOJA + ", NUMERO_LOJA="
				+ NUMERO_LOJA + "]";
	}
	
	
	
	
}


