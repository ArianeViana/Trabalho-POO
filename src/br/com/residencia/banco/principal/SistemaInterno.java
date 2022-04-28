package br.com.residencia.banco.principal;

import java.io.IOException;

import java.util.Scanner;

import br.com.residencia.banco.contas.Conta;
import br.com.residencia.banco.logins.Login;
import br.com.residencia.banco.menus.MenuConta;
import br.com.residencia.banco.io.Leitura;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		// LeituraEscrita.leitor("objetoscriados.txt");

		// LeituraEscrita.escritor("./");

				
		// MENU CONTA CLIENTE
		
//		MenuConta m = new MenuConta();
//		Conta c1 = new Conta();
//		c1.setSaldo(1000.0);
//		Conta c2 = new Conta();
//		c2.setSaldo(1000.0);
//		
//		System.out.println(c1.getSaldo());
//		System.out.println(c2.getSaldo());
		
//		Scanner sc = new Scanner(System.in);
//		m.menuOpcoes();
//		int opcao = sc.nextInt();
//
//		switch (opcao) {
//		case 1:
//			m.operacoes();
//			opcao = sc.nextInt();
//			if (opcao == 1) {
//				System.out.println("Digite o valor de saque: ");
//				double valor = sc.nextDouble();
//				c1.sacar(valor);
//
//			} else if (opcao == 2) {
//
//				System.out.println("Digite o valor do deposito: ");
//				double valor = sc.nextDouble();
//				c1.depositar(valor);
//
//			} else if (opcao == 3) {
//				System.out.println("Digite o valor da transferência: ");
//				double valor = sc.nextDouble();
//				System.out.println("Digite o número da conta destino: ");
//				ContaCorrente id = sc.nextInt();
				//c1.transferir(100, c2);
//
//			} else if (opcao == 4) {
//				System.out.println("sair");
//			}
//			break;
//
//		case 2:
//			System.out.println("Relatórios");
//			break;
//
//		case 3:
//			System.out.println("SAIR");
//
//			break;
//
//		default:
//			System.out.println("Opção inválida.");
//		}
//		sc.close();
		//System.out.println(c1.getSaldo());
		//System.out.println(c2.getSaldo());
		
		Leitura.leitor("arquivo.txt");
		Login.loginCliente();

	}
}
