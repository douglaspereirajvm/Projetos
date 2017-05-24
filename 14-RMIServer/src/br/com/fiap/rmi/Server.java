package br.com.fiap.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import br.com.fiap.bo.impl.RestauranteBOImpl;

public class Server {

	public static void main(String[] args) throws Exception {
		//Recupera o registry
		Registry registry = 
				LocateRegistry.createRegistry(8080);
		//Registra o objeto para o acesso remoto
		registry.bind("restaurante", new RestauranteBOImpl());
		
		System.out.println("Objeto registrado!");
	}
	
}
