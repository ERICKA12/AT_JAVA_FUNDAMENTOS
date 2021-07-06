package com.ericka.appIndicadoresGestao.modelo.dominio;

public class DesempenhoSetorial extends Indicador {
	
	String nomeMetrica;
	String indicadorSetor;
	float metaSetor;
	String responsavelSetor;
	
	
	public DesempenhoSetorial(String agenda, String descricao, String mes ,String ano) {
		super(agenda, descricao, mes,ano);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.nomeMetrica);
		sb.append(";");
		sb.append(this.indicadorSetor);
		sb.append(";");
		sb.append(this.metaSetor);
		sb.append(";");
		sb.append(this.responsavelSetor);
		sb.append(";");		
		sb.append(this.calcularTotalIndicadores());
		
		return sb.toString();
	}
	
		
	@Override
	public int calcularTotalIndicadores() {
		return 20;
	}
	

	public String getIndicadorSetor() {
		return indicadorSetor;
	}

	public void setIndicadorSetor(String string) {
		this.indicadorSetor = string;
	}

	public float getMetaSetor() {
		return metaSetor;
	}

	public void setMetaSetor(Float float1) {
		this.metaSetor = float1;
	}

	public String getResponsavelSetor() {
		return responsavelSetor;
	}

	public void setResponsavelSetor(String responsavelSetor) {
		this.responsavelSetor = responsavelSetor;
	}

	public String getNomeMetrica() {
		return nomeMetrica;
	}

	public void setNomeMetrica(String nomeMetrica) {
		this.nomeMetrica = nomeMetrica;
	}
	
}
