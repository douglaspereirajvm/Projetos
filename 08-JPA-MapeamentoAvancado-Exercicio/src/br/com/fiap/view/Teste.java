package br.com.fiap.view;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.DependenteDAO;
import br.com.fiap.dao.impl.DependenteDAOImpl;
import br.com.fiap.entity.Dependente;
import br.com.fiap.entity.Funcionario;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		DependenteDAO dao = new DependenteDAOImpl(em);
		
		Funcionario func = new Funcionario("João", 
			new GregorianCalendar(2013,1,1));
		func.setNumeroConta(123);
		func.setSalario(13111);
		
		Dependente dep = new Dependente(func, "Maria");
		
		try {
			dao.cadastrar(dep);
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
	}
	
}
