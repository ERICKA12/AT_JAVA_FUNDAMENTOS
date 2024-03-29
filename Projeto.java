package com.ericka.appIndicadoresGestao.modelo.dominio;

public class Projeto extends Indicador {
	
	private String nomeProjeto;
	private String indicadorProjeto;
	private float metaProjeto;
	private String responsavelProjeto;
	
	public Projeto(String agenda, String descricao, String mes ,String ano) {
		super(agenda, descricao, mes,ano);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		if(this.metaProjeto >= 0) {
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.nomeProjeto);
		sb.append(";");
		sb.append(this.calcularTotalIndicadores());
		
		} else {
			System.out.println("A meta do projeto foi preenchida incorretamente.");
		}
		
		return sb.toString();
	}

	
	public String getNomeProjeto() {
		return nomeProjeto;
	}


	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}




	public String getIndicadorProjeto() {
		return indicadorProjeto;
	}




	public void setIndicadorProjeto(String indicadorProjeto) {
		this.indicadorProjeto = indicadorProjeto;
	}




	public float getMetaProjeto() {
		return metaProjeto;
	}




	public void setMetaProjeto(float metaProjeto) {
		this.metaProjeto = metaProjeto;
	}




	public String getResponsavelProjeto() {
		return responsavelProjeto;
	}




	public void setResponsavelProjeto(String responsavelProjeto) {
		this.responsavelProjeto = responsavelProjeto;
	}

	@Override
	public int calcularTotalIndicadores() {
		return 10;
	}

}
