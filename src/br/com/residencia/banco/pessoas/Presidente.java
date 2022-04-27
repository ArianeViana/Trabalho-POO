package br.com.residencia.banco.pessoas;

import java.util.List;

public class Presidente extends Funcionario {

	// ATRIBUTOS
	private Integer idPresidente;
	List<Diretor> diretores; //= new ArrayList<>()


	// GETTERS AND SETTERS
	public Integer getIdPresidente() {
		return idPresidente;
	}

	//CONTSRUTOR
	public Presidente() {
		super();
	}
}
