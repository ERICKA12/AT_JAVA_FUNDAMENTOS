package com.ericka.appIndicadoresGestao.modelo.dominio;

public class Estrategico extends Indicador {
	
	
	private String nomeProjetoEstrategico;
	private String indicadorEstrategico;
	private float metaEstrategico;
	private String responsavelEstrategico;

	public Estrategico( String agenda, String descricao, String mes, String ano) {
		super(agenda, descricao, mes, ano);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.nomeProjetoEstrategico);
		sb.append(";");
		sb.append(this.indicadorEstrategico);
		sb.append(";");
		sb.append(this.metaEstrategico);
		sb.append(";");
		sb.append(this.responsavelEstrategico);
		sb.append(";");
		sb.append(this.calcularTotalIndicadores());
		
		
		return sb.toString();
	}

	@Override
	public int calcularTotalIndicadores() {
		return 25;
	}

	public String getNomeProjetoEstrategico() {
		return nomeProjetoEstrategico;
	}

	public void setNomeProjetoEstrategico(String nomeProjetoEstrategico) {
		this.nomeProjetoEstrategico = nomeProjetoEstrategico;
	}

	public String getIndicadorEstrategico() {
		return indicadorEstrategico;
	}

	public void setIndicadorEstrategico(String indicadorEstrategico) {
		this.indicadorEstrategico = indicadorEstrategico;
	}

	public float getMetaEstrategico() {
		return metaEstrategico;
	}

	public void setMetaEstrategico(float campos) {
		this.metaEstrategico = campos;
	}

	public String getResponsavelEstrategico() {
		return responsavelEstrategico;
	}

	public void setResponsavelEstrategico(String responsavelEstrategico) {
		this.responsavelEstrategico = responsavelEstrategico;
	}
	
}
