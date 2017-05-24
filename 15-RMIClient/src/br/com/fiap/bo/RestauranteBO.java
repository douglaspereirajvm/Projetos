package br.com.fiap.bo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RestauranteBO extends Remote{

	double calcularTaxaServico(double valor) 
								throws RemoteException;
	
}