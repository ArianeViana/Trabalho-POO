package br.com.residencia.banco.contas;

public class ContaCorrente extends Conta {

	// Atributos
		
	private Integer idContaCorrente;
	private Integer totalSaques = 0, totalDepositos = 0, totalTransferencias = 0;
	private double totalTributos = 0.0;
	
	//GETTERS AND SETTERS
	
	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}
	

	public Integer getTotalSaques() {
		return totalSaques;
	}

	public Integer getTotalDepositos() {
		return totalDepositos;
	}

	public Integer getTotalTransferencias() {
		return totalTransferencias;
	}

	public double getTotalTributos() {
		this.totalTributos = this.getCobraDeposito() + this.getCobraSaque() + this.getCobraTransferencia();
		return totalTributos;
	}

	//CONSTRUTOR
//	public ContaCorrente() {
//		super();
//	}
//		
	public ContaCorrente(Integer idConta, String numeroConta, Double saldo, Integer idContaCorrente) {
		super(idConta, numeroConta, saldo);
		this.idContaCorrente = idContaCorrente;
	}

	@Override
	public boolean sacar(double valor) {
		if (this.saldo < valor || valor == 0) {
			System.out.println("Não é possível sacar esse valor");
			return false;	
		} else {
			
			double novoSaldo = this.saldo - valor - this.getCobraSaque();
			this.saldo = novoSaldo;
			++totalSaques;
			return true;
		}
	}

	@Override
	public void depositar(double valor) {
		if(valor < 0) {
			System.out.println("Só é possivel fazer depósitos com valores acima de R$0,00");
		}else {
			this.saldo += valor - this.getCobraDeposito();
			++totalDepositos;
		}
	}


	@Override
	public boolean transferir(double valor, Conta contaDestino) {
		if (this.saldo > valor) {
			this.sacar(valor); // DESCONTA 0.1
			this.saldo -= getCobraDeposito(); // DESCONTA 0.1
			contaDestino.depositarPorTransferencia(valor,contaDestino);
			++totalTransferencias;
			return true;
		} else {
			System.out.println("Saldo Insuficiente.");
			return false;
		}
	}

}
