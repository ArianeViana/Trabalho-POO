package br.com.residencia.banco.contas;

public class ContaPoupanca extends Conta {
	
	Integer idContaPoupanca;
	Double rendimento;
	
	//GETTERS AND SETTERS
	
	public Integer getIdContaPoupanca() {
		return idContaPoupanca;
	}
	public void setIdContaPoupanca(Integer idContaPoupanca) {
		this.idContaPoupanca = idContaPoupanca;
	}
	public Double getRendimento() {
		return rendimento;
	}
	public void setRendimento(Double rendimento) {
		this.rendimento = rendimento;
	}
	
	
}
