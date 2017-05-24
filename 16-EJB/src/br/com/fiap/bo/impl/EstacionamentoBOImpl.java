package br.com.fiap.bo.impl;

import javax.ejb.Stateless;
import br.com.fiap.bo.EstacionamentoBO;

@Stateless
public class EstacionamentoBOImpl implements EstacionamentoBO{

	@Override
	public double calcularValor(int horasInicial, int horaFinal) {
		return (horaFinal-horasInicial)*10;
	}

}
