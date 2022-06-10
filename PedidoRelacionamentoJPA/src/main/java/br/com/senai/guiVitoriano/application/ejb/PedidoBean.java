package br.com.senai.guiVitoriano.application.ejb;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.guiVitoriano.application.model.*;


@Stateless
public class PedidoBean {

	@PersistenceContext
	private EntityManager em;
	
	//listagem dos epdidos
	public List<Pedido> listar() {
		return em.createQuery("SELECT p FROM Pedido p", Pedido.class).getResultList();
	}
	
	//É passado o ID e o ytansforma em Enum
	public void pagar(Integer pedidoId, String tipo) {
		TipoPagamento tipoPagamento = TipoPagamento.valueOf(tipo);
		
		//Faz o binding com a tabela
		Pedido pedido = em.find(Pedido.class, pedidoId);
		
		Pagamento pagamento = new Pagamento();
		
		//armazena na variável
		
		pagamento.setTipoPagto(tipoPagamento);
		em.persist(pagamento);
		
		//graças ao binding é possível realizar o salvamento no bancoi
		pedido.setPagamento(pagamento);
	}
	
	public void excluir(Integer pedidoId) {
		Pedido pedido = em.find(Pedido.class, pedidoId);
		em.remove(pedido);
	}
	
	public void cadastrar(Integer clienteId, Integer[] produtosIds) throws Exception {
		
		//binding Cliente e Tabela
		Cliente cliente = em.find(Cliente.class, clienteId);
		
		Pedido pedido = new Pedido();
		pedido.setData(new Date());
		pedido.setCliente(cliente);
		
		//persist --> grava as infos na tabela
		em.persist(pedido);
		
		double valorTotal = 0;
		
		//Add o produto a tabela e depois o mesmo é incrementado
		for (Integer produtoId : produtosIds) {
			Produto produto = em.find(Produto.class, produtoId);
			pedido.getProdutos().add(produto);
			valorTotal += produto.getValor();
		}
		
		//graças ao binding é possível realizar o salvamento no banco
		pedido.setValorTotal(valorTotal);
	}
}