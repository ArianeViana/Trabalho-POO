package br.com.residencia.banco.principal;

import java.io.IOException;

import java.util.Scanner;

import br.com.residencia.banco.contas.Conta;
import br.com.residencia.banco.logins.Login;
import br.com.residencia.banco.menus.MenuConta;
import br.com.residencia.banco.io.EscritaCorrente;
import br.com.residencia.banco.io.EscritaPoupanca;
import br.com.residencia.banco.io.Leitura;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
						
		// MENU CONTA CLIENTE
		
//		MenuConta m = new MenuConta();
//		m.menuOpcoes();
//	
//				
		Leitura.leitor("arquivo.txt");
		Login.login();
		
		//Escrita
//				EscritaCorrente.comprovanteTransacoes(null);
//				EscritaPoupanca.comprovanteRendimento(null, 0, null);
				

	}
}
