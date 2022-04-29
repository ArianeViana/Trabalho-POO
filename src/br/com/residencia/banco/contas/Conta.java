package br.com.residencia.banco.contas;

public abstract class Conta {

	private Integer idConta;
	private String tipoConta; // trocar para ENUM
	private String senha;
	private String numeroAgencia;
	private String numeroConta;
	protected Double saldo;
	private static int totalDeContas;
	private float cobraSaque;
	private float cobraDeposito;
	private float cobraTransferencia;

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
	
	public double getCobraSaque() {
		return this.cobraSaque  + 0.1d;
	}
	
	public double getCobraDeposito() {
		return this.cobraDeposito  + 0.1d;
	}
	
	public double getCobraTransferencia() {
		return cobraTransferencia + 0.2d;
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
	
	
	public void exibirRelatorioSacar() {
		System.out.println("Foram descontados R$ " + this.getCobraSaque() + " do seu saque.");
				
	}
	
	public void exibirRelatorioDeposito() {
		System.out.println("Foram descontados R$ " + this.getCobraDeposito() + " do seu depósito.");
				
	}
	
	public void exibirRelatorioTranferência() {
		System.out.println("Foram descontados R$ " + this.getCobraTransferencia() + " do seu depósito.");
				
	}

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
