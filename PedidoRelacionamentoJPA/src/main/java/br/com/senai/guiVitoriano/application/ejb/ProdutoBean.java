package br.com.senai.guiVitoriano.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.guiVitoriano.application.model.*;

@Stateless
public class ProdutoBean {

	@PersistenceContext
	private EntityManager em;
	public List<Produto> listar() {
		return em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
	}
}