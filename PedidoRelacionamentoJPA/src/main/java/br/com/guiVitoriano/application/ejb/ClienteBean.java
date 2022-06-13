package br.com.guiVitoriano.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.guiVitoriano.application.model.Cliente;

@Stateless //Determina o tempo de vida do EJB
public class ClienteBean {

	@PersistenceContext
	private EntityManager em;
	//Seleciona os itens que serão listados
	
	public List<Cliente> listar() {
		/*
		 * Seleciona os objetos e os transforma em elementos na tabela
		 * */
		return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
}