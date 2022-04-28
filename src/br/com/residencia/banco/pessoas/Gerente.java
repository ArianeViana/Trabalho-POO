package br.com.residencia.banco.pessoas;

import br.com.residencia.banco.agencias.Agencia;

public class Gerente extends Funcionario {

	// ATRIBUTOS
	private Integer idGerente;
	private Agencia idAgencia;
	
	
	// GETTERS AND SETTERS
	public Integer getIdGerente() {
		return idGerente;
	}

	public Agencia getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(Agencia idAgencia) {
		this.idAgencia = idAgencia;
	}

	//CONTSRUTOR
//	public Gerente() {
//		super();
//	}

	public Gerente(String nome, String cpf, Double salario) {
		super(nome, cpf, salario);
		
	}

}
