package br.com.senai.guiVitoriano.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.guiVitoriano.application.model.*;

//tempo de vida do ejb, esse espera ser criada uma nova requisição para agir
@Stateless
public class ClienteBean {

	@PersistenceContext
	private EntityManager em;
	
	//Seleciona os itens a serem listados e os tranforma em objetos na tabela
	public List<Cliente> listar() {
		return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
}