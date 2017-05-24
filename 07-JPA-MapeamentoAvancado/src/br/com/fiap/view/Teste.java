package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AluguelDAO;
import br.com.fiap.dao.impl.AluguelDAOImpl;
import br.com.fiap.entity.Aluguel;
import br.com.fiap.entity.Automovel;
import br.com.fiap.entity.Cliente;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		//Cadastrar tudo!
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		AluguelDAO dao = new AluguelDAOImpl(em);
		
		Cliente cliente = new Cliente("Anderson");
		Automovel auto = new Automovel("Fluence", "Renault");
		Aluguel aluguel = new Aluguel(cliente, auto,
				Calendar.getInstance(), 
				new GregorianCalendar(2017,1,1),
				1500);
		
		try {
			dao.cadastrar(aluguel);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		em.close();
		System.exit(0);
	}
	
}
