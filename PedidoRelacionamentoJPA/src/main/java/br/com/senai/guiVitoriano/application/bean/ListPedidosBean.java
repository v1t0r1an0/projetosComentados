package br.com.rafaelcosta.application.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.senai.guiVitoriano.application.ejb.*;
import br.com.senai.guiVitoriano.application.model.*;


@Named
@RequestScoped

//Realiza a listagem de TODOS os pedidos
public class ListPedidosBean implements Serializable {

	@EJB
	private PedidoBean pedidoBean;
	
	private List<Pedido> pedidos;
	
	//Carrega os pedidos
	@PostConstruct
	public void init() {
		pedidos = pedidoBean.listar();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	//Determina a forma de pagamento
	public String pagar(Integer pedidoId, String tipo) throws Exception  {
		pedidoBean.pagar(pedidoId, tipo);
		
		//As novas informa��es s�o atualizadas atrav�s do redirect
		return "pedidos?faces-redirect=true";
	}
	
	public String excluir(Integer pedidoId) {
		
		//Atrav�s de uma busca pelo ID as informa��es s�o exclu�das
		pedidoBean.excluir(pedidoId);
		
		//As novas informa��es s�o atualizadas atrav�s do redirect
		return "pedidos?faces-redirect=true";
	}
}