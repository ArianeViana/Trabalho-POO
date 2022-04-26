package br.com.residencia.banco.contas;

public class ContaCorrente extends Conta {

	// Atributos
		
	Integer idContaCorrente;
	Double chequeEspecial;
	Double tarifa;
	
	//GETTERS AND SETTERS
	
	public Integer getIdContaCorrente() {
		return idContaCorrente;
	}

	public void setIdContaCorrente(Integer idContaCorrente) {
		this.idContaCorrente = idContaCorrente;
	}

	public Double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public Double getTarifa() {
		return tarifa;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}
	
	

}
