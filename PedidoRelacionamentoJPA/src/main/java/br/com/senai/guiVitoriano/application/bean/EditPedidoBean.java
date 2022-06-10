package br.com.senai.guiVitoriano.application.bean;

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
public class EditPedidoBean implements Serializable {
	
	/*
	 * Cliente, Produto e Pedido estão sendo relacionados com o banco pelo EJB
	 * */
	@EJB
	private PedidoBean pedidoBean;
	
	@EJB
	private ProdutoBean produtoBean;
	
	@EJB
	private ClienteBean clienteBean;
	
	//LISTA DE CLIENTES
	private List<Cliente> clientes;
	
	//LISTA DE PRODUTOS
	private List<Produto> produtos;
	
	//ID DO CLIENTE
	private Integer selectedClienteId;]
			
	//ID DOS PRODUTOS
	private Integer[] selectedProdutosIds;
	
	
	//PostConstruct --> Esse método é executado logo após a construção do bean
	@PostConstruct
	public void init() {
		clientes = clienteBean.listar();
		produtos = produtoBean.listar();
	}
	
	//Usadno os ID's como parâmetros as informações são cadastradas
	public String cadastrarPedido() throws Exception {
		pedidoBean.cadastrar(selectedClienteId, selectedProdutosIds);
		
		//Manda pra tela de dads
		return "pedidos?faces-redirect=true";
	}
	 
	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Integer getSelectedClienteId() {
		return selectedClienteId;
	}

	public void setSelectedClienteId(Integer selectedClienteId) {
		this.selectedClienteId = selectedClienteId;
	}

	public Integer[] getSelectedProdutosIds() {
		return selectedProdutosIds;
	}

	public void setSelectedProdutosIds(Integer[] selectedProdutosIds) {
		this.selectedProdutosIds = selectedProdutosIds;
	}
}
