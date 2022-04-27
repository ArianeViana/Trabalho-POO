package br.com.residencia.banco.pessoas;

import java.util.List;

import br.com.residencia.banco.agencias.Agencia;

public class Diretor extends Funcionario{
	

	// ATRIBUTOS
	private Integer idDiretor;
	private Integer qteAgencias;
	List<Agencia> agencias; // = new ArrayList<>();
	

	// GETTERS AND SETTERS
	public Integer getIdDiretor() {
		return this.idDiretor;
	}

	public Integer getQteAgencias() {
		return this.qteAgencias;
	}

	public void setQteAgencias(Integer qteAgencias) {
		this.qteAgencias = qteAgencias;
	}

	//CONSTRUTOR
	public Diretor() {
		super();
	}	
}
