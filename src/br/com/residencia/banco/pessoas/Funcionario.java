package br.com.residencia.banco.pessoas;

public class Funcionario extends Pessoa {
	
	Integer idFuncionario;
	String senhaAcesso;
	String login;
	Double salario;
	String cargo;
	
	// GETTERS AND SETTERS
	
	public Integer getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getSenhaAcesso() {
		return senhaAcesso;
	}
	public void setSenhaAcesso(String senhaAcesso) {
		this.senhaAcesso = senhaAcesso;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	//METODOS
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
	//CONTSRUTOR
	public Funcionario(Integer idFuncionario, String senhaAcesso, String login, Double salario, String cargo) {
		super();
		this.idFuncionario = idFuncionario;
		this.senhaAcesso = senhaAcesso;
		this.login = login;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	
	
}
