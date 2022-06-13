package br.com.guiVitoriano.application.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.guiVitoriano.application.ejb.PedidoBean;
import br.com.guiVitoriano.application.model.Pedido;


@Named
@RequestScoped

public class ListPedidosBean implements Serializable {

	@EJB
	private PedidoBean pedidoBean;
	
	private List<Pedido> pedidos;
	@PostConstruct
	public void init() {
		pedidos = pedidoBean.listar();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	//Retorna a forma de pagamento
	public String pagar(Integer pedidoId, String tipo) throws Exception  {
		pedidoBean.pagar(pedidoId, tipo);

		return "pedidos?faces-redirect=true";
	}

	public String excluir(Integer pedidoId) {
		
		pedidoBean.excluir(pedidoId);
		return "pedidos?faces-redirect=true";
	}
}