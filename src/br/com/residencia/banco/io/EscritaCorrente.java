package br.com.residencia.banco.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;

import br.com.residencia.banco.contas.ContaCorrente;

public class EscritaCorrente {
	

	final static String PATH_BASICO = "./temp/";
    final static String EXTENSAO = ".txt";
    
    	public static void comprovanteTransacoes(ContaCorrente contaCorrente) throws IOException {

        String nomeArquivo = contaCorrente.getIdCliente() + " " + contaCorrente.getNumeroAgencia()+ " " + contaCorrente.getNumeroConta() + contaCorrente.getSaldo() + "txt";
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nomeArquivo + EXTENSAO + true));
        
        String linha ="";
        linha = "\t\t\n===========Transações============\n";
        for (Entry<String, Double> entry : contaCorrente.getTipoTransacaoValor().entrySet()) {
        	linha+=String.format("""
        			ID Cliente: %s
        			Agência: %s
        			Conta: %s
        			Saldo: %.2f
        			Tipo Transação: %s
        			Valor: %.2f
        			""",contaCorrente.getIdCliente(),contaCorrente.getNumeroAgencia(),contaCorrente.getNumeroConta(), contaCorrente.getSaldo()
        				,entry.getKey(),entry.getValue());
	    }
        linha += "Total tarifas: R$" + contaCorrente.getTotalTaxas();
        linha += "\t\t\n============FIM============";
        buffWrite.write(linha);
        buffWrite.close();
               	
    	}
	
}
