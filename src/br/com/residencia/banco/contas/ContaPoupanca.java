package br.com.residencia.banco.contas;

public class ContaPoupanca extends Conta {
	
	private Integer idContaPoupanca;
	
	
	//GETTERS AND SETTERS
	
	public Integer getIdContaPoupanca() {
		return idContaPoupanca;
	}

	//CONSTRUTOR
	public ContaPoupanca() {
		super();
	}

	//METODOS
	
	@Override
	public boolean sacar(double valor) {
		if (this.saldo < valor || valor < 0) {
			System.out.println("N�o � poss�vel sacar esse valor");
			return false;
		} else {
			System.out.println("Valor Retirado: " + valor);
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}

	}

	@Override
	public void depositar(double valor) {
		if(valor < 0) {
			System.out.println("S� � possivel fazer dep�sitos com valores acima de R$0,00");		
		}else {
			this .saldo += valor;
		}
	}
			
	
	@Override
	public boolean transferir(double valor, Conta contaDestino) {
		if (this.saldo > valor) {
			this.sacar(valor);
			super.depositarPorTransferencia(valor, contaDestino);
			return true;
		} else {
			System.out.println("Saldo Insuficiente.");
			return false;
		}
	}
	// RENDIMENTO POUPAN�A

	public void calculaRendimentos(double valor, Integer dias) {
		if (dias < 15) {
			System.out.println("Rendimentos s� podem ser calculados acima de 14 dias.");
		} else {
			double valorFinal = dias * 0.001 * valor;
			System.out.format("Valor informado: R$" + valor + " [Seu rendimento ser� de: R$" + valorFinal
					+ " no prazo informado.]");
		}

	}
	
}
