package br.com.residencia.banco.contas;

public class Conta {

	private Integer idConta;
	private String tipoConta; // trocar para ENUM
	private String senha;
	private String numeroAgencia;
	private String numeroConta;
	private Double saldo;

	// GETTERS AND SETTERS

	public Integer getIdConta() {
		return idConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

//	public String getSenha() {
//		return senha;
//	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) { // criei para teste
		this.saldo = saldo;
	}

//	Métodos 

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo Insuficiete");
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

	public boolean transferir(double valor, ContaCorrente contaDestino) {
		if (this.saldo > valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}

	// CONSTRUTOR
	public Conta() {
		super();
	}

//	public void fecharConta() {
//
//	}

}
