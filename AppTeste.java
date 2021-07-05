package com.ericka.appIndicadoresGestao.modelo.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
					
					if(campos.length == 2) {
						System.out.println("Cliente/Função");
							
					} else {
						switch (campos[0].toUpperCase()) {
						case "P":
						case "p":
							System.out.println("Indicador de Projeto:");
						break;
						
						case "S":
						case "s":
							System.out.println("Indicador de Desempenho Setorial:");
						break;
						
						case "E":
						case "e":
							System.out.println("Indicador de Planejamento Estratégico:");
						break;
							
						default:
							System.out.println("Entrada inválida.");
							break;

							}
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
			System.out.println("Processamento finalizado!");
		}
		
	}
}
