package com.ericka.appIndicadoresGestao.modelo.testes;

import com.ericka.appIndicadoresGestao.modelo.dominio.DesempenhoSetorial;
import com.ericka.appIndicadoresGestao.modelo.dominio.Estrategico;
import com.ericka.appIndicadoresGestao.modelo.dominio.Indicador;
import com.ericka.appIndicadoresGestao.modelo.dominio.Projeto;

public class IndicadorTeste {
	public static void main(String [] args) {
		
		Projeto prj1 = new Projeto("Saude animal", "Proteção à saúde animal", "Dezembro", 2020);
		prj1.setNomeProjeto("Projeto Bem-estar animal");
		prj1.setIndicadorProjeto("nº de animais castrados");
		prj1.setMetaProjeto(100);
		prj1.setResponsavelProjeto("Gabiela");
		System.out.println("Desempenho de Projeto: "+prj1);
		
		
		DesempenhoSetorial ds1 = new DesempenhoSetorial("Monitoramento e Avaliação", "Apoio ao monitoramento de projetos", "Janeiro",2008);
		ds1.setIndicadorSetor("Nº de quadros de monitoramento elaborados");
		ds1.setMetaSetor(350);
		ds1.setNomeMetrica("Quadros de monitoramento elaborados");
		ds1.setResponsavelSetor("Victor");
		System.out.println("Desempenho Setorial: " + ds1);
		
		
		Estrategico e1 = new Estrategico("Programa de Educação para Sustentabilidade", "Educação",
				"Laboratório de Aprendizagem","Março", 2020);
		e1.setNomeProjetoEstrategico("Visão Sistêmica FAS 2030");
		e1.setIndicadorEstrategico("Percentual de alcance");
		e1.setMetaEstrategico(85);
		e1.setResponsavelEstrategico("Michelle");
		System.out.println("Planejamento Estratégico: " + e1);
		
	
	}

}
