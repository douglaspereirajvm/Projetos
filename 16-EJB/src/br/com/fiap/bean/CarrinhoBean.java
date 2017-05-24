package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.bo.CarrinhoCompraBO;

@ManagedBean
@SessionScoped
public class CarrinhoBean {

	private double dolar, total;
	
	@EJB
	private CarrinhoCompraBO bo;
	
	public void adicionar(){
		bo.adicionar(dolar);
		total = bo.total();
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
}
