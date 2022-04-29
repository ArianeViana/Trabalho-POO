package br.com.residencia.banco.contas;

import br.com.residencia.banco.pessoas.Cliente;

public abstract class Conta {

	private Integer idConta;
	private String tipoConta; // trocar para ENUM
	private String senha;
	private String numeroAgencia;
	private String numeroConta;
	protected Double saldo;
	private Cliente cliente;
	private static int totalDeContas;
	private static final double TAXA_SAQUE =  0.1;
	private static final double TAXA_DEPOSITO = 0.1;
	private static final double TAXA_TRANSFERENCIA = 0.2;

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
	

	public double getSaldo() {
		return saldo;
	}
	
	public static double getTaxaSaque() {
		return TAXA_SAQUE;
	}

	public static double getTaxaDeposito() {
		return TAXA_DEPOSITO;
	}

	public static double getTaxaTransferencia() {
		return TAXA_TRANSFERENCIA;
	}


	public void setSaldo(Double saldo) { // criei para teste
		this.saldo = saldo;
	}
	
	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public void setTotalDeContas(Integer totalDeContas) {
		this.totalDeContas = totalDeContas;
	}
	public Integer getIdCliente() {
		return this.cliente.getIdCliente(); 
	}

//	Métodos 

	public abstract boolean sacar(double valor);

	//PARA TRASNFERÊNCIA
	public void depositarPorTransferencia(double valor, Conta contaDestino) {
		System.out.printf("Valor Depositado: %.2f " , valor);
		double novoSaldo = contaDestino.getSaldo() + valor;
		contaDestino.saldo = novoSaldo;
	}

	public abstract void depositar(double valor);
	

	public abstract boolean transferir(double valor, Conta contaDestino); 

	// CONSTRUTOR
	public Conta() {
		super();
		this.totalDeContas = totalDeContas +1;
	}
	
	public Conta(Integer idConta, String numeroConta, Double saldo) {
		this.idConta = idConta;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

//	public void fecharConta() {
//
//	}

}
