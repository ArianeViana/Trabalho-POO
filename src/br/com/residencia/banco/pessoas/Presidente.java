package br.com.residencia.banco.pessoas;

import java.util.List;

public class Presidente extends Funcionario {

		//CONSTRUTOR
	public Presidente(Integer idFuncionario, String senhaAcesso, String login, Double salario, String cargo) {
		super(idFuncionario, senhaAcesso, login, salario, cargo);
		
	}

	// ATRIBUTOS
	private Integer idPresidente;
	List<Diretor> diretores; //= new ArrayList<>()
	
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



}
