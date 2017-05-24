package br.com.fiap.bo;

import javax.ejb.Remote;

@Remote
public interface CarrinhoCompraBO {

	void adicionar(double dolar);
	
	double total();
	
}