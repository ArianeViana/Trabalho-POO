package br.com.residencia.banco.pessoas;

public class Gerente extends Funcionario {

	// ATRIBUTOS
	private Integer idGerente;
	private Integer idAgencia;
	
	
	// GETTERS AND SETTERS
	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}

	public Integer getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(Integer idAgencia) {
		this.idAgencia = idAgencia;
	}

	// MÉTODOS
	public void contratar() {
		
	}
	
	public void demitir() {
		
	}
	
	public double getBonificacao() {  //* 1.5
		return super.getBonificacao() + this.salario * 0.05;
		
	}

	public Gerente(Integer idFuncionario, String senhaAcesso, String login, Double salario, String cargo,
			Integer idGerente, Integer idAgencia) {
		super(idFuncionario, senhaAcesso, login, salario, cargo);
		this.idGerente = idGerente;
		this.idAgencia = idAgencia;
	}	
	

}
