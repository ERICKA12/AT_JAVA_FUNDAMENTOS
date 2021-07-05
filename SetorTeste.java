package com.ericka.appIndicadoresGestao.modelo.testes;

import com.ericka.appIndicadoresGestao.modelo.dominio.Setor;

public class SetorTeste {
	public static void main(String[] args) {
		
		Setor s1 = new Setor("Programa de Gestão e Transparência","Superintendencia de Gestão e Planejamento","3366-0512");
		s1.setIndicador(null);
		System.out.println(s1);
	}

}
