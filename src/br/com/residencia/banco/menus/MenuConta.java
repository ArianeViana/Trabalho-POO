package br.com.residencia.banco.menus;

import java.util.Scanner;

public class MenuConta {
	
	

	public static void menuOpcoes() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.println("      MENU DE OP��ES          ");
		System.out.println("------------------------------");
		System.out.println("[1] Movimenta��o da Conta");
		System.out.println("[2] Relat�rios");
		System.out.println("[3] Sair");
		System.out.print("Opera��o: ");
		
		int opcao = sc.nextInt();
		
	}

	public static void operacoes() {
		System.out.println("------------------------------");
		System.out.println("      ESCOLHA UMA OPERA��O    ");
		System.out.println("------------------------------");
		System.out.println("[1] Saque");
		System.out.println("[2] Dep�sito");
		System.out.println("[3] Transfer�ncia");
		System.out.println("[4] Sair");
		System.out.print("Escolha uma op��o: ");
		// int oper = sc.nextInt();
	}
}