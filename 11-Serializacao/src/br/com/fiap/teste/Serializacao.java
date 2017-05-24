package br.com.fiap.teste;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.bean.Cliente;

public class Serializacao {

	public static void main(String[] args) throws Exception {
		//serializar
		//gravar as informações de um objeto em um arquivo
		
		Cliente cliente = new Cliente("Edu Giba","21313");
		
		FileOutputStream outStream = 
					new FileOutputStream("arquivo");
		
		ObjectOutputStream objectStream =
					new ObjectOutputStream(outStream);
		
		objectStream.writeObject(cliente);
		
		System.out.println("Cliente serializado!");
		
		objectStream.close();
		
	}
	
}
