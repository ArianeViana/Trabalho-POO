package br.com.residencia.banco.pessoas;

import java.util.List;

public class Presidente extends Funcionario {

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



//	// CONSTRUTOR
//	public Presidente(Integer idPresidente, String senha, float salario) {
//		super();
//		this.idPresidente = idPresidente;
//		this.senha = senha;
//		this.salario = salario;
//	}
//
//	// TO STRING
//	@Override
//	public String toString() {
//		return "Presidente [idPresidente=" + idPresidente + ", senha=" + senha + ", salario=" + salario + "]";
//	}

}
