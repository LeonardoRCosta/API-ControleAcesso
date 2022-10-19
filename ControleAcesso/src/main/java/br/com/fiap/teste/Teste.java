package br.com.fiap.teste;

import br.com.fiap.bo.UsuarioBO;
import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.to.UsuarioTO;

public class Teste {

	public static void main(String[] args) {
//		UsuarioDAO uDAO = new UsuarioDAO();
		
		UsuarioBO uBO = new UsuarioBO();
		
		UsuarioTO uTO = new UsuarioTO("Selva", "12345");

		System.out.println("Resposta: " + uBO.validacao(uTO).getLogin());
	}

}
