package br.com.fiap.main;

import java.lang.reflect.Method;

import br.com.fiap.annotation.Banco;
import br.com.fiap.connection.ConnectionFactory;

public class Teste {

	public static void main(String[] args) {
		//Recuperar a anota��o da classe de conex�o
		
		//Reflection API
		//Recupera a estrutura da classe e tenta recuperar a anota��o dela
		Banco anotacao = ConnectionFactory.class.getAnnotation(Banco.class);
		System.out.println("Usu�rio: " + anotacao.usuario());
		System.out.println("Senha: " + anotacao.senha());
		
		//Recuperar as anota��es dos m�todos
		//Recuperar os m�todos da classe
		Method[] metodos = ConnectionFactory.class.getDeclaredMethods();
		for (Method method : metodos) {
			//Recuperar a anota��o @Banco do m�todo
			Banco anotacaoMetodo = method.getAnnotation(Banco.class);
			System.out.println(anotacaoMetodo.usuario() + " " + anotacaoMetodo.senha());
		}
		
	}
	
}



