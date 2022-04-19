package br.com.residencia.banco.pessoas;

public class Gerente {

	// ATRIBUTOS
	private Integer idGerente;
	private String senha;
	private float salario;

	// MÉTODOS
	public void contratar() {
		
	}
	
	public void demitir() {
		
	}
	
	// GETTERS AND SETTERS
	public String getSenha() {
		return senha;
	}

	public Gerente(Integer idGerente) {
		super();
		this.idGerente = idGerente;
	}

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
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

	// CONSTRUTOR

	public Gerente(Integer idGerente, String senha, float salario) {
		super();
		this.idGerente = idGerente;
		this.senha = senha;
		this.salario = salario;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Gerente [idGerente=" + idGerente + ", senha=" + senha + ", salario=" + salario + "]";
	}

}
