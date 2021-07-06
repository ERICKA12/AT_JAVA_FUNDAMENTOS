package com.ericka.appIndicadoresGestao.modelo.dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Setor {
	private String nomeSetor;
	private String superintendencia;
	private String telefone;
	private LocalDateTime data;
	private Indicador indicador; // relacionamento 1:1 - 1 setor tem 1 indicador
	
	public Setor() {
		data = LocalDateTime.now();
	}
	
	
	public Setor (String nomeSetor, String superintendencia, String telefone) {
		this();
		this.nomeSetor = nomeSetor;
		this.superintendencia = superintendencia;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return String.format("%s;%s;%s;%s;%s;",
				this.nomeSetor,
				this.superintendencia,
				this.telefone,
				this.data.format(dataFormatada),
				this.indicador);
	}

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public String getSuperintendencia() {
		return superintendencia;
	}

	public void setSuperintendencia(String superintendencia) {
		this.superintendencia = superintendencia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDateTime getData() {
		return data;
	}
	
	public Indicador getIndicador() {
		return indicador;
	}

	public void setIndicador(Indicador indicador) {
		this.indicador = indicador;
	}
		
}
