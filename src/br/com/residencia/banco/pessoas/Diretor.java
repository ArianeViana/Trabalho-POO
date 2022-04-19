package br.com.residencia.banco.pessoas;

public class Diretor {

	// ATRIBUTOS
	private Integer idDiretor;
	private String senha;
	private float salario;
	
	// MÉTODOS
	public void aumentarSalario() {
		
	}

	// GETTERS AND SETTERS
	public Integer getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(Integer idDiretor) {
		this.idDiretor = idDiretor;
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
	public Diretor(Integer idDiretor, String senha, float salario) {
		super();
		this.idDiretor = idDiretor;
		this.senha = senha;
		this.salario = salario;
	}
	// TO STRING

	@Override
	public String toString() {
		return "Diretor [idDiretor=" + idDiretor + ", senha=" + senha + ", salario=" + salario + "]";
	}

}
