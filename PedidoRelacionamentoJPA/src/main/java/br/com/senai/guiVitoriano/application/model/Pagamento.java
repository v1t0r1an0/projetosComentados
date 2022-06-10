package br.com.senai.guiVitoriano.application.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pagamento implements Serializable {
	
	//O enum possibilita a escolha de dois tipos distintos(STRING, INT)
	public enum TipoPagamento {
		CARTAO_CREDITO,
		BOLETO
	}

	@Id
	@GeneratedValue
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	//Seleciona p nome da coluna, caso n~~ao exista ele seleciona o atributo
	@Column(name = "tipo_pagto", length = 20, nullable = false)
	private TipoPagamento tipoPagto;
	/*
	 * Relacionamento da tabela
	 * 
	 * OneToOne ===> um para um
	 * 
	 * um pedido para um pagamento
	 */
	@OneToOne(mappedBy = "pagamento")
	private Pedido pedido;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoPagamento getTipoPagto() {
		return tipoPagto;
	}

	public void setTipoPagto(TipoPagamento tipoPagto) {
		this.tipoPagto = tipoPagto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", tipoPagto=" + tipoPagto + "]";
	}
}