package br.com.residencia.banco.pessoas;

import java.util.List;

import br.com.residencia.banco.agencias.Agencia;

public class Diretor extends Funcionario{

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

	
//
//	// CONSTRUTOR
//	public Diretor(Integer idDiretor, String senhaAcesso, float salario) {
//		super();
//		this.idDiretor = idDiretor;
//		this.senhaAcesso = senhaAcesso;
//		this.salario = salario;
//	}
//	// TO STRING
//
//	@Override
//	public String toString() {
//		return "Diretor [idDiretor=" + idDiretor + ", senha=" + senhaAcesso + ", salario=" + salario + "]";
//	}

}
