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
	
	public boolean transferirValores(double valor, Conta cliente02) {
		if (this.saldo < valor) {
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			cliente02.saldo = cliente02.saldo + valor;
			return true;
			
		}
	}
	
	
	public void exibirExtrato() {
		System.out.println(this.titular + " " + this.numeroConta + " " + this.saldo + " " + this.tipoDeConta);
	}

	
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
