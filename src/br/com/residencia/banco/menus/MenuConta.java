package br.com.residencia.banco.menus;

import java.util.Scanner;

public class MenuConta {
	
	Scanner sc = new Scanner(System.in);

	public static void menuOpcoes() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================================");
		System.out.println("           G R U P O  3  B A N K I N G             ");
		System.out.println("===================================================");
		System.out.println("[1] Movimentação da Conta");
		System.out.println("[2] Relatórios");
		System.out.println("[3] Sair");
		System.out.print("Operação: ");
		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			if (opcao == 1) {
				MenuConta.operacoes();
				System.out.println("Digite o valor de saque: ");
				double valor = sc.nextDouble();
			//	c1.sacar(valor);

			} else if (opcao == 2) {
				
				System.out.println("Digite o valor do deposito: ");
				double valor = sc.nextDouble();
			//	c1.depositar(valor);

			} else if (opcao == 3) {
				System.out.println("Digite o valor da transferência: ");
				double valor = sc.nextDouble();
				System.out.println("Digite o número da conta destino: ");
				String numContaDestino = sc.next();
//				for (int i = 0; i < 2; i++) {
//					if(minhasContas[i].numConta.equals(numContaDestino)) {
//					Conta contaDestino = minhasContas[i];
				//	c1.transferir(100.0, c2);
				//	c1.transferir(valor, minhasContas, contaDestino);
			} 			
			 else if (opcao == 4) {
				System.out.println("sair"); // CHAMAR MENU LOGIN
				break;
			}

		case 2:
			System.out.println("Relatórios");
			break;

		case 3:
			System.out.println("SAIR");
			
			break;

		default:
			System.out.println("Opção inválida.");
			
		}	
	}
	public static void operacoes() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===================================================");
		System.out.println("          S I S T E M A   B A N C A R I O          ");
		System.out.println("===================================================");
		System.out.println("[1] Saque");
		System.out.println("[2] Depósito");
		System.out.println("[3] Transferência");
		System.out.println("[4] Sair");
		System.out.print("Digite a opção desejada: ");
		int oper = sc.nextInt();
		
		sc.close();
	
	}		
}   	
	
	