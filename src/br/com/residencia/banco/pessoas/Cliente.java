package br.com.residencia.banco.pessoas;

public class Cliente extends Pessoa {

	// ATRIBUTOS
	private Integer idCliente;
	private Gerente idGerente;

	// GETTERS AND SETTERS
	public Integer getIdCliente() {
		return idCliente;
	}

	public Gerente getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Gerente idGerente) {
		this.idGerente = idGerente;
	}

	//CONSTRUTOR
	public Cliente() {
		super();
	}
	
	
}
