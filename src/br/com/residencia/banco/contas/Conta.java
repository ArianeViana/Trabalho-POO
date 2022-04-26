package br.com.residencia.banco.contas;

import java.util.Date;

public class Conta {
	
	Integer idConta;
	String tipoConta;
	String senha;
	private String numeroAgencia;
	private String numeroConta;
	private Double saldo;
	Date dataAbertura;
	boolean status;
	
	//GETTERS AND SETTERS
	
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
//	Métodos 
	
	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;

	}
	
	public boolean transferir(double valor, ContaCorrente contaDestino) {
		if (this.saldo > valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public void exibirExtrato() {
		
	}

	public void pagarContas() {

	}

	public void investir() {

	}

	public void pegarEmprestimo() {

	}

	public void fecharConta() {

	}
}
