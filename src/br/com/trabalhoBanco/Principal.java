package br.com.trabalhoBanco;


public class Principal {

	public static void main(String[] args) {

		Conta cliente01 = new Conta();
		cliente01.titular = "Thiago Thurler";
		cliente01.numeroConta = "12345";
		cliente01.saldo = 1000;
		cliente01.tipoDeConta = "Física";

		Conta cliente02 = new Conta();
		cliente02.titular = "Ariane Viana";
		cliente02.numeroConta = "98765";
		cliente02.saldo = 2500;
		cliente02.tipoDeConta = "Jurídica";
	
		

		System.out.println(cliente01.titular + " Seu saldo atual é de: R$ " + cliente01.saldo);
		System.out.println(cliente02.titular + " Seu saldo atual é de: R$ " + cliente02.saldo);
		System.out.println("\n");
		if(cliente01.sacar(800)) {
			System.out.println("Saque concluído!");
		}else {
			System.out.println("Saldo Insuficiente...");
		}
		System.out.println(cliente01.titular + " Seu saldo atual após o saque é de: R$ " + cliente01.saldo);
		
// TRANFERIR
		
		
			if (cliente02.transferir(100, cliente01)) {
				System.out.println("Transferência realizada com sucesso!");
			}else
				System.out.println("Saldo insuficiente!");
			
		
		
		
		System.out.println(cliente01.titular + " Saldo atual após transferência: " + cliente01.saldo);
		System.out.println(cliente02.titular + " Seu saldo atual é: " + cliente02.saldo);

		
		System.out.println(cliente01.titular + "Seu saldo atual é de: R$ " + cliente01.saldo);
		//cliente01.depositar(100);
		System.out.println(cliente01.titular + "Seu saldo após o depósito é de: R$ " + cliente01.saldo);

	}
}
