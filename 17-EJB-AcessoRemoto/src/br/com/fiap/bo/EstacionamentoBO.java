package br.com.fiap.bo;

import javax.ejb.Remote;

@Remote
public interface EstacionamentoBO {

	double calcularValor(int horasInicial, int horaFinal);
	
}
