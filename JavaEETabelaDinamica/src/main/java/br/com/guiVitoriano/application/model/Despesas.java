package br.com.guiVitoriano.application.model;

public class Despesas {
	
	/*Atributos primitivos, sendo assim não podem ser nulosm por isso per necessária a utilização de Wrappers
	  que são como classes especiais que possuem métodos capazes de fazer conversões em variáveis primitivas
	  e também de encapsular tipos primitivos para serem trabalhados como objetos */
	private String data;
	private String descricao;
	private Double valor;
	private Boolean edit;
	private Boolean t;
	
	public String getData() {
		return data;
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Boolean getEdit() {
		return edit;
	}
	public void setEdit(Boolean edit) {
		this.edit = edit;
	}
	public Boolean getT() {
		return t;
	}
	public void setT(Boolean t) {
		this.t = t;
	}	
}
