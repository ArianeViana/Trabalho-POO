package br.com.residencia.banco.pessoas;

import java.util.Date;

public class Pessoa {
	
	//Atributos 
	//CHAMAR ENUM
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private Date dataNascimento;
	
		
	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	//CONSTRUTOR
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
}
