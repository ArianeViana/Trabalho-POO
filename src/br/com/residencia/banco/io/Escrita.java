package br.com.residencia.banco.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escrita {
	
	final static String PATH_BASICO = "./temp/";
	final static String EXTENSAO = ".txt";
	
	public static void escritor() throws IOException {
		
		String nomeArquivo = "relatorioTeste.txt";
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo));
		
		String linha = "Você efetuou um saque. Foi cobrado R$0.10" ;
		
		buffWrite.append(linha);
		buffWrite.close();
	}
	
}
