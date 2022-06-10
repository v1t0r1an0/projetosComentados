package br.com.senai.guiVitoriano.application.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Despesas {
	
	@Id //Determina que o id vai ser a chave prim�ria
	@GeneratedValue //Determina que a respondabilidade da gera��o dos ids � do provedor de persist�ncia
	private Integer id;
	private String data;
	private String descricao;
	private String valor;
	private Boolean edit;
	
	public String getData() {
		return data;
	}
	
	
	public Despesas(String data, String descricao, String valor) {
		super();
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Despesas() {
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Boolean getEdit() {
		return edit;
	}
	public void setEdit(Boolean edit) {
		this.edit = edit;
}


	
}