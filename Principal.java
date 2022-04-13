package br.com.trabalhoBanco;


public class Principal {

	public static void main(String[] args) {

		Conta thiago = new Conta("Thiago", "12356", 1.99, "Conta-corrente");
		Conta ariane = new Conta("Ariane", "987456", 5000000.00, "Jurídica");
		Conta vanessa = new Conta("Vanessa", "856974", 1000000.00, "Poupança");
		Conta andrea = new Conta("Andrea", "658987", 50000.00, "Conta-corrente");
		Conta ricardo = new Conta("Ricardo", "569213", 800000.00, "Poupança");
		Conta douglas = new Conta("Douglas", "569874", 700000.00, "Jurídica");
		// ContaClientes Deby = new ContaClientes();

		// Deby.titular = "Debora";
		// Deby.numeroConta = "569874";
		// Deby.saldo = 5.00;

		thiago.exibirExtrato();
		ariane.exibirExtrato();
		vanessa.exibirExtrato();
		andrea.exibirExtrato();
		ricardo.exibirExtrato();
		douglas.exibirExtrato();

		// Deby.exibirExtrato();

		// Ariane.sacar();

	}
}
