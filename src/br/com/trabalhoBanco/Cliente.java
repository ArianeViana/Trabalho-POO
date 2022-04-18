package br.com.trabalhoBanco;

public class Cliente {
	// ATRIBUTOS
	private String nome;
	private String cpf;
	//private String endereco;
	private String telefone;

	// GETTERS AND SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

//	public String getEndereco() {
//		return endereco;
//	}

//	public void setEndereco(String endereco) {
//		this.endereco = endereco;
//	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// CONSTRUTOR
	public Cliente(String nome, String cpf, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
//		this.endereco = endereco;
		this.telefone = telefone;
	}

	// MÉTODOS

	public void abrirConta() {

	}

	public void fecharConta() {

	}

//	// TO STRING
//	@Override
//	public String toString() {
//		return "Cliente [Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", Telefone: " + telefone + "]";
//	}

}
