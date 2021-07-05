package com.ericka.appIndicadoresGestao.modelo.dominio;

public class Cliente {
	String nome;
	String funcao;
	String email;
	
	
	public Cliente (String nome, String funcao, String email) {
		this.nome= nome;
		this.funcao = funcao;
		this.email = email;
		
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.nome);
		sb.append(";");
		sb.append(this.funcao);
		sb.append(";");
		sb.append(this.email);
		
		return sb.toString();
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
