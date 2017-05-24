package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.dao.impl.PessoaDAOImpl;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.PessoaJuridica;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		PessoaDAO dao = new PessoaDAOImpl(em);
		
		PessoaJuridica pj = 
			new PessoaJuridica("FIAP","12312235/0001-52");
		PessoaFisica pf = 
			new PessoaFisica("Bruce", "326587541-55");
		
		try {
			dao.cadastrar(pf);
			dao.cadastrar(pj);
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
	}
	
}
