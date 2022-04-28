package br.com.residencia.banco.contas;

public class ContaCorrente extends Conta {

	// Atributos
		
	private Integer idContaCorrente;
	
	//GETTERS AND SETTERS
	
	public Integer getIdContaCorrente() {
		return idContaCorrente;
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
	

}
