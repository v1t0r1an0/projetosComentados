package br.com.guiVitoriano.jpa.ejbbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.guiVitoriano.jpa.model.Tarefa;
//Classe que representa um serviço
@Stateless
public class TarefaBean {
	/* O PersistenceContext
	 * é responsável por armazenar
	 * os objetos do EntityManager
	 */
	@PersistenceContext
	private EntityManager em;
	/*
	 * O Persist
	 * é responsável por mandar
	 * os dados pro banco
	 */
	public void inserir(Tarefa tarefa) {
		em.persist(tarefa);
	}
	/*
	 * O Merge
	 * é o responsável por
	 * sobreescrever dos dados
	 * */
	public void atualizar(Tarefa tarefa) {
		em.merge(tarefa);
	}
	/*
	 * O remove
	 * é o responsável por
	 * realizar a exclusão dos dados
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
