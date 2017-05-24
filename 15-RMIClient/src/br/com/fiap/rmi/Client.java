package br.com.fiap.rmi;

import java.rmi.Naming;
import br.com.fiap.bo.RestauranteBO;

public class Client {

	public static void main(String[] args) throws Exception {
		RestauranteBO bo = (RestauranteBO)
			Naming.lookup("rmi://127.0.0.1:8080/restaurante");
		
		double taxaServico = bo.calcularTaxaServico(250);
		
		System.out.println("Taxa: " + taxaServico);
		
	}
	
}
