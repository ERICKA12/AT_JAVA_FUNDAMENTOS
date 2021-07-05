package com.ericka.appIndicadoresGestao.modelo.testes;

import com.ericka.appIndicadoresGestao.modelo.dominio.Projeto;

public class ProjetoTeste {
	
	public static void main(String[] args) {
		Projeto prj1 = new Projeto ("Saude animal", "Proteção à saúde animal", "Dezembro", 2020);
		prj1.setNomeProjeto("Bem-estar Animal");
		
		System.out.println(prj1);
		
	}

}
