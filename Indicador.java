package com.ericka.appIndicadoresGestao.modelo.dominio;

public class Indicador {
	
	private String agenda;
	private String descricao;
	private String mes;
	private String ano;
	
	
	public Indicador(String agenda, String descricao, String mes ,String ano)
	{
		
		this.agenda = agenda;
		this.descricao = descricao;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String TotalDeindicadores() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.agenda);
		sb.append(";");
		sb.append(this.calcularTotalIndicadores());
		sb.append("\r\n");
		
		return sb.toString();
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.agenda);
		sb.append(";");
		sb.append(this.descricao);
		sb.append(";");
		sb.append(this.mes);
		sb.append(";");
		sb.append(this.ano);
		
		return sb.toString();
	}
	
	public int calcularTotalIndicadores() {
		return 0;
	}
	
	

	public String getAgenda() {
		return agenda;
	}


	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}
		
	

}
