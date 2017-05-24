package br.com.fiap.bean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import br.com.fiap.bo.EleicaoBO;

@ManagedBean
public class EleicaoBean {

	private int totalSim, totalNao;
	
	@EJB
	private EleicaoBO bo;
	
	@PostConstruct
	private void init(){
		totalSim = bo.totalSim();
		totalNao = bo.totalNao();
	}
	
	public void votarSim(){
		bo.votar(true);
		totalSim = bo.totalSim();
		totalNao = bo.totalNao();
	}
	
	public void votarNao(){
		bo.votar(false);
		totalSim = bo.totalSim();
		totalNao = bo.totalNao();
	}

	public int getTotalNao() {
		return totalNao;
	}

	public void setTotalNao(int totalNao) {
		this.totalNao = totalNao;
	}

	public int getTotalSim() {
		return totalSim;
	}

	public void setTotalSim(int totalSim) {
		this.totalSim = totalSim;
	}
	
}
