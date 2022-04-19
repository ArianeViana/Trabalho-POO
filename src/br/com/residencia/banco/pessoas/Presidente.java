package br.com.residencia.banco.pessoas;

public class Presidente {

	// ATRIBUTOS
	private Integer idPresidente;
	private String senha;
	private float salario;

	// MÉTODOS
	public void abrirAgencia() {

	}

	// GETTERS AND SETTERS
	public Integer getIdPresidente() {
		return idPresidente;
	}

	public void setIdPresidente(Integer idPresidente) {
		this.idPresidente = idPresidente;
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

	// CONSTRUTOR
	public Presidente(Integer idPresidente, String senha, float salario) {
		super();
		this.idPresidente = idPresidente;
		this.senha = senha;
		this.salario = salario;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Presidente [idPresidente=" + idPresidente + ", senha=" + senha + ", salario=" + salario + "]";
	}

}
