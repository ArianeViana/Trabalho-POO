package br.com.residencia.banco.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.residencia.banco.contas.ContaCorrente;
import br.com.residencia.banco.io.Leitura;
import br.com.residencia.banco.pessoas.Cliente;
import br.com.residencia.banco.pessoas.Gerente;

public class Leitura {
	
	final static String PATH_BASICO = "./temp/";
	final static String EXTENSAO = ".txt";
	
	private static List<Cliente> clientes = new ArrayList<>();
	private static List<Gerente> gerentes = new ArrayList<>();
	private static List<ContaCorrente> contasCorrente = new ArrayList<>();

		
	public static void leitor(String path) throws IOException {
		List<Cliente> clientesArray = new ArrayList<>();
		List<Gerente> gerentesArray = new ArrayList<>();
		List<ContaCorrente> contasCorrenteArray = new ArrayList<>();
			 
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path));
		String linha = "";
		
		try { 
			while (true) {
				linha = buffRead.readLine();
				if (linha != null) {
					String[] vetor = linha.split(";");
					if(vetor[0].equalsIgnoreCase("Cliente")) {
						clientesArray.add(new Cliente(vetor[1], vetor[2], vetor[3]));
						setClientes(clientesArray);
					}else if(vetor[0].equalsIgnoreCase("Gerente")){
						gerentesArray.add(new Gerente(vetor[1], vetor[2], Double.parseDouble(vetor[3])));
						setGerentes(gerentesArray);						
					}else if(vetor[0].equalsIgnoreCase("ContaCorrente")){
						contasCorrenteArray.add(new ContaCorrente(Integer.parseInt(vetor[1]), vetor[2], Double.parseDouble(vetor[3]), Integer.parseInt(vetor[4])));
						setContasCorrente(contasCorrenteArray);
					}
				} else {
					break;
				}
			}
			buffRead.close();
		}
		catch (FileNotFoundException e) { 
			System.out.println("Arquivo não encontrado no caminho " + PATH_BASICO + path); 
		} 
			
	}

	public static List<Cliente> getClientes() {
		return clientes;
	}

	public static void setClientes(List<Cliente> clientes) {
		Leitura.clientes = clientes;
	}

	public static List<Gerente> getGerentes() {
		return gerentes;
	}

	public static void setGerentes(List<Gerente> gerentes) {
		Leitura.gerentes = gerentes;
	}

	public static List<ContaCorrente> getContasCorrente() {
		return contasCorrente;
	}

	public static void setContasCorrente(List<ContaCorrente> contasCorrente) {
		Leitura.contasCorrente = contasCorrente;
	}
}