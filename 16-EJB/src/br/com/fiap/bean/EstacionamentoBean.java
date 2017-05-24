package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.fiap.bo.EstacionamentoBO;

@ManagedBean
public class EstacionamentoBean {

	private int inicio, fim;
	private double valorTotal;
	
	@EJB
	private EstacionamentoBO bo;
	
	public void calcular(){
		valorTotal = bo.calcularValor(inicio, fim);
	}
	
	public int getInicio() {
		return inicio;
	}
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	public int getFim() {
		return fim;
	}
	public void setFim(int fim) {
		this.fim = fim;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
