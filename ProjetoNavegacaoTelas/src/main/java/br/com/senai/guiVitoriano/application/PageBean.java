package br.com.senai.guiVitoriano.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class PageBean implements Serializable {

	private String page;
	
	public enum Pages {
		page_a, page_b;
	}
	
	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	} 	

	/*
	 * Faz a valida��o do caractere digitado pelo usu�rio e
	 * o direciona para a p�gina da web desejada
	 * */
	public Pages goTo() {
		
		if ("a".equals(page)) {
			
			return Pages.page_a;
			
		} else if("b".equals(page)) {
			return Pages.page_b;
			
		} else {
			return null;
		}
	}
}