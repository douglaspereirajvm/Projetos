package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.TransporteDAO;
import br.com.fiap.dao.impl.TransporteDAOImpl;
import br.com.fiap.entity.Transporte;

public class ConsoleView3 {

	public static void main(String[] args) {
		//Buscar os transporte por empresa
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		TransporteDAO dao = new TransporteDAOImpl(em);
		
		List<Transporte> lista = dao.buscarPorEmpresa("o");
		
		for (Transporte transporte : lista) {
			System.out.println(transporte.getEmpresa());
		}
		
		em.close();
		System.exit(0);
	}
	
}
