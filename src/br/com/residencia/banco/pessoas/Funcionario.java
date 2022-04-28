package br.com.residencia.banco.pessoas;

public class Funcionario extends Pessoa {
	
	private Integer idFuncionario;
	private Double salario;
	private String cargo;
	
	// GETTERS AND SETTERS
	
	public Integer getIdFuncionario() {
		return idFuncionario;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	//CONTSRUTOR
//	public Funcionario() {
//		super();
//	}
	
	public Funcionario(String nome, String cpf, Double salario) {
		super(nome, cpf);
		this.salario = salario;
		
	}
}
