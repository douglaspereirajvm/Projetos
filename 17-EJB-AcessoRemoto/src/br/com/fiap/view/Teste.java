package br.com.fiap.view;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.fiap.bo.CarrinhoCompraBO;
import br.com.fiap.bo.EstacionamentoBO;

public class Teste {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put(Context.URL_PKG_PREFIXES, 
						"org.jboss.ejb.client.naming" );
		
		try {
			Context context = new InitialContext(prop);
			
			EstacionamentoBO bo = (EstacionamentoBO) 
				context.lookup("ejb:/16-EJB/EstacionamentoBOImpl"
						+ "!br.com.fiap.bo.EstacionamentoBO");
			
			System.out.println(bo.calcularValor(10, 12));
			
			CarrinhoCompraBO carrinhoBo = (CarrinhoCompraBO) 
				context.lookup("ejb:/16-EJB/CarrinhoCompraBOImpl"
						+ "!br.com.fiap.bo.CarrinhoCompraBO?stateful");
			
			carrinhoBo.adicionar(500);
			System.out.println("$" + carrinhoBo.total());
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
}
