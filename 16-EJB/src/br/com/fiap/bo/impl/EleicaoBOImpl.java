package br.com.fiap.bo.impl;

import javax.ejb.Singleton;
import br.com.fiap.bo.EleicaoBO;

@Singleton
public class EleicaoBOImpl implements EleicaoBO {

	private int totalSim, totalNao;

	@Override
	public void votar(boolean sim) {
		if (sim) {
			totalSim += 1;
		}else{
			totalNao++;
		}
	}

	@Override
	public int totalSim() {
		return totalSim;
	}

	@Override
	public int totalNao() {
		return totalNao;
	}
	
	
	
}
