package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.TransporteDAO;
import br.com.fiap.entity.Transporte;

public class TransporteDAOImpl extends GenericDAOImpl<Transporte,Integer> implements TransporteDAO{

	public TransporteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Transporte> buscarPorEmpresa(String empresa) {
		return em.createNativeQuery("SELECT * FROM TRANSPORTE"
			+ " WHERE EMPRESA LIKE :e", Transporte.class)
			.setParameter("e", "%"+empresa+"%")
			.getResultList();
	}

}




