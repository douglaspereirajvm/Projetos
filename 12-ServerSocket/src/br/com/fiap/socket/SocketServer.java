package br.com.fiap.socket;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.bean.Cliente;

public class SocketServer {

	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(123);
		
		while(true){
			System.out.println("Aguardando conexão...");
			
			Socket socket = server.accept();
			
			ObjectInputStream inputStream =
					new ObjectInputStream(socket.getInputStream());
			
			Cliente cliente = (Cliente) inputStream.readObject();
			
			System.out.println(cliente.getNome());
			System.out.println(cliente.getRg());
		
		}
	}
	
}





