package br.com.fiap.bo.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import br.com.fiap.bo.RestauranteBO;

public class RestauranteBOImpl
				extends UnicastRemoteObject
							implements RestauranteBO {

	public RestauranteBOImpl() throws RemoteException {
		super();
	}

	@Override
	public double calcularTaxaServico(double valor) throws RemoteException {
		System.out.println("Servidor...");
		return valor * 0.1;
	}
	
}