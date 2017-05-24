package br.com.fiap.bo;

import javax.ejb.Remote;

@Remote
public interface EleicaoBO {

	void votar(boolean sim);
	
	int totalSim();

	int totalNao();
	
}
