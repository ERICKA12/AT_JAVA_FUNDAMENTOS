package com.ericka.appIndicadoresGestao.modelo.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.ericka.appIndicadoresGestao.modelo.dominio.DesempenhoSetorial;
import com.ericka.appIndicadoresGestao.modelo.dominio.Estrategico;
import com.ericka.appIndicadoresGestao.modelo.dominio.Projeto;

public class AppTeste {
	public static void main(String[] args) {
		try {
			
			String dir = "C:/INFNET/JAVA/JAVA FUNDAMENTOS/ASSESSMENT_JAVA/";
			String arq = "setores.txt";
			
			try {
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				FileReader file = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(file);
				
				
				String linha = leitura.readLine();
			
				while(linha != null) {
					
					String[] campos = linha.split(";");
					
						switch (campos[0].toUpperCase()) {
						case "X":							
							System.out.println("Indicadores:");							
							break;
							
							
						case "P":
						case "p":
							Projeto prj1 = new Projeto(campos[1], campos[2], campos[3], campos[4]);
							prj1.setNomeProjeto(campos[5]);
							prj1.setIndicadorProjeto(campos[6]);
							prj1.setMetaProjeto(Float.valueOf(campos[7]));
							prj1.setResponsavelProjeto(campos[8]);
							escrita.write(prj1.TotalDeindicadores());
							
							//System.out.println("Indicador de Projeto: "+prj1);
						break;
							
						
						case "S":
						case "s":
							DesempenhoSetorial ds1 = new DesempenhoSetorial(campos[1], campos[2], campos[3], campos[4]);
							ds1.setNomeMetrica(campos[5]);
							ds1.setIndicadorSetor(campos[6]);
							ds1.setMetaSetor(Float.valueOf(campos[7]));						
							ds1.setResponsavelSetor(campos[8]);
							escrita.write(ds1.TotalDeindicadores());

						break;
						
						case "E":
						case "e":
							Estrategico e1 = new Estrategico(campos[1], campos[2], campos[3], campos[4]);
							e1.setNomeProjetoEstrategico(campos[5]);
							e1.setIndicadorEstrategico(campos[6]);
							e1.setMetaEstrategico(Float.valueOf(campos[7]));
							e1.setResponsavelEstrategico(campos[8]);
							escrita.write(e1.TotalDeindicadores());
						break;
							
						default:
							System.out.println("Entrada inválida.");
							break;

							}
	
				linha = leitura.readLine();
				
				}
				
				file.close();
				leitura.close();
				escrita.close();
				fileW.close();
				
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
				
		} finally {
			System.out.println("Finalizado.");
		}
		
	}
}
