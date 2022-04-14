package br.com.trabalhoBanco;

public class Conta {

	// Atributos
	String titular;
	String numeroConta;
	double saldo;
	String tipoDeConta;

	//Métodos 
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;

	}
	
	public boolean transferir(double valor, Conta contaDestino) {
		if (this.saldo > valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	
	public void exibirExtrato() {
		System.out.println(this.titular + " " + this.numeroConta + " " + this.saldo + " " + this.tipoDeConta);
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
