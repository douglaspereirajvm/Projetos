package br.com.fiap.socket;

import java.io.ObjectOutputStream;
import java.net.Socket;

import br.com.fiap.bean.Cliente;

public class Client {

	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("127.0.0.1", 123);
		
		ObjectOutputStream outputStream = 
			new ObjectOutputStream(socket.getOutputStream());
		
		Cliente cliente = new Cliente("Teste","113216346323");
		
		outputStream.writeObject(cliente);
		
		socket.close();
	}
	
}
