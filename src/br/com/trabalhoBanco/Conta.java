package br.com.trabalhoBanco;

public class Conta {

	// Atributos
	String titular;
	String numeroConta;
	double saldo;
	String tipoDeConta;

	// M�todo Especial

	public Conta(String titular, String numeroConta, double saldo, String tipoDeConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.tipoDeConta = tipoDeConta;
	}

	// M�todos

	public void exibirExtrato() {
		System.out.println(this.titular + " " + this.numeroConta + " " + this.saldo + " " + this.tipoDeConta);
	}

	// M�todos Propriedades da conta

	public void sacar() {
		System.out.println("Saquei");
	}

	public void depositar() {

	}

	// M�todos Tipos Opera��es

	public void transferirValores() {

	}

	public void pagarContas() {

	}

	public void investir() {

	}

	public void pegarEmprestimo() {

	}

	public void fecharConta() {

	}

}
