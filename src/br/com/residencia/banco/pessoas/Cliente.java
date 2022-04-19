package br.com.residencia.banco.pessoas;

public class Cliente {

	// ATRIBUTOS
	private Integer idCliente;
	private Integer idGerente;

	// GETTERS AND SETTERS
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}

	// CONSTRUTOR
	public Cliente(Integer idCliente, Integer idGerente) {
		super();
		this.idCliente = idCliente;
		this.idGerente = idGerente;
	}

	// MÉTODOS
	public void abrirConta() {

	}

	public void fecharConta() {

	}

	// TO STRING
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", idGerente=" + idGerente + "]";
	}

}
