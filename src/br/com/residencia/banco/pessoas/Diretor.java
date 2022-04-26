package br.com.residencia.banco.pessoas;

import java.util.List;

import br.com.residencia.banco.agencias.Agencia;

public class Diretor extends Funcionario{

	//CONSTRUTOR
	public Diretor(Integer idFuncionario, String senhaAcesso, String login, Double salario, String cargo) {
		super(idFuncionario, senhaAcesso, login, salario, cargo);
	
	}

	// ATRIBUTOS
	private Integer idDiretor;
	Integer qteAgencias;
	List<Agencia> agencias; // = new ArrayList<>();
	
	
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

	public Integer getQteAgencias() {
		return qteAgencias;
	}

	public void setQteAgencias(Integer qteAgencias) {
		this.qteAgencias = qteAgencias;
	}
	

}
