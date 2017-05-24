package br.com.fiap.bo.impl;

import javax.ejb.Stateful;

import br.com.fiap.bo.CarrinhoCompraBO;

@Stateful
public class CarrinhoCompraBOImpl implements CarrinhoCompraBO {
	
	private double total;
	
	@Override
	public void adicionar(double dolar) {
		total += dolar;
	}

	@Override
	public double total() {
		return total;
	}

}
