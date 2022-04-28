package br.com.residencia.banco.menus;

import java.util.Scanner;

public class MenuConta {
	
	

	public static void menuOpcoes() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.println("      MENU DE OPÇÕES          ");
		System.out.println("------------------------------");
		System.out.println("[1] Movimentação da Conta");
		System.out.println("[2] Relatórios");
		System.out.println("[3] Sair");
		System.out.print("Operação: ");
		
		int opcao = sc.nextInt();
		
	}

	public static void operacoes() {
		System.out.println("------------------------------");
		System.out.println("      ESCOLHA UMA OPERAÇÃO    ");
		System.out.println("------------------------------");
		System.out.println("[1] Saque");
		System.out.println("[2] Depósito");
		System.out.println("[3] Transferência");
		System.out.println("[4] Sair");
		System.out.print("Escolha uma opção: ");
		// int oper = sc.nextInt();
	}
}