package br.com.residencia.banco.pessoas;

public class Cliente extends Pessoa {

	// ATRIBUTOS
	private Integer idCliente;
	private Gerente idGerente;
	private String senha;

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

	public String getSenha() {
		return senha;
	}

	//CONSTRUTOR

	public Cliente(String nome, String cpf, String senha) {
		super(nome, cpf);
		this.senha = senha;
	}
	
}
