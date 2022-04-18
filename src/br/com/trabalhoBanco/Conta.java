package br.com.trabalhoBanco;

public class Conta {

	// Atributos
	private String numeroAgencia;
	private String numeroConta;
	//private boolean statusConta; 
	//private Cliente titular;
	private double saldo;
	private String tipoConta;
	
	//GETTERS AND SETTERS

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

//	public boolean getStatusConta() {
//		return statusConta;
//	}

//	public void setStatusConta(boolean statusConta) {
//		this.statusConta = statusConta;
//	}

//	public Cliente getTitular() {
//		return titular;
//	}
//
//	public void setTitular(Cliente titular) {
//		this.titular = titular;
//	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

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
	
	//CONSTRUTOR
	
	public Conta(String numeroAgencia, String numeroConta, boolean statusConta, Cliente titular, double saldo,
			String tipoConta) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
//		this.statusConta = statusConta;
//		this.titular = titular;
		this.saldo = saldo;
		this.tipoConta = tipoConta;
	}
	
//	public void exibirExtrato() {
//		System.out.println(this.titular + " " + this.numeroConta + " " + this.saldo + " " + this.tipoConta);
//	}

	public void pagarContas() {

	}

	public void investir() {

	}

	public void pegarEmprestimo() {

	}

	public void fecharConta() {

	}
	
	

}
