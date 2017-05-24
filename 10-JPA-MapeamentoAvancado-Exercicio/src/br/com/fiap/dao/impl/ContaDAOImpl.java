package br.com.fiap.dao.impl;

import br.com.fiap.entity.Conta;
import br.com.fiap.entity.ContaPK;
import javax.persistence.EntityManager;
import br.com.fiap.dao.ContaDAO;

public class ContaDAOImpl extends GenericDAOImpl<Conta, ContaPK> implements ContaDAO{

	public ContaDAOImpl(EntityManager em) {
		super(em);
	}

}