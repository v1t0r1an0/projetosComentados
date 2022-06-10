package br.com.senai.guiVitoriano.application.model;

public class Despesas {
	
	/*Atributos primitivos, sendo assim n�o podem ser nulosm por isso per necess�ria a utiliza��o de Wrappers
	  que s�o como classes especiais que possuem m�todos capazes de fazer convers�es em vari�veis primitivas
	  e tamb�m de encapsular tipos primitivos para serem trabalhados como objetos */
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