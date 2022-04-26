package br.com.residencia.banco.principal;

import java.io.IOException;

import br.com.residencia.banco.io.LeituraEscrita;
import br.com.residencia.banco.pessoas.Funcionario;
import br.com.residencia.banco.pessoas.Gerente;

public class Principal {

	public static void main(String[] args) throws IOException {
		//LeituraEscrita.leitor("objetoscriados.txt");
					
		//LeituraEscrita.escritor("./");

		
		Funcionario f01 = new Funcionario(01, "1234", "f01", 1000.00, "atendente");
		
		System.out.println(f01.getBonificacao());
		
		
		Gerente g01 = new Gerente(1,"2354","f01", 1500.00,"atendente",002,45631);
		
		System.out.println(g01.getBonificacao());
		System.out.println(f01.getSalario());
		System.out.println(g01.getSalario());
		//System.out.println(g01.getSenhaAcesso());
		//System.out.println(g01.getIdGerente());
		//System.out.println(g01.getIdFuncionario());
		
	}
}
