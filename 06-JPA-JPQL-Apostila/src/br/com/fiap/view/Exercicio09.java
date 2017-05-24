package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;

public class Exercicio09 {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAO dao = new PacoteDAOImpl(em);
		
		Calendar inicio = 
			new GregorianCalendar(2017, Calendar.MAY, 20);
		Calendar fim =
			new GregorianCalendar(2017, Calendar.SEPTEMBER, 17);

		System.out.println("Pacotes: " +
					dao.buscarQuantidade(inicio, fim));
		
		em.close();
		System.exit(0);
	}
	
}
