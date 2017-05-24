package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaDAO;
import br.com.fiap.dao.impl.ContaDAOImpl;
import br.com.fiap.entity.Agencia;
import br.com.fiap.entity.ContaCorrente;
import br.com.fiap.entity.ContaPoupanca;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		ContaDAO dao = new ContaDAOImpl(em);
		
		Agencia ag = new Agencia("Av Paulista");
		ContaCorrente cc = new ContaCorrente(ag, 1000, 10, 10000);
		ContaPoupanca cp = new ContaPoupanca(ag, 50, 0.45);
		
		try {
			dao.cadastrar(cc);
			dao.cadastrar(cp);
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
	}
	
}





