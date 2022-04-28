package br.com.residencia.banco.logins;

import java.util.Scanner;

import br.com.residencia.banco.io.Leitura;
import br.com.residencia.banco.menus.MenuConta;

public class Login {
	public static void loginCliente() {
		String cpf;
		String senha;
		Boolean teste = false;
		String nomeCliente = "";
		
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
			}
		}		
		if(teste == true) {
			System.out.println("\nOlá, " + nomeCliente + "\n");
			MenuConta.menuOpcoes();
		}else {
			System.out.println("Erro");
			//fazer for para dar mais duas chances antes de bloquear a conta
		}
		
	}
}

