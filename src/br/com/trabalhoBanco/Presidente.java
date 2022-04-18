package br.com.trabalhoBanco;

public class Presidente {
	
	private String nome;
	private String cpf;
	private String senha;
	private float salario;
	
	//GETTERS AND SETTERS
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	//CONSTRUTOR
	public Presidente(String nome, String cpf, String senha, float salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.salario = salario;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Presidente [nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + ", salario=" + salario + "]";
	}
	
}
	
