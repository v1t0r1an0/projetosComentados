package br.com.senai.guiVitoriano.jpa.jsfbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.guiVitoriano.jpa.model.Tarefa;

//Classe que representa um servi�o
@Stateless
public class FormBean {
	
	/* O PersistenceContext
	 * � respons�vel por armazenar
	 * os objetos do EntityManager
	 */
	@PersistenceContext
	private EntityManager em;
	
	/*
	 * O Persist
	 * � respons�vel por mandar
	 * os dados pro banco
	 */
	public void inserir(Tarefa tarefa) {
		em.persist(tarefa);
	}
	
	/*
	 * O Merge
	 * � o respons�vel por
	 * sobreescrever dos dados
	 * */
	public void atualizar(Tarefa tarefa) {
		em.merge(tarefa);
	}
	
	/*
	 * O remove
	 * � o respons�vel por
	 * realizar a exclus�o dos dados
	 */
	public void excluir(Tarefa tarefa) {
		tarefa = carregar(tarefa.getId());
		em.remove(tarefa);
	}
	
	public Tarefa carregar(int id) {
		//find procura o valor
		return em.find(Tarefa.class, id);
	}
}