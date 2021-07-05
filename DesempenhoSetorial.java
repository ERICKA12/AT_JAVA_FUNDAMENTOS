package com.ericka.appIndicadoresGestao.modelo.dominio;

public class DesempenhoSetorial extends Indicador {
	
	String nomeMetrica;
	String indicadorSetor;
	int metaSetor;
	String responsavelSetor;
	
	
	public DesempenhoSetorial(String agenda, String descricao, String mes ,int ano) {
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
		sb.append(this.calcularNumeroIndicador());
		
		return sb.toString();
	}
	
		
	@Override
	public int calcularNumeroIndicador() {
		return 20;
	}
	

	public String getIndicadorSetor() {
		return indicadorSetor;
	}

	public void setIndicadorSetor(String string) {
		this.indicadorSetor = string;
	}

	public int getMetaSetor() {
		return metaSetor;
	}

	public void setMetaSetor(int metaSetor) {
		this.metaSetor = metaSetor;
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
