package br.com.residencia.banco.logins;

import java.util.Scanner;
import br.com.residencia.banco.io.Leitura;
import br.com.residencia.banco.menus.MenuConta;
import br.com.residencia.banco.menus.MenuRelatorio;
import br.com.residencia.banco.enums.TipoPessoa;

public class Login {
	public static void login() {
		String cpf;
		String senha;
		Boolean teste = false;
		String nomeCliente = "";
		String nomeGerente = "";
		String nomeDiretor = "";
		String nomePresidente = "";
		TipoPessoa tipo = null;		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("=====Banco 16Bits=====\n");
		System.out.println("CPF: ");
		cpf  = scan.next();
		System.out.println("Senha: ");
		senha = scan.next();
		
		for(int i = 0; i < Leitura.getClientes().size(); i++) {
			if (Leitura.getClientes().get(i).getCpf().equals(cpf) && Leitura.getClientes().get(i).getSenha().equals(senha)) {
				teste = true;
				nomeCliente = Leitura.getClientes().get(i).getNome();
				tipo = Leitura.getClientes().get(i).getTipoPessoa();
			}
		}		
		
		for(int i = 0; i < Leitura.getGerentes().size(); i++) {
			if (Leitura.getGerentes().get(i).getCpf().equals(cpf) && Leitura.getGerentes().get(i).getSenha().equals(senha)) {
				teste = true;
				nomeGerente = Leitura.getGerentes().get(i).getNome();
				tipo = Leitura.getGerentes().get(i).getTipoPessoa();
			}
		}
		
		for(int i = 0; i < Leitura.getDiretores().size(); i++) {
			if (Leitura.getDiretores().get(i).getCpf().equals(cpf) && Leitura.getDiretores().get(i).getSenha().equals(senha)) {
				teste = true;
				nomeDiretor = Leitura.getDiretores().get(i).getNome();
				tipo = Leitura.getDiretores().get(i).getTipoPessoa();
			}
		}
		
		if (Leitura.getPresidente().get(0).getCpf().equals(cpf) && Leitura.getPresidente().get(0).getSenha().equals(senha)) {
			teste = true;
			nomePresidente = Leitura.getPresidente().get(0).getNome();
			tipo = Leitura.getPresidente().get(0).getTipoPessoa();
		}
		
		
		if(teste == true && tipo == TipoPessoa.CLIENTE) {			
			System.out.println("\nOlá, " + nomeCliente + "\n");
			MenuConta.menuOpcoes();
		}else if(teste == true) {			
			if(tipo == TipoPessoa.GERENTE) {
				System.out.println("\nOlá, " + nomeGerente + "\n");
				MenuRelatorio.relatorio();				
			}else if(tipo == TipoPessoa.DIRETOR) {
				System.out.println("\nOlá, " + nomeDiretor + "\n");
				MenuRelatorio.relatorio();
			}else if(tipo == TipoPessoa.PRESIDENTE)	{
				System.out.println("\nOlá, " + nomePresidente + "\n");
				MenuRelatorio.relatorio();
			}
		}else {
			System.out.println("Erro");
		}
		
	}
}

