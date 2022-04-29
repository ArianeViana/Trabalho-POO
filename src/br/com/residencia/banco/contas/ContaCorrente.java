package br.com.residencia.banco.contas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.residencia.banco.enums.TipoConta;
import br.com.residencia.banco.pessoas.Cliente;

public class ContaCorrente extends Conta {

	// Atributos
		
	private Integer idContaCorrente;
	private Cliente cliente;
	private List<Double> taxaTotalDeOperacoes = new ArrayList<>(); 
	private Map<String, Double> tipoTransacaoValor = new HashMap<>();
	
	//GETTERS AND SETTERS
	
	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}

	public Integer getIdCliente() {
		return this.cliente.getIdCliente(); // PARA CHAMAR O ID
	}


	public double getTotalTaxas() {
		return taxaTotalDeOperacoes.stream().mapToDouble(Double::doubleValue).sum();
							    
	}

	public Map<String, Double> getTipoTransacaoValor() {
		return tipoTransacaoValor;
	}
	

	//CONSTRUTOR
	public ContaCorrente(Integer idConta, TipoConta tipoConta, String numeroAgencia, String numeroConta, Double saldo,
			Integer idContaCorrente, Cliente cliente) {
		super(idConta, tipoConta, numeroAgencia, numeroConta, saldo);
		this.idContaCorrente = idContaCorrente;
		this.cliente = cliente;
		
	}
	

		//METODOS
	@Override
	public boolean sacar(double valor) {
		if (this.saldo < valor || valor == 0) {
			System.out.println("Não é possível sacar esse valor");
			return false;
		} else {

			double novoSaldo = this.saldo - valor - super.getTaxaSaque();
			this.saldo = novoSaldo;
			this.taxaTotalDeOperacoes.add(super.getTaxaSaque());
			this.tipoTransacaoValor.put("Saque", valor);// criei
			return true;
		}
	}

	
	@Override
	public void depositar(double valor) {
		if (valor < 0) {
			System.out.println("Só é possivel fazer depósitos com valores acima de R$0,00");
		} else {
			this.saldo += valor - super.getTaxaDeposito();
			this.taxaTotalDeOperacoes.add(super.getTaxaDeposito());
			this.tipoTransacaoValor.put("Depósito", valor);// criei
		}
	}

	@Override
	public boolean transferir(double valor, Conta contaDestino) {
		if (this.saldo > valor) {
			this.sacar(valor); // DESCONTA 0.1
			this.saldo -= super.getTaxaDeposito(); // DESCONTA 0.1
			contaDestino.depositarPorTransferencia(valor, contaDestino);
			this.taxaTotalDeOperacoes.add(super.getTaxaDeposito());
			this.tipoTransacaoValor.put("Transferência", valor);// criei
			return true;
		} else {
			System.out.println("Saldo Insuficiente.");
			return false;
		}
	}

}
