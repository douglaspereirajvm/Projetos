package br.com.fiap.teste;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.fiap.bean.Cliente;

public class Desserializacao {

	public static void main(String[] args) throws Exception {
		//ler o arquivo e recuperar o objeto serializado
		FileInputStream fileInput = 
				new FileInputStream("arquivo");
		
		ObjectInputStream objectInput =
				new ObjectInputStream(fileInput);
		
		Cliente cliente = (Cliente) objectInput.readObject();
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getRg());
		
		objectInput.close();
	}
	
}
